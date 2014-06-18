package visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List pizzaList = new ArrayList();
		pizzaList.add(new PopJohn());
		pizzaList.add(new PizzaHut());
		pizzaList.add(new GodFather());
		Iterator it = pizzaList.iterator();
		System.out.println("How many pizza restaurants in this area?");
		while (it.hasNext()) {
			System.out.println(((Pizza) it.next()).order());
		}
		Dinner d = new Dinner();
		Pizza pza = d.getDinner();
		Visitor v = d.howto();
		v.visit(pza);
		System.out.println("\nWhich store for dinner?");
		System.out.println(v);
	}
}
