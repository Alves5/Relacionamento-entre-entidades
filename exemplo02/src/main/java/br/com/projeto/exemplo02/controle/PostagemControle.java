package br.com.projeto.exemplo02.controle;

import br.com.projeto.exemplo02.modelo.Postagem;
import br.com.projeto.exemplo02.repositorio.PostagemRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/postagens")
public class PostagemControle {

    @Autowired
    private PostagemRepositorio postagemRepositorio;

    @GetMapping("/listar")
    public Iterable<Postagem> listar(){
        return postagemRepositorio.findAll();
    }
    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj){
        return postagemRepositorio.save(obj);
    }
}
