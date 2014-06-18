package state;

abstract class Connection {
	public abstract void open();

	public abstract void close();

	public abstract void log();
}
