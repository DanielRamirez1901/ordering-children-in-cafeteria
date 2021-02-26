import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	ArrayList <Double> age;
	public static Integer[] array;

	
	public static void bubbleSort() {
		boolean changed = true;
		for (int i = 1; i < array.length && changed; i++) {
			changed = false;
			for(int j = 0; j < array.length-i; j++) {
				if(array[j] > array[j+1]) {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
					changed = true;
				}
			}
		}
	}
	public static void main(String[] args) {
		array = new Integer[] {7,3,9,2,5,1,6,4,8};
		bubbleSort();

	}

}
