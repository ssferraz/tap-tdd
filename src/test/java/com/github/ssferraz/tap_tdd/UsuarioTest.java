package com.github.ssferraz.tap_tdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class UsuarioTest {

	Usuario usuario;

	@Before
	public void setUp() {
		usuario = new Usuario("samuel@email.com", "senhacriptografada", false);
	}

	@Test
	public void testGetEmail() {
		// WHEN:
		String result = usuario.getEmail();
		// THEN:
		assertEquals(result, "samuel@email.com");
	}

	@Test
	public void testSetEmail() {
		//GIVEN
		String novoEmail = "alterado@email.com";
		// WHEN:
		usuario.setEmail(novoEmail);
		// THEN:
		assertEquals(usuario.getEmail(), "alterado@email.com");
	}

	@Test
	public void testGetHashSenha() {
		// WHEN:
		String result = usuario.getHashSenha();
		// THEN:
		assertEquals(result, "senhacriptografada");
	}

	@Test
	public void testSetHashSenha() {
		//GIVEN
		String novaSenha = "senhaalterada";
		// WHEN:
		usuario.setHashSenha(novaSenha);
		// THEN:
		assertEquals(usuario.getHashSenha(), novaSenha);
	}

	@Test
	public void testIsAutenticado() {
		// WHEN:
		boolean result = usuario.isAutenticado();
		// THEN:
		assertFalse(result);
	}

	@Test
	public void testSetAutenticado() {
		// WHEN:
		usuario.setAutenticado(true);
		// THEN:
		assertTrue(usuario.isAutenticado());
	}

}
