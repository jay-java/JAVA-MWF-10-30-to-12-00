
public class Loops {
	public static void main(String[] args) {
//		int i=-5;
//		int j=500;
//		j =- i;//j=j+i
////		i++;
//		System.out.println(j);
		
		System.out.println("for loop");
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		System.out.println("while loop");
		int j=6;
		while(j<=5) {
			System.out.println(j);
			j++;
		}
		
		System.out.println("do while");
		int k=6;
		do {
			System.out.println(k);
			k++;
		}
		while(k<=5);
	}
}
