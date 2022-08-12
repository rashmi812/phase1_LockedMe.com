package locked.com;

import java.util.Scanner;

public class ControlOperations {
	public static void welcometoApp() {
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				ScreenDisplay.displayMenu();
				int input = sc.nextInt();

				switch (input) {
				case 1:
					FileOperations.displayFiles("locker");
					break;
				case 2:
					ControlOperations.fileMenu();
					break;
				case 3:
					System.out.println("Program exited successfully.");
					result = false;
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				welcometoApp();
			} 
		} while (result == true);
	}
	
	public static void fileMenu() {
		boolean result = true;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				ScreenDisplay.displayFileMenu();
				FileOperations.createFolder();
				
				int input = sc.nextInt();
				switch (input) {
				case 1:
					// File Add
					System.out.println("Enter the name of the file to be added to the \"locker\" folder");
					String fileToAdd = sc.next();
					
					FileOperations.addFile(fileToAdd, sc);
					
					break;
				case 2:
					// File delete
					System.out.println("Enter the name of the file to be deleted from \"locker\" folder");
					String filename = sc.next();
					
					
					FileOperations.deleteFile(filename, sc);
		        	 
				

					break;
				case 3:
					// File Search
					System.out.println("Enter the name of the file to be searched from \"locker\" folder");
					String fileName = sc.next();
					
					
					FileOperations.searchFile(fileName,  sc);

					
					break;
				case 4:
					// Go to Previous menu
					return;
				case 5:
					// Exit
					System.out.println("Program exits successfully.");
					result = false;
					sc.close();
					System.exit(0);
				default:
					System.out.println("Please select a valid option from above.");
				}
			} catch (Exception e) {
				System.out.println(e.getClass().getName());
				fileMenu();
			}
		} while (result == true);
	}
}
