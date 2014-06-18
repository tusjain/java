package mediator;

import java.awt.event.ActionListener;

public class BtnView {
	Mediator med;

	BtnView(ActionListener al, Mediator m) {
		super("View");
		addActionListener(al);
		med = m;
		med.registerView(this);
	}

	public void execute() {
		med.view();
	}
}
