package mediator;

import java.awt.event.ActionListener;

public class BtnSearch {
	Mediator med;

	BtnSearch(ActionListener al, Mediator m) {
		super("Search");
		addActionListener(al);
		med = m;
		med.registerSearch(this);
	}

	public void execute() {
		med.search();
	}
}
