public class Float {
	public static void main(String[] args){
	float num1 = 1.1F;
	double num2 = 1.1F;
	double num5 = .123;
	System.out.println(5.12e2);

	double num11 = 2.7;
	double num12 = 8.1/3;
	System.out.println(num11);
	System.out.println(num12);

	if (num11 == num12) {
		System.out.println("!");
	}

	if (Math.abs(num11 - num12) < 0.001) {
		System.out.println("!!!");
	}
	}
}