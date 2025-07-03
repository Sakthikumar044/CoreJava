package day7;

public class LoopEx {
	public static void main(String[] args) {
		
		for(int i=1; i<=1000; i++) {
			System.out.println("Iteration on Increament :"+i);
			
		}
		
		for(int j=1000; j>=1; j--) {
			System.out.println("Iteration on Decreament :"+j);
			
		}
		for(int i=50; i>=1; i--) {
			System.out.println("Reverse order :"+i);
			
		}
		int count=0;
		for(int a=1; a<=100; a+=2) {
			count = count+a;
			
		}
		System.out.println(count);
		
		
		
		
	}

}
