import java.sql.SQLSyntaxErrorException;
import java.util.Arrays;
import java.util.Scanner;

abstract class NumberRandomizer{
    abstract int randomizeInBetween(int min,int max);
    abstract int[] randomizeUniqueInBetween(int min,int max,int amount);
}
class Random extends NumberRandomizer{

    @Override
    int randomizeInBetween(int min, int max) {
        int result = 0 ;
        do{
            result =(int) (Math.random()*max);
        }while(result<min);
        return result;
    }

    @Override
    int[] randomizeUniqueInBetween(int min, int max, int amount) {
        int[] result = new int[amount];
        int num = amount;
        do {
            int rand = (int) (Math.random()*max);
            if(rand>=min){
                for(int i = 0;i<result.length;i++){
                    if(min!=result[i]){
                        result[num-1] = rand;
                    }
                }
                num--;
            }
        }while (num>0);
        return result;
    }
}
public class Lab07_2 {
    private static Scanner sc = new Scanner(System.in);
    private static Random rand = new Random();
    private static void menu(){
        System.out.print("==== Number Randomizer ===\n" +
                "1. In between\n" +
                "2. Unique in between\n" +
                "3. Quit\n" +
                "Choose an opt:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->{
                System.out.print("Input min: ");
                int min = sc.nextInt();
                System.out.print(("Input max: "));
                int max = sc.nextInt();
                System.out.println("Result: "+rand.randomizeInBetween(min,max));
                menu();
            }
            case 2->{
                System.out.print("Input min: ");
                int min = sc.nextInt();
                System.out.print(("Input max: "));
                int max = sc.nextInt();
                System.out.print(("Input amount: "));
                int amount = sc.nextInt();
                System.out.println("Result: "+ Arrays.toString(rand.randomizeUniqueInBetween(min, max, amount)));
                menu();
            }
            case 3->System.out.println("Quited");
            default -> menu();
        }
    }
    public static void main(String[] args){
        menu();
    }
}
