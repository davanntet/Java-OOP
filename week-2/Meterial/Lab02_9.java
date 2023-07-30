/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davan
 *
 */
public class Lab02_9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		char[] ch= {'A','B','C','D','E'};
		for(int i=0;i<5;i++) {
			System.out.print("Input value of "+ch[i]+": ");
			arr[i]=sc.nextInt();
		}
		int k=arr[0];
		for(int i=1;i<5;i++) {
			if(k<arr[i]) {
				k=arr[i];
			}
		}
		System.out.println("The smallest number among A, B, C, D, and E is: "+k);
	}

}
