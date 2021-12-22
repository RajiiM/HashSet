import java.util.HashSet;

public class Practice {

	public static void main(String[] args) {
		HashSet al = new HashSet();
		al.add("Rajii");
		al.add(4.5f);
		al.add(true);
		al.add("Rajii");
		System.out.println(al);			
		System.out.println(al.size());
		
		HashSet al1 = new HashSet();
		al1.addAll(al);
		System.out.println(al1);			
		System.out.println(al1.size());
		
		al1.add(100);
		al1.add(200);
		al1.add("Hi");
		System.out.println(al1);			
		System.out.println(al1.size());
		
		al1.removeAll(al);
		System.out.println(al1);			
		System.out.println(al1.size());
		
	}
}
----------------------------------
OUTPUT:
[4.5, Rajii, true]
3
[4.5, Rajii, true]
3
[4.5, Hi, 100, 200, Rajii, true]
6
[Hi, 100, 200]
3
===============================================
===============================================
