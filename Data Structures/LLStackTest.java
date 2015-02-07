import static org.junit.Assert.*;

import org.junit.Test;


public class LLStackTest {

	@Test
	public void testLLStack() {
		fail("Not yet implemented");
	}

	@Test
	public void testPush() {
		fail("Not yet implemented");
	}

	@Test
	public void testPop() {
		fail("Not yet implemented");
	}

	@Test
	public void testTop() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEmpty() {
		LLStack<Integer> stack = new LLStack<Integer>();
		assertTrue(stack.isEmpty());
		stack.push(5);
		assertFalse(stack.isEmpty());
		try{
			stack.pop();
		}
		catch(StackUnderflowException e){
			fail(e.toString());
		}
		assertTrue(stack.isEmpty());
		
	}

}
