package test;

import static org.junit.Assert.*;

import org.junit.Test;

import test.Main;

public class MainTest {

	@Test
	public void testReturn7() {
		Main main = new Main();
		assertEquals(main.return7(), 7);
	}

	@Test
	public void testcallFunction() {
		Main main = new Main();
		assertEquals(main.callFunction(), 7);
	}

	@Test
	public void testCallFunction10x() {
		Main main = new Main();
		assertEquals(main.callFunction10x(), 70);
	}

	@Test
	public void testFail() {
		Main main = new Main();
		assertEquals(main.return7(), 8);
	}

	@Test
	public void testCaughtException() {
		Main main = new Main();
		assertEquals(main.caughtException(), false);
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testUncaughtException() {

		Main main = new Main();
		main.uncaughtException();
	}

}
