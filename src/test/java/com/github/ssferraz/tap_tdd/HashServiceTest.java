package com.github.ssferraz.tap_tdd;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HashServiceTest {

	HashService hashService;
	
	@Before
	public void setUp() {
		hashService = new HashService();
	}
	
	@Test
	public void testGetHash() {
		//WHEN:
		String result = hashService.getHash("senha");
		//THEN:
		assertEquals(result, "senhacriptografada");
	}
	
	
}
