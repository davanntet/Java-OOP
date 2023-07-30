package Week3;
import java.util.Scanner;

class phoneSetting{
	private static Scanner sc=new Scanner(System.in);
	public static void Open() {
		Setting();
	}
	private static void Setting() {
		System.out.println("Phone Setting:");
		System.out.println("1. General \t\t>");
		System.out.println("2. Wi-Fi \t\t>");
		System.out.println("3. Bluetooth \t\t>");
		System.out.println("4. Mobile Data \t\t>");
		System.out.println("5. Hotspot \t\t>");
		System.out.println("6. Notification \t>");
		System.out.println("0. Quit");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->General();
			case 2->Wifi();
			case 3->Title();
			case 4->Title();
			case 5->Title();
			case 6->Title();
			case 0->System.out.println("Exited");
			default->Setting();
		}
	}
	private static void General() {
		System.out.println("General:");
		System.out.println("1. About \t\t>");
		System.out.println("2. Software update \t>");
		System.out.println("3. Storage \t\t>");
		System.out.println("0. Back");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->GeneralAbout();
			case 2->GeneralSoftwareUpdate();
			case 3->Title();
			case 0->Setting();
			default->General();
		}
	}
	private static void Wifi() {
		System.out.println("Wi-Fi:");
		System.out.println("Status \t\t\tOn");
		System.out.println("Network I-Coffee");
		System.out.println("1. Other networks \t>");
		System.out.println("0. Back");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 1->WifiOtherNetwork();
			case 0->Setting();
			default->Wifi();
		}
	}
	private static void Title() {
		System.out.println("Title:");
		System.out.println("============================");
		System.out.println("The Feature is not available");
		System.out.println("============================");
		System.out.println("0. Back");
		System.out.print("Enter");
		int index=sc.nextInt();
		switch(index) {
			case 0->Setting();
			default->Title();
		}
	}
	private static void GeneralAbout() {
		System.out.println("General > About:");
		System.out.println("Name \t\tiPhone");
		System.out.println("Model \t\tIXs");
		System.out.println("Version \t18.5");
		System.out.println("0. Back");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 0->General();
			default->GeneralAbout();
		}
	}
	private static void GeneralSoftwareUpdate() {
		System.out.println("General > Software Update:");
		System.out.println("======================");
		System.out.println("Software is up to date");
		System.out.println("======================");
		System.out.println("0. Back");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 0->General();
			default->GeneralSoftwareUpdate();
		}
	}
	private static void WifiOtherNetwork() {
		System.out.println("Wi-Fi > Other networks:");
		System.out.println("Bayon coffee \t\t*****");
		System.out.println("Angkor coffee \t\t**");
		System.out.println("Brown coffee \t\t****");
		System.out.println("Koi \t\t\t*");
		System.out.println("0. Back");
		System.out.print("Enter:");
		int index=sc.nextInt();
		switch(index) {
			case 0->Wifi();
			default->WifiOtherNetwork();
		}
	}
}

public class Lab03_3 {

	public static void main(String[] args) {
		phoneSetting.Open();
	}

}
