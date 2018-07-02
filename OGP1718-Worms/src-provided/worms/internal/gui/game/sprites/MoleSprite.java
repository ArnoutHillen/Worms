package worms.internal.gui.game.sprites;

import worms.internal.gui.GUIUtils;
import worms.internal.gui.game.ImageSprite;
import worms.internal.gui.game.PlayGameScreen;
import worms.model.Mole;

public class MoleSprite extends ImageSprite<Mole> {

	private static final double MAX_SCALE = 100;
	private static final double MIN_SCALE = 0.05;
	private final Mole mole;
	
	private boolean isMoving;
	private double orientation;
	private String name;
	private boolean atImpassableTerrain;
	private long actionPoints;
	private long maxActionPoints;
	private double actualX;
	private double actualY;
	private double radius;

	public MoleSprite(PlayGameScreen screen, Mole mole) {
		super(screen, "images/mole.png");
		this.mole = mole;
		update();
	}

	@Override
	public Mole getObject() {
		return getMole();
	}

	public Mole getMole() {
		return mole;
	}

	private void setDirection(double newDirection) {
		double direction = GUIUtils.restrictDirection(newDirection);
		this.orientation = direction;

		if (Math.PI / 2 > direction || 3 * Math.PI / 2 < direction) {
			setHflipped(true);
		} else {
			setHflipped(false);
		}
	}

	/**
	 * @param radius
	 *            (in worm-meter)
	 */
	public synchronized void setRadius(double radius) {
		this.radius = radius;
		/*
		 * Height of the image (when drawn at native size) in worm-meters, given the
		 * scale at which the world is drawn to screen
		 */
		double imageHeightInMeters = getScreen().screenToWorldDistance(getImageHeight());

		/*
		 * scale factor to nicely fit the image in a circle with diameter equal to the
		 * image height (value determined experimentally)
		 */
		double fitFactor = 1.0;

		double scaleFactor = fitFactor * 2 * radius / imageHeightInMeters;

		// limit scaling
		scaleFactor = Math.max(MIN_SCALE, Math.min(scaleFactor, MAX_SCALE));

		setScale(scaleFactor);
	}

	public boolean hitTest(double screenX, double screenY) {
		double radius = getScale() * Math.max(getImageWidth(), getImageHeight()) / 2.0;
		double dx = screenX - getCenterX();
		double dy = screenY - getCenterY();
		return dx * dx + dy * dy <= radius * radius;
	}

	@Override
	public boolean isObjectAlive() {
		return !getFacade().isTerminated(getMole());
	}

	@Override
	public synchronized void update() {
		double[] xy = getFacade().getLocation(getMole());
		if (isMoving) {
			// don't update the location here, because it may differ from the
			// location in the model (interpolation)
		} else {
			setCenterLocation(
					getScreen().getScreenX(xy[0]),
					getScreen().getScreenY(xy[1]));
		}
		this.actualX = xy[0];
		this.actualY = xy[1];
		setRadius(getFacade().getRadius(getMole()));
		setDirection(getFacade().getOrientation(getMole()));
		setName(getFacade().getName(getMole()));
		this.atImpassableTerrain = !getFacade().isPassable(getScreen().getWorld(), 
				xy, getFacade().getRadius(getMole()));
		this.actionPoints = getFacade().getNbActionPoints(getMole());
		this.maxActionPoints = getFacade().getMaxNbActionPoints(getMole());
	}

	public void setIsMoving(boolean isMoving) {
		this.isMoving = isMoving;
	}

	public synchronized double getOrientation() {
		return orientation;
	}

	public synchronized String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public synchronized boolean isAtImpassableTerrain() {
		return atImpassableTerrain;
	}

	public synchronized long getActionPoints() {
		return actionPoints;
	}

	public synchronized long getMaxActionPoints() {
		return maxActionPoints;
	}

	public synchronized double getActualX() {
		return actualX;
	}

	public synchronized double getActualY() {
		return actualY;
	}

	public synchronized double getRadius() {
		return radius;
	}
}
