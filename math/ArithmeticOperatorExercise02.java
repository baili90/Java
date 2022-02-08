public class ArithmeticOperatorExercise02 {
	public static void main(String[] args){
		int days = 59;
		int weeks = days/7;
		int leftDays = days % 7;
		System.out.println( weeks +"weeks" + leftDays + "days");

		double f1 = 234.6;
		double c1 =  5.0 / 9 * (f1 - 100);
		System.out.println(f1 + "oF"+c1);
	}
}