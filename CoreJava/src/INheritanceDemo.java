//inheritance-->to access property of one class to another class
//TYPES
//1.single
//2.multilevel
//3.multiple
//4.hierarchical
//5.hybrid
class A{
	public void showAClass() {
		System.out.println("A class");
	}
}
class B extends A{
	public void showBClass() {
		System.out.println("B class");
	}
}
class C extends B{
	public void showCClass() {
		System.out.println("C class");
	}
}
public class INheritanceDemo {
	public static void main(String[] args) {
		B b = new B();
		b.showAClass();
		b.showBClass();
		C c = new C();
		c.showAClass();
		c.showBClass();
		c.showCClass();
	}
}
