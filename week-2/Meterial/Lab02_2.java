/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davann
 *
 */
public class Lab02_2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Program for converting money in Riels to Dollars.");
		System.out.print("Please input conversion rat of 1 dollar in Riels: ");
		float rate=sc.nextFloat();
		System.out.print("Please input money to exchange in Reils: ");
		int Reils=sc.nextInt();
		float result=Reils/rate;
		System.out.printf("%d REILS = %.2f DOLLARS",Reils,result);
	}

}
