//2.this keyword is used to remove confliction
//between local variable and instance variable.
public class ThisSecond {

	String name;

	void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		ThisSecond thisSecond = new ThisSecond();
		thisSecond.setName("Deep Singh");
		System.out.println(thisSecond.name);
	}

	// output is :
	// Deep Singh

}
