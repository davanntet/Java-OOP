package Week4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
	}
}
public class Lab04_1 {

	public static void main(String[] args) {
		ArrayList<Student> list=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		char ch;
		int u=1;
		do {
			System.out.println("Student #"+u+":");
			int id;
			String name;
			int age;
			System.out.print("ID: ");
			id=sc.nextInt();
			System.out.print("Name :");
			sc.nextLine();
			name=sc.nextLine();
			System.out.print("Age :");
			age=sc.nextInt();
			list.add(new Student(id,name,age));
			System.out.print("Do you want to add more (y/n)?:");
			ch=sc.next().charAt(0);
			System.out.println("");
			u++;
		}while(ch=='y'||ch=='Y');
		System.out.println("=================================================");
		System.out.println("| No\t| ID\t| Name\t\t\t| Age\t|");
		System.out.println("=================================================");
		AtomicInteger k=new AtomicInteger();
		list.forEach(e->{
			System.out.println("|"+(k.get()+1)+"\t|"+e.id+"\t|"+e.name+"\t\t|"+e.age+"\t|");
			
			k.set(k.get()+1);
		});
		System.out.println("=================================================");
		
	}

}
