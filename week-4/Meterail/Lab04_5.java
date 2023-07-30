package Week4;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Music{
	String title;
	String singer;
	String length;
	String price;
	public Music(String title,String singer,String length,String price) {
		this.title=title;
		this.singer=singer;
		this.length=length;
		this.price=price;
	}
	String albumTitle;
	String albumGenre;
	public Music(String albumTitle,String albumGenre) {
		this.albumTitle=albumTitle;
		this.albumGenre=albumGenre;
	}
	
}

public class Lab04_5 {
	static Scanner sc=new Scanner(System.in);
	static ArrayList<Music> listAlbum=new ArrayList<Music>();
	static ArrayList<ArrayList<Music>> listMusic=new ArrayList<ArrayList<Music>>();
	static void Menu() {
		System.out.println("====== Menu ======");
		System.out.println("1. View a music store");
		System.out.println("2. Add a song");
		System.out.println("3. Create an album");
		System.out.println("4. Quit");
		System.out.print("Choose an option:");
		int option=sc.nextInt();
		switch(option) {
			case 1->View();
			case 2->Add();
			case 3->Create();
			case 4->System.out.println("Quited");
			default->Menu();
		}
	}
	static void View() {
		System.out.println("====== Music Store ======");
		AtomicInteger at=new AtomicInteger();
		at.set(0);
		listMusic.forEach(e->{
			System.out.println("Album: "+listAlbum.get(at.get()).albumTitle);
			AtomicInteger k=new AtomicInteger();
			
			if(e.size()>0) {
				k.set(1);
				e.forEach(ex->{
					System.out.println("| "+k.get()+"\t| "+ex.title+"\t| "+ex.singer+"\t| "+ex.length+"\t| "+ex.price+"\t|");
					k.set(k.get()+1);
				});
				at.set(at.get()+1);				
			}else {
				System.out.println("None of song");
			}
			System.out.println();
		});
		Menu();
	}
	static void Add() {
		System.out.println("===== Add a new song ====");
		System.out.println("Select following album:");
		AtomicInteger at=new AtomicInteger();
		at.set(1);
		listAlbum.forEach(e->{
			System.out.println(at.get()+". "+e.albumTitle);
			at.set(at.get()+1);
		});
		System.out.print("Choose an opt:");
		int option=sc.nextInt();
		System.out.print("Song title:");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("Singer:");
		String singer=sc.nextLine();
		System.out.print("Length:");
		String length=sc.nextLine();
		System.out.print("Price:");
		String price=sc.nextLine();
		listMusic.get(option-1).add(new Music(title,singer,length,price));
		System.out.println("A new song added to the album");
		Menu();
	}
	static void Create() {
		System.out.println("===== Create new album ====");
		System.out.print("Album title: ");
		sc.nextLine();
		String title=sc.nextLine();
		System.out.print("Genre: ");
		String genre=sc.nextLine();
		listAlbum.add(new Music(title, genre));
		listMusic.add(new ArrayList<Music>());
		Menu();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu();
		
	}

}
