import java.util.HashMap;
class AbstractMath{
    int reverseNumber(int num){
        return 0;
    }
    int roundedNumber(double num){
        return 0;
    }
    int countDistinct(int []values){
        return 0;
    }
    int decimalToBinary(int decimal){
        return 0;
    }
}
class Maths extends AbstractMath{
    int reverseNumber(int num){
        String strnum = num+"";
        String renum = "";
        for(int i=strnum.length()-1;i>=0;i--){
            renum += strnum.charAt(i);
        }
        return Integer.parseInt(renum);
    }
    int roundedNumber(double num){
        int result= 0;
        float nm=(float) ((int)num+0.5);
        if(num>=nm){
            result = (int)(nm+1);
        }else{
            result = (int)(num);
        }
        return result;
    }
    int countDistinct(int []values){
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(values[0],1);
        for(int i=1; i<values.length; i++){
            if(map.get(values[i])!=null){
                if(map.get(values[i])>0){
                    map.put(values[i],map.get(values[i])+1);
                }else{
                    map.put(values[i],1);
                }
            }else{
                map.put(values[i],1);
            }
        }
        int count=0;
        for(int i=0;i<values.length;i++){
            if(map.get(values[i])==1){
                count++;
            }
        }
        return count;
    }
    int decimalToBinary(int decimal){
        int a = 0;
        int bs10=decimal;
        int bs2=0;
        if(bs10>=0&&bs10<=15){
            a=4;
        }else if(bs10>15&&bs10<=255){
            a=8;
        }else if(bs10>225&&bs10<=4095){
            a=12;
        }else if(bs10>4095&&bs10<=65535){
            a=16;
        }else if(bs10>65535&&bs10<=1048575){
            a=20;
        }else if(bs10>1048575&&bs10<=16777215){
            a=24;
        }else if(bs10>16777215&&bs10<=268435455){
            a=28;
        }

        int[] bar=new int[a];
        for(int k=0;k<a;k++){
            bar[k]=0;
        }
        int i=0;
        do{
            if(bs10%2==1){
                bs2=1;
            }else if(bs10%2==0){
                bs2=0;
            }
            bs10=bs10/2;
            bar[i]=bs2;
            i++;
        }while(bs10>0);
        StringBuilder res= new StringBuilder();
        for(int j=a-1;j>=0;j--){
            res.append(bar[j]);
        }
        return Integer.parseInt(res.toString());
    }
}

public class Lab06_1 {
    public static void main(String[] args){
        Maths math=new Maths();
        System.out.println(math.reverseNumber(1234));
        System.out.println(math.roundedNumber(3.4));
        System.out.println(math.roundedNumber(3.6));
        int[] arr={-1,-1,1,0,1,5,9};
        int[] arr1={-5,1,0,6,5,0};
        System.out.println(math.countDistinct(arr1));
        System.out.println(math.decimalToBinary(20));
    }
}
