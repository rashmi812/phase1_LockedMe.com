package locked.com;

public class ScreenDisplay {
	public static void welcomeScreen() {
		String welcome = "** Welcome to Lockers Pvt. Ltd \n" + "** This application is developed by Rashmi Rathi \n"
				+ "*****************************************************\n";
		String info = "--------Company Lockers Pvt. Ltd. hired me as a Full Stack Developer-------\n"
				+ "The goal of the company is to deliver a high-end quality product as early as possible. \n";
				
		System.out.println(welcome);

		System.out.println(info);
	}

	public static void displayMenu() {
		String displaymenu = "\n\n### Select any number from below and press Enter ###\n\n"
				+ "1) Retrieve all files in ascending order\n"
                + "2) Details of the user interface menu for File operations\n"
				+ "3) Close the application\n";
		System.out.println(displaymenu);

	}

	public static void displayFileMenu() {
		String operations = "\n\n### Select any option number from below and press Enter ###\n\n"
				+ "1) Add a file to the existing directory list\n" 
				+ "2) Delete a user specified file from the existing directory list\n"
				+ "3) Search a user specified file from the main directory\n" + "4) Option to navigate back to the main context\n" 
				+ "5) close the application\n";

		System.out.println(operations);
	}
}
