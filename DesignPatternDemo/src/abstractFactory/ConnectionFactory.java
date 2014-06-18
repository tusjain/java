package abstractFactory;

public interface ConnectionFactory {
	Local getLocalConnection();
	Remote getRemoteConnection();
	}
