package jp.beinteractive.travis_test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreeterTest {
	
	private Greeter greeter;
	
	@Before
	public void setUp()
	{
		greeter = new Greeter();
	}
	
	@After
	public void tearDown()
	{
		greeter = null;
	}

	@Test
	public void testGreet()
	{
		assertThat(greeter.greet(), is("Hello"));
	}
}
