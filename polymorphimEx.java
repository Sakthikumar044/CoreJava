package day13;

public class polymorphimEx {
	//overloading
	int add(int a, int b) {
		return a + b;
		}
	int add(int a, int b, int c) {
		return a + b + c;
		}
	String add(String name,int a, int b, int c) {
		return name+ (a + b + c);
		}
	//overriding
	public String toString() {
		return "The overriding function";
		}
	public static void main(String[] args) {
		polymorphimEx user = new polymorphimEx();
		System.out.println("addition of two number :"+user.add(11, 22));
		System.out.println("addition of three number :"+user.add(11, 22,24));
		System.out.println("addition of three number :"+user.add("Ajay",11, 22,24));
		System.out.println(user );
		}
}



