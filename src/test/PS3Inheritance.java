package test;

public class PS3Inheritance extends PS4Inheritance{

	int a;
	public PS3Inheritance(int a) {
		super(a);
		this.a=a;
		
	}
	public int incerement()
	{
		a=a+1;
		//System.out.println(a); 
		return a;
	}
	public int decrement()
	{
		a=a-1;
		//System.out.println(a); 
		return a;
	}

}
 