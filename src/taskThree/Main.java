package taskThree;

import java.io.File;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
	
		
		showAllFolders("./some");

	}
	
	public static void showAllFolders( String adress ) {
		
		File folder = new File(adress);
		File[] folders = folder.listFiles();
		
		for( int i = 0; i < folders.length; i++ ) {
			if( folders[i].isDirectory() ) {
				System.out.println(folders[i]);
			}
		}
	}

}

