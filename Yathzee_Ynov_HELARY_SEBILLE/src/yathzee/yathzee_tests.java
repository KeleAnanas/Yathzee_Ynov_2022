package yathzee;
import static org.junit.Assert.*;
import org.junit.Test;

public class yathzee_tests {

	@Test
	public void estBrelan() {
		int serieDes1[] = {1,1,1,4,5};
		int serieDes2[] = {1,4,4,4,5};
		int serieDes3[] = {1,4,5,5,5};
		int serieDes4[] = {1,5,1,3,1};
		assertEquals(12, yathzee.yathzee(serieDes1));
		assertEquals(18, yathzee.yathzee(serieDes2));
		assertEquals(20, yathzee.yathzee(serieDes3));
		assertEquals(11, yathzee.yathzee(serieDes4));
	}
	
	

}
