package inheritance;

class chandan {
	public static void name() {
		System.out.println("chandan");
	}
} 
//Overriding.
class new_chandan extends chandan {
	public static void name() {
		System.out.println("Chandan");
	}
	//Overloading.
	public static void name(int a) {
		System.out.println("chandnananana");
	}
	public void name(int a, int b) {
		System.out.println("chdhdhdhdh");
	}
}

public class inheritance {
	public static void main(String args[]) {
		chandan chan = new chandan();
		new_chandan chand = new new_chandan();   
		chan.name();
		chand.name();
		chand.name(1);
		chand.name(1,1);
	}

}
