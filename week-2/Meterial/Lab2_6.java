/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davann
 *
 */
public class Lab2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
			do {
			System.out.print("Input a number to check whether it is a prime number:");
			int num=sc.nextInt();
			int k=0;
			int dv=0;
			for(int i=2;i<num;i++) {
				if((num/i!=1||num/i!=num)&&num%i!=0) {
					k++;
				}else {
					dv=i;
					break;
				}
			}
			if(k==num-2) {
				System.out.println(num+" is a prime number.");
			}else {
				System.out.println(num+" is not a prime number, because it is divisible by "+dv);
			}
		}while(true);
	}

}
