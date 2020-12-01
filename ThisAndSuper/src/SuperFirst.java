//1.super keyword is used to access property of parent class.
//2.using super keyword we can remove confliction between 
//child class property and parent class property.
//super keyword always used when we have inheritance concept.
class Bike {
	static final int speed = 120;
	int color = 1;

	void mySpeed() {
		System.out.println(speed);
	}
}

class SportsBike extends Bike {
	static final int speed = 220;
	int color = 2;

	void mySpeed() {
		//remove confliction between static variable
		System.out.println(Bike.speed);
		System.out.println(speed);

		//remove confliction between non static variable.
		System.out.println(color);
		System.out.println(super.color);
	}

}

public class SuperFirst {
	public static void main(String[] args) {
		new SportsBike().mySpeed();
	}
}
