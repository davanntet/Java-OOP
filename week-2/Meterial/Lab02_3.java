/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davann
 *
 */
public class Lab02_3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String[] result=new String[8];
		String[] ask= {
				"Q1. Feeling feverish and/or having chills? ",
				"Q2. Has there been any use of fever reducing medication within the last 24 hours not due to another healthcondition? ",
				"Q3. A new cough that is not due to another health condition? ",
				"Q4. New chills that are not due to another health condition? ",
				"Q5. A new sore throat that is not due to another health condition? ",
				"Q6. A new loss of taste or smell? ",
				"Q7. Have you had a positive test for the virus that causes COVID-19 disease within the past 10 days? ",
				"Q8. In the past 14 days, have you had close contact (within about 6 feet for 15 minutes or more) with someone with suspected or confirmed COVID-19? "
		};
		System.out.println("==== Covid-19 Screen Health ===");
		for(int i=0;i<8;i++) {
			System.out.print(ask[i]);
			result[i]=sc.nextLine();
		}
		System.out.println("=================================================");
		System.out.println("| \tQuestions \t| \tAnswers \t|");
		System.out.println("=================================================");
		for(int i=0;i<8;i++) {
			System.out.println("| Q"+(i+1)+"\t\t\t| "+result[i]+"\t\t\t|");
			System.out.println("-------------------------------------------------");
			
		}
	}

}
