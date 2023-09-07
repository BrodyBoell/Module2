
/**
 * @author brody - bjboell
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
package test;
import model.player;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PlayerTest2 {
	player player = new player("Brody", 70, "Warrior");
	@Before
	public void setUp() throws Exception {
	}
	@Test
	void testFalseIsMax() {
	assertFalse(player.isMax());	
	}
	@Test
	void testclasses() {
		assertTrue("Warrior" == player.getClasses());
	}
}
