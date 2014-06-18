package state;

class Accounting extends Connection {
	public void open() {
		System.out.println("open database for accounting");
	}

	public void close() {
		System.out.println("close the database");
	}

	public void log() {
		System.out.println("log activities");
	}
	// ...
}
