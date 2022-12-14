
abstract class RBI {
	public abstract void interest();

	public abstract void homeloan();
	public void reporate() {
		System.out.println("repo rate : +-4%");
	}
}

class SBI extends RBI {
	public void interest() {
		System.out.println("sbi interest : 5%");
	}

	public void homeloan() {
		System.out.println("sbi homeloan : 7%");
	}
}

class PNB extends RBI {
	public void interest() {
		System.out.println("pnb interest : 6%");
	}

	public void homeloan() {
		System.out.println("pnb homeloan : 8%");
	}
}

class JAVA extends RBI {
	public void interest() {
		System.out.println("pnb interest : 12%");
	}

	public void homeloan() {
		System.out.println("pnb homeloan : 6%");
	}

}

public class AbstractionDemo {
	public static void main(String[] args) {
		PNB p = new PNB();
		p.interest();
		p.homeloan();
		p.reporate();
		SBI s = new SBI();
		s.interest();
		s.homeloan();s.reporate();
		JAVA j = new JAVA();
		j.interest();
		j.homeloan();
		j.reporate();
		
	}
}
