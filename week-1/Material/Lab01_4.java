/**
 * 
 */
package Week1;

/**
 * @author davann
 *
 */
public class Lab01_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//part 1
		for(int k=0;k<=10;k++) {
			if(k!=0) {
				System.out.print("\t"+k+"|");
			}else {
				System.out.print("\t"+" "+"|");
			}
			
		}
		System.out.println();
		for(int k=0;k<=90;k++) {
			System.out.print("-");
		}
		for(int i=1;i<=5;i++) {
			System.out.println();

			System.out.print("\t"+i+"|");
			for(int j=1;j<=10;j++) {
				if(i*j<10) {
					System.out.print("\t ");
				}else {
					System.out.print("\t");
				}
					System.out.print(j*i);
				System.out.print("|");
			}
			
		}
		

		//part 2
		System.out.println("\n\n");
		String row1="| Country           | Name         | Profession             | Age    |";
		String row2="| Germany           | Michael      | Computer Engineer      | 19     |";
		String row3="| England           | Robert       | Artist                 | 34     |";
		String row4="| United Kingdom    | Julia        | Designer               | 42     |";
		String row5="| United State      | Jo           | Actor                  | 21     |";
		String row[]= {row1,row2,row3,row4,row5,""};
		for(int i=0;i<=5;i++) {
			for(int j=0;j<70;j++) {
				if(j==0||j==20||j==35||j==60||j==69) {
					System.out.print("+");
				}else {
					System.out.print("-");
				}
				
			}
			System.out.println();
			System.out.println(row[i]);
		}

				
	}

}
