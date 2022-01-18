package com.qa.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.qa.main.BlackJack;

public class BlackJackTest {

	private BlackJack jack = new BlackJack();

	@Test
	public void testP1Wins() {
		assertEquals(20, this.jack.play(20, 19));
	}

	@Test
	public void testP2Wins() {
		assertEquals(18, this.jack.play(12, 18));
	}

	@Test
	public void testDraw() {
		assertEquals(17, this.jack.play(17, 17));
	}

	@Test
	public void testP1Bust() {
		assertEquals(16, this.jack.play(22, 16));
	}

	@Test
	public void testP2Bust() {
		assertEquals(19, this.jack.play(19, 25));
	}

	@Test
	public void testBothBust() {
		assertEquals(0, this.jack.play(23, 24));
	}
}
