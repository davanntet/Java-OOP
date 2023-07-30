/**
 * 
 */
package Week2;

import java.util.Scanner;

/**
 * @author davann
 *
 */
public class Lab02_10 {

	/**
	 * @param args
	 */
	static void Starter() {
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Math Menu ===");
		System.out.println("1. Addition (+)");
		System.out.println("2. Substruction (-)");
		System.out.println("3. Multiplication (x)");
		System.out.println("4. Division (/)");
		System.out.println("5. Quit");
		int index;
		System.out.print("Please choose an option: ");
		index=sc.nextInt();
		switch(index) {
		case 1:Add();break;
		case 2:Sub();break;
		case 3:Multi();break;
		case 4:Divide();break;
		case 5:System.out.println("Exited");break;
		default:Starter();
		}
	}
	static void Add() {
		int a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Substruction (-)===");
		System.out.print("Please input value A:");
		a=sc.nextInt();
		System.out.print("Please input value B:");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Answer of A + B ="+c);
		System.out.println("Do you want to continue? If no go to Menu.");
		System.out.print("Input your answer (y/n):");
		ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			Add();
		}else if(ch=='y'||ch=='Y') {
			System.out.println("Exited");
		}else {
			Starter();
		}
	}
	static void Sub() {
		int a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Substruction (-)===");
		System.out.print("Please input value A:");
		a=sc.nextInt();
		System.out.print("Please input value B:");
		b=sc.nextInt();
		c=a-b;
		System.out.println("Answer of A - B ="+c);
		System.out.println("Do you want to continue? If no go to Menu.");
		System.out.print("Input your answer (y/n):");
		ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			Sub();
		}else if(ch=='y'||ch=='Y') {
			System.out.println("Exited");
		}else {
			Starter();
		}
	}
	static void Multi() {
		int a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Multiplication (x)===");
		System.out.print("Please input value A:");
		a=sc.nextInt();
		System.out.print("Please input value B:");
		b=sc.nextInt();
		c=a*b;
		System.out.println("Answer of A x B ="+c);
		System.out.println("Do you want to continue? If no go to Menu.");
		System.out.print("Input your answer (y/n):");
		ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			Multi();
		}else if(ch=='y'||ch=='Y') {
			System.out.println("Exited");
		}else {
			Starter();
		}
	}
	static void Divide() {
		float a,b,c;
		char ch;
		Scanner sc=new Scanner(System.in);
		System.out.println("=== Division (/)===");
		System.out.print("Please input value A:");
		a=sc.nextInt();
		System.out.print("Please input value B:");
		b=sc.nextInt();
		c=a/b;
		System.out.println("Answer of A / B ="+c);
		System.out.println("Do you want to continue? If no go to Menu.");
		System.out.print("Input your answer (y/n):");
		ch=sc.next().charAt(0);
		if(ch=='y'||ch=='Y') {
			Divide();
		}else if(ch=='y'||ch=='Y') {
			System.out.println("Exited");
		}else {
			Starter();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Starter();
	}

}
