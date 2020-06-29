import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import javax.naming.spi.DirStateFactory.Result;

import org.junit.jupiter.api.Test;

class GetSumTest {

	@Test
	void GetSumTest() {
		TestCalculations testCalculations = new TestCalculations();
		int result = testCalculations.GetSum(10, 20);
		//assertEquals(31, result);
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		//assertEquals(list, list);
		int[] array = new int[] {1,2,3};
		int[] array2 = new int[] {1,2,3};
		//assertEquals(array, array);
		//assertArrayEquals(array, array2);
		assertAll(
				() -> assertEquals(30, result),
				() -> assertArrayEquals(array, array2)
				);
	}

}
