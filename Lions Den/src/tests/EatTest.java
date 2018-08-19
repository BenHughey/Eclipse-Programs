package tests;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class EatTest {

	@Test
	void test() {
		String output  = normal.Lion.eat();
		assertEquals("mmmm food", output);
	}

}
