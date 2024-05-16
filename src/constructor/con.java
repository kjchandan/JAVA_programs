package constructor;

	class con1 {
		
	
	public con1() {
		System.out.println("chandan");
		}
	
	public con1(int a, int b,int c) {
		System.out.println(a+b+c);
		}
	}

public class con {
		public static void main(String args[]) {
			con1 c = new con1(1, 2, 3);
			con1 c1 = new con1();
		}	
}
	