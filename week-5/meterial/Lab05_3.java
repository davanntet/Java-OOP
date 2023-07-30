import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Shape{
    public void ShapeLine(int length){
        for(int i=0;i<length;i++){
            System.out.print("_");
        }
        System.out.println();
    }
    public void ShapeRectangle(int width, int height){
       for(int i=0;i<height;i++){
           for(int j=0;j<width;j++){
               if(i==0||i==height-1){
                   System.out.print("*");
               }else{
                   if(j==0||j==width-1){
                       System.out.print("*");
                   }else{
                       System.out.print(" ");
                   }
               }
           }
           System.out.println();
       }
    }
    public void ShapeTriangle(int hw){
        for(int i=0; i<hw; i++){
            for(int j=0;j<hw*2;j++){
                if(j>=hw-i&&j<=hw+i){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
public class Lab05_3 {
    static ArrayList<Integer> line= new ArrayList<>();
    static ArrayList<Integer> triangle= new ArrayList<>();
    static HashMap<String,Integer> map= new HashMap<>();
    static ArrayList<HashMap<String,Integer>> rectangle= new ArrayList<>();
    static Scanner sc=new Scanner(System.in);
    static Shape shape=new Shape();
    private static void Line(){
        System.out.println("==== List all lines ====");
        AtomicInteger k = new AtomicInteger(1);
        line.forEach(e->{
            System.out.println(k.get()+". length="+e);
            shape.ShapeLine(e);
            k.set(k.get()+1);
        });
        Menu();
    }
    private static void Rectangle(){
        System.out.println("==== List all rectangle ====");
        AtomicInteger k = new AtomicInteger(1);
        rectangle.forEach(e->{
            System.out.println(k.get()+". width="+e.get("w")+" height="+e.get("h"));
            shape.ShapeRectangle(e.get("w"),e.get("h"));
            k.set(k.get()+1);
        });
        Menu();
    }
    private static void Triangle(){
        AtomicInteger k = new AtomicInteger(1);
        System.out.println("==== List all triangle ====");
        triangle.forEach(e->{
            System.out.println(k.get()+". height="+e);
            shape.ShapeTriangle(e);
            k.set(k.get()+1);
        });
        Menu();
    }
    private static void addNew(){
        System.out.println("==== Add new shape ====\n" +
                "Select a shape:\n" +
                "1. Line\n" +
                "2. Rectangle\n" +
                "3. Triangle");
        System.out.print("Choose an opt: ");
        int opt=sc.nextInt();
        switch(opt){
            case 1->{
                System.out.print("Input Length: ");
                int lth=sc.nextInt();
                line.add(lth);
                Menu();
            }
            case 2->{
                System.out.print("Input Width: ");
                int w=sc.nextInt();
                System.out.print("Input Height: ");
                int h=sc.nextInt();
                map.put("w",w);
                map.put("h",h);
                rectangle.add(map);
                Menu();
            }
            case 3->{
                System.out.print("Input Height: ");
                int h=sc.nextInt();
                triangle.add(h);
                Menu();
            }
            default -> addNew();
        }
    }
    private static void Menu(){
        System.out.println("==== Menu ===\n" +
                "1. View all lines\n" +
                "2. View all rectangles\n" +
                "3. View all triangles\n" +
                "4. Add a new shape\n" +
                "5. Quit");
        System.out.print("Choose an opt: ");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->Line();
            case 2->Rectangle();
            case 3->Triangle();
            case 4->addNew();
            case 5->System.out.println("Quited");
            default -> Menu();
        }
    }
    public static void main(String[] args){
        Menu();
    }
}
