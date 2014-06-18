package memento;

import java.awt.event.ActionListener;

public class BtnPrevious {
	Mediator med;

	BtnPrevious(ActionListener al, Mediator m) {
		super("Previous");
		addActionListener(al);
		med = m;
		med.registerPrevious(this);
	}

	public void execute() {
		med.previous();
	}
}
