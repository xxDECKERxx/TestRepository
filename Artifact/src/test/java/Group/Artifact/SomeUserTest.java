package Group.Artifact;

import org.junit.Test;
import static org.junit.Assert.*;

public class SomeUserTest {
	
	@Test
	public void testSomeUser() {
		SomeUser testSomeUser = new SomeUser();
		assertTrue(testSomeUser.getUsername() == "defaultUser");
		assertTrue(testSomeUser.getFirstName() == "joe");
		
		
		SomeUser someTestUser = new SomeUser("HelloWorld", "rob", "smith", "manchester");
		assertTrue(someTestUser.getUsername() == "HelloWorld");
		assertTrue(someTestUser.getFirstName() == "rob");
	}
}
