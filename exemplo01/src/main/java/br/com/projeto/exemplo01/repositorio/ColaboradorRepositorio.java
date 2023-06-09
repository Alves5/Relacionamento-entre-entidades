package br.com.projeto.exemplo01.repositorio;

import br.com.projeto.exemplo01.modelo.Colaborador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ColaboradorRepositorio extends CrudRepository<Colaborador, Long> {
}
