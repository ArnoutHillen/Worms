package worms.internal.gui.game;

import java.awt.Graphics2D;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;

import worms.facade.IFacade;
import worms.internal.gui.GUIConstants;
import worms.internal.gui.GUIUtils;
import worms.internal.gui.GameState;
import worms.internal.gui.InputMode;
import worms.internal.gui.Level;
import worms.internal.gui.Screen;
import worms.internal.gui.WormsGUI;
import worms.internal.gui.game.modes.DefaultInputMode;
import worms.internal.gui.game.modes.EnteringNameMode;
import worms.internal.gui.game.modes.GameOverMode;
import worms.internal.gui.game.modes.SetupInputMode;
import worms.internal.gui.game.sprites.FoodSprite;
import worms.internal.gui.game.sprites.MoleSprite;
import worms.internal.gui.game.sprites.WormSprite;
import worms.internal.gui.messages.MessageType;
import worms.model.Food;
import worms.model.Mole;
import worms.model.Team;
import worms.model.World;
import worms.model.Worm;

public class PlayGameScreen extends Screen {

	final PlayGameScreenPainter painter;
	private final GameState gameState;

	private final Set<Sprite<?>> sprites = new HashSet<Sprite<?>>();
	private final DefaultActionHandler userActionHandler;
	private final IActionHandler programActionHandler;

	public PlayGameScreen(WormsGUI gui, GameState state) {
		super(gui);
		this.gameState = state;
		this.painter = createPainter();
		this.userActionHandler = createUserActionHandler();
		this.programActionHandler = createProgramActionHandler();
	}

	protected DefaultActionHandler createUserActionHandler() {
		return new DefaultActionHandler(this, true);
	}

	protected IActionHandler createProgramActionHandler() {
		return new DefaultActionHandler(this, false);
	}

	@Override
	protected InputMode<PlayGameScreen> createDefaultInputMode() {
		return new SetupInputMode(this, null);
	}

	@Override
	public void screenStarted() {
		runGameLoop();
	}

	final AtomicLong lastUpdateTimestamp = new AtomicLong();

	final TimerTask gameLoop = new TimerTask() {

		@Override
		public void run() {
			long now = System.currentTimeMillis();
			long delta = now - lastUpdateTimestamp.getAndSet(now);
			double dt = delta / 1000.0 * GUIConstants.TIME_SCALE;
			gameState.evolve(dt);
			repaint();
		}
	};
	private Object currentObject;

	private void runGameLoop() {
		Timer timer = new Timer();
		Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
			@Override
			public void uncaughtException(Thread t, Throwable e) {
				gameLoop.cancel();
				e.printStackTrace();
				getGUI().showError(e.getClass().getName() + ": " + e.getMessage());
			}
		});
		lastUpdateTimestamp.set(System.currentTimeMillis());
		timer.scheduleAtFixedRate(gameLoop, 0, 1000 / GUIConstants.FRAMERATE);
	}

	public void gameFinished() {
		addMessage("Game over! The winner is " + getFacade().getWinner(getWorld())
				+ "\n\nPress 'R' to start another game, or 'ESC' to quit.", MessageType.NORMAL);
		gameLoop.cancel();
		switchInputMode(new GameOverMode(this, getCurrentInputMode()));
	}

	public synchronized void update() {
		removeInactiveSprites();
		addNewSprites();
		for (Sprite<?> sprite : sprites) {
			sprite.update();
		}
		currentObject = getFacade().getActivePlayingObject(getWorld());
	}

	protected void removeInactiveSprites() {
		for (Sprite<?> sprite : new ArrayList<Sprite<?>>(sprites)) {
			if (!sprite.isObjectAlive()) {
				removeSprite(sprite);
			}
		}
	}

	protected void addNewSprites() {
		addNewWormSprites();
		addNewMoleSprites();
		addNewFoodSprites();
	}

	private void addNewWormSprites() {
		Collection<Worm> worms = getFacade().getAllWorms(getWorld());
		if (worms != null) {
			for (Worm worm : worms) {
				WormSprite sprite = getWormSprite(worm);
				if (sprite == null) {
					createWormSprite(worm);
				}
			}
		}
	}

	private void addNewMoleSprites() {
		Collection<Mole> moles = getAll(Mole.class);
		if (moles != null) {
			for (Mole mole : moles) {
				MoleSprite sprite = getSpriteOfTypeFor(MoleSprite.class, mole);
				if (sprite == null) {
					createMoleSprite(mole);
				}
			}
		}
	}

	private void addNewFoodSprites() {
		Collection<Food> foods = getAll(Food.class);
		if (foods != null) {
			for (Food food : foods) {
				FoodSprite sprite = getSpriteOfTypeFor(FoodSprite.class, food);
				if (sprite == null) {
					createFoodSprite(food);
				}
			}
		}
	}

	private <T> Collection<T> getAll(Class<T> type) {
		return getFacade().getAllItems(getWorld()).stream().filter(type::isInstance).map(type::cast)
				.collect(Collectors.toSet());
	}

	private void createFoodSprite(Food food) {
		FoodSprite sprite = new FoodSprite(this, food);
		addSprite(sprite);
	}

	private void createMoleSprite(Mole mole) {
		MoleSprite sprite = new MoleSprite(this, mole);
		addSprite(sprite);
	}

	private void createWormSprite(Worm worm) {
		WormSprite sprite = new WormSprite(this, worm);
		addSprite(sprite);
	}

	public GameState getGameState() {
		return gameState;
	}

	public IFacade getFacade() {
		return getGameState().getFacade();
	}

	protected PlayGameScreenPainter createPainter() {
		return new PlayGameScreenPainter(this);
	}

	public <T extends Sprite<?>> Set<T> getSpritesOfType(Class<T> type) {
		Set<T> result = new HashSet<T>();
		for (Sprite<?> sprite : sprites) {
			if (type.isInstance(sprite)) {
				result.add(type.cast(sprite));
			}
		}
		return result;
	}

	public <ObjectType, SpriteType extends Sprite<ObjectType>> SpriteType getSpriteOfTypeFor(Class<SpriteType> type,
			ObjectType object) {
		if (object == null) {
			return null;
		}
		for (SpriteType sprite : getSpritesOfType(type)) {
			if (object.equals(sprite.getObject())) {
				return sprite;
			}
		}
		return null;
	}

	public WormSprite getWormSprite(Worm worm) {
		return getSpriteOfTypeFor(WormSprite.class, worm);
	}

	public void move() {
		if (getSelectedObject() instanceof Worm) {
			userActionHandler.move((Worm) getSelectedObject());
		} else if (getSelectedObject() instanceof Mole) {
			userActionHandler.move((Mole) getSelectedObject());
		}
	}

	public void jump() {
		Worm worm = getSelectedWorm();
		if (worm != null) {
			userActionHandler.jump(worm);
		}

	}

	public void eat() {
		if (getSelectedObject() instanceof Worm) {
			userActionHandler.eat((Worm) getSelectedObject());
		} else if (getSelectedObject() instanceof Mole) {
			userActionHandler.eat((Mole) getSelectedObject());
		}
	}

	public void fire() {
		Worm worm = getSelectedWorm();
		if (worm != null) {
			userActionHandler.fire(worm);
		}

	}

	public void turn(double angle) {
		Worm worm = getSelectedWorm();
		angle = GUIUtils.restrictAngle(angle, -Math.PI);

		if (worm != null) {
			userActionHandler.turn(worm, angle);
		}
	}

	public void changeName(String newName) {
		Worm worm = getSelectedWorm();

		if (worm != null) {
			userActionHandler.changeName(worm, newName);
		}
	}

	public synchronized Worm getSelectedWorm() {
		if (currentObject instanceof Worm)
			return (Worm) currentObject;
		return null;
	}

	public synchronized Object getSelectedObject() {
		return currentObject;
	}

	@Override
	protected void paintScreen(Graphics2D g) {
		painter.paint(g);
	}

	public static PlayGameScreen create(WormsGUI gui, GameState gameState, boolean debugMode) {
		if (!debugMode) {
			return new PlayGameScreen(gui, gameState);
		} else {
			return new PlayGameScreen(gui, gameState) {
				@Override
				protected PlayGameScreenPainter createPainter() {
					return new PlayGameScreenDebugPainter(this);
				}
			};
		}
	}

	protected Level getLevel() {
		return getGameState().getLevel();
	}

	public World getWorld() {
		return getGameState().getWorld();
	}

	public void addSprite(Sprite<?> sprite) {
		sprites.add(sprite);
	}

	public void removeSprite(Sprite<?> sprite) {
		sprites.remove(sprite);
	}

	/**
	 * Aspect ratio of the screen
	 */
	private double getScreenAspectRatio() {
		return (double) getScreenWidth() / getScreenHeight();
	}

	/**
	 * Width of the world when displayed (in pixels)
	 */
	private double getWorldDisplayWidth() {
		if (getLevel().getMapAspectRatio() >= getScreenAspectRatio()) {
			return getScreenWidth();
		} else {
			return getScreenHeight() * getLevel().getMapAspectRatio();
		}
	}

	/**
	 * Height of the world when displayed (in pixels)
	 */
	private double getWorldDisplayHeight() {
		if (getLevel().getMapAspectRatio() <= getScreenAspectRatio()) {
			return getScreenHeight();
		} else {
			return getScreenWidth() / getLevel().getMapAspectRatio();
		}
	}

	/**
	 * Scale of the displayed world (in worm-meter per pixel)
	 */
	private double getDisplayScale() {
		return getLevel().getWorldWidth() / getWorldDisplayWidth();
	}

	/**
	 * Distance in the world (worm-meter) to distance on the screen (pixels)
	 */
	public double worldToScreenDistance(double ds) {
		return ds / getDisplayScale();
	}

	/**
	 * Distance on the screen (pixels) to distance in the world (worm-meter)
	 */
	public double screenToWorldDistance(double ds) {
		return ds * getDisplayScale();
	}

	/**
	 * World x coordinate to screen x coordinate
	 */
	public double getScreenX(double x) {
		double offset = (getScreenWidth() - getWorldDisplayWidth()) / 2.0;
		return offset + worldToScreenDistance(x);
	}

	/**
	 * Screen x coordinate to world x coordinate
	 */
	public double getLogicalX(double screenX) {
		double offset = (getScreenWidth() - getWorldDisplayWidth()) / 2.0;
		return screenToWorldDistance(screenX - offset);
	}

	/**
	 * World y coordinate to screen y coordinate
	 */
	public double getScreenY(double y) {
		double offset = (getScreenHeight() - getWorldDisplayHeight()) / 2.0;
		return offset + getWorldDisplayHeight() - worldToScreenDistance(y);
	}

	/**
	 * Screen y coordinate to world y coordinate
	 */
	public double getLogicalY(double screenY) {
		double offset = (getScreenHeight() - getWorldDisplayHeight()) / 2.0;
		return screenToWorldDistance(-screenY + offset + getWorldDisplayHeight());
	}

	public void paintTextEntry(Graphics2D g, String message, String enteredName) {
		painter.paintTextEntry(g, message, enteredName);
	}

	public void drawTurnAngleIndicator(Graphics2D g, WormSprite wormSprite, double currentAngle) {
		painter.drawTurnAngleIndicator(g, wormSprite, currentAngle);
	}

	public <T, S extends Sprite<T>> void removeSpriteFor(Class<S> type, T object) {
		S sprite = getSpriteOfTypeFor(type, object);
		sprites.remove(sprite);
	}

	@SuppressWarnings("unchecked")
	@Override
	public InputMode<PlayGameScreen> getCurrentInputMode() {
		return (InputMode<PlayGameScreen>) super.getCurrentInputMode();
	}

	public void addEmptyTeam() {
		switchInputMode(new EnteringNameMode("Enter team name: ", this, getCurrentInputMode(),
				newName -> userActionHandler.addEmptyTeam(newName)));
	}

	private Team lastTeam;

	public void setLastCreatedTeam(Team team) {
		this.lastTeam = team;
	}

	public Team getLastCreatedTeam() {
		return lastTeam;
	}

	public void addPlayerControlledWorm() {
		userActionHandler.addNewWorm(false);
	}

	public void addComputerControlledWorm() {
		userActionHandler.addNewWorm(true);
	}

	public void addFood() {
		userActionHandler.addNewFood();
	}

	public void startGame() {
		lastTeam = null;
		userActionHandler.startGame();
	}

	public void gameStarted() {
		switchInputMode(new DefaultInputMode(this, getCurrentInputMode()));
	}

	public void renameWorm() {
		switchInputMode(new EnteringNameMode("Enter new name for worm: ", this, getCurrentInputMode(),
				new EnteringNameMode.Callback() {
					@Override
					public void onNameEntered(String newName) {
						changeName(newName);
					}
				}));
	}

	public void showInstructions(Graphics2D g, String string) {
		painter.paintInstructions(g, string);
	}

	public WormSprite getSelectedWormSprite() {
		return getWormSprite(getSelectedWorm());
	}

	public void selectNextWorm() {
		userActionHandler.selectNextWorm();
	}

	public void selectWorm(Worm worm) {
		while (getSelectedWorm() != worm) {
			selectNextWorm();
		}
	}

	public IActionHandler getProgramActionHandler() {
		return programActionHandler;
	}

	public void activateWizard() {
		userActionHandler.activateWizard();
	}

	public void addMole() {
		userActionHandler.addNewMole();
	}

}
