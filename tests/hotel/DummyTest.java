package hotel;

//import static org.junit.Assert.*;
import static org.assertj.core.api.Assertions.*;

import org.junit.Test;

public class DummyTest {
/*
	@Test
	public void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testRealityStillWorks() {
		assertThat(1 == 1);
	}
*/
	@Test
	public void testShakespeare() {
		boolean toBe = true;
		assertThat(toBe || !toBe);
	}
}
