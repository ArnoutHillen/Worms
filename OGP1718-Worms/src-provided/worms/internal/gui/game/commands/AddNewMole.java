package worms.internal.gui.game.commands;

import java.util.Random;

import worms.facade.IFacade;
import worms.internal.gui.GUIUtils;
import worms.internal.gui.game.PlayGameScreen;
import worms.internal.gui.messages.MessageType;
import worms.model.Mole;
import worms.util.ModelException;

public class AddNewMole extends InstantaneousCommand {

	private static final double MIN_RADIUS = 0.33;
	private static final double MAX_RADIUS = 1.0;

	public AddNewMole(IFacade facade, PlayGameScreen screen) {
		super(facade, screen);
	}

	@Override
	protected boolean canStart() {
		return true;
	}

	@Override
	protected void doStartExecution() {
		try {
			Random random = getScreen().getGameState().getRandom();
			int nbMoles = (int) getFacade().getAllItems(getWorld()).stream().filter(i -> i instanceof Mole).count();
			String name = "Mole " + GUIUtils.numberToName(nbMoles++);
			double radius = MIN_RADIUS + (MAX_RADIUS - MIN_RADIUS) * random.nextDouble();

			double worldWidth = getFacade().getWorldWidth(getWorld());
			double worldHeight = getFacade().getWorldHeight(getWorld());

			double x = radius + (worldWidth - 2 * radius) * random.nextDouble();
			double y = radius + (worldHeight - 2 * radius) * random.nextDouble();
			double[] p = { x, y };

			double direction = random.nextDouble() * 2 * Math.PI;
			getFacade().createMole(getWorld(), p, direction, radius, name);
		} catch (ModelException e) {
			e.printStackTrace();
			getScreen().addMessage("Could not create mole", MessageType.ERROR);
		}
	}
}
