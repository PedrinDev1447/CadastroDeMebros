package dev.java10x.CadastroDeMembros.Ministerio;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ministerios")
public class MinisterioController {

    @GetMapping("/")
    public String boasVindasMinisterioRaiz() {
        return "Bem-vindo à seção de Ministérios!";
    }

    @GetMapping("/controller")
    public String boasVindasMinisterio(){
        return "Este é o retorno do MinisterioController";
    }
}