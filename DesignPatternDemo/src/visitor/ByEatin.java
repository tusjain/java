package visitor;

public class ByEatin implements Visitor {
	private String name;
	private final String method = "By eat in";

	public void visit(Pizza p) {
		name = p.order();
	}

	public String toString() {
		return name + " " + method;
	}

}
