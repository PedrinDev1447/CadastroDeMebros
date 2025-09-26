package dev.java10x.CadastroDeMembros.Ministerio;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MinisterioController {

    @GetMapping("/Ministério Controller")
    public String boasVindasMinisterio(){return "Este é o retorno do MinisterioController";

    }
}
