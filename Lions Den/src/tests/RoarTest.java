package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RoarTest {

	@Test
	void test() {
		String output = normal.Lion.roar();
		assertEquals("ROAR!!!", output);
	}

}
