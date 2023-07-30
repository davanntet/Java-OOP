package Week4;

//part1
class Point{
	int point_1_x=0;
	int point_1_y=10;
	public void getPoint() {
		System.out.println("Point: ("+point_1_x+","+point_1_y+")");
	}
}

class Line extends Point{
	int point_2_x=20;
	int point_2_y=10;
	public void getLine() {
		System.out.println("Line: ("+point_1_x+" , "+point_1_y+") , ("+point_2_x+" , "+point_2_y+")");
	}
}

class Triangle extends Line{
	int point_3_x=0;
	int point_3_y=0;
	public void getTriangle() {
		System.out.println("Triangle: ("+point_1_x+" , "+point_1_y+") , ("+point_2_x+" , "+point_2_y+") , ("+point_3_x+" , "+point_3_y+")");
	}
}
class Retangle extends Triangle{
	int point_4_x=20;
	int point_4_y=0;
	public void getTriangle() {
		System.out.println("Rectangle: ("+point_1_x+" , "+point_1_y+") , ("+point_2_x+" , "+point_2_y+") , ("+point_3_x+" , "+point_3_y+") , ("+point_4_x+" , "+point_4_y+")");
	}
}
// finished part1


//part2

class StudentIT{
	int id;
	String departement;
}
class StudentProgrmming extends StudentIT{
	String name;
	public StudentProgrmming(int id,String name) {
		this.id=id;
		this.name=name;
		this.departement="Promming";
	}
	public void getInfo() {
		System.out.println("ID:"+id+"\tName:"+name+"\tDepartment:"+departement);
	}
}
class StudentTelecom extends StudentIT{
	String name;
	public StudentTelecom(int id,String name) {
		this.id=id;
		this.name=name;
		this.departement="Telecom";
	}
	public void getInfo() {
		System.out.println("ID:"+id+"\tName:"+name+"\tDepartment:"+departement);
	}
}
//finished part2
public class Lab04_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
