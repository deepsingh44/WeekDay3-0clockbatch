//Rahul want to share own data with Hritik
class Student {
	private String name;
	private int roll;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public int getRoll() {
		return roll;
	}
}

class Rahul {

	void share() {
		Hritik hr=new Hritik();
		/*Student student=new Student();
		student.setRoll(123);
		student.setName("Rahul");*/
		hr.access(123,"Rahul");
		
	}
	
}

class Hritik {

	void access(int roll,String name) {
		//System.out.println(student.getRoll()+"\t"+student.getName());
		System.out.println(roll+"\t"+name);
	}
	
}

public class EncapsulationTutorial {
public static void main(String[] args) {
	new Rahul().share();
	
}
}
