package hyoungki.dao.conf;

import static org.hamcrest.CoreMatchers.either;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.sameInstance;
import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;

public class JUnitTest3 {

	@Autowired
	ApplicationContext	context;
	
	static Set<JUnitTest3>		testObjects		= new HashSet<JUnitTest3>();
	static ApplicationContext	contextOject	= null;
	
	@Test
	public void test1() {
		assertThat(testObjects, not(hasItem(this)));
		testObjects.add(this);
		
		assertThat(contextOject == null || contextOject == this.context, equalTo(true));
		contextOject	= this.context;
	}
	
	@Test
	public void test2() {
		assertThat(testObjects, not(hasItem(this)));
		testObjects.add(this);
		
		assertTrue(contextOject == null || contextOject == this.context);
		contextOject	= this.context;
	}

	@Test
	public void test3() {
		assertThat(testObjects, not(hasItem(this)));
		testObjects.add(this);
		
		assertThat(contextOject, either(is(nullValue())).or(is(this.context)));
		contextOject	= this.context;
	}
}
