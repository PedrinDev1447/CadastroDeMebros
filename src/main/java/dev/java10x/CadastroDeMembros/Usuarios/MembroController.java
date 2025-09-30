package dev.java10x.CadastroDeMembros.Usuarios;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MembroController {

    @GetMapping("/boasvindasController")
    public String boasVindasUsaurios(){
       return "Essa é minha primeira mensagem nessa rota";
    }

}
