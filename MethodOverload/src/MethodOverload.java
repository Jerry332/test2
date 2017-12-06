class overload{
	int add(int a,int b)
	{return a+b;}
	int add (int a,int b,int c){
		return a+b+c;
	}
}

public class MethodOverload {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		overload test=new overload();
     System.out.println(test.add(1, 3));
     System.out.println(test.add(1, 2, 3));
	
	}
}
