//2.using super keyword we can also access overriden property.

//Note: super keyword can never used as a value like this 
//that means we can never pass super keyword as an argument
//or return statement or print statement.

class Animal {
	void eat() {
		System.out.println("I dont know...");
	}
}

class Lion extends Animal {
	@Override
	void eat() {
		System.out.println("meat ...");
		//after overriding if you want to access 
		//parent class eat method then you can use super keyword.
		super.eat();
	}
}

public class SuperSecond {
public static void main(String[] args) {
	new Lion().eat();
}
}
