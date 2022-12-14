import java.util.InputMismatchException;
import java.util.Scanner;

//1.try 2.catch 3.finally 4.throw 5.throws

class Divide { // A
	public void division() throws ArithmeticException, InputMismatchException {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("enter a = ");
		a = sc.nextInt();
		System.out.println("enter b = ");
		b = sc.nextInt();
		c = a / b;
		System.out.println("c = " + c);
		throw new ArithmeticException();
	}
}

public class ExceptionHandling { // B
	public static void main(String[] args) {

		try {
			Divide d = new Divide();
			d.division();
		} catch (ArithmeticException e) {
			System.out.println("number cannot divide by zero");
		}
		catch (InputMismatchException e) {
			System.out.println("number cannot divide by another value except integer");
		}

//		int i, j, k;
//		try {
//			Scanner sc = new Scanner(System.in);
//			System.out.println("enter  i = ");
//			i = sc.nextInt();
//			System.out.println("enter  j = ");
//			j = sc.nextInt();
//			k = i / j;
//			System.out.println("k = " + k);
//		}
//
//		catch (ArithmeticException e) {
//			System.out.println("number cannot divide by zero");
//		} catch (InputMismatchException e) {
//			System.out.println("number cannot divide by string");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		
//		finally {
//			System.out.println("this will executes everytime");
//		}
	}
}
