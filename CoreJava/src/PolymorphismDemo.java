//same method name but having different functionalities
//1.Compile time->oveloading
//2.Runtime->overrding
class Calc{
	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	public void sum(int a,int b,int c) {
		System.out.println(a+b);
	}
	public void sum(int a,float b) {
		System.out.println(a+b);
	}
}
public class PolymorphismDemo {
	public static void main(String[] args) {
		Calc c = new Calc();
		c.sum(1, 2);
	}
}
