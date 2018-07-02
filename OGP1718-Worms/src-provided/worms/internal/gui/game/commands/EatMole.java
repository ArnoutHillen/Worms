package worms.internal.gui.game.commands;

import worms.facade.IFacade;
import worms.internal.gui.game.PlayGameScreen;
import worms.internal.gui.messages.MessageType;
import worms.model.Mole;
import worms.model.Worm;
import worms.util.ModelException;

public class EatMole extends InstantaneousCommand {
	private final Mole mole;

	public EatMole(IFacade facade, Mole mole,
			PlayGameScreen screen) {
		super(facade, screen);
		this.mole = mole;
	}

	@Override
	protected boolean canStart() {
		return mole != null;
	}

	@Override
	protected void doStartExecution() {
		try {
			long nbWormsBefore = getFacade().getAllItems(getWorld()).stream().filter(Worm.class::isInstance).count();
			getFacade().eat(mole);
			long nbWormsAfter = getFacade().getAllItems(getWorld()).stream().filter(Worm.class::isInstance).count();
			if (nbWormsAfter < nbWormsBefore) {
				getScreen().addMessage("Yummie!", MessageType.INFO);
			}
		} catch (ModelException e) {
			getScreen().addMessage("This mole cannot eat.", MessageType.ERROR);
		}
	}
}