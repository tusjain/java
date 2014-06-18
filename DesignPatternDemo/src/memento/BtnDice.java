package memento;

import java.awt.event.ActionListener;

public class BtnDice {
	Mediator med;

	BtnDice(ActionListener al, Mediator m) {
		super("Throw Dice");
		addActionListener(al);
		med = m;
		med.registerDice(this);
	}

	public void execute() {
		med.throwit();
	}
}
