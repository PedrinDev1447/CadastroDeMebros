package dev.java10x.CadastroDeMembros.Eventos;

import org.springframework.core.codec.StringDecoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EventosController {

    @GetMapping("/boasvindas")
    public String boasVindasEvento(){return "Essa é minha EventosController ";}
}
