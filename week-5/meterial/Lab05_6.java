import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Lab05_6 {
    private static Scanner sc=new Scanner(System.in);
    private static void Menu() throws Exception{
        System.out.print("==== Menu ===\n" +
                "1. Login\n" +
                "2. Register\n" +
                "3. Quit\n" +
                "Choose an option:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->Login();
            case 2->Register();
            case 3->System.out.println("Quited");
            default -> Menu();
        }
    }
    private static void Login()throws Exception {
        System.out.println("=== Login ===");
        boolean lg=false;
        do{
            System.out.print("Email or Username: ");
            String emus = sc.next().toLowerCase();
            System.out.print("Password:");
            String password = sc.next();
            Scanner fread=null;
            fread = new Scanner(new File("src/user.txt"));
            while (fread.hasNext()){
                String [] ln = fread.nextLine().split(";");
                if((emus.equals(ln[2])&&password.equals(ln[4]))||(emus.equals(ln[3])&&password.equals(ln[4]))){
                    lg=true;
                    System.out.println("=== User Info ===");
                    System.out.println("Hi "+ln[0]+" "+ln[1]
                            +"\nYour username is: " + ln[2]
                            +"\nYour email is: " + ln[3]
                    );
                }

            }
            if(!lg){
                lg=false;
                System.out.println("User not found. Please try again!\n");
            }
        }while (!lg);
        Menu();
    }
    private static void Register() throws Exception{
        System.out.println("===  Register a new user ===");
        System.out.print("Firstnanme: ");
        String fname = sc.next();
        System.out.print("Lastnanme: ");
        String lname = sc.next();
        System.out.print("Username: ");
        String username = sc.next().toLowerCase();
        System.out.print("Email: ");
        String email = sc.next().toLowerCase();
        System.out.print("Password: ");
        String password = sc.next();
        System.out.println("\nYou are successfully registered~");
        Scanner fread=null;
        PrintWriter fwrite=null;
        String text="";
        ArrayList<String> lines = new ArrayList<>();
        fread = new Scanner(new File("src/user.txt"));
        while (fread.hasNext()){
            lines.add(fread.nextLine());
        }
        text=fname+";"+lname+";"+username+";"+email+";"+password;
        fwrite=new PrintWriter("src/user.txt");
        lines.forEach(fwrite::println);
        fwrite.println(text);
        fwrite.close();
        Menu();
    }
    public static void main(String[] args) throws Exception {
        Menu();
    }
}
