package taskOne;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input your text and press 'Enter' to save in a file:");
		
		String text = sc.nextLine();
		
		File file = new File( "taskOne.txt" );
		
		try( PrintWriter pw = new PrintWriter(file) ) {
			pw.println( text );
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
