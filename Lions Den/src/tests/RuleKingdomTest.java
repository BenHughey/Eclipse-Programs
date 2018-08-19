package tests;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RuleKingdomTest {

	@Test
	void test() {
		String output = normal.Lion.ruleKingdom();
		assertEquals("I am king of the jungle!" , output);
		
	}

}
