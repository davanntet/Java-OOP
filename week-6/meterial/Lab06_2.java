import java.util.ArrayList;
import java.util.Scanner;
class math{
    int sum(int a,int b){
        return a+b;
    }
    int sum(int a,int b,int c){
        return a+b+c;
    }
    int sum(int[] values){
        int result=0;
        for(int x:values){
            result+=x;
        }
        return result;
    }
    int multiply(int a,int b){
        return a*b;
    }
    int multiply(int a,int b,int c){
        return a*b*c;
    }
    int multiply(int[] values){
        int result=1;
        for(int x:values){
            result*=x;
        }
        return result;
    }
    int max(int a,int b){
        int result=a>=b?a:b;
        return result;
    }
    int max(int a,int b,int c){
        int[] values={a,b,c};
        int result=a;
        for(int x:values){
            if(x>result){
                result=x;
            }
        }
        return result;
    }
    int max(int[] values){
        int result=values[0];
        for(int x:values){
            if(x>result){
                result=x;
            }
        }
        return result;
    }
    int min(int a,int b){
        int result=a<=b?a:b;
        return result;
    }
    int min(int a,int b,int c){
        int[] values={a,b,c};
        int result=a;
        for(int x:values){
            if(x<result){
                result=x;
            }
        }
        return result;
    }
    int min(int[] values){
        int result=values[0];
        for(int x:values){
            if(x<result){
                result=x;
            }
        }
        return result;
    }
    double average(double a,double b){
      return (a+b)/2;
    }
    double average(double a,double b,double c){
        return (a+b+c)/3;
    }
    double average(int[] values){
        double result=0;
        for(double x:values){
            result+=x;
        }
        return result/values.length;
    }
}
public class Lab06_2 {
    static Scanner sc=new Scanner(System.in);
    private static void Menu(){
        math mth=new math();
        System.out.println("==== Menu ===\n" +
                "1. Sum of two values\n" +
                "2. Sum of three values\n" +
                "3. Sum of many values\n" +
                "4. Multiply of two values\n" +
                "5. Multiply of three values\n" +
                "6. Multiply of many values\n" +
                "7. Max of two values\n" +
                "8. Max of three values\n" +
                "9. Max of many values\n" +
                "10. Min of two values\n" +
                "11. Min of three values\n" +
                "12. Min of many values\n" +
                "13. Average of two values\n" +
                "14. Average of three values\n" +
                "15. Average of many values\n" +
                "16. Quit");
        System.out.print("choose: ");
        int opt=sc.nextInt();
        int value1,value2,value3;
        if(opt==1||opt==4||opt==7||opt==10||opt==13){
            System.out.print("Input value-1: ");
            value1=sc.nextInt();
            System.out.print("Input value-2: ");
            value2=sc.nextInt();
            System.out.print("Result = ");
            if(opt==1){
                System.out.println(mth.sum(value1,value2));
            }else if(opt==4){
                System.out.println(mth.multiply(value1,value2));
            }else if(opt==7){
                System.out.println(mth.max(value1,value2));
            }else if(opt==10){
                System.out.println(mth.min(value1,value2));
            }else if(opt==13){
                System.out.println(mth.average(value1,value2));
            }
            Menu();
        }else if(opt==2||opt==5||opt==8||opt==11||opt==14){
            System.out.print("Input value-1: ");
            value1=sc.nextInt();
            System.out.print("Input value-2: ");
            value2=sc.nextInt();
            System.out.print("Input value-3: ");
            value3=sc.nextInt();
            System.out.print("Result = ");
            if(opt==2){
                System.out.println(mth.sum(value1,value2,value3));
            }else if(opt==5){
                System.out.println(mth.multiply(value1,value2,value3));
            }else if(opt==8){
                System.out.println(mth.max(value1,value2,value3));
            }else if(opt==11){
                System.out.println(mth.min(value1,value2,value3));
            }else if(opt==14){
                System.out.println(mth.average(value1,value2,value3));
            }
            Menu();
        }else if(opt==3||opt==6||opt==9||opt==12||opt==15){
            int x=0;
            int count=1;
            ArrayList<Integer> list=new ArrayList<>();
            do{
                if(count<=2){
                    System.out.print("Input value-"+x+"");
                    x=sc.nextInt();
                    list.add(x);
                }else{
                    System.out.print("Input value-"+x+"(0->stop input): ");
                    x=sc.nextInt();
                    list.add(x);
                }
                count++;
            }while (x!=0);
            int []values = new int[list.size()];
            for(int i=0; i<values.length; i++){
                values[i] = list.get(i);
            }
            System.out.print("Result = ");
            if(opt==3){
                System.out.println(mth.sum(values));
            }else if(opt==6){
                System.out.println(mth.multiply(values));
            }else if(opt==9){
                System.out.println(mth.max(values));
            }else if(opt==12){
                System.out.println(mth.min(values));
            }else if(opt==15){
                System.out.println(mth.average(values));
            }
            Menu();
        }else if(opt==16){
            System.out.println("Quited");
        }else{
            System.out.println("Please input available");
            Menu();
        }

    }

    public static void main(String[] args){
        Menu();
    }
}
