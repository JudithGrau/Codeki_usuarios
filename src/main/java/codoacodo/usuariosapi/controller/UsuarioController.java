package codoacodo.usuariosapi.controller;

import codoacodo.usuariosapi.model.Usuario;
import codoacodo.usuariosapi.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("")
    public List<Usuario> getAllFlights(){
        return usuarioService.traerTodosLosUsuarios();
    }

    @PostMapping("/agregar")
    public void createFlight(@RequestBody Usuario flight){
        usuarioService.crearUsuario(flight);
    }

    @GetMapping("/{id}")
    public Usuario findUsuarioById(@PathVariable Long id){
        return usuarioService.buscarUsuarioPorId(id);
    }

    @DeleteMapping("/eliminar/{id}")
    public void deleteFlight(@PathVariable Long id){
        usuarioService.borrarUsuarioPorId(id);
    }
    @PutMapping("/actualizar")
    public Usuario updateFlight(@RequestBody Usuario usuario){
        return usuarioService.actualizarUsuario(usuario);
    }
}
