package br.com.projeto.exemplo02.repositorio;

import br.com.projeto.exemplo02.modelo.Postagem;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepositorio extends CrudRepository<Postagem, Long> {
}
