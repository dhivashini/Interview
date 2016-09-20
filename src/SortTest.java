import static org.junit.Assert.*;

import org.junit.Test;

import com.dhiva.sorting.*;;


public class SortTest {

	@Test
	public void test() {
		int[] elements = new int[]{3,4,5,1,2};
		BubbleSort sortObj = new BubbleSort();
		int[] sortedElements =sortObj.sort(elements);
		int[] actual = new int[]{1,2,3,4,5};
		assertArrayEquals(actual, sortedElements);
	}

}
