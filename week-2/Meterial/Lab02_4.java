/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davann
 *
 */
public class Lab02_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input number of seconds:");
		int second = sc.nextInt();
		int hour=second/3600;
		int minute=(second%3600)/60;
		second=(second%3600)%60;
		System.out.printf("Time corresponding to 1259 seconds is:: %02d:%02d:%02d",hour,minute,second);
	}

}
