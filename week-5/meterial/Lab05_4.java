import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab05_4 {
    static Scanner sc=new Scanner(System.in);
    static Scanner fread;

    static int row=0;

    private static void view() throws Exception {
        fread = new Scanner(new File("src/data.txt"));

        int k=1;
        row = 0;
        while (fread.hasNext()) {
            System.out.println(k+"| "+fread.nextLine());
            k++;
            row++;
        }
        fread.close();
    }
    private static void edit() throws Exception {
        view();
        System.out.print("*****************************\n" +
                "1. Append new line\n" +
                "2. Update at line\n" +
                "3. Delete line\n" +
                "Choose an opt: ");
        int opt=sc.nextInt();
        fread = new Scanner(new File("src/data.txt"));
        switch (opt){
            case 1->{

                ArrayList<String> lines = new ArrayList<>();
                while (fread.hasNext()){
                    lines.add(fread.nextLine());
                }
                PrintWriter fwrite=new PrintWriter("src/data.txt");
               System.out.println("Input a string for line "+(row+1)+"#:");
               sc.nextLine();
               String text=sc.nextLine();
               lines.forEach(fwrite::println);
                fwrite.println(text);
                System.out.println("Line #"+(row+1)+" is appended to the note.");
                fwrite.close();
            }
            case 2->{

                System.out.print("Update line number: ");
                int line =sc.nextInt();
                System.out.print("Line "+line+"#: ");
                sc.nextLine();
                String text=sc.nextLine();

                ArrayList<String> lines = new ArrayList<>();
                while (fread.hasNext()){
                    //fwrite.println(fread.nextLine());
                    lines.add(fread.nextLine());
                }
                PrintWriter fwrite=new PrintWriter("src/data.txt");
                for(int i=1; i<=lines.size(); i++){
                    if(i==line){
                        System.out.println(text);
                        fwrite.println(text);
                    }else{
                        fwrite.println(lines.get(i-1));
                        System.out.println(lines.get(i-1));
                    }

                }
                fwrite.close();
            }
            case 3->{
                System.out.print("Delete line number: ");
                int line =sc.nextInt();

                ArrayList<String> lines = new ArrayList<>();
                while (fread.hasNext()){
                    //fwrite.println(fread.nextLine());
                    lines.add(fread.nextLine());
                }

                PrintWriter fwrite=new PrintWriter("src/data.txt");
                for(int i=1; i<=lines.size(); i++){
                    if(i==line){
                       continue;
                    }else{
                        fwrite.println(lines.get(i-1));
                    }

                }
                fwrite.close();
            }
            default -> Menu();
        }

        edit();
    }
    private static void Menu() throws Exception {
        System.out.print("=== Menu ===\n" +
                "1. View my note\n" +
                "2. Edit\n" +
                "3. Quit\n" +
                "Choose an option:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->{
                System.out.println("==== View note ====\n" +
                                    "*****************************");
                view();
                Menu();
            }
            case 2->{
                System.out.println("==== Edit following note ====\n" +
                                    "*****************************");
                edit();
            }

            case 3->System.out.println("Quited");
            default -> Menu();
        }
    }
    public static void main(String[] args) throws Exception {
        Menu();
    }

}
