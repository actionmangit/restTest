package hyoungki.dao.conf;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitTest1 {

	static JUnitTest1 testObject;
	
	@Test
	public void test1() {
		assertThat(this, not(sameInstance(testObject)));
		testObject	= null;
	}
	
	@Test
	public void test2() {
		assertThat(this, not(sameInstance(testObject)));
		testObject	= null;
	}

	@Test
	public void test3() {
		assertThat(this, not(sameInstance(testObject)));
		testObject	= null;
	}

}
