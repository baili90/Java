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
		 // int[] arr = {10 ,-1,9};
		 // int max = arr[0];
		 // int maxIndex = 0;

		 // for (int i = 1;i < arr.length;i++ ) {
		 // 	if (max < arr[i]) {
		 // 		max = arr[i];
		 // 		maxIndex = i;
		 // 	}
		 // }
		 // System.out.println("max=" + max + "maxIndex=" + maxIndex);

		//Q4
		// int[] arr1 = {1,2,3};
		// int[] arr2 = arr1;
		// arr2[1] = 4;
		// for (int i = 0;i < arr1.length ;i++ ) {
		// 	System.out.println(arr1[i]);
		// }

		//Q5
		// int[] arr1 = {10,20,30};
		// int[] arr2 = new int[arr1.length];
		// for (int i = 0;i < arr1.length;i++ ) {
		// 	arr2[i] = arr1[i];
		// 	System.out.println(arr2[i]);
		// }
		// arr2[0] = 40;
		// System.out.println(arr2[0]);

		//Q6
		// int[] arr = {11,22,33};
		// int tmp = 0;
		// for (int i = 0;i < arr.length/2;i++ ) {
		// 	tmp = arr[i];
		// 	arr[i] = arr[arr.length - 1 -i];
		// 	arr[arr.length - 1 -i] = tmp;
		// 	System.out.println(arr[i]);
		// }
		// for (int i = 0;i < arr.length;i++ ) {
		// 	System.out.println(arr[i]);
		// }

		//Q7
		// int[] arr = {1,2,3};
		// int[] arr1 = new int[arr.length + 1];
		// for (int i = 0;i < arr.length;i++) {
		// 	arr1[i] = arr[i];
		// 	arr1[arr.length] = 4;
		// }
		// arr = arr1;
		// System.out.println(arr[3]);

		//Q8
		// int[] arr = {1,2,3};
		// do{
		// 	int[] arr1 = new int[arr.length + 1];
		// 	for (int i = 0;i < arr.length;i++) {
		// 		arr1[i] = arr[i];
		// 	}
		// 	System.out.println("Please input a num");
		// 	int num = myScanner.nextInt();
		// 	arr1[arr1.length - 1] = num;
		// 	arr = arr1;
		// 	System.out.println("扩容后");
		// 	for (int i = 0;i < arr.length;i++) {
		// 		 System.out.print(arr[i] + "\t");
		// 	}

		// 	System.out.println("Please input a num?y or n");
		// 	char ans = myScanner.next().charAt(0);
		// 	if (ans == 'n') {
		// 		break;
		// 	}
		// }while(true);
		// System.out.println("wow");


		//Q9

		int[] arr ={1,2,3,4,5};
		int len = arr.length;
		// for (int i = len;i > 0 ;i-- ) {
		// 	System.out.println("would you want to reduce a number?Say y / n.");
		// 	char ans = myScanner.next().charAt(0);
		// 	if(ans == 'n'){
		// 		break;
		// 	}
		// 	int[] arrNew = new int[len - 1];
		// 	for (;i < len -1;i++ ) {
		// 		arrNew[i] = arr[i];
		// 		}
		// 	arr = arrNew;
		// 	for (;i < len -1 ;i++ ) {
		// 		System.out.println(arr[i]);
		// 	}			
		// }
		// System.out.println("wow");

		//下面是先执行减数一遍
		// do{
		// 	if (len == 0) {
		// 		System.out.println("0");
		// 		break;
		// 	}
		// 	int[] arrNew = new int[len - 1];
		// 	for (int i = 0;i < len-1 ; i++) {
		// 		arrNew[i] = arr[i];
		// 	}
		// 	arr = arrNew;
		// 	len = arr.length;
		// 	for (int i = 0;i < len ; i++) {
		// 		System.out.println(arr[i]);
		// 	}
		// 	System.out.println("would you want to reduce a number?Say y / n.");
		// 	char ans = myScanner.next().charAt(0);
		// 	if(ans == 'n'){
		// 		break;
		// 	}

		// }while(true);

			do{
			if (len == 0) {
				System.out.println("0");
				break;
			}
			int[] arrNew = new int[len - 1];
			for (int i = 0;i < len-1 ; i++) {
				arrNew[i] = arr[i];
			}
			arr = arrNew;
			len = arr.length;
			for (int i = 0;i < len ; i++) {
				System.out.println(arr[i]);
			}
			System.out.println("would you want to reduce a number?Say y / n.");
			char ans = myScanner.next().charAt(0);
			if(ans == 'n'){
				break;
			}

		}while(true);



	}
}