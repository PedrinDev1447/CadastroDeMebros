package dev.java10x.CadastroDeMembros.Doacoes;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class DoacoesController {

    @GetMapping("/boasvindasDoacoes")
    public String boasVindasDoacoes() {return "Essa é a minha DoacoesController";}
}
