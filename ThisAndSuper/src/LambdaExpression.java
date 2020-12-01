interface FunctionalInterface {
	//void add(int i, int j);
	
	int add(int i,int j);
}

public class LambdaExpression {
	public static void main(String[] args) {

		
		//this is a way to used void return type method
		//FunctionalInterface fi=(x,y)->System.out.println(x+y);
		//fi.add(12, 12);
		
		//FunctionalInterface fi=(x,y)->x+y;
		//OR
		FunctionalInterface fi=(x,y)->{
			return x+y;
		};
		
		
		
	}
}
