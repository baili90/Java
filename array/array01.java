import java.util.Scanner;
public class array01{
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		// double[] hens = {3,5,1,3.4,2,50};
		// double totalWeight = 0;
		// for (int i = 0;i < 6 ;i++ ) {
		// 	System.out.println("i=" + hens[i]);
		// 	totalWeight += hens[i];
		// }
		// System.out.println("avg=" + (totalWeight/6));

		//Q1 
		// double[] scores = new double[5];
		// for (int i = 0;i < scores.length;i++ ) {
		// 	System.out.println("Please input your num");
		// 	scores[i] = myScanner.nextDouble();
		// }
		// for (int i = 0;i < scores.length;i++ ) {
		// 	System.out.println("i=" + scores[i]);
		// }

		//Q2
		// char[] letters = new char[26];
		// for (int i = 0;i < 26;i++ ) {
		// 	letters[i] = (char)('A' + i);  
		// 	System.out.println(letters[i]);
		// }

		//Q3
		 int[] arr = {10,-1,9};
		 int max = arr[0];
		 int maxIndex = 0;

		 for (int i = 1;i < arr.length;i++ ) {
		 	if (max < arr[i]) {
		 		max = arr[i];
		 		maxIndex = i;
		 	}
		 }
		 System.out.println("max=" + max + "maxIndex=" + maxIndex);







	}
}