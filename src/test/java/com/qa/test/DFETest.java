package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DFETest {

	@Test // tells junit this is a test
	public void basicTestPass() {
		assertEquals(2, 1 + 1);
	}

	@Test
	public void testFail() {
		assertEquals(3, 1 + 1);
	}

}
