/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davan
 *
 */
public class Lab02_5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		float x,y,z;
		System.out.println("Program for calculating equation 1/x = 1/y + 1/z to find value of x");
		System.out.print("Please input y:");
		y=sc.nextFloat();
		System.out.print("Please input z:");
		z=sc.nextFloat();
		x=1/((1/y)+(1/z));
		System.out.println("Result x = "+x);
		
	}

}
