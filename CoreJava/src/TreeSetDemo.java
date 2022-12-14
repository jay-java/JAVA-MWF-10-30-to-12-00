import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Set set = new TreeSet<>();
		set.add(1);
		set.add(123);
		set.add(36534);
		set.add(-345);
		set.add(-34554);
		set.add(0);
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
