package br.com.projeto.exemplo02.controle;

import br.com.projeto.exemplo02.modelo.Comentario;
import br.com.projeto.exemplo02.repositorio.ComentarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comentarios")
public class ComentarioControle {

    @Autowired
    private ComentarioRepositorio comentarioRepositorio;

    @GetMapping("/listar")
    public Iterable<Comentario> listar(){
        return comentarioRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Comentario cadastrar(@RequestBody Comentario obj){
        return comentarioRepositorio.save(obj);
    }
}
