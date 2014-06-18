package state;

class Management extends Connection {
	public void open() {
		System.out.println("open database for management");
	}

	public void close() {
		System.out.println("close the database");
	}

	public void log() {
		System.out.println("log activities");
	}
	// ...
}
