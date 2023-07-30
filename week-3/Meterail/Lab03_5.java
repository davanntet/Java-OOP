package Week3;

class Maths{
	static double add(double a,double b) {
		return a+b;
	}
	static double subtract(double a,double b) {
		return a-b;
	}
	static double multiply(double a,double b) {
		return a*b;
	}
	static double divide(double a,double b) {
		return (float)a/b;
	}
	static double min(double a,double b) {
		return a>b?b:a;
	}
	static double max(double a,double b) {
		return a>b?a:b;
	}
}

public class Lab03_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Maths.add(5,7)="+Maths.add(5,7));
		System.out.println("Maths.subtract(5,7)="+Maths.subtract(5,7));
		System.out.println("Mahts.multiply(5,7)="+Maths.multiply(5, 7));
		System.out.println("Mahts.divide(5,7)="+Maths.divide(5, 7));
		System.out.println("Mahts.min(5,7)="+Maths.min(5,7));
		System.out.println("Mahts.max(5,7)="+Maths.max(5,7));
	}

}
