package Week3;

class Math6{
	static int factorial(int x) {
		return x>0?x*factorial(x-1):1;
	}
	static double rectangleSurface(double width,double height) {
		return (float)width*height;
	}
	static double circleSurface(double radius) {
		return (float) 3.14*radius*radius;
	}
	static int max(int a,int b,int c,int d,int e) {
		int[] arr= {a,b,c,d,e};
		int m=arr[0];
		for(int i=1;i<5;i++) {
			if(m<arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
	static int min(int a,int b,int c,int d,int e) {
		int[] arr= {a,b,c,d,e};
		int m=arr[0];
		for(int i=1;i<5;i++) {
			if(m>arr[i]) {
				m=arr[i];
			}
		}
		return m;
	}
}
public class Lab03_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Math6.factorial(5)="+Math6.factorial(5));
		System.out.println("Math6.rectangleSurface(4,5)"+Math6.rectangleSurface(4, 5));
		System.out.println("Math6.circleSurface(5)="+Math6.circleSurface(5));
		System.out.println("Math6.max(4,7,3,5,1)="+Math6.max(4, 7,3, 5, 1));
		System.out.println("Math6.min(4,7,3,5,1)="+Math6.min(4, 7, 3, 4, 1));
	}

}
