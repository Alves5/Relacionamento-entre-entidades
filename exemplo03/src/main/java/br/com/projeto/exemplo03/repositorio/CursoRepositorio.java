package br.com.projeto.exemplo03.repositorio;

import br.com.projeto.exemplo03.modelo.Curso;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CursoRepositorio extends CrudRepository<Curso, Long> {
}
