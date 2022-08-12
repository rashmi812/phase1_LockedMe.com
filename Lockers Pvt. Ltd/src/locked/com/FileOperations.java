package locked.com;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class FileOperations {
	public static void createFolder() {
		String foldername= "locker";
		File file = new File(foldername);

		// If folder doesn't exist, create the locker folder
		if (!file.exists()) {
			file.mkdirs();
			
		}
		
	}

	public static void displayFiles(String path) {
		FileOperations.createFolder();
		// All required files and folders inside "locker" folder 
		
		File dir = new File(path);
		
		File[] files = dir.listFiles();
		if(files==null) {
			System.out.println("Empty directory.");
		}
		else {
		
			List<File> filesList = Arrays.asList(files);

			Collections.sort(filesList);
	        System.out.println("Displaying all files in ascending order\n");
			filesList.stream().forEach(System.out::println);
			
		}
		
	}

	

	public static void addFile(String fileToAdd, Scanner sc) {
		FileOperations.createFolder();
		Path pathToFile = Paths.get("./locker/" + fileToAdd);
		try {
			Files.createDirectories(pathToFile.getParent());
			Files.createFile(pathToFile);
			System.out.println(fileToAdd + " created successfully");

		

		} catch (IOException e) {
			System.out.println("Failed to create file " + fileToAdd);
			System.out.println(e.getClass().getName());
		}
	}

	

	 public static void searchFile(String fileName, Scanner sc) {
    	 
			
			File file=new File("./locker/" );
			 
			 int flag = 0;
			
			 
     String[] filelist = file.list();
			if(filelist==null) {
				System.out.println("Empty directory.");
			}
			else {
				  
			    // Linear search in the array
			    for (int i = 0; i < filelist.length;i++) {
			       String filename =filelist[i];
			             if(filename.equals(fileName)) {
			            System.out.println(fileName + " File is found");
			            flag = 1;
			            break;
			             }
			    }
			    }
			
 
			if (flag == 0) {
			    System.out.println("File Not Found");
			}
	 }
				 
		
	           

	
	 
	 public static void deleteFile(String userFilename, Scanner sc)  {
        	
		   File file = new File("./locker/");
		   String[] flist = file.list();
	        int flag = 0;
	        if (flist == null) {
	            System.out.println("Empty directory.");
	        }
	        else {
	  
	            // Linear search in the array
	            for (int i = 0; i < flist.length; i++) {
	                String filename = flist[i];
	                if (filename.equals(userFilename)) {
	                	 File file1 = new File("./locker/" + userFilename);
	                	if (file1.delete()) {
	    					System.out.println(userFilename + " deleted successfully");
	    				} else {
	    					System.out.println("Failed to delete " + userFilename);
	    				}
	                    flag = 1;
	                }
	            }
	        }
	  
	        if (flag == 0) {
	            System.out.println("File Not Found");
	        }
	    }
}
