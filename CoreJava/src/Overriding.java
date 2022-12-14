class Dog{
	public void run() {
		System.out.println("dog is running");
	}
}
class Cat extends Dog{
	public void run() {
		super.run();
		System.out.println("cat is running");
	}
}
public class Overriding {
	public static void main(String[] args) {
		Cat c = new Cat();
		c.run();
	}
}
