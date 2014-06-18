package state;

class Sales extends Connection {
	public void open() {
		System.out.println("open database for sales");
	}

	public void close() {
		System.out.println("close the database");
	}

	public void log() {
		System.out.println("log activities");
	}

	public void update() {

	}
}
