//Here is a good example of an "assert" statement used to check an invariant:
// Day-of-week calculator

public class DayOfWeek {
	private int days = 0;

	public DayOfWeek(int d) {
		days = d;
	}

	// calculate day of the week
	public String getDayOfWeek() {
		if (days % 7 == 0) {
			return "Sunday";
		} else if (days % 7 == 1) {
			return "Monday";
		} else if (days % 7 == 2) {
			return "Tuesday";
		} else if (days % 7 == 3) {
			return "Wednesday";
		} else if (days % 7 == 4) {
			return "Thursday";
		} else if (days % 7 == 5) {
			return "Friday";
		} else {
			assert days % 7 == 6 : days;
			return "Saturday";
		}
	}

	// main method for testing purpose
	public static void main(String[] arg) {
		int d = Integer.parseInt(arg[0]);
		DayOfWeek o = new DayOfWeek(d);
		System.out.print("Day of the week: " + o.getDayOfWeek());
	}

}
