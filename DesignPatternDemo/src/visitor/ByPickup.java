package visitor;

public class ByPickup implements Visitor {
	private String name;
	private final String method = "By pick up";

	public void visit(Pizza p) {
		name = p.order();
	}

	public String toString() {
		return name + " " + method;
	}

}
