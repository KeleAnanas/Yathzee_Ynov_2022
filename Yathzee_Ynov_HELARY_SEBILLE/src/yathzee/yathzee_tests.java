package yathzee;
import static org.junit.Assert.*;

import org.junit.Test;

public class yathzee_tests {

	@Test
	public void estBrelan() {
		//String[] des = new String[5];
		//String[] des = {"1","2","3","4","5"};
		assertEquals(yathzee({"1","1","1","4","5"}), 12);
		assertEquals(yathzee({"1","4","4","4","5"}), 18));
		assertEquals(yathzee({"1","4","5","5","5"}), 20));
		
	}

}
