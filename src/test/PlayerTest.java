
/**
 * @author brody - bjboell
 * CIS175 - Fall 2023
 * Sep 6, 2023
 */
package test;
import model.player;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

class PlayerTest {
player player = new player("Brody", 80, "Warrior");
@Before
public void setUp() throws Exception {
}
	@Test
	void testIsMax() {
		assertTrue(player.isMax());
	}
	@Test
	void testNames() {
		assertEquals("Brody", player.getName());
	}

}
