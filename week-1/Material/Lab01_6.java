/**
 * 
 */
package Week1;

/**
 * @author davann
 *
 */

class Employee{
	int id;
	String name;
	String sex;
	int age;
	String position;
	float salary;
}

class Car{
	int yearProduct;
	String name;
	String model;
	String color;
	float price;
	String maxSpreed;
}

class BankAccount{
	long id;
	double total;
	String type;
	String name;
	String sex;
	String job;
	
}

class Video{
	int hour;
	int minute;
	int seconde;
	String title;
	String description;
	
}


public class Lab01_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For Employee
		System.out.println("For Object Employee");
			//employee-1
				Employee employee1=new Employee();
				employee1.age=19;
				employee1.id=1001;
				employee1.name="Tet Davann";
				employee1.position="Manager";
				employee1.sex="Male";
				employee1.salary=2500;
			System.out.printf("Employee 1: ID:%d , Name:%s , Sex:%s , Age:%d , Position: %s , Salary :%.2f$%n",employee1.id,employee1.name,employee1.sex,employee1.age,employee1.position,employee1.salary);
			//employee-2
				Employee employee2=new Employee();
				employee2.age=21;
				employee2.id=1002;
				employee2.name="Super Man";
				employee2.position="Cleaner";
				employee2.sex="Female";
				employee2.salary=1200;
			System.out.printf("Employee 2: ID:%d , Name:%s , Sex:%s , Age:%d , Position: %s , Salary :%.2f$%n%n",employee2.id,employee2.name,employee2.sex,employee2.age,employee2.position,employee2.salary);

		
		//For Car
				System.out.println("For Object Car");
			//car-1
				Car car1 = new Car();
				car1.color="Red";
				car1.maxSpreed="570km/h";
				car1.model="Luxis";
				car1.name = "Luxis 570";
				car1.price =75000;
				car1.yearProduct=2020;
			System.out.printf("Car 1: Color:%s , Maximum Spedd:%s , Model:%s , Name:%s , Price:%.2f$ , Product Year:%d%n",car1.color,car1.maxSpreed,car1.model,car1.name,car1.price,car1.yearProduct);
			//car-2;
				Car car2 = new Car();
				car2.color="White";
				car2.maxSpreed="330km/h";
				car2.model="Luxis";
				car2.name = "Luxis 330";
				car2.price =35000;
				car2.yearProduct=2022;
			System.out.printf("Car 2: Color:%s , Maximum Spedd:%s , Model:%s , Name:%s , Price:%.2f$ , Product Year:%d%n%n",car2.color,car2.maxSpreed,car2.model,car2.name,car2.price,car1.yearProduct);

		//For BankAccount
			System.out.println("For BankAccount");
			//account-1
				BankAccount bankAccount1=new BankAccount();
				bankAccount1.id=23493536;
				bankAccount1.job="Student";
				bankAccount1.name="Tet Davann";
				bankAccount1.sex="Male";
				bankAccount1.total=150.30;
				bankAccount1.type="Saving";
				System.out.printf("Bank Account1: ID:%d , Name:%s , Sex:%s , Job:%s , Total:%.2f , Type:%s%n",bankAccount1.id,bankAccount1.name,bankAccount1.sex,bankAccount1.job,bankAccount1.total,bankAccount1.type);
			//account-2
				BankAccount bankAccount2=new BankAccount();
				bankAccount2.id=53447536;
				bankAccount2.job="Student";
				bankAccount2.name="Super Man";
				bankAccount2.sex="Female";
				bankAccount2.total=1150.30;
				bankAccount2.type="Saving";
				System.out.printf("Bank Account2: ID:%d , Name:%s , Sex:%s , Job:%s , Total:%.2f , Type:%s%n%n",bankAccount2.id,bankAccount2.name,bankAccount2.sex,bankAccount2.job,bankAccount2.total,bankAccount2.type);
		//For Video
			System.out.println("For Video");
			//video-1
				Video video1 = new Video();
				video1.description="Education for kid";
				video1.hour=0;
				video1.minute=20;
				video1.seconde=40;
				video1.title="Joav Jit";
				System.out.printf("Video 1: Title:%s , Description:%s , Hour:%d , Minute:%d , Second:%d%n",video1.title,video1.description,video1.hour,video1.minute,video1.seconde);
			//video-2;
				Video video2 = new Video();
				video2.description="General education";
				video2.hour=2;
				video2.minute=30;
				video2.seconde=34;
				video2.title="Limit";
				System.out.printf("Video 2: Title:%s , Description:%s , Hour:%d , Minute:%d , Second:%d%n",video2.title,video2.description,video2.hour,video2.minute,video2.seconde);

	}

}
