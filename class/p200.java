public class p200 {
	public static void main(String[] args){
		// Cat cat1 = new Cat();
		// cat1.name = "fafa";
		// cat1.age = 11;
		// cat1.color = "red";
		// System.out.println(cat1.name);
		// cat1.speak();

		// int[][] map = {{1,2,3},{2,3,4},{3,4,5}};
		// MyTools mytools = new MyTools();
		// mytools.printArr(map);

		// AA a1 = new AA();
		// if(a1.aa(2)){
		// 	System.out.println("奇数");
		// }else{
		// 	System.out.println("偶数");
		// }
		// A2 a2 = new A2();
		// a2.printSymbol(4,2,"*");

		// Person p = new Person();
		// p.name = "mary";
		// p.age = 100;
		// MyTools tools = new MyTools();
		// Person p2 =  tools.copyPerson(p);
		// System.out.println("P的属性" + p.age);
		// System.out.println("P2的属性" + p2.age);

		// T t1 = new T() ;
		// System.out.println(t1.fibo(7));

		HspMethod m = new HspMethod();
	
		System.out.println(	m.showScore("s",85,59));

	 }
}

class HspMethod {
	public String showScore(String name,double... scores){
	double totalScores = 0;
		for (int i = 0;i < scores.length ;i++ ) {
			// double totalScores = 0;
			totalScores += scores[i]; 
		}

		return name + "have " + totalScores;
	}
}
// class T {
// 	public int fibo(int n){
// 		if (n == 1 || n ==2) {
// 			return 1;
// 		}else {
// 			return fibo(n-1) + fibo(n-2);
// 		}

// 	}
// }
// class Person{
// 	String name;
// 	int age; 
// }
// class  MyTools{
// 	public Person copyPerson(Person p){
// 		Person p2 = new Person();
// 		p2.name = p.name;
// 		p2.age = p.age;
// 		return p2;

// 	}
// }
// class A2{
// 	public void printSymbol(int n,int m,String s){
// 		for (int i = 0 ;i < n ;i++ ) {
// 			for (int j = 0;j< m ;j++ ) {
// 				System.out.print(s);
// 			}
// 			System.out.println();
// 		}
// 	}
// }

// class AA{
// 	public boolean aa(int num  ){
// 		// boolean b1 = false;
// 		// if (n % 2 == 0) {
// 		// 	b1 = true;
// 		// }
// 		// System.out.println(b1);
// 		// return b1;

// 		return num % 2 != 0 ;
// 	}
// }

// class Cat {
// 	//属性 成员变量
// 	String name;
// 	int age;
// 	String color; 

// 	//方法
// 	public void speak(){
// 		System.out.println("meow meow meow"); 
// 	}
// }

// class MyTools{
// 	public void printArr(int[][] map){
// 		for(int i = 0 ;i < map.length;i++){
// 			for(int j = 0;j < map[i].length;j++){
// 				System.out.print(map[i][j] + "-");
// 			}
// 			System.out.println();
// 		}
// 	}
// }