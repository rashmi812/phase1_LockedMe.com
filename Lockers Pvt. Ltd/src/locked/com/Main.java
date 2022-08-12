package locked.com;


public class Main {
public static void main(String[] args) {
		
		// Create "locker" folder if not present in current folder structure
		FileOperations.createFolder();
		
		ScreenDisplay.welcomeScreen();
		
		ControlOperations.welcometoApp();
	}

	
}


