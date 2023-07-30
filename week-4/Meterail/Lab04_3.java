package Week4;


import java.util.Scanner;

class Book{
	int isbn;
	String title;
	double price;
	String author;
	public Book(int isbn,String title,double price,String author) {
		this.isbn=isbn;
		this.title=title;
		this.price=price;
		this.author=author;
	}
	
}
public class Lab04_3 {
	private static Scanner sc =new Scanner(System.in);
	private static Book[] book =new Book[50];
	private static int i=0;
	private static void menu(){
		System.out.println("====== Menu ======");
		System.out.println("1. View all Book");
		System.out.println("2. Add a new Book");
		System.out.println("3. Update a Book");
		System.out.println("4. Quit");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->ListBook();
			case 2->createBook();
			case 3->update();
			case 4->System.out.println("Exited");
			default->menu();
		}
		
	}
	private static void createBook() {
		System.out.println("Book #"+(i+1)+":");
		System.out.print("ISBN :");
		int isbn=sc.nextInt();
		System.out.print("Title :");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("Price :");
		double price=sc.nextInt();
		System.out.print("Author :");
		sc.nextLine();
		String author=sc.nextLine();
		book[i]=new Book(isbn,title,price,author);
		i++;
		System.out.println();
		menu();
	}
	private static void ListBook() {
		System.out.println("==========================================================");
		System.out.println("| No\t| ISBN\t| Title\t\t\t| Price\t| Author");
		System.out.println("==========================================================");
		for(int j=0;j<i;j++) {
			System.out.println("|"+(j+1)+"\t|"+book[j].isbn+"\t|"+book[j].title+"\t\t|"+book[j].price+"\t|"+book[j].author+"\t|");
		}
		System.out.println("==========================================================\n\n");
		menu();
	}
	private static void update() {

		boolean b;
		do {
			b=false;
			System.out.print("Input ISBN: ");
			int isbn=sc.nextInt();
			for(int k=0;k<i;k++) {
				if(isbn==book[k].isbn) {
					b=true;
				}
			}
			if(!b) {
				System.out.println("Book is not found. Try again");
			}else {
				System.out.println("Please update the following:");
				System.out.print("ISBN :");
				int isbns=sc.nextInt();
				System.out.print("Title :");
				sc.nextLine();
				String title=sc.nextLine();
				System.out.print("Price :");
				double price=sc.nextInt();
				System.out.print("Author :");
				sc.nextLine();
				String author=sc.nextLine();
				for(int j=0;j<i;j++) {
					if(isbn==book[j].isbn) {
						book[j].isbn=isbns;
						book[j].title=title;
						book[j].price=price;
						book[j].author=author;
					}
				}
			}
		}while(!b);
		menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
