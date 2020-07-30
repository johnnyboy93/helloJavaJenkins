

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoApp {
	static HelloJava app = new HelloJava();
	@Test
	public void test() {
		assertEquals("Hello", app.msg());
	}

}
