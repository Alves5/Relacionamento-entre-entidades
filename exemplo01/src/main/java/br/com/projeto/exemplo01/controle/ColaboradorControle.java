package br.com.projeto.exemplo01.controle;

import br.com.projeto.exemplo01.modelo.Colaborador;
import br.com.projeto.exemplo01.repositorio.ColaboradorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/colaboradores")
public class ColaboradorControle {

    @Autowired
    private ColaboradorRepositorio colaboradorRepositorio;

    @GetMapping("/listar")
    public Iterable<Colaborador> listar(){
        return colaboradorRepositorio.findAll();
    }

    @PostMapping("/cadastrar")
    public Colaborador cadastrar(@RequestBody Colaborador obj){
        return colaboradorRepositorio.save(obj);
    }
}
