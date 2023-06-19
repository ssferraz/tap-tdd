package com.github.ssferraz.tap_tdd;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class AutenticadorTest {

	IUsuarioRepository usuarioRepository;
	IHashService hashService;
	Autenticador autenticador;

	@Before
	public void setUp() {
		usuarioRepository = new UsuarioRepository();
		hashService = new HashService();
		autenticador = new Autenticador(usuarioRepository, hashService);
	}

	@Test
	public void testGetUsuarioRepository() {
		// WHEN: Execução do método a ser testado
		UsuarioRepository result = (UsuarioRepository) autenticador.getUsuarioRepository();
		// THEN: Verificações do resultado
		assertNotNull(result);
	}

	@Test
	public void testGetHashService() {
		// WHEN: Execução do método a ser testado
		HashService result = (HashService) autenticador.getHashService();
		// THEN: Verificações do resultado
		assertNotNull(result);
	}

	@Test
	public void testAutenticarUsuario() {
		// GIVEN: Configuração inicial
		String email = "admin@gmail.com";
		String senha = "admin";

		// WHEN: Execução do método a ser testado
		boolean result = autenticador.autenticarUsuario(email, senha);

		// THEN: Verificações do resultado
		assertTrue(result);
	}

	@Test
	public void testAutenticarUsuarioException() {
		// GIVEN: Configuração inicial
		String email = "admin1@gmail.com";
		String senha = "admin";

		// WHEN: Execução do método a ser testado
		boolean result = autenticador.autenticarUsuario(email, senha);

		// THEN: Verificações do resultado
		assertFalse(result);
	}
	
	@Test
	public void testAutenticarUsuarioSenhaIncorreta() {
		// GIVEN: Configuração inicial
		String email = "admin@gmail.com";
		String senha = "admin1";

		// WHEN: Execução do método a ser testado
		boolean result = autenticador.autenticarUsuario(email, senha);

		// THEN: Verificações do resultado
		assertFalse(result);
	}
	

}
