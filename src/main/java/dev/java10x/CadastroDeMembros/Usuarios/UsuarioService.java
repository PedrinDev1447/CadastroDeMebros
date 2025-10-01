package dev.java10x.CadastroDeMembros.Usuarios;

import dev.java10x.CadastroDeMembros.Usuarios.UsuarioModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Optional<UsuarioModel> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public List<UsuarioModel> buscarPorParteDoNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome);
    }
}