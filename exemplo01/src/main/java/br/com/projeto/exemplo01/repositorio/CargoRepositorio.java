package br.com.projeto.exemplo01.repositorio;

import br.com.projeto.exemplo01.modelo.Cargo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargoRepositorio extends CrudRepository<Cargo, Long> {
}
