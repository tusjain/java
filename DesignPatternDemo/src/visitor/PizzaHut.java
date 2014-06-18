package visitor;

public class PizzaHut implements Pizza {
	final String name = "PizzaHut";

	public String order() {
		return name;
	}

}
