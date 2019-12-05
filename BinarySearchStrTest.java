package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BinarySearchStrTest {

	@Test
	void testSearch() {
		assertTrue(BinarySearchStr.search("aeiouxyz", 'e')); 
		assertFalse(BinarySearchStr.search("aeiouxyz", 'w'));
	}

}
