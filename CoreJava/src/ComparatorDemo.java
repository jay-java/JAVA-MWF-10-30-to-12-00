import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Mobile1{
	int price;
	String com;
	public int getPrice() {
		return price;
	}
	public String getCom() {
		return com;
	}
	public Mobile1(int price,String com) {
		this.price=price;
		this.com = com;
	}
	@Override
	public String toString() {
		return "price : "+price+" comapanyuy : "+com;
	}
}
public class ComparatorDemo {
	public static void main(String[] args) {
		Mobile1 m1= new Mobile1(10000, "MI");
		Mobile1 m2= new Mobile1(20000, "VIVO");
		Mobile1 m3= new Mobile1(50000, "APPLE");
		Mobile1 m4= new Mobile1(40000, "SAMSUNG");
		Mobile1 m5= new Mobile1(30000, "REDMI");
		
		List<Mobile1> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		
		Comparator<Mobile1>	com = new Comparator<Mobile1>() {

			@Override
			public int compare(Mobile1 o1, Mobile1 o2) {
				if(o1.getPrice()>o2.getPrice()) {
					return 1;
				}
				else {
					return -1;
				}
			}
		};	
		
		Collections.sort(list, com);
		for(Mobile1 m : list) {
			System.out.println(m);
		}
	}
}
