package memento;

import java.awt.event.ActionListener;

public class BtnClear {
	Mediator med;

	BtnClear(ActionListener al, Mediator m) {
		super("Clear");
		addActionListener(al);
		med = m;
		med.registerClear(this);
	}

	public void execute() {
		med.clear();
	}
}
