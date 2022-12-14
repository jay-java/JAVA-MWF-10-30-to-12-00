import java.util.Enumeration;
import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector vr = new Vector<>();
		vr.add(1);
		vr.add("name");
		vr.add('a');
		vr.add(565.5);
		vr.add(false);
		vr.add(12);
		vr.add(-12);
		vr.add(97567);
		System.out.println(vr);
		System.out.println("size of vector : "+vr.size());
		Enumeration em = vr.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
