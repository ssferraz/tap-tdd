package com.github.ssferraz.tap_tdd;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

public class UsuarioRepositoryTest {

	UsuarioRepository usuarioRepository;

	@Before
	public void setUp() {
		usuarioRepository = new UsuarioRepository();
	}

	@Test
	public void testGetUsuarioPorEmail() throws Exception {
		//GIVEN:
		String email = "admin@gmail.com";
		//WHEN:
		Usuario user = usuarioRepository.getUsuarioPorEmail(email);
		//THEN:
		assertEquals(user.getEmail(), email);
	}
	
	@Test(expected = Exception.class)
	public void testGetUsuarioPorEmailFalha() throws Exception {
		//GIVEN:
		String email = "admin1@gmail.com";
		//WHEN:
		usuarioRepository.getUsuarioPorEmail(email);
	}

	@Test
	public void testRegistraLogin() {
		//GIVEN:
		Usuario user = new Usuario("teste@gmail.com", "senha", false);
		//WHEN:
		usuarioRepository.registraLogin(user);
		//THEN:
		assertEquals(usuarioRepository.getUsuarios().size(), 2);
	}

	@Test
	public void testGetUsuarios() {
		//WHEN:
		ArrayList<Usuario> usuarios = usuarioRepository.getUsuarios();
		//THEN:
		assertEquals(usuarios.size(), 1);
	}


}
