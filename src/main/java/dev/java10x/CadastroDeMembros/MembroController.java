package dev.java10x.CadastroDeMembros;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MembroController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
       return "Essa é minha primeira mensagem nessa rota";
    }

}
