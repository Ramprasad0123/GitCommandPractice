package gitBashCommand_practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GitbashPractice1 {
	@Test
	public void step1Test() {
		System.out.println("Script1");
	}
	
	@Test
	public void step2Test() {
		Reporter.log("Script2",true);
	}
	
	@Test
	public void step3Test() {
		Reporter.log("Script3",true);
	}

	

}
