package Latest_Practice_TestScripts;

import org.testng.annotations.Test;

public class ThreadPoolSize {
	
	public int count=0;
	@Test(threadPoolSize =8, invocationCount=5)
	public void demoForThreadPoll() {
		count++;
		System.out.println("Rakesh : "+count);
		System.out.println();
	}

}
