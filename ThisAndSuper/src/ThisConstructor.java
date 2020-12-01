//1.this() is used to call local constructor chaining to 
//initialize property.

//Note: this() must be use inside a constructor and 
//that must be the first statement.

public class ThisConstructor {
	int size;

	// default size
	public ThisConstructor() {
		this(10);
	}

	// user specific size
	ThisConstructor(int size) {
		this.size = size;
	}

	public static void main(String[] args) {
		System.out.println(new ThisConstructor(20).size);
	}

}
