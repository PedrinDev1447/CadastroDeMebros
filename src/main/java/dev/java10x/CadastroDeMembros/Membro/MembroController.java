package dev.java10x.CadastroDeMembros.Membro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class MembroController {

    @GetMapping("/")
    public String boasVindasUsuariosRaiz() {
        return "Bem-vindo à seção de Usuários!";
    }

    @GetMapping("/boasvindasController")
    public String boasVindasUsaurios(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}