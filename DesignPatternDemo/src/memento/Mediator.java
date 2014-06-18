package memento;

public class Mediator {
	BtnDice btnDice;
	BtnPrevious btnPrevious;
	BtnClear btnClear;
	LblDisplay show;
	java.util.List list, undo;
	boolean restart = true;
	int counter = 0, ct = 0;

	// ....
	Mediator() {
		list = new ArrayList();
		undo = new ArrayList();
	}

	void registerDice(BtnDice d) {
		btnDice = d;
	}

	void registerClear(BtnClear c) {
		btnClear = c;
	}

	void registerPrevious(BtnPrevious p) {
		btnPrevious = p;
	}

	void registerDisplay(LblDisplay d) {
		show = d;
	}

	void throwit() {
		show.setForeground(Color.black);
		int num = (int) (Math.random() * 6 + 1);
		int i = counter++;
		list.add(i, new Integer(num));
		undo.add(i, new Memento(num));
		show.setText("" + num);
	}

	void previous() {
	show.setForeground(Color.red);
	btnDice.setEnabled(false);
	if (undo.size() > 0) {
	ct = undo.size()-1;
	Memento num = (Memento)undo.get(ct);
	show.setText(""+num.getNum());
	61
	undo.remove(ct);
	}
	if (undo.size() == 0)
	show.setText("0");
	}

	void clear() {
		list = new ArrayList();
		undo = new ArrayList();
		counter = 0;
		show.setText("0");
		btnDice.setEnabled(true);
	}
}
