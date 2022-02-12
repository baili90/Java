import java.util.Scanner;
public class loop {
	public static void main(String[] args){
		// int start = 1;
		// int end = 100;
		// int j = 0;
		// int sum = 0;
		// for (int i = start;i < end ;i ++ ) {
		// 	if (i % 9 == 0) {
		// 		j++;
		// 		sum +=  i;
		// 	}
		// }
		// System.out.println(j);
		// System.out.println(sum);

		//Q2
		// int n1 = 0;
		// int n2 = 5;
		// int j = n2  ;
		// for (int i = n1;i <= n2 ;i++,j-- ) {
		// 	int sum = i + j;
		// 	System.out.println(i + "+" + j + "=" + sum);
		// }

		//Q3
		// int i = 1;
		// int sum = 0;
		// while(i <= 100){
		// 	if (i % 5 == 0 && i % 3 != 0) {
		// 		System.out.println(i);
		// 	}
		// 	// sum += i;
		// 	// System.out.println(i);
		// 	i++;
		// }
		// System.out.println(sum);

		// Scanner myScanner = new Scanner(System.in);
		// char answer = ' ';
		// do{
		// 	System.out.println("打一顿");
		// 	System.out.println("还钱吗？y or n?");
		// 	answer = myScanner.next().charAt(0);
		// 	System.out.println("Answer is" + " " + answer);
		// }while(answer != 'y');

		//Q4
		// int i = 1;
		// int j = 1;
		// for (;i <= 9 ;i ++ ) {
		// 	for (j = 1;j <= i;j++ ) {
		// 		System.out.println(j + "*" + i + "=" + j*i);
		// 	}

		// }

		//Q5
		// int row = 20;
		// for (int i = 1;i <= row ;i++ ) {
		// 	for (int k = 1;k <= row - i ;k++ ) {
		// 		System.out.print(" ");
		// 	}
		// 	for (int j = 1;j <= 2 * i - 1 ;j++ ) {
		// 		if (j == 1 || j == 2 * i - 1 || i == row) {
		// 			System.out.print('*');
		// 		}else{
		// 			System.out.print(" ");
		// 		}
		// 	}
		// 	System.out.println(" ");

		//Q6
		// for (int i = 0;i < 10 ;i++ ) {
		// 	if (i == 5) {
		// 		break;
		// 	}
		// 	System.out.println("i=" + i );
		// }
		// System.out.println("退出for");
		
		//Q7
		// String TName = "丁真";
		// Scanner myScanner = new Scanner(System.in);
		// for (int i = 0;i < 3 ;i++ ) {
		// 	String name = myScanner.next();
		// 	int password = myScanner.nextInt();
		// 	if (name.equals(TName) && password == 666) {
		// 		System.out.println("You win");
		// 		break;
		// 	}else {
		// 		System.out.println("Wrong,you left "+ (2 - i) + "chances");
		// 	}
		// }

		//Q7
		// int i = 1;
		// while(i < 4){
		// 	i++;
		// 	if(i == 2){
		// 		continue;
		// 	}
		// 	System.out.println("i=" + i);
		// }
	}
}