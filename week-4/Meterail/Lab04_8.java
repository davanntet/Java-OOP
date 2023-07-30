package Week4;

class BasicMath{
	double addition(double a,double b) {
		return a+b;
	}
	double substract(double a,double b) {
		return a-b;
	}
}

class AdvanceMath extends BasicMath{
	double multiply(double a,double b) {
		return a*b;
	}
	double divide(double a,double b) {
		return a/b;
	}
}

public class Lab04_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicMath bm=new BasicMath();
		System.out.println("6+9="+bm.addition(6,9));
		System.out.println("6-9="+bm.substract(6,9));
		
		AdvanceMath am=new AdvanceMath();
		System.out.println("6+9="+am.addition(6,9));
		System.out.println("6-9="+am.substract(6,9));
		System.out.println("6x9="+am.multiply(6,9));
		System.out.println("6/9="+am.divide(6,9));
	}

}
