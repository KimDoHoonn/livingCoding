package orDemo;

public class Ordemo {
	
	public static void main(String[] args) {
	
		if(true || true) {
			System.out.println(1);
		}
		if(true || false) {
			System.out.print(2);
		}
		if(false || true) {
			System.out.println(3);
		}
		if(false || false) {
			System.out.print(4);
			
		}
	}
}
