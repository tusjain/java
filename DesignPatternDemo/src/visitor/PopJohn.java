package visitor;

public class PopJohn implements Pizza {
	final String name = "PopJohn";

	public String order() {
		return name;
	}

}
