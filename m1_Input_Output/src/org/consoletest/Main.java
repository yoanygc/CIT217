package org.consoletest;

import java.util.InputMismatchException;
import java.util.Scanner;


import java.io.*;
/*
 * An Application Shell
 */

// Main Class
public class Main {

	// static main method
	public static void main(String[] args) throws IOException {

//		 PrefixPostfixIncrementOperators();
//		 ShortcutArithmeticOperators();
//		 EnteringDataFromStandardInput();
//		LowLevelOutputToFile();
//		LowLevelInputFromFile();
//		HighLevelDataOutputToFile();
//		PrintWriterOutputToFiles();
//		BufferedReaderInputFromFile();
		ExceptionHandling(); 
//		ThrowingExceptions();
		
	}

	public static void PrefixPostfixIncrementOperators() {

		int a = 5;

		System.out.println("a = " + a);		// --> a = 5

		System.out.println("\nAfter a++; a = " + a++); // a = a + 1		--> a = 6  
		System.out.println("\nAfter a++; a = " + a);
		System.out.println("\nAfter ++a; a = " + ++a); // a = a + 1;    --> a = 6 

	}

	public static void ShortcutArithmeticOperators() {

		int a = 5;
		System.out.println("a = " + a);

		a += 10; // a = a + 10
		System.out.println("\nAfter a +=10; a = " + a);

		a -= 3; // a = a - 3;
		System.out.println("\nAfter a -= 3; a = " + a);

		a *= 2; // a = a * 2;
		System.out.println("\nAfter a *= 2; a is " + a);
	}

	public static void EnteringDataFromStandardInput() {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter your first name: ");
		String firstName = scanner.next();

		System.out.print("How old are you?: ");
		Integer age = scanner.nextInt();
		
		
		System.out.println("Nice to meet you, " + firstName + ".");
		System.out.println("You are " + age + " years old.");

		scanner.close();
	}

	private static void LowLevelOutputToFile() {

		// First we create a File object:
		File outFile = new File("sample1.data");
		try {

			// Then we associate a new FileOutputStream object to outFile:
			System.out.println("Creating the file...");
			FileOutputStream outStream = new FileOutputStream(outFile);

			// These are datas to be writen to the file
			byte[] byteArray = { 10, 20, 30, 40, 50, 60, 70, 80 };

			// Write the whole byte array at once to the file
			System.out.println("Writing to the file...: ");
			outStream.write(byteArray);

			// After the values are written to the file, we must close the stream:
			System.out.println("Closing the file...");
			outStream.close();

		} catch (IOException e) {

			e.printStackTrace();	
		}

	}

	private static void LowLevelInputFromFile() {

		// First we create a File object
		File inFile = new File("sample1.data");
		int fileSize = (int) inFile.length();
		byte[] byteArray = new byte[fileSize];

		try {
			// Associate a new FileInputStream object to inFile:
			FileInputStream inStream = new FileInputStream(inFile);
			
			// Read from file
			inStream.read(byteArray);

		} catch (IOException e) {
			System.out.println("ERROR...There was a problem getting access to the file...");
		}

		// Print to console
		for (int i = 0; i < fileSize; i++) {
			System.out.print(byteArray[i] + ", ");
		}

	}

	private static void HighLevelDataOutputToFile() {
		
		//set up the streams
		File outFile = new File("sample2.data");
		FileOutputStream outFileStream;
		try {
			outFileStream = new FileOutputStream(outFile);
			DataOutputStream outDataStream = new DataOutputStream(outFileStream);
			//write values of primitive data types to the stream
			outDataStream.writeInt(987654321);
			outDataStream.writeLong(11111111L);
			outDataStream.writeFloat(22222222F);
			outDataStream.writeDouble(3333333D);
			outDataStream.writeChar('A');
			outDataStream.writeBoolean(true);
			//output done, so close the stream
			outDataStream.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void PrintWriterOutputToFiles() {
		
		//set up file and stream
		File outFile = new File("sample3.data");
		FileOutputStream outFileStream;
		PrintWriter outStream = null;
		
		try {
			outFileStream = new FileOutputStream(outFile);
			outStream = new PrintWriter(outFileStream);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error opening the file.");
		}
		
		//write values of primitive data types to the stream
		outStream.println(987654321);
		outStream.println(1234L);
		outStream.println(567890F);
		outStream.println(33333333D);
		outStream.println('A');
		outStream.println(true);
		
		//output done, so close the stream
		outStream.close();
	}

	private static void BufferedReaderInputFromFile() throws IOException {
		
		File inFile = new File("sample3.data");
		FileReader fileReader = new FileReader(inFile);
		BufferedReader bufReader = new BufferedReader(fileReader);
		String str;
		
		//get integer
		str = bufReader.readLine();
		int i = Integer.parseInt(str);
		
		//get long
		str = bufReader.readLine();
		long l = Long.parseLong(str);
		
		//get float
		str = bufReader.readLine();
		float f = Float.parseFloat(str);
		
		//get double
		str = bufReader.readLine();
		double d = Double.parseDouble(str);
		//get char
		str = bufReader.readLine();
		char c = str.charAt(0);
		
		//get boolean
		str = bufReader.readLine();
		boolean b = Boolean.parseBoolean(str);
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		
		//input done, so close the stream
		bufReader.close();
		
	}

	private static void ExceptionHandling() {
		
		Scanner scanner = new Scanner(System.in);
		Integer intNumber = 0;
		
		System.out.print("Enter a valid Integer number: ");
		
		try {
			
			intNumber = scanner.nextInt();
			System.out.println("Entered number: " + intNumber);
			scanner.close();
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid Entry...Please enter an Integer number. ");
			scanner.close();
		}
		
		
	}
	
	private static void ThrowingExceptions() {
		
		Scanner scanner = new Scanner(System.in);
		Integer age = 0;
		
		System.out.print("How old are you: ");
		
		try {
			age = scanner.nextInt();
			
			if (age < 0) {
				scanner.close();
				throw new Exception("Negative age is invalid");
			}
			
			System.out.println("You are " + age + " years old");
			
		} catch (InputMismatchException e) {
			System.out.println("Invalid Entry...Please enter an Integer number. ");
			
		} catch (Exception e) {
			System.out.println("ERROR..." + e.getMessage());
		}
		finally {
			System.out.println("DONE");
			scanner.close();
		}
		
	}

	
}
