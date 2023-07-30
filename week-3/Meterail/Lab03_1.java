package Week3;

import java.util.Scanner;

class quadraticEquation{
	int a,b,c;
	double rootBelta;
	void setValue(int a,int b,int c) {
		this.a=a;
		this.b=b;
		this.c=c;
		int belta=b*b-4*a*c;
		
		if(belta>0) {
			rootBelta=Math.sqrt(belta);
			greaterZero();
		}else if(belta<0) {
			lessZero();
		}else if(belta==0) {
			rootBelta=Math.sqrt(belta);
			equlZero();
		}else {
			System.out.println();
		}
	}
	void equlZero() {
		double x=(-b)/(2*a);
		System.out.println("double root is X="+x);
	}
	void lessZero() {
		System.out.println("Equation roots are complex!");
	}
	void greaterZero() {
		double x1=(-b+rootBelta)/(2*a);
		double x2=(-b-rootBelta)/(2*a);
		System.out.println("X1 ="+x1+", X2 ="+x2);
	}
}

public class Lab03_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Program for calculating roots of quadratic equation ax^2+ bx +c=0");
		System.out.print("Input value of a: ");
		a=sc.nextInt();
		System.out.print("Input value of b: ");
		b=sc.nextInt();
		System.out.print("Input value of c: ");
		c=sc.nextInt();
		
		quadraticEquation calcu=new quadraticEquation();
		calcu.setValue(a, b, c);
	}

}
