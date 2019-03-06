package test;

class F{
	public F() {
		System.out.println("아빠");
	}
	public F(String str) {
		this();
		System.out.println(str+"아빠");
	}
}

public class S extends F{
	public S() {
		
		this("아들 : ");
		System.out.println("아들1");
	}
	
	public S(String str) {
		this(str,"아들2 : ");
		System.out.println("아들2");
	}
	public S(String str, String str2) {
//		super(str2);
		System.out.println("아들3");
	}

	public static void main(String[] args) {
		new S();
	}
}
