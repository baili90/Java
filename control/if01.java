import java.util.Scanner;
public class if01 {
	public static void main(String[] args){
		// Q3
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("Please input your age");
		// int age = myScanner.nextInt();
		// if(age >= 18){
		// 	System.out.println("Congratulation!");
		// }else {
		// 	System.out.println("Pity～");
		// }
		// System.out.println("continue……");

		//Q2
		// int x = 7;
		// int y = 5;
		// if(x > 5){
		// 	if(y>5){
		// 		System.out.println(x + y);
		// 	}
		// 	System.out.println("x enough");
		// }else{
		// 	System.out.println("not enough");
		// }

		//Q3
		// double d1 = 12.0;
		// double d2 = 14.0;
		// Scanner myScanner = new Scanner(System.in);
		// d1 = myScanner.nextDouble();
		// d2 = myScanner.nextDouble();
		// if (d1 > 10.0 && d2 < 20.0) {
		// 	System.out.println(d1 + d2);
		// }

		//Q4
		// int n1 = 10;
		// int n2 = 5;
		// int sum = n1 + n2;
		// if (sum % 3 == 0 && sum %5 ==0 ){
		// 	System.out.println(sum);
		// }

		//Q5
		// int year = 2008;
		// if (year % 400 == 0) {
		// 	System.out.println("闰年");
		// }else if(year % 4 == 0 && year % 100 != 0){
		// 	System.out.println("闰年");
		// }else{
		// 	System.out.println("不是闰年");
		// }

		//Q6
		// Scanner myScanner = new Scanner(System.in);
		// System.out.println("Please input your score");
		// double score  = myScanner.nextDouble();

		// if (score >= 80){
		// 	System.out.println("Please input your gender");
		// 	char gender = myScanner.next().charAt(0);
		// 	if(gender == '男'){
		// 		System.out.println("进入男子组");
		// 	}else {
		// 		System.out.println("进入女子组");
		// 	}
		// }else{
		// 	System.out.println("淘汰");
		// }

		// Q7
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Please input month");
		int month = myScanner.nextInt();
		System.out.println("Please input age");
		int age = myScanner.nextInt();
		if (month >= 4 && month <= 10) {
			if (age > 60) {
				System.out.println("20");
			}else if(age >= 18){
				System.out.println("60");
			}else if(age < 18){
				System.out.println("30");
			}else{
				System.out.println("{Please return input!");
			}
		}else if(month < 4 || (month >10 && month <= 12)){
			if (age >=18 && age <= 60){
				System.out.println("40");
			}else{
				System.out.println("20");
			}
		}
	}
}