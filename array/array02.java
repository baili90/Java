import java.util.Scanner;
import java.util.Random;
public class array02 {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);
		// int[][] arr ={{0,0,0,0,0},{0,0,0,0,0},
		// {0,0,0,0,0},{0,0,0,0,0},{0,0,0,0,0}};
		// for (int i = 0;i < arr.length ;i++ ) {
		// 	for (int j = 0;j < arr[i].length ;j++ ) {
		// 		System.out.print(arr[i][j] + "\t");
		// 	}
		// 	System.out.println(" ");
		// }

		//Q1
		// int[][] arr = new int[3][];
		// for (int i = 0;i < arr.length ;i++ ) {
		// 	arr[i] = new int[i + 1];
		// }

		// int arr[][] = {{1,2},{2,3},{3,4}};
		// int sum = 0;
		// for(int i = 0;i < arr.length;i++){
		// 	for (int j = 0;j < arr[i].length;j++ ) {
		// 		sum += arr[i][j];
		// 	}
		// }
		// System.out.println("sum = " + sum);

		//Q3
		// int[] nums = {10,12,45,90};
		// int[] numNew = new int[5];
		// for (int i = 0;i < 4 ;i++ ) {
		// 	numNew[i] = nums[i];
		// }
		// System.out.println("Please input a number.");
		// int num = myScanner.nextInt();
		// numNew[4] = num;
		// for (int i = 3; i >= 0;i-- ) {
		// 	if (num < numNew[i]) {
		// 		int temp = numNew[i];
		// 		numNew[i] = num;
		// 		numNew[i+1] = temp;
		// 	}else{
		// 		break;
		// 	}
		// 		System.out.println(numNew[0] + " " + numNew[1] + " " + numNew[2] +  " " + numNew[3] + " " + numNew[4] );
		// }

		//A3
		// int[] arr = {10,12,45,90};
		// int inserNum = 133;
		// int index = -1;
		// for (int i = 0;i < arr.length ;i++ ) {
		// 	if (inserNum < arr[i]) {
		// 		index = i;
		// 		break;
		// 	}
		// }
		// if (index == -1) {
		// 	index = arr.length;
		// } 
		// System.out.println("index=" + index);

		//Q4
		// int nums[] = new int[10];
		// int sum = 0;
		// for (int i = 0; i < 10 ;i++ ) {
		// 	nums[i] = (int)(Math.random()*100);
		// 	System.out.println(nums[i]);
		// }
		// for (int i = 9 ;i >= 0 ;i-- ) {
		// 	System.out.println(nums[i]);
		// 	sum +=nums[i]; 
		// }
		// int avg = sum/10;
		// System.out.println("sum=" + sum + "and avg=" + avg);

		//


	}
}