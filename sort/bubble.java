import java.util.Scanner;
public class bubble {
	public static void main(String[] args){
		// int[] arr = {4,3,2,5,0};
		// int temp = 0;
		// for (int i = 0;i < 4;i++ ) {
		// 	for (int j = 0;j < 4 - i ;j++ ) {
		// 		if (arr[j] > arr[j+1]) {
		// 			temp = arr[j];
		// 			arr[j] = arr[j+1];
		// 			arr[j+1]=temp;
		// 		}
		// 	}
		// 	System.out.println("n time =");
		// 	for (int j = 0;j < arr.length ;j++ ) {
		// 		System.out.println(arr[j] + "\t");
		// 	}
		// }

		//Q1
		String[] names  = {"白色","金色","紫色","青色"};
		Scanner myScanner = new Scanner(System.in);
		int index = -1;

		System.out.println("Please input name");
		String name = myScanner.next();
		for (int i = 0;i < 4 ;i++ ) {
			if (name.equals(names[i])) {
				System.out.println("Congratulation");
				index = 1;
				break;
			}
		}
		if (index == -1 ){
			System.out.println("No");
		}

	}


}