import java.util.Scanner;

class Student{
	private int id;
	private String name;
	private float per;
	Student(int id,String name,float per){
		this.id=id;
		this.name=name;
		this.per=per;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+" per : "+per;
	}
}
public class Encapsuation {
	public static void main(String[] args) {
		int id;
		String name;
		float per;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id : ");
		id = sc.nextInt();
		System.out.println("enter  name : ");
		name = sc.next();
		System.out.println("enter  per : ");
		per = sc.nextFloat();
		Student s = new Student(id,name,per);
		System.out.println(s);
	}
}
