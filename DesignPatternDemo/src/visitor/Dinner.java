package visitor;

public class Dinner {
	public Pizza getDinner() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new PopJohn();
		case 1:
			return new PizzaHut();
		case 2:
			return new GodFather();
		default:
			return null;
		}
	}

	public Visitor howto() {
		switch ((int) (Math.random() * 3)) {
		case 0:
			return new ByPickup();
		case 1:
			return new ByEatin();
		case 2:
			return new ByDelivery();
		default:
			return null;
		}
	}
}
