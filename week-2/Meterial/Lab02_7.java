/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davan
 *
 */
public class Lab02_7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Input a sentence:");
		String str=sc.nextLine();
		int countVowel=0;
		int countconsonant=0;
		int countspace=0;
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='i'||str.charAt(i)=='e'||str.charAt(i)=='u'||str.charAt(i)=='o'||str.charAt(i)=='a') {
				countVowel+=1;
			}else if(str.charAt(i)==' ') {
				countspace+=1;
			}else {
				countconsonant+=1;
			}
		}

			System.out.println("Count of vowel is: "+countVowel);
			System.out.println("Count of consonant is: "+countconsonant);
			System.out.println("Count of space is: "+countspace);
		
	
	}
}
