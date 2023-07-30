/**
 * 
 */
package Week2;

/**
 * @author davann
 *
 */
class IDCard{
	String name;
	int age;
	String gender;
	String Location;
	String Height;
	String Job;
	
}
class FacebookPost{
	String title;
	String who_Can_See;
	String tag;
	String []mention=new String[10];
	String photo;
}
class Phone{
	String name;
	String model;
	String price;
	String warrent;
	String color;
}
class Book{
	String title;
	String page;
	String price;
	String recomment_for;
	String type;
}
public class Lab02_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//For ID Card
		IDCard card1=new IDCard();
		IDCard card2=new IDCard();
		IDCard card3=new IDCard();
		
		card1.name="Tet Davann";
		card1.age=25;
		card1.gender="Male";
		card1.Height="170cm";
		card1.Job="Student";
		card1.Location="Phnom Penh";
		
		card2.name="Super Man";
		card2.age=35;
		card2.gender="Female";
		card2.Height="190cm";
		card2.Job="Flighter";
		card2.Location="Kandal";
		
		card3.name="Jonh Sina";
		card3.age=25;
		card3.gender="Female";
		card3.Height="185cm";
		card3.Job="Sports";
		card3.Location="Takeov";
		
		IDCard[] card=new IDCard[3];
		card[0]=card1;
		card[1]=card2;
		card[2]=card3;
		//Finish
	
	//For Facebook Post
		FacebookPost post1=new FacebookPost();
		FacebookPost post2=new FacebookPost();
		FacebookPost post3=new FacebookPost();
		
		post1.title="What is color of light of sun?";
		post1.tag="DAVANN";
		post1.mention[0]="Davann";
		post1.mention[1]="Biden";
		post1.mention[2]="Trump";
		post1.who_Can_See="Friends";
		post1.photo="photo1.png";
		
		post2.title="Why sea water is salty?";
		post2.tag="DAVANN";
		post2.mention[0]="Putin";
		post2.mention[1]="Kimjongoun";
		post2.mention[2]="Xijinping";
		post2.who_Can_See="Friend of Friend";
		post2.photo="photo2.png";
		
		post3.title="How to sucess?";
		post3.tag="DAVANN";
		post3.mention[0]="Bill Gate";
		post3.mention[1]="Lilon Mass";
		post3.mention[2]="Zackburg";
		post3.who_Can_See="Friends";
		post3.photo="photo3.png";
		
		FacebookPost[] post=new FacebookPost[3];
		post[0]=post1;
		post[1]=post2;
		post[2]=post3;
		//Finish
		
	//For Phone
		Phone phone1=new Phone();
		Phone phone2=new Phone();
		Phone phone3=new Phone();
		
		phone1.name="Samsung";
		phone1.model="J6+";
		phone1.price="399.99$";
		phone1.warrent="2year";
		phone1.color="black";
		
		phone2.name="Iphone";
		phone2.model="14 pro max";
		phone2.price="1799.99$";
		phone2.warrent="3 month";
		phone2.color="gold";
		
		phone3.name="Samsung";
		phone3.model="Galaxy Tab";
		phone3.price="799.99$";
		phone3.warrent="1year";
		phone3.color="grey";
		
		Phone[] phone=new Phone[3];
		phone[0]=phone1;
		phone[1]=phone2;
		phone[2]=phone3;
		//finish
		
	//For Book
		Book book1=new Book();
		Book book2=new Book();
		Book book3=new Book();
		
		book1.title="The Great";
		book1.page="250 page";
		book1.price="5$";
		book1.recomment_for="Student";
		book1.type="Education";
		
		book2.title="Tom and Jerry";
		book2.page="350 page";
		book2.price="25$";
		book2.recomment_for="Children";
		book2.type="toy";
		
		book3.title="Joav Jit";
		book3.page="120 page";
		book3.price="2.5$";
		book3.recomment_for="Student";
		book3.type="Novel";
		
		Book[] book=new Book[3];
		book[0]=book1;
		book[1]=book2;
		book[2]=book3;
		//finish
		
		
	}

}
