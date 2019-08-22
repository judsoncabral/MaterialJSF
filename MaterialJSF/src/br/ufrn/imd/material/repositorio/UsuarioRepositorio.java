package br.ufrn.imd.material.repositorio;
import java.util.ArrayList;
import java.util.List;

import br.ufrn.imd.material.dominio.*;

public class UsuarioRepositorio {
	public static List<Usuario> usuarios;
	
	public static Usuario getUsuario(String login, String senha) {
		if(usuarios == null) {
			usuarios = new ArrayList<Usuario>();
			Usuario usr = new Usuario("judson","judson");
			usr.setNome("Judson");
			usuarios.add(usr);
		}
		for(Usuario u : usuarios) {
			if(u.getLogin().contentEquals(login) && u.getSenha().contentEquals(senha)) {
				return u;
			}
		}
		return null;
	}
		
	
}
