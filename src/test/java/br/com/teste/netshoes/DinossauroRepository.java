package br.com.teste.netshoes;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DinossauroRepository extends CrudRepository<Dinossauro, Long> {
	public List<Dinossauro> findAll();

}
