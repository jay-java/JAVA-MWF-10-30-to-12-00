import java.util.Scanner;

class students{
	static {
		System.out.println("static block in student class");
	}
	int id;
	float per;
	static String cname = "TOPS";
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		id = sc.nextInt();
		System.out.println("enter per : ");
		per= sc.nextFloat();
	}
	public void show() {
		System.out.println("id : "+id+" per: "+per+" cname : "+cname);
	}
	public static void another() {
		System.out.println("another methos in student class");
	}
}
public class ClassObject {
	static {
		System.out.println("static block in main class");
	}
	public static void main(String[] args) {
		students h1 = new students();
		h1.input();
		h1.show();
		students h2 = new students();
		h2.input();
		h2.show();
		students h3 = new students();
		h3.input();
		h3.show();
		students.another();
	}
}
