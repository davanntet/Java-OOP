import java.sql.Array;
import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

abstract class TextRandomizer{
    abstract char randomizeACharacter();
    abstract String randomizeAString(int length);
    abstract String[] randomizeStrings(int length,int amount);
}
class TextRandom extends TextRandomizer{

    @Override
    char randomizeACharacter() {
        char ch = ' ';
        do{
            ch = (char) (int)(Math.random()*(int)'z');
        }while (!((ch>='A'&&ch<='Z')||(ch>='a'&&ch<='z')));
        return ch;
    }

    @Override
    String randomizeAString(int length) {
        String str = "";
        do{
            str+=randomizeACharacter();
        }while (str.length()<length);
        return str;
    }

    @Override
    String[] randomizeStrings(int length, int amount) {
        String str[] = new String[amount];
        for(int i=0; i<amount; i++){
            str[i]=randomizeAString(length);
        }
        return str;
    }
}
public class Lab07_3 {
    private static Scanner sc = new Scanner(System.in);
    private static TextRandom random = new TextRandom();
    private static void menu(){
        System.out.print("==== Text Randomizer ===\n" +
                "1. A Character\n" +
                "2. A String\n" +
                "3. Unique Strings\n" +
                "Choose an opt:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->{
                System.out.println("Result: "+random.randomizeACharacter());
                menu();
            }
            case 2->{
                System.out.print("Input length: ");
                int len = sc.nextInt();
                System.out.println("Result: "+random.randomizeAString(len));
                menu();
            }
            case 3->{
                System.out.print("Input length: ");
                int len = sc.nextInt();
                System.out.print("Input amount: ");
                int amount = sc.nextInt();
                System.out.println("Result: "+ Arrays.toString(random.randomizeStrings(len, amount)));
                menu();
            }
            case 4->System.out.print("Quited");
            default -> menu();
        }

    }
    public static void main(String[] args){
        menu();
    }
}
