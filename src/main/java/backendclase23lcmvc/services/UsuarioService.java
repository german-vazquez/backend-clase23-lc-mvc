package backendclase23lcmvc.services;

import backendclase23lcmvc.dominio.Usuario;

public class UsuarioService {

    public Usuario crearUsuario(){
        Usuario usuario= new Usuario("Cosme", 42);

        return usuario;
    }
}
