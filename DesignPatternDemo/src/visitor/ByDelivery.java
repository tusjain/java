package visitor;

public class ByDelivery implements Visitor {
	private String name;
	private final String method = "By delivery";

	public void visit(Pizza p) {

		name = p.order();
	}

	public String toString() {
		return name + " " + method;
	}

}
