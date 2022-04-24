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
		assertEquals(12, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(18, yathzee.combinaisonsYathzee(serieDes2));
		assertEquals(20, yathzee.combinaisonsYathzee(serieDes3));
		assertEquals(11, yathzee.combinaisonsYathzee(serieDes4));
	}
	
	@Test
	public void estCarre() {
		int serieDes1[] = {1,1,1,1,5};
		int serieDes2[] = {1,4,4,4,4};
		int serieDes3[] = {5,4,5,5,5};
		int serieDes4[] = {5,5,4,5,5};
		int serieDes5[] = {5,5,5,4,5};
		assertEquals(9, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(17, yathzee.combinaisonsYathzee(serieDes2));
		assertEquals(24, yathzee.combinaisonsYathzee(serieDes3));
		assertEquals(24, yathzee.combinaisonsYathzee(serieDes4));
		assertEquals(24, yathzee.combinaisonsYathzee(serieDes5));
	}
	
	@Test
	public void estFullHouse() {
		int serieDes1[] = {1,1,1,5,5};
		int serieDes2[] = {1,1,4,4,4};
		int serieDes3[] = {5,4,5,4,5};
		int serieDes4[] = {5,4,4,5,5};
		int serieDes5[] = {5,5,4,4,5};
		assertEquals(25, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(25, yathzee.combinaisonsYathzee(serieDes2));
		assertEquals(25, yathzee.combinaisonsYathzee(serieDes3));
		assertEquals(25, yathzee.combinaisonsYathzee(serieDes4));
		assertEquals(25, yathzee.combinaisonsYathzee(serieDes5));
	}
	
	@Test
	public void estPetiteSuite() {
		int serieDes1[] = {1,2,3,4,2};
		int serieDes2[] = {5,2,4,3,4};
		int serieDes3[] = {5,6,5,4,3};
		assertEquals(30, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(30, yathzee.combinaisonsYathzee(serieDes2));
		assertEquals(30, yathzee.combinaisonsYathzee(serieDes3));
	}

	@Test
	public void estGrandeSuite() {
		int serieDes1[] = {1,2,3,4,5};
		int serieDes2[] = {6,2,4,3,5};
		assertEquals(40, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(40, yathzee.combinaisonsYathzee(serieDes2));
	}
	
	@Test
	public void estYathzee() {
		int serieDes1[] = {1,1,1,1,1};
		int serieDes2[] = {5,5,5,5,5};
		assertEquals(50, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(50, yathzee.combinaisonsYathzee(serieDes2));
	}
	
	@Test
	public void estChance() {
		int serieDes1[] = {1,6,5,2,1};
		int serieDes2[] = {5,5,2,4,1};
		assertEquals(15, yathzee.combinaisonsYathzee(serieDes1));
		assertEquals(17, yathzee.combinaisonsYathzee(serieDes2));
	}
	
	@Test
	public void sommeXDes() {
		int serieDes1[] = {1,6,1,2,1};
		int serieDes2[] = {5,5,2,5,5};
		int serieDes3[] = {5,4,5,4,5};
		assertEquals(3, yathzee.sommeXYathzee(serieDes1, 1));
		assertEquals(20, yathzee.sommeXYathzee(serieDes2, 5));
		assertEquals(8, yathzee.sommeXYathzee(serieDes3, 4));	}
}
