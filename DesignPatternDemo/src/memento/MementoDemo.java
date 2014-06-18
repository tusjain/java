package memento;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import mediator.Command;

public class MementoDemo extends JFrame implements ActionListener {
	Mediator med = new Mediator();

	MementoDemo() {
		JPanel p = new JPanel();
		p.add(new BtnDice(this, med));
		p.add(new BtnPrevious(this, med));
		p.add(new BtnClear(this, med));
		JPanel dice = new JPanel();
		LblDisplay lbl = new LblDisplay(med);
		dice.add(lbl);
		getContentPane().add(dice, "Center");
		getContentPane().add(p, "South");
		setTitle("Memento pattern example");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 200);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		Command comd = (Command) ae.getSource();
		comd.execute();
	}

	public static void main(String[] args) {
		new MementoDemo();
	}

}
