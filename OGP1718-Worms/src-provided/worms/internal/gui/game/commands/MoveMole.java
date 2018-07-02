package worms.internal.gui.game.commands;

import worms.facade.IFacade;
import worms.internal.gui.GUIConstants;
import worms.internal.gui.game.PlayGameScreen;
import worms.internal.gui.game.sprites.MoleSprite;
import worms.internal.gui.messages.MessageType;
import worms.model.Mole;
import worms.util.ModelException;

public class MoveMole extends Command {

	private double startX;
	private double startY;

	private double finalX;
	private double finalY;

	private final Mole mole;

	public MoveMole(IFacade facade, Mole mole, PlayGameScreen screen) {
		super(facade, screen);
		this.mole = mole;
	}

	public Mole getMole() {
		return mole;
	}

	@Override
	protected boolean canStart() {
		return getMole() != null;
	}

	private double getDuration() {
		return GUIConstants.MOVE_DURATION;
	}

	@Override
	protected void doUpdate(double dt) {
		MoleSprite sprite = getScreen().getSpriteOfTypeFor(MoleSprite.class, getMole());
		if (sprite != null) {
			sprite.setIsMoving(true);
			if (getElapsedTime() < getDuration()) {
				double t = getElapsedTime() / getDuration();
				t = t * t * (3 - 2 * t); // smooth-step interpolation
				double x = (1.0 - t) * startX + t * finalX;
				double y = (1.0 - t) * startY + t * finalY;
				sprite.setCenterLocation(x, y);
			} else {
				sprite.setCenterLocation(finalX, finalY);
				completeExecution();
			}
		} else {
			cancelExecution();
		}
	}

	@Override
	protected void afterExecutionCompleted() {
		MoleSprite sprite = getScreen().getSpriteOfTypeFor(MoleSprite.class, getMole());
		if (sprite != null) {
			sprite.setIsMoving(false);
		}
	}

	@Override
	protected void afterExecutionCancelled(Throwable e) {
		MoleSprite sprite = getScreen().getSpriteOfTypeFor(MoleSprite.class, getMole());
		if (sprite != null) {
			sprite.setIsMoving(false);
		}
		getScreen().addMessage("This mole cannot move like that :(" + (e != null ? "\n" + e.getMessage() : ""),
				MessageType.ERROR);
	}

	@Override
	protected void doStartExecution() {
		try {
			double[] xy = getFacade().getLocation(getMole());
			this.startX = getScreen().getScreenX(xy[0]);
			this.startY = getScreen().getScreenY(xy[1]);
			getFacade().move(getMole());
			xy = getFacade().getLocation(getMole());
			this.finalX = getScreen().getScreenX(xy[0]);
			this.finalY = getScreen().getScreenY(xy[1]);
		} catch (ModelException e) {
			cancelExecution(e);
		}
	}

	protected boolean isObjectStillActive() {
		return !getFacade().isTerminated(getMole());
	}

	protected double getObjectX() {
		return getFacade().getLocation(getMole())[0];
	}

	protected double getObjectY() {
		return getFacade().getLocation(getMole())[1];
	}
}