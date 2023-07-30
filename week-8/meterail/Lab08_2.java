
import java.util.Scanner;

interface Borrowable{
    void borrow(String borrower);
    void returnItem();
    boolean isBorrowed();
}
class BorrowableItem{
    private String borrower;
    private boolean borrowed;
    public String getBorrower() {
        return borrower;
    }

    public void setBorrower(String borrower) {
        this.borrower = borrower;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }


}
class Book extends BorrowableItem implements Borrowable{
    private String title;
    private String edition;
    private String author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdition() {
        return edition;
    }

    public void setEdition(String edition) {
        this.edition = edition;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public void borrow(String borrower) {
        setBorrower(borrower);
    }

    @Override
    public void returnItem() {
        setBorrowed(false);
    }


}
class DVD extends BorrowableItem implements Borrowable{
    private String price;
    private String category;
    private String title;
    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public void borrow(String borrower) {
        setBorrower(borrower);
    }

    @Override
    public void returnItem() {
        setBorrowed(false);
    }

}
class CD extends BorrowableItem implements Borrowable{
    private String price;
    private String singer;
    private String category;

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public void borrow(String borrower) {
        setBorrower(borrower);
    }

    @Override
    public void returnItem() {
        setBorrowed(false);
    }


}
public class Lab08_2 {
    private static String[][] book = {{"Advanced C++","Nu haj","edition 1"},{"Basic Java","Nhouk Thoem","edition 3"},{ "Advanced C","Bill Gate","edition 2"}};
    private static String[][] dvd ={{"Avatar 1","Holy wood","21.99$"},{"Avatar 2","Holy wood","34.99$"},{"IRon Man","Holy wood","12.99$"}};
    private static String[][] cd ={{"KPOP","Plack Pink","9.99$"},{"KPOP","BTS","4.99$"},{"Traditional Music","Koev Sarat","19.99$"}};
    private static Book[] objBook = new Book[book.length];
    private static DVD[] objDVD = new DVD[dvd.length];
    private static CD[] objCD = new CD[cd.length];
    private static Scanner sc= new Scanner(System.in);
    private static void initValues() {
        for(int i=0;i<3;i++){
            objBook[i] = new Book();
            objDVD[i] = new DVD();
            objCD[i] = new CD();
            //book
            objBook[i].setTitle(book[i][0]);
            objBook[i].setAuthor(book[i][1]);
            objBook[i].setEdition(book[i][2]);
            objBook[i].returnItem();
            //dvd
            objDVD[i].setTitle(dvd[i][0]);
            objDVD[i].setCategory(dvd[i][1]);
            objDVD[i].setPrice(dvd[i][2]);
            objDVD[i].returnItem();
            //cd
            objCD[i].setCategory(cd[i][0]);
            objCD[i].setSinger(cd[i][1]);
            objCD[i].setPrice(cd[i][2]);
            objCD[i].returnItem();
        }
    }
    private static void menu(){
        System.out.print("=== The Library ===\n" +
                "1. Display Book list\n" +
                "2. Display DVD list\n" +
                "3. Display CD list\n" +
                "4. Borrow an item\n" +
                "5. Return an item\n" +
                "6. Quit\n" +
                "Choose an opt:");
        int opt = sc.nextInt();
        switch (opt) {
            case 1 -> {
                System.out.println("=== The List of Book ===");
                listBook();
                menu();
            }
            case 2 -> {
                System.out.println("=== The List of DVD ===");
                listDVD();
                menu();
            }
            case 3 -> {
                System.out.println("=== The List of CD ===");
                listCD();
                menu();
            }
            case 4 -> {
                System.out.println("=== To Borrow ===");
                borrowItem();
                menu();
            }
            case 5 -> {
                System.out.println("=== To Return Item ===");
                returnItem();
                menu();
            }
            case 6 -> {
                System.out.println("Quited");
            }
            default -> menu();
        }
    }
    private static void listBook(){

        for(int i=0;i< objBook.length;i++){
            if(objBook[i].isBorrowed()){
                System.out.println((i+1)+". "+ objBook[i].getTitle()+"\t"+ objBook[i].getAuthor()+"\t"+ objBook[i].getEdition()+"\t(borrowed by "+objBook[i].getBorrower()+")");

            }else {
                System.out.println((i+1)+". "+ objBook[i].getTitle()+"\t"+ objBook[i].getAuthor()+"\t"+ objBook[i].getEdition()+"\t(available)");
            }
        }
    }
    private static void listDVD(){

        for(int i=0;i< objDVD.length;i++){
            if(objDVD[i].isBorrowed()){
                System.out.println((i+1)+". "+ objDVD[i].getTitle()+"\t"+ objDVD[i].getCategory()+"\t"+ objDVD[i].getPrice()+"\t(borrowed by "+objDVD[i].getBorrower()+")");

            }else {
                System.out.println((i+1)+". "+ objDVD[i].getTitle()+"\t"+ objDVD[i].getCategory()+"\t"+ objDVD[i].getPrice()+"\t(available)");
            }
        }
    }
    private static void listCD(){
        for(int i=0;i< objCD.length;i++){
            if(objCD[i].isBorrowed()){
                System.out.println((i+1)+". "+ objCD[i].getCategory()+"\t"+ objCD[i].getSinger()+"\t"+ objCD[i].getPrice()+"\t(borrowed by "+objCD[i].getBorrower()+")");

            }else {
                System.out.println((i+1)+". "+ objCD[i].getCategory()+"\t"+ objCD[i].getSinger()+"\t"+ objCD[i].getPrice()+"\t(available)");
            }
        }
    }
    private static void borrowItem(){
        System.out.print("1. Book\n" +
                "2. DVD\n" +
                "3. CD\n\n" +
                "Choose an item:");
        int opt = sc.nextInt();
        int index;
        String name;
        switch (opt) {
            case 1->{
                System.out.print("Input index of item : ");
                index = sc.nextInt();
                if(!objBook[index-1].isBorrowed()){
                    System.out.print("Input name of borrower :" );
                    name = sc.next();
                    objBook[index-1].setBorrower(name);
                    objBook[index-1].setBorrowed(true);
                }else{
                    System.out.println("not allow");
                }
            }
            case 2->{
                System.out.print("Input index of item : ");
                index = sc.nextInt();
                if(!objDVD[index-1].isBorrowed()){
                    System.out.print("Input name of borrower :" );
                    name = sc.next();
                    objDVD[index-1].setBorrower(name);
                    objDVD[index-1].setBorrowed(true);
                }else{
                    System.out.println("not allow");
                }
            }
            case 3->{
                System.out.print("Input index of item : ");
                index = sc.nextInt();
                if(!objCD[index-1].isBorrowed()){
                    System.out.print("Input name of borrower :" );
                    name = sc.next();
                    objCD[index-1].setBorrower(name);
                    objCD[index-1].setBorrowed(true);
                }else{
                    System.out.println("not allow");
                }
            }
            default -> borrowItem();
        }
    }
    private static void returnItem(){
        System.out.print("1. Book\n" +
                "2. DVD\n" +
                "3. CD\n\n" +
                "Choose an item:");
        int opt = sc.nextInt();
        int index;
        System.out.print("Input index of item : ");
        index = sc.nextInt();
        switch (opt) {
            case 1->{
                if(objBook[index-1].isBorrowed()){
                    objBook[index-1].returnItem();
                }else{
                    System.out.println("not allow");
                }
            }
            case 2->{
                if(objDVD[index-1].isBorrowed()){
                    objDVD[index-1].returnItem();
                }else{
                    System.out.println("not allow");
                }
            }
            case 3->{
                if(objCD[index-1].isBorrowed()){
                    objCD[index-1].returnItem();
                }else{
                    System.out.println("not allow");
                }
            }
            default -> returnItem();
        }
    }
    public static void main(String[] args){
        initValues();
        menu();
    }
}
