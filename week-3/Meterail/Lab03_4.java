package Week3;
import java.util.Scanner;

class Student{
	int id;
	String name;
	int age;
	public Student (int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Lab03_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		Student[] student =new Student[50];
		int i=0;
		char option=' ';
		do {
			int id,age;
			String name;
			System.out.println("Student #"+(i+1)+":");
			System.out.print("Id :");
			id=sc.nextInt();
			System.out.print("Name :");
			sc.nextLine();
			name=sc.nextLine();
			System.out.print("Age :");
			age=sc.nextInt();
			student[i]=new Student(id, name, age);
			System.out.print("Do you want to add more (y/n)?: ");
			option=sc.next().charAt(0);
			i++;
		}while(option=='y'||option=='Y');
		System.out.println("=================================================");
		System.out.println("| No\t| ID\t| Name\t\t\t| Age\t|");
		System.out.println("=================================================");
		for(int j=0;j<i;j++) {
			System.out.println("|"+(j+1)+"\t|"+student[j].id+"\t|"+student[j].name+"\t\t|"+student[j].age+"\t|");
		}
		System.out.println("=================================================");
	}

}
