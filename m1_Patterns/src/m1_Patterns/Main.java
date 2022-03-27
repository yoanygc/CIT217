package m1_Patterns;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

//		int option = 0;
//		char actualPattern = ' ';
//		
//		Scanner scanner = new Scanner(System.in);
//		
//		do {
//			System.out.println("");
//			System.out.println("**** MENU ****");
//			System.out.println("1- Select Pattern A");
//			System.out.println("2- Select Pattern B");
//			System.out.println("3- Output via Console");
//			System.out.println("4- Output to TXT File");
//			System.out.println("5- Quit");
//			
//			option = scanner.nextInt();
//
//			switch (option) {
//			case 1:
//				actualPattern = 'A';
//				System.out.println("Pattern A Selected");
//				break;
//
//			case 2:
//				actualPattern = 'B';
//				System.out.println("Pattern B Selected");
//				break;
//			
//			case 3:
//				if (actualPattern == 'A') {
//					Console_Pattern_A();			
//				}else if(actualPattern == 'B') {
//
//				}else {
//					System.out.println("No Pattern Selected.");
//					
//				}
//				break;
//				
//			case 4:
//				if (actualPattern == 'A') {
//					File_Pattern_A();			
//				}else if(actualPattern == 'B') {
//
//				}else {
//					System.out.println("No Pattern Selected.");
//					
//				}
//				
//				break;
//				
//			default:
//				break;
//			}
//		} while (option < 5); 

	
		//Console_Pattern_A();
		File_Pattern_A();

	}

	public static void Console_Pattern_A() {

		int rowMax = 6;
		int colMax = 6;

		for (int i = 1; i <= rowMax; i++) {

			System.out.println("");
			for (int j = 1; j <= colMax; j++) {

				if (j <= i) {
					System.out.print(j);
				} else {
					System.out.print("*");
				}
			}
		}
		System.out.println("");
	}

	public static void File_Pattern_A() {

		File outFile = new File("outFile.txt");
		FileOutputStream outFileStream;
		PrintWriter outStream;
		
		try {
		
			outFileStream = new FileOutputStream(outFile);
			outStream = new PrintWriter(outFileStream);
			
		
		} catch (FileNotFoundException e) {

			System.out.println("Error opening the file...");
			return;
		}
		
		int rowMax = 6;
		int colMax = 6;

		for (int i = 1; i <= rowMax; i++) {

			outStream.println("");
			for (int j = 1; j <= colMax; j++) {

				if (j <= i) {
					outStream.print(j);
				} else {
					outStream.print("*");
				}
			}
		}
		outStream.close();
		System.out.println("");
		
	}

}
