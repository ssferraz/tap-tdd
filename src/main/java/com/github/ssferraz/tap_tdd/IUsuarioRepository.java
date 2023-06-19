package com.github.ssferraz.tap_tdd;

public interface IUsuarioRepository {

	public Usuario getUsuarioPorEmail(String email) throws Exception;
	public void registraLogin(Usuario usuario);
}
