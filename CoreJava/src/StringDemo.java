
public class StringDemo {
	public static void main(String[] args) {
		String s ="hello java";
		String s2 = "hello java";
		String s1 = "	hello java again	";
		System.out.println("length of string : "+s.length());
		System.out.println(s.charAt(9));
		System.out.println(s.concat(s1));
		System.out.println(s);
		System.out.println(s.endsWith("a "));
		System.out.println(s.contains("ja"));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareToIgnoreCase(s2));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.isEmpty());
		System.out.println(s1.trim());
	}
}
