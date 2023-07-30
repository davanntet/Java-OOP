package Week1;

public class Lab01_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			for(int j=0;j<19-i;j++) {
				if(j<i) {
					System.out.print(" ");
					continue;
				}
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println("\n\n");
		for(int i=0;i<20;i++) {
			for(int j=0;j<20;j++) {
				if(i==0||i==19||j==0||j==19) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		for(int i=1;i<=5;i++) {
			for(int j=0;j<5;j++) {
				System.out.print(j+i+"  ");
			}
			System.out.println();
		}
	}

}
