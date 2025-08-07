package day16;

import java.util.ArrayList;

public class ArrayListEX {
	
	public static void main(String[] args) {
		
		ArrayList<String> a1 = new ArrayList();
		ArrayList<String> a2 = new ArrayList();
		ArrayList<String> a3 = new ArrayList();
		
		
		//add
		a1.add("Blue");
		a1.add(1,"Green");
		a1.add(2,"Red");
		a1.addFirst("Orange");
		a1.addLast("Black");
		a2.add("Fruits");
		a2.add("Apple");
		a2.add("Mango");
		a2.add("Grapes");
		a2.add("orange");
		
		
		System.out.println(a1);
		System.out.println(a2);
		a3.addAll(a1);
		System.out.println(a3);
		a2.addAll(5, a1);
		System.out.println(a2);
		
		
		//remove
		a2.remove(6);
		System.out.println(a2);
		a2.remove("Orange");
		System.out.println(a2);
		a2.removeFirst();
		System.out.println(a2);
		a2.removeLast();
		System.out.println(a2);
		a2.removeAll(a1);
		System.out.println(a2);
		
		//get
		System.out.println(a1.getFirst());
		System.out.println(a1.getLast());
		System.out.println(a1.get(3));
		System.out.println(a1.getClass());
		
		//Set
		a2.set(1, "Banana");
		System.out.println(a2);
		
		//clear
		a3.clear();
		System.out.println(a3);
		
		//Size
		System.out.println(a1.size());
		System.out.println(a2.size());
		System.out.println(a3.size());
		
		//isEmpty
		System.out.println(a1.isEmpty());
		System.out.println(a3.isEmpty());
		
		//contains
		System.out.println(a2.contains(a1));
		System.out.println(a1.containsAll(a3));
		
		//indexof()
		System.out.println(a1.indexOf("Blue"));
		//lastindexof()
		System.out.println(a2.lastIndexOf("Apple"));
		//equals
		System.out.println(a1.equals(a3));
		//foreach
		a1.forEach(s -> System.out.println(s));
		for(int i= 0;i<=a1.size()-1;i++) {
			System.out.println(a1[i]);
		}
		//replaceall
				
		
		

		
		
		//
		
		
		
		
	}

}
