package myproject.myproject;

import org.junit.Test;
import junit.framework.Assert;

public class AppTest {
	App app = new App();

	@Test
	public void validateSetAndGet() {
		app.setGreeting("good afternoon");
		Assert.assertEquals("good afternoon", app.getGreeting());

	}

	@Test
	public void validateBadGreeting() {
		app.setGreeting("Bad Boy");
		Assert.assertEquals(null,  app.getGreeting());
		
	}

	@Test
	public void validateWelcomeGreeting() {
		app.setGreeting("Welcome Monty");
		Assert.assertEquals("Welcome Monty", app.getGreeting());

	}
}
