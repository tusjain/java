package mediator;

import java.awt.event.ActionListener;

public class BtnBook {
	Mediator med;

	BtnBook(ActionListener al, Mediator m) {
		super("Book");
		addActionListener(al);
		med = m;
		med.registerBook(this);
	}

	public void execute() {
		med.book();
	}
}
