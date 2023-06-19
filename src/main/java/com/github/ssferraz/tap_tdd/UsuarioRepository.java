package com.github.ssferraz.tap_tdd;

import java.util.ArrayList;

public class UsuarioRepository implements IUsuarioRepository{
	
	private ArrayList<Usuario> usuarios;

	public UsuarioRepository() {
		usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("admin@gmail.com", "admincriptografada", false));
	}
	
	@Override
	public Usuario getUsuarioPorEmail(String email) throws Exception {
		for (Usuario usuario : usuarios) {
	        if (usuario.getEmail().equals(email)) {
	           return usuario;
	        }
	    }
		throw new Exception("UserNotFound");
	}

	@Override
	public void registraLogin(Usuario usuario) {
		usuarios.add(usuario);
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}


}
