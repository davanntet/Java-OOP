package Week3;
//part 1
class Product{
	String name;
	String price;
	String made;
	String start;
	String end;
	Category category;
	void setValue(String name,String price,String made,String start,String end,Category category){ 
		this.name=name;
		this.price=price;
		this.made=made;
		this.start=start;
		this.end=end;
		this.category=category;
	}
	void printValue() {
		System.out.println("Name :"+name+"->Price :"+price+"->Made in :"+made+"->Start :"+start+"->End :"+end+"->Type :"+category.type);
	}
}
class Category{
	String type;
}

//part2
class User{
	String name;
	int age;
	String sex;
	String job;
	Video video;
	void setValue(String name,int age,String sex,String job,Video video) {
		this.name=name;
		this.age=age;
		this.sex=sex;
		this.job=job;
		this.video=video;
	}
	void printValue() {
		System.out.println("Name :"+name+"->Age :"+age+"->Sex :"+sex+"->Job :"+job+"->Title :"+"->Type:"+video.type+"->Time :"+video.time);
	}
}
class Video{
	String title;
	String type;
	String time;
}

//part3
class Book{
	String title;
	String lang;
	String price;
	int madeTime;
	int page;
	Author author;
	void setValue(String title,String lang,String price,int madeTime,int page,Author author) {
		this.title=title;
		this.lang=lang;
		this.price=price;
		this.madeTime=madeTime;
		this.page=page;
		this.author=author;
	}
	void printValue() {
		System.out.println("Title :"+title+"->Language :"+lang+"->Price :"+price+"->Produced in :"+madeTime+"->Author Name :"+author.name+"->Sex :"+author.sex+"->Nationality :"+author.Nationality);
	}
}
class Author{
	String name;
	String sex;
	String Nationality;
}
public class Lab03_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part 1
		System.out.println("1. Product & Category");
		Product[] product=new Product[3];
		for(int i=0;i<product.length;i++) {
			product[i]=new Product();
		}
		Category category1=new Category();
		category1.type="Soap";
		product[0].setValue("Viso","2.5$","Thai","2020-05-23","2023-05-23", category1);
		
		Category category2=new Category();
		category2.type="Fast food";
		product[1].setValue("Noodles","0.5$","Japan", "2022-03-27","2023-03-27", category2);
		
		Category category3=new Category();
		category3.type="Spices";
		product[2].setValue("Sugar","5.99$", "Khmer","2023-01-07","2023-01-07", category3);
		
		for(int i=0;i<product.length;i++) {
			product[i].printValue();
		}
		//finished
		
		
		//part 2
		System.out.println("2. User & Video");
		User[] user=new User[3];
		for(int i=0;i<user.length;i++) {
			user[i]=new User();
		}
		Video video1=new Video();
		video1.title="Logorithm";
		video1.type="Mathemetic";
		video1.time="1h25mn30s";
		user[0].setValue("Tet Davann",45,"Male","Student", video1);
		
		Video video2=new Video();
		video2.title="History fo Human";
		video2.type="Novel";
		video2.time="5h45mn23s";
		user[1].setValue("Sprider Man", 90,"Female","Actor", video2);
		
		Video video3=new Video();
		video3.title="Ban Merl Ban Saoch";
		video3.type="Joke";
		video3.time="20mn30s";
		user[2].setValue("Kim JongAoun", 35,"Female", "Driver", video3);
		
		for(int i=0;i<user.length;i++) {
			user[i].printValue();
		}
		
		//part 3
		System.out.println("3. Book & Author");
		Book[] book=new Book[3];
		for(int i=0;i<book.length;i++) {
			book[i]=new Book();
		}
		Author author1=new Author();
		author1.name="Tet Davann";
		author1.sex="Male";
		author1.Nationality="Khmer";
		book[0].setValue("The Segret", "Khmer","25.99$", 2022, 499, author1);
		
		Author author2=new Author();
		author2.name="Nhouk Time";
		author2.sex="Male";
		author2.Nationality="Khmer";
		book[1].setValue("Khoulabbailen", "Khmer","5.99$",1961, 169, author2);
		
		Author author3=new Author();
		author3.name="Ti Gihout";
		author3.sex="Male";
		author3.Nationality="Khmer";
		book[2].setValue("Techoyout", "Khmer","3.99$",1955, 121, author3);
		
		for(int i=0;i<book.length;i++) {
			book[i].printValue();
		}
		
	}

}
