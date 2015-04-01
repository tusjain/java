package object;
public class Example {
	public static void main(String[] args) {
		ResourceCarrier carrier = new ResourceCarrier();
		ThingNeedingResource thingNeedingResource = new ThingNeedingResource(carrier);
		ThingNeedingResource thingNeedingResource2 = new ThingNeedingResource(carrier);
		ThingNeedingResource thingNeedingResource3 = new ThingNeedingResource(carrier);
		ResourceCreator resourceCreator = new ResourceCreator(carrier);
		new Thread(thingNeedingResource).start();
		new Thread(thingNeedingResource2).start();
		new Thread(thingNeedingResource3).start();
		new Thread(resourceCreator).start();
	}
}