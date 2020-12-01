//5.We can pass this keyword as an argument to pass 
//current object to another class.

//Note: this keyword can never used inside static context (Area).
 
class MyFriend {
	void access(ThisFourth thisFourth) {
		thisFourth.car();
	}
}

public class ThisFourth {
	void car() {
		System.out.println("This is my car");
	}

	void getMyCar() {
		new MyFriend().access(this);
	}

	public static void main(String[] args) {
		new ThisFourth().getMyCar();
	}
}
