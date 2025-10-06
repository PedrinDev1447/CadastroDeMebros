package dev.java10x.CadastroDeMembros.Membro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MembroService {

    @Autowired
    private MembroRepository usuarioRepository;

    public Optional<MembroModel> buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }

    public List<MembroModel> buscarPorParteDoNome(String nome) {
        return usuarioRepository.findByNomeContainingIgnoreCase(nome);
    }
}