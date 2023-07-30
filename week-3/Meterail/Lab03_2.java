package Week3;

import java.util.Scanner;

public class Lab03_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many number to be input?");
		System.out.print("Number of input:");
		int num=sc.nextInt();
		int []arrNum=new int[num];
		for(int i=0;i<num;i++) {
			System.out.print("Value #"+i+": ");
			arrNum[i]=sc.nextInt();
		}
		int max=arrNum[0];
		int min=arrNum[0];
		int total=0;
		for(int i=0;i<num;i++) {
			if(max<arrNum[i]) {
				max=arrNum[i];
			}
			if(min>arrNum[i]) {
				min=arrNum[i];
			}
			total+=arrNum[i];
		}
		float average=(float)total/num;
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
		System.out.println("Average :"+average);
		System.out.println("Sum :"+total);
	}

}
