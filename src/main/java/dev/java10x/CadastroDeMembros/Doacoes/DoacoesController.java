package dev.java10x.CadastroDeMembros.Doacoes;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doacoes")
public class DoacoesController {

    @GetMapping("/")
    public String boasVindasDoacoesRaiz() {
        return "Bem-vindo à seção de Doações!";
    }

    @GetMapping("/boasvindasDoacoes")
    public String boasVindasDoacoes() {
        return "Essa é a minha DoacoesController";
    }
}