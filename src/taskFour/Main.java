package taskFour;

import java.io.File;

public class Main {

	public static void main(String[] args) {
		
		
		System.out.println( getFileSize("./some/big.mp4") );
		System.out.println( getFileSize("./some/small.txt") );
		System.out.println( getFileSize("./some/java.jpg") );
		System.out.println( getFileSize("./some/text.txt") );
	
	}
	

	public static String getFileSize( String fileAdress ) {
		
		String res = "File is not exist";
		
		File file = new File( fileAdress );
		if( file.isFile() ) {
			long fileSize = file.length();
			res = fileSize + "";
			if( fileSize < 1024 ) {
				res = fileSize + " bytes";
			} else if( fileSize >= 1024 && fileSize < 1048576 ) {
				res = fileSize/1024 + " kilobyte";
			} else {
				res = String.format("%.2f", (double) ( (fileSize / 1024.0) / 1024.0 ) ) + " mb";
			}
			
		}
		
		return res;	
	}
	
}

