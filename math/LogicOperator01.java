public class LogicOperator01 {
	public static void main(String[] args){
		int age = 50;
		if(age > 20 && age < 90) {
			System.out.println("ok100");
		}

		int a = 4;
		int b = 9;
		if(a < 10 || ++b < 50){
			System.out.println("ok200");
		}
		System.out.println(a + " " + b);
		if(a < 10 | ++b < 50){
			System.out.println("ok300");
		}
		System.out.println(a + " " + b);
		//逻辑与、逻辑或会把整个判断语句都执行
		//短路与、短路或是第一个条件可得知结果后就立即不再执行了
	}
}