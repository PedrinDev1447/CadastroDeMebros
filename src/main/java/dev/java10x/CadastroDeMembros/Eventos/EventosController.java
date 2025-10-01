package dev.java10x.CadastroDeMembros.Eventos;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eventos")
public class EventosController {

    @GetMapping("/")
    public String boasVindasEventosRaiz() {
        return "Bem-vindo à seção de Eventos!";
    }

    @GetMapping("/boasvindas")
    public String boasVindasEvento(){
        return "Essa é minha EventosController ";
    }
}