//1.super() is used to call parent class constructor.
//2.using super() we can initialize parent class property.

//Note: super() must be used inside the constructor and that 
//must be the first statement..

class GrandFather {
	String name;

	public GrandFather(String name) {
		this.name = name;
	}
}

class Dad extends GrandFather{
	String name;

	public Dad(String name,String grandfathername) {
		super(grandfathername);
		this.name = name;
	}
}

class Son extends Dad {
	String name;

	public Son(String name, String dadname,String grandfathername) {
		super(dadname,grandfathername);
		this.name = name;
	}

	void showName() {
		System.out.println(name);
		System.out.println(super.name);
		GrandFather grandFather=this;
		System.out.println(grandFather.name);
	}

}

public class SuperConstructor {
	public static void main(String[] args) {
		Son son = new Son("Sonu Sing", "Suresh Singh","Ashok Singh");
		// if you want to access both name from static
		// method then we can use typecasting:
		System.out.println(son.name);
		Dad dad = son;
		System.out.println(dad.name);
		GrandFather grandFather=son;
		System.out.println(grandFather.name);
		// if you want to access from non static
		// method the we can call
		son.showName();
	}
}
