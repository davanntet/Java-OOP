import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Student{
    int id;
    String name;
    int age;
    public Student(int id, String name,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
public class Lab05_2 {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Student> list=new ArrayList<Student>();
    public static void Menu(){
        System.out.println("==== Menu ===\n" +
                "1. Add new students\n" +
                "2. Delete multiple students\n" +
                "3. Quit");
        System.out.print("Choose an opt:");
        int opt=sc.nextInt();
        switch (opt) {
            case 1->Add();
            case 2->Delete();
            case 3->System.out.println("Exited");
            default -> Menu();
        }
    }
    public static void Add(){
        int k=1;
        char ch;
        do{
            System.out.println("Student #"+k+":");
            System.out.print("ID: ");
            int id=sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name=sc.nextLine().trim();
            System.out.print("Age: ");
            int age=sc.nextInt();
            list.add(new Student(id, name, age));
            k++;
            System.out.print("Do you want to add more (y/n)?: ");
            ch=sc.next().toLowerCase().charAt(0);
        }while(ch=='y');
        Menu();
    }
    public static void Delete(){
        System.out.println("=============================================");
        System.out.println("| No\t| ID\t| Name\t\t\t\t| Age\t|");
        System.out.println("=============================================");
        AtomicInteger k=new AtomicInteger(1);
        list.forEach(e->{
            System.out.println("| "+k.get()+"\t\t| "+e.id+"\t| "+e.name+"\t\t |"+e.age+"\t|");
            k.set(k.get()+1);
        });
        System.out.println("=============================================\n");
        System.out.println("==== DELETION =====");
        ArrayList<String> listDelete = new ArrayList<String>();
        char ch;
        do{
            System.out.print("Input student # ID: ");
            int id = sc.nextInt();
            ArrayList<Student> students=new ArrayList<Student>();
            list.forEach(e->{
                if(e.id!=id){
                    students.add((Student)e);
                }
            });
            if(list.size()==students.size()){
                listDelete.add("Student with "+id+" not found!");
            }else{
                listDelete.add("Student with "+id+" deleted");
                list=students;
            }
            System.out.print("Do you want to delete more (y/n)?: ");
            ch=sc.next().toLowerCase().charAt(0);
        }while (ch=='y');
        listDelete.forEach(System.out::println);
        Menu();
    }

    public static void main(String[] args){
        Menu();
    }
}
