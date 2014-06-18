package state;

public class Controller {
	public static Accounting acct;
	public static Sales sales;
	public static Management manage;
	private static Connection current;

	Controller() {
		acct = new Accounting();
		sales = new Sales();
		manage = new Management();
	}

	public void makeAccountingConnection() {
		current = acct;
	}

	public void makeSalesConnection() {
		current = sales;
	}

	public void makeManagementConnection() {
		current = manage;
	}

	public void open() {
		current.open();
	}

	public void close() {
		current.close();
	}

	public void log() {
		current.log();
	}
}
