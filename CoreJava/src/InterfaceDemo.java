
interface inter1{
	public void interface1();
	public static void interface4() {
		System.out.println("interface 4");
	}
}
interface inter2 {
	public void interface2();
	public static void interface5() {
		System.out.println("interface 5");
	}
}
interface inter3 extends inter1,inter2{
	public void interface3();
	public static void interface6() {
		System.out.println("interface 6");
	}
}
class InterfaceCalling implements inter3{
	public void run() {
		System.out.println("run method inside class");
	}
	public void interface1() {
		System.out.println("interface 1");
	}
	public void interface2() {
		System.out.println("interface 2");
	}
	public void interface3() {
		System.out.println("interface 3");
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		InterfaceCalling i = new InterfaceCalling();
		i.run();
		i.interface1();
		i.interface2();
		i.interface3();
		inter1.interface4();
	}
}
