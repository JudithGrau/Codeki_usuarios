package codoacodo.usuariosapi.service;

import codoacodo.usuariosapi.model.Usuario;
import codoacodo.usuariosapi.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    UsuariosRepository usuariosRepository;

    public List<Usuario> traerTodosLosUsuarios(){
        return usuariosRepository.findAll();
    }
    public void crearUsuario(Usuario usuario){
        usuariosRepository.save(usuario);
    }
    public Usuario buscarUsuarioPorId(Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }
    public void borrarUsuarioPorId(Long id) {
        usuariosRepository.deleteById(id);
    }
    public Usuario actualizarUsuario(Usuario usuario) {
        usuariosRepository.save(usuario);
        return usuariosRepository.findById(usuario.getId()).orElse(null);
    }
}
