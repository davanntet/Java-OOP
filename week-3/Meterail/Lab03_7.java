package Week3;

import java.util.Scanner;

class StudentManagement{
	int id;
	String name;
	int age;
	public StudentManagement(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
}
public class Lab03_7 {
	private static Scanner sc =new Scanner(System.in);
	private static StudentManagement[] student =new StudentManagement[50];
	private static int i=0;
	private static void menu(){
		System.out.println("====== Menu ======");
		System.out.println("1. Create a student");
		System.out.println("2. List students");
		System.out.println("3. Quit");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->createStudent();
			case 2->ListStudent();
			case 3->System.out.println("Exited");
			default->menu();
		}
		
	}
	private static void createStudent() {
		System.out.println("Student #"+(i+1)+":");
		System.out.print("ID :");
		int id=sc.nextInt();
		System.out.print("Name :");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.print("Age :");
		int age=sc.nextInt();
		student[i]=new StudentManagement(id,name,age);
		i++;
		System.out.println();
		menu();
	}
	private static void ListStudent() {
		System.out.println("=================================================");
		System.out.println("| No\t| ID\t| Name\t\t\t| Age\t|");
		System.out.println("=================================================");
		for(int j=0;j<i;j++) {
			System.out.println("|"+(j+1)+"\t|"+student[j].id+"\t|"+student[j].name+"\t\t|"+student[j].age+"\t|");
		}
		System.out.println("=================================================\n\n");
		menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
