package object;

public class ResourceCarrier {
	private boolean resourceReady;
	public boolean isResourceReady() {
		return resourceReady;
	}
	public void resourceIsReady() {
		resourceReady = true;
	}
}