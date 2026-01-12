package test;

import org.testng.annotations.Test;

public class PS2Inheritance extends PSInheritance {

	@Test
	public void testRun() {
		PS3Inheritance ps3=new PS3Inheritance(3);//construtor
		
		int a=3; 
		doThis();
		System.out.println(ps3.incerement());
		System.out.println(ps3.decrement());
		
		
		PS4Inheritance ps4=new PS4Inheritance(3);
		System.out.println(ps4.multiplyThree());
		
	}
}
