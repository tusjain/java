package mediator;

import java.awt.Font;

public class LblDisplay {
	Mediator med;

	LblDisplay(Mediator m) {
		super("Just start...");
		med = m;
		med.registerDisplay(this);
		setFont(new Font("Arial", Font.BOLD, 24));
	}
}
