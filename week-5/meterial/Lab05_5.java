import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab05_5 {
    static Scanner sc=new Scanner(System.in);
    private static void Menu() throws Exception{
        System.out.print("=== Menu ===\n" +
                "1. View all\n" +
                "2. Add new\n" +
                "3. Quit\n" +
                "Choose an option:");
        int opt=sc.nextInt();
        switch (opt) {
            case 1->View();
            case 2->addNew();
            case 3->System.out.println("Quited");
            default -> Menu();
        }
    }
    private static void addNew() throws Exception {
        System.out.print("==== Add new resource ====\n" +
                "1. Teacher\n" +
                "2. Student\n" +
                "3. Security guard\n" +
                "Choose an opt:");
        int opt=sc.nextInt();
        Scanner fread=null;
        PrintWriter fwrite=null;
        String text="";
        ArrayList<String> lines = new ArrayList<>();
        switch (opt) {
            case 1-> {
                System.out.print("Firstnanme: ");
                String fname = sc.next();
                System.out.print("Lastnanme: ");
                String lname = sc.next();
                System.out.print("Sex: ");
                char sex= sc.next().toUpperCase().charAt(0);
                System.out.print("Email: ");
                String email = sc.next().toLowerCase();
                System.out.print("Subject: ");
                sc.nextLine();
                String subject = sc.nextLine();
                System.out.print("Salary: ");
                String salary = sc.nextLine();
                fread = new Scanner(new File("src/teacher.txt"));
                while (fread.hasNext()){
                    lines.add(fread.nextLine());
                }
                text=fname+";"+lname+";"+sex+";"+email+";"+subject+";"+salary;
                fwrite=new PrintWriter("src/teacher.txt");
            }
            case 2-> {
                System.out.print("Firstnanme: ");
                String fname = sc.next();
                System.out.print("Lastnanme: ");
                String lname = sc.next();
                System.out.print("Sex: ");
                char sex= sc.next().toUpperCase().charAt(0);
                System.out.print("Email: ");
                String email = sc.next().toLowerCase();
                System.out.print("Year: ");
                sc.nextLine();
                String year = sc.nextLine();
                System.out.print("Major: ");
                String major = sc.nextLine();
                fread = new Scanner(new File("src/student.txt"));
                while (fread.hasNext()){
                    lines.add(fread.nextLine());
                }
                text=fname+";"+lname+";"+sex+";"+email+";"+year+";"+major;
                fwrite=new PrintWriter("src/student.txt");

            }
            case 3-> {
                System.out.print("Firstnanme: ");
                String fname = sc.next();
                System.out.print("Lastnanme: ");
                String lname = sc.next();
                System.out.print("Sex: ");
                char sex= sc.next().toUpperCase().charAt(0);
                System.out.print("Email: ");
                String email = sc.next().toLowerCase();
                System.out.print("Position: ");
                sc.nextLine();
                String position = sc.nextLine();
                fread = new Scanner(new File("src/securityguard.txt"));
                while (fread.hasNext()){
                    lines.add(fread.nextLine());
                }
                text=fname+";"+lname+";"+sex+";"+email+";"+position;
                fwrite=new PrintWriter("src/securityguard.txt");

            }
            default -> Menu();
        }
        if(fwrite != null){
            lines.forEach(fwrite::println);
            fwrite.println(text);
            fwrite.close();
        }
        addNew();
    }
    private static void View()throws Exception{
        Scanner fread=null;
        System.out.println("=== Teacher ===");
        fread = new Scanner(new File("src/teacher.txt"));
        int k=1;
        while (fread.hasNext()){
            String [] ln = fread.nextLine().split(";");
            System.out.println(k+". ["+ln[0]+" "+ln[1]+"]"+"["+ln[2]+"]"+"["+ln[3]+"]"+"["+ln[4]+"]"+"["+ln[5]+"$]");
            k++;
        }
        fread.close();
        System.out.println("=== Student ===");
        fread = new Scanner(new File("src/student.txt"));
        k=1;
        while (fread.hasNext()){
            String [] ln = fread.nextLine().split(";");
            System.out.println(k+". ["+ln[0]+" "+ln[1]+"]"+"["+ln[2]+"]"+"["+ln[3]+"]"+"["+ln[4]+"]"+"["+ln[5]+"]");
            k++;
        }
        fread.close();
        System.out.println("=== Security guard ===");
        fread = new Scanner(new File("src/securityguard.txt"));
        k=1;
        while (fread.hasNext()){
            String [] ln = fread.nextLine().split(";");
            System.out.println(k+". ["+ln[0]+" "+ln[1]+"]"+"["+ln[2]+"]"+"["+ln[3]+"]"+"["+ln[4]+"]");
            k++;
        }
        fread.close();
        Menu();
    }
    public static void main(String[] args) throws Exception{
        Menu();
    }
}
