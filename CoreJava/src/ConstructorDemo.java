import java.util.Scanner;

//CONSTRUCTOR --> special member function of class which has same name as class name
//TYPES
//1.default
//2.parameterized
//3.copy
class laptop {
	double price;
	String company;

	laptop() {
		System.out.println("this is default constru..");
	}
	laptop(double price,String company){
		System.out.println("this is para cons..");
		this.price= price;
		this.company = company;
	}


	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCompany() {
		return company;
	}
	@Override
	public String toString() {
		return "l2 value -->"+"price : "+price+" company : "+company;
	}
}
class laptop2{
	double price;
	String company;
	laptop2(laptop l2){
		this.price = l2.price;
		this.company = l2.company;
	}
	@Override
	public String toString() {
		return "l3 value --->"+"price : "+price+" company : "+company;
	}
}
public class ConstructorDemo {
	public static void main(String[] args) {
		laptop l1 = new laptop();
		double price;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter price : ");
		price = sc.nextDouble();
		System.out.println("enter name : ");
		name = sc.next();
		l1.setPrice(price);
		l1.setCompany(name);
		System.out.println(l1.getPrice());
		System.out.println(l1.getCompany());
		laptop l2 = new laptop(12000.89,"dell");
		System.out.println(l2);
		
		laptop2 l3 = new laptop2(l2);
		System.out.println(l3);
	}
}
