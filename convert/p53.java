public class p53 {
	public static void main(String[] args){
		// int n1 = (int)10.1;
		// float n2 = n1 + 1.1F;
		// System.out.println(n1);

		int x = (int)(10*3.5+6*1.5);
		System.out.println(x);

		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(s1 + " " + s2 + " " + s3 + " " + s4 + " ");

		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		System.out.println(num1);
	}
}