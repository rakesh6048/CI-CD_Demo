package ForPractice_String.SecondSetPractice_String_Program;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListnerDemo.class)

public class TestListnerDemo {
	
	@Test
	public void test1() {
		int a=10;
		int b=10/0;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		
		Assert.assertEquals(a, b);
	}
	
	@Test
	public void test2() {
		int c=10;
		int d=10;
		System.out.println("c : "+c);
		System.out.println("d : "+d);
		
		Assert.assertEquals(c, d);
	}

}
