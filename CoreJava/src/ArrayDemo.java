import java.util.Scanner;

public class ArrayDemo {
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
		int size;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		size = sc.nextInt();
		int arr2[] = new int[size];
		for(int index=0;index<arr2.length;index++) {
			System.out.print("enter element at arr["+index+"] : ");
			arr2[index] = sc.nextInt();
		}
		for(int index=0;index<arr2.length;index++) {
			System.out.println("element at arr2["+index+"] is : "+arr2[index]);
		}
		int sum =0;
		for(int index=0;index<arr2.length;index++) {
			sum = sum+arr2[index];
		}
		System.out.println("sum :"+sum);
		int num,counter=0;
		int index;
		System.out.println("enter number to search in array : ");
		num = sc.nextInt();
		for(index=0;index<arr2.length;index++) {
			if(num == arr2[index]) {
				counter++;
				break;
			}
		}
		if(counter==1) {
			System.out.println("yes exist at index : "+index);
		}
		else {
			System.out.println("not exist");
		}
	}
}
