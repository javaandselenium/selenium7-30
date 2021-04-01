package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 {
	
	@Test(priority = -1)
	public void chats() {
		Reporter.log("chats",true);
	}
	
	@Test(priority = 1,invocationCount = 3,enabled=false)
	public void blocks() {
		Reporter.log("blocks",true);
	}
	
	@Test()
	public void calls() {
		Reporter.log("calls",true);
	}
	
	
	
	


}
