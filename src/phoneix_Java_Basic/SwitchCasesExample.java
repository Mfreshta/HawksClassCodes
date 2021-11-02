package phoneix_Java_Basic;

public class SwitchCasesExample {
	public static void main(String[] args) {

		String day = "sat";

		// in switch, we compare the key to the case expressions,
		// as soon as we find a match, we start running the statements from there
		// we only stop if we either see a break or end of the switch

		// byte , short , char , and int + String
		switch (day) {
		case "sat":
			System.out.println("weekend day 1");
		case "sun":
			System.out.println("weekend day 2");
		case "mon":
			System.out.println("the start of the week");
		default:
			System.out.println("some other day");
		}
		
		
		
		
		System.out.println("-----------------------");
		if (day.equals("sat")) {
			System.out.println("weekend day 1");
		} else if (day.equals("sun")) {
			System.out.println("weekend day 2");
		} else if (day.equals("mon")) {
			System.out.println("the start of the week");
		}

		String task = "Task3";

		System.out.println("Tasks left to do: ");

		switch (task) {
		case "Task1":
			System.out.println("Task 1");
		case "Task2":
			System.out.println("Task 2");
		case "Task3":
			System.out.println("Task 3");
		}
		
		System.out.println("-------------------------");
		
		int numberOfdayOfTheWeek = 5;  // 1=mon --> 7=sun
		
		switch (numberOfdayOfTheWeek) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wendsday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
		case 6:
			System.out.println("Saturday");
		case 7:
			System.out.println("Sunday");
		}

		
	}
}
