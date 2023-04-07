package br.com.projeto.exemplo03.repositorio;

import br.com.projeto.exemplo03.modelo.Aluno;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepositorio extends CrudRepository<Aluno, Long> {
}
