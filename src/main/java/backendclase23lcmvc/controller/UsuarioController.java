package backendclase23lcmvc.controller;

import backendclase23lcmvc.dominio.Usuario;
import backendclase23lcmvc.services.UsuarioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private UsuarioService usuarioService= new UsuarioService();
    @GetMapping("/")
    public Usuario crearUsuario(){
        return usuarioService.crearUsuario();
    }
    @GetMapping("crear2")
    public Usuario crearUsuario2(){
        Usuario usuario=new Usuario("Fulanito", 45);
        return usuario;
    }
}
