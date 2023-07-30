package Week4;

import java.util.Scanner;

class Video{
	String title;
	public Video(String title) {
		this.title=title;
	}
	
}
public class Lab04_4 {
	private static Scanner sc =new Scanner(System.in);
	private static Video[] video =new Video[50];
	private static int i=0;
	private static void menu(){
		System.out.println("====== Menu ======");
		System.out.println("1. Search");
		System.out.println("2. View all video");
		System.out.println("3. Add a new video");
		System.out.println("4. Quit");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->searchVideo();
			case 2->viewVideo();
			case 3->createVideo();
			case 4->System.out.println("Exited");
			default->menu();
		}
		
	}
	private static void createVideo() {
		System.out.println("Video #"+(i+1)+":");
		System.out.print("Title :");
		sc.nextLine();
		String title=sc.nextLine();
		video[i]=new Video(title);
		i++;
		System.out.println();
		menu();
	}
	private static void viewVideo() {
		System.out.println("=================================================");
		System.out.println("| Title \t\t\t\t|");
		System.out.println("=================================================");
		for(int j=0;j<i;j++) {
			System.out.println("|"+(j+1)+"\t|"+video[j].title+"\t|");
		}
		menu();
	}
	private static void searchVideo() {
		System.out.println("==== Video Search ====");
		System.out.print("Input title: ");
		sc.nextLine();
		String search=sc.nextLine();
		int z=0;
		for(int j=0;j<i;j++) {
			int verify=video[j].title.toLowerCase().indexOf(search.toLowerCase());
			if(verify>=0) {
				z++;
			}
		}
		int t=1;
		if(z>0) {
			System.out.println(z+" videos found:");
			for(int j=0;j<i;j++) {
				int verify=video[j].title.toLowerCase().indexOf(search.toLowerCase());
				if(verify>=0) {
					System.out.println(t+". "+video[j].title);
					t++;
				}
			}			
		}else {
			System.out.println("0 video found. Try again");
		}
		menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		menu();
	}

}
