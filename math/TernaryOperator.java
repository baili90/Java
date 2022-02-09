public class TernaryOperator {
	public static void main(String[] args){
		int a = 3;
		int b = 8;
		int c = a > b ? a : b;
		System.out.println("c" + c);

		int n1 = 552;
		int n2 = 33;
		int n3 = 123;
		int max1 = n1 > n2 ? n1 : n2;
		max1 = max1 > n3 ? max1 : n3;
		System.out.println("max:" + max1);
	}
}