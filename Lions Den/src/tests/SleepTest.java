package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

 class SleepTest {


	@Test
	void test() {
		String output = normal.Lion.sleep();
		assertEquals("I am sleeping", output);
		
		
	}

}
