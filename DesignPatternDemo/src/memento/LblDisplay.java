package memento;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import mediator.Mediator;

public class LblDisplay {
	Mediator med;

	LblDisplay(Mediator m) {
		super("0", JLabel.CENTER);
		med = m;
		med.registerDisplay(this);
		setBackground(Color.white);
		setBorder(new EtchedBorder(Color.blue, Color.green));
		Font font = new Font("Arial", Font.BOLD, 40);
		setFont(font);
	}
}
