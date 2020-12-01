//3.we use this keyword as a return statement 
//to achieve method chaining.
//4.Using method chaining we can reduce the statement.
public class ThisThird {

	ThisThird a() {
		System.out.println("a");
		return this;
	}

	ThisThird b() {
		System.out.println("b");
		return this;
	}

	ThisThird c() {
		System.out.println("c");
		return this;
	}

	public static void main(String[] args) {
		// old example:
		ThisThird third = new ThisThird();
		third.a();
		third.b();
		third.c();
		// in this case statements are 4.

		// Using method chaining:
		new ThisThird().a().b().c();
		// In this case we have only one statement.
	}
}
