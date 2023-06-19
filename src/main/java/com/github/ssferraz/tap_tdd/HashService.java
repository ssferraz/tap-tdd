package com.github.ssferraz.tap_tdd;

public class HashService implements IHashService {

	@Override
	public String getHash(String senha) {
		return senha.concat("criptografada") ;
	}

}
