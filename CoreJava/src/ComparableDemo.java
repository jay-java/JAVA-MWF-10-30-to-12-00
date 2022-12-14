import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Mobile implements Comparable<Mobile>{
	int price;
	String com;
	public int getPrice() {
		return price;
	}
	public String getCom() {
		return com;
	}
	public Mobile(int price,String com) {
		this.price=price;
		this.com = com;
	}
	@Override
	public String toString() {
		return "price : "+price+" comapanyuy : "+com;
	}
	@Override
	public int compareTo(Mobile o) {
		if(this.getPrice()>o.getPrice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
public class ComparableDemo {
	public static void main(String[] args) {
		Mobile m1= new Mobile(10000, "MI");
		Mobile m2= new Mobile(20000, "VIVO");
		Mobile m3= new Mobile(50000, "APPLE");
		Mobile m4= new Mobile(40000, "SAMSUNG");
		Mobile m5= new Mobile(30000, "REDMI");
		
		List<Mobile> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		Collections.sort(list);
		for(Mobile m:list) {
			System.out.println(m);
		}
	}
}
