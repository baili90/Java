import java.util.Scanner;
public class exercise {
	public static void main(String[] args){
		Scanner myScanner = new Scanner(System.in);

		//Q1
		// double cash = 100000;
		// int time = 0;
		// while(cash > 0){
		// 	if (cash > 50000) {
		// 		cash *= 0.95;
		// 		time++;
		// 		System.out.println(time);
		// 	}else{
		// 		cash -=1000;
		// 		time++;
		// 		System.out.println(time);
		// 		if (cash < 1000) {
		// 			System.out.println(time);
		// 			break;
		// 		}
		// 	}
		// }

		// A1 答案代码相比之下更简洁清晰，但是自己的思路和结果都不错。
		// double cash = 100000;
		// int time = 0;
		// while(cash > 0){
		// 	if (cash > 50000) {
		// 		cash *= 0.95;
		// 		time++;
		// 	}else if(cash >= 1000){
		// 		cash -=1000;
		// 		time++;
		// 	}else{
		// 		break;
		// 	}	
		// }
		// System.out.println(time);


			//Q2
			// System.out.println("Please input number");
			// int num = myScanner.nextInt();
			// if (num >= 0) {
			// 	if (num == 0) {
			// 		System.out.println("等于0");
			// 	}else{
			// 		System.out.println("大于0");
			// 	}
			// }else{
			// 	System.out.println("小于0");
			// }

		//Q4
		// System.out.println("Please input number");
		// int num = myScanner.nextInt();
		// int n1 = num / 100;
		// int n2 = (num - n1 * 100) /10;
		// int n3 = num - n1 * 100 - n2 * 10;
		// while(num >= 100 && num <= 999){
		// 	if (num == (n1 * n1 * n1 + n2 * n2 * n2 +n3 * n3 * n3 )) {
		// 		System.out.println("Yes,it's ego.");
		// 		break;
		// 	}
		// }

		//A4 自己这里的取n1、n2、n3方法不太方便
		// System.out.println("Please input number");
		// int num = myScanner.nextInt();
		// int n1 = num / 100;
		// int n2 = num % 100 / 10;
		// int n3 = num % 10;
		// while(num >= 100 && num <= 999){
		// 	if (num == (n1 * n1 * n1 + n2 * n2 * n2 +n3 * n3 * n3 )) {
		// 		System.out.println("Yes,it's ego.");
		// 		break;
		// 	}
		// }

		//Q6
		// int n = 1;
		// int count = 0;
		// while(n <= 100 ) {
		// 	if (n % 5 != 0) {
		// 		System.out.print(n);
		// 		count++;
		// 		if (count % 5 == 0) {
		// 		System.out.println(" ");
		// 	}
		// 	}
		// 	n++;
			
		// 	// while(n % 5 != 0){
		// 	// 	System.out.print(n);
		// 	// 	count++;
		// 	// 	if (count % 5 == 0) {
		// 	// 	System.out.println(" ");		
		// 	// 	}
		// 	// }

		// }

		//A6
		 // int count = 0;
		 // for (int i = 1;i <= 100 ;i++ ) {
		 // 	if (i % 5 != 0) {
		 // 		count++;
		 // 		System.out.print(i + "\t");
		 // 		if (count % 5 ==0) {
		 // 			System.out.println(" ");
		 // 		}
		 // 	}
		 // }

		//Q7
		// char letter = 'A';
		// int na = (int)letter;
		// int nz = (int)'Z';
		// // System.out.println(nz);
		// // System.out.println(na);
		// for (int n = 97;n <= 122 ;n++) {
		// 	System.out.println((char)n);
		// }
		// for (int m = 90;m >= 65 ;m--) {
		// 	System.out.println((char)m);
		// }

		// A7 没想到这个比较式子
		// for (char c1 = 'a';c1 <= 'z' ;c1++ ) {
		// 	System.out.print(c1 + " ");
		// }

		// Q8
		// int n = 1;
		// int m = 1;
		// int num = 0;
		// int sum = 0;
		// for (;m <= 100 ;m++ ) {
		// 	// int num =n/m*1
		// 	if (m % 2 ==0) {
		// 	 	num = -n/m;
		// 	 	sum +=num;
		// 	 	// System.out.println(sum);
		// 	 	break;
		// 	 } else{
		// 	 	num = n/m;
		// 	 	sum +=num;
		// 	 	// System.out.println(sum);
		// 	 	break;
		// 	 }
		// }
		// 	 	System.out.println(sum);

		//A8 这题没做对,没考虑到精度问题。
		// double sum = 0;
		// for (int i = 1;i <= 100 ;i++ ) {
		// 	if (i % 2 != 0) {
		// 		sum += 1.0 / i;
		// 	}else{
		// 		sum -= 1.0 / i;
		// 	}
		// }
		// System.out.println(sum);

		//Q9
		// int sum = 0;
		// int total = 0;
		// for (int n = 1;n <= 100 ;n++ ) {
		// 	sum += n;
		// 	total += sum;
		// }
		// System.out.println(total);

		// //A9 居然，这道题我的代码比教程还简洁！
		// int sum = 0;
		// for (int n = 1;n <= 100 ;n++ ) {
		// 	for (int j = 1;j <= i ;j++ ) {
		// 		sum += j;
		// 	}
		// }
		// System.out.println(total);


	}
}