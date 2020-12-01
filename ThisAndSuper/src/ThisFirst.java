//1.this keyword is used to hold address of current instance.
public class ThisFirst {

	void show() {
		System.out.println(this);
	}
	
	public static void main(String[] args) {
		ThisFirst thisFirst=new ThisFirst();
		System.out.println(thisFirst);
		thisFirst.show();
	}
	
	//output is  :
	//ThisFirst@4517d9a3
	//ThisFirst@4517d9a3
	
}
