package Week4;
class Node{
	String data;
	Node next;
	Node pre;
}
class List{
	int n;
	Node tail;
	Node head;
	public List(){
		n=0;
		tail=null;
		head=null;
	}
}
class StudentList{
	static List list;
	public StudentList(){
		list=new List();
	}
	public static void add(String data) {
		todoAdd(list, data);
	}
	public static void todoAdd(List list,String data) {
		Node node=new Node();
		node.data=data;
		node.next=list.head;
		if(list.n==0) {
			list.tail=node;
		}else {
			list.head.pre=node;
		}
		list.head=node;
		list.n++;
	}
	public static void dispay() {
		Node tm=list.tail;
		while(tm!=null) {
			System.out.println(tm.data);
			tm=tm.pre;
		}
	}
	public static void removeLast() {
		List ls=new List();
		Node tm=list.tail;
		int k=0;
		while(k<list.n-1) {
			todoAdd(ls,tm.data);
			tm=tm.pre;
			k++;
		}
		list=ls;
	}
	public static void removeAt(int n) {
		List ls=new List();
		Node tm=list.tail;
		int k=0;
		if(n>list.n) {
			System.out.println("Index is out of range");
		}else {
			while(k<list.n) {
				
				if(n==k+1) {
					k=k+1;
					continue;
				}
				
				todoAdd(ls,tm.data);
				tm=tm.pre;
				k++;
			}			
		}

		list=ls;
	}
	public static void clear() {
		list=new List();
		System.out.println("Array is emply");
	}
	
}

public class Lab04_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentList list=new StudentList();
		System.out.println("==> Add");
		list.add("Makara");
		list.add("Kompheak");
		list.dispay();
		System.out.println("==> Remove at last");
		list.removeLast();
		list.add("Minea");
		list.add("Mahsa");
		list.dispay();
		System.out.println("==> Remove at larger index");
		list.removeAt(10);
		System.out.println("==> Clear all element");
		list.clear();
		
	}

}
