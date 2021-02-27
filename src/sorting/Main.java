package sorting;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class Main {
	public static Double[] array;
	

//********************************************************************
	
	public static double bubbleSort() {//Method to organize the data
		boolean changed = true;
		double ci = 0;
		for (int i = 1; i < array.length && changed; i++) {
			changed = false;
			for(int j = 0; j < array.length-i; j++) {
				if(array[j] > array[j+1]) {
					ci++;
					double temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changed = true;
				}//End if
			}//End for
		}//End for
		return ci = ci/(array.length-1);
	}//End bubbleSort method
	
//******************************************************************
	
	public static Double [] convertToDouble(String[] arrayString) {//Method to transform the array of strings that contains a case into an array of type double
		Double arrayDouble [] = new Double[arrayString.length];
		for(int i = 0; i<arrayDouble.length; i++) {
			arrayDouble [i] = Double.parseDouble(arrayString[i]);
		}//End for
		return arrayDouble;
	}//End convertToDouble method
	
//******************************************************************
	
	public static String formatOutput() {//Method to format the data
		DecimalFormatSymbols dfs = new DecimalFormatSymbols();dfs.setDecimalSeparator('.');
		DecimalFormat df = new DecimalFormat(".##",dfs);
		String output = "";
		output =  df.format(bubbleSort()) + "-" + array[0];
		for(int i = 1; i<array.length; i++) {
			output = output + " " + array[i];
		}//End for
		return output;
	}//End formatOutput method
	
//*******************************************************************
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int caseNumber = Integer.parseInt(sc.nextLine());

		while(caseNumber>0) {
			String caseLine = sc.nextLine();
			String [] arrayString = caseLine.split(" ");
			array = convertToDouble(arrayString);
			System.out.println(formatOutput());
			caseNumber--;
		}//End while
		
	}//End main method
}//End Main class
