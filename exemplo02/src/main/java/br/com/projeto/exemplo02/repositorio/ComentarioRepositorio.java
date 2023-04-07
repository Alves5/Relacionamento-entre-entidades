package br.com.projeto.exemplo02.repositorio;

import br.com.projeto.exemplo02.modelo.Comentario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComentarioRepositorio extends CrudRepository<Comentario, Long> {
}
