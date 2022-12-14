import java.util.Scanner;

//conditional statemetns
//1.simple if
//2.if else
//	3.nested if
//	4.else if ladder
//	5.switch case
class EX {
	public void show() {
		System.out.println("show method inside ex class");
	}
}

public class ConditionalStatement {
	public static void main(String[] args) {
		System.out.println("exeuction start");
		EX obj = new EX();
		obj.show();
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter i = ");
		i = sc.nextInt();
		System.out.println("i = " + i);

		float f;
		System.out.println("enter float value = ");
		f = sc.nextFloat();
		System.out.println(f);
		// 1.simple if
		if (i == 1) {
			System.out.println("true");
		}

		// 2.if else
		if (i == 1) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

		// 3.nested if
		int age;
		System.out.println("enter age = ");
		age = sc.nextInt();
		if (age > 18) {
			if (age < 60) {
				System.out.println("you are eligible");
			} else {
				System.out.println("age is greater than 18 but not less than 60");
			}
		} else {
			System.out.println("age should be greater than 18");
		}

		// 4.else if ladder
		int marks;
		System.out.println("enter marks  = ");
		marks = sc.nextInt();
		if (marks < 35) {
			System.out.println("fail");
		} else if (marks >= 35 && marks <= 50) {
			System.out.println("D grade");
		} else if (marks >= 51 && marks <= 70) {
			System.out.println("C grade");
		} else if (marks >= 71 && marks <= 80) {
			System.out.println("B grade");
		} else if (marks >= 81 && marks <= 90) {
			System.out.println("A grade");
		} else if (marks >= 91 && marks <= 100) {
			System.out.println("A+ grade");
		} else {
			System.out.println("invalid input");
		}

		// 5.switch case
		int lang;
		System.out.println("1.For English");
		System.out.println("2.Hindi k liye 2");
		System.out.println("3.gujarati mate 3");
		System.out.println("enter your choince: ");
		lang = sc.nextInt();
		switch (lang) {
		case 1:
			System.out.println("you selected english");
			break;
		case 2:
			System.out.println("you selected hindi");
			break;
		case 3:
			System.out.println("you selected gujarati");
			break;
		default:
			System.out.println("invalid input");
		}

	}
}
