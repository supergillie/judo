package com.example.budo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class BudoApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void noOfLines() throws IOException {
		//arrange
		var ob = new ObliqueStrategies();
		//act
		int nub = ob.numberOfLines();
		//assert
		assertTrue(nub == 115);
	}
}
