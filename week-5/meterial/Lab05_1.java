import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Lab05_1 {
    static Scanner sc=new Scanner(System.in);
    public static void Menu() throws Exception {
        System.out.println("==== Menu ===\n" +
                "1. Current date and time\n" +
                "2. Calculate days btw two dates\n" +
                "3. Find the day of the week\n" +
                "4. Quit\n");
        System.out.print("Choose an opt: ");
        int opt=sc.nextInt();
        switch (opt) {
            case 1->CurrentDateTime();
            case 2->CalculateBetweenDate();
            case 3->FindDayOfWeek();
            case 4->System.out.println("Exited");
            default -> Menu();
        }
    }
    public static void CurrentDateTime() throws Exception {
        Date date=new Date();
        SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println(fm.format(date));
        Menu();
    }
    public static void CalculateBetweenDate() throws Exception {
        System.out.print("First date (dd/mm/yyyy): ");
        String date1=sc.next();
        System.out.print("Second date (dd/mm/yyyy): ");
        String date2=sc.next();
        SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
        Date dt1=fm.parse(date1);
        Date dt2=fm.parse(date2);
        long dtms1=dt1.getTime();
        long dtms2=dt2.getTime();
        long dtms=Math.abs(dtms1-dtms2);
        long days=dtms/(24*60*60*1000);
        System.out.println("Difference between two dates is: "+days);
        Menu();
    }
    public static void FindDayOfWeek() throws Exception {
        System.out.print("Input a date (dd/mm/yyyy): ");
        String strdate = sc.next();
        SimpleDateFormat fm=new SimpleDateFormat("dd/MM/yyyy");
        Calendar cal = Calendar.getInstance();
        cal.setTime(fm.parse(strdate));
        int mm=cal.get(Calendar.DAY_OF_WEEK)-1>0?cal.get(Calendar.DAY_OF_WEEK)-1:7;
        System.out.println("The day is: "+ DayOfWeek.of(mm));
        Menu();
    }
    public static void main(String[] args) throws Exception{
        Menu();
    }
}
