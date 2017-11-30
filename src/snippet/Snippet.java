package snippet;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Snippet {
	@Test(testName="demo1")
		public void g1() {
			int a = 10;
			int b = 15;
	
			Assert.assertTrue(true, "demo g1 true");
	
			Assert.assertTrue(a < b, "a is small");
	
			// Assert.assertTrue(a>b,"a is big");
		}
}

