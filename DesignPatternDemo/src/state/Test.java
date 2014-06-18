package state;

public class Test {
	String con;
	Controller controller;

	Test(String con) {
		controller = new Controller();
		// the following trigger should be made by the user
		if (con.equalsIgnoreCase("management"))
			controller.makeManagementConnection();
		if (con.equalsIgnoreCase("sales"))
			controller.makeSalesConnection();
		if (con.equalsIgnoreCase("accounting"))
			controller.makeAccountingConnection();
		controller.open();
		controller.log();
		controller.close();
	}
}
