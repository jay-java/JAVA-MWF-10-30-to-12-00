import java.util.ArrayList;
import java.util.List;

class TV{
	private long price;
	private String company;
	private int size;
	TV(long price,String company,int size){
		this.price=price;
		this.company=company;
		this.size=size;
	}
	@Override
	public String toString() {
		return "Price : "+price+" Comapny : "+company+" Size : "+size;
	}
}
public class LIstPractical {
	public static void main(String[] args) {
		TV t1 = new TV(10000,"sony",52);
		TV t2 = new TV(20000,"samsung",32);
		TV t3 = new TV(30000,"toshiba",48);
		TV t4 = new TV(40000,"LG",28);
		
		List<TV> list  = new ArrayList<TV>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		System.out.println(list);
	}
}
