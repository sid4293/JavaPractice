package example25;

public class TestArg {
	static int a;
	public static void main(String[] args) {
		a=Integer.parseInt(args[0]);
		System.out.println(a);
	}

}
