import java.awt.*;
import java.util.Calendar;
import java.util.Scanner;

abstract class ShapeArea{
    abstract double calculateRectangleArea(double width,double height);
    abstract double calculateCircleArea(double radius);
    abstract double calculateTraingleArea(double a,double b,double c);
    abstract double calculateTraingleArea(double base,double height);
    abstract double calculateSemicircleArea(double radius);
    abstract double calculateSectorArea(double radius,double angle);
}
class Calculator extends ShapeArea{

    @Override
    double calculateRectangleArea(double width, double height) {
        return width*height;
    }

    @Override
    double calculateCircleArea(double radius) {
        return 3.14*radius*radius;
    }
    @Override
    double calculateTraingleArea(double a, double b, double c) {
        return 0.25*Math.sqrt((a+b+c)*(-a+b+c)*(a-b+c)*(a+b-c));
    }

    @Override
    double calculateTraingleArea(double base, double height) {
        return base*height/2;
    }

    @Override
    double calculateSemicircleArea(double radius) {
        return 0.5*3.14*radius*radius;
    }

    @Override
    double calculateSectorArea(double radius, double angle) {
        return (angle/360)*3.14*radius*radius;
    }
}
public class Lab07_1 {
    private static Scanner sc=new Scanner(System.in);
    private static void menu(){
        Calculator cal = new Calculator();
        System.out.print("==== Shape Area Calculation ===\n" +
                "1. Rectangle\n" +
                "2. Circle\n" +
                "3. Triangle (three sides)\n" +
                "4. Triangle (base and height)\n" +
                "5. Semi circle\n" +
                "6. Sector\n" +
                "7. Quit\n" +
                "Choose an opt:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1->{
                System.out.print("Input width: ");
                double w = sc.nextDouble();
                System.out.print("Input height: ");
                double h = sc.nextDouble();
                System.out.println("Result: "+cal.calculateRectangleArea(w,h));
                menu();
            }
            case 2->{
                System.out.print("Input radius: ");
                double radius = sc.nextDouble();
                System.out.println("Result: "+cal.calculateCircleArea(radius));
                menu();
            }
            case 3->{
                System.out.print("Input A: ");
                double a =  sc.nextDouble();
                System.out.print("Input B: ");
                double b = sc.nextDouble();
                System.out.print("Input C: ");
                double c = sc.nextDouble();
                System.out.println("Result: "+cal.calculateTraingleArea(a,b,c));
                menu();
            }
            case 4->{
                System.out.print("Input base: ");
                double base = sc.nextDouble();
                System.out.print("Input height: ");
                double height = sc.nextDouble();
                System.out.println("Result: "+cal.calculateTraingleArea(base,height));
                menu();
            }
            case 5->{
                System.out.print("Input radius: ");
                double radius = sc.nextDouble();
                System.out.println("Result: "+cal.calculateSemicircleArea(radius));
                menu();
            }
            case 6->{
                System.out.print("Input radius: ");
                double radius = sc.nextDouble();
                System.out.print("Input angle: ");
                double angle = sc.nextDouble();
                System.out.println("Result: "+cal.calculateSectorArea(radius,angle));
                menu();
            }
            case 7->System.out.println("Quited");
            default -> menu();
        }
    }
    public static void main(String[] args){
        menu();
    }
}
