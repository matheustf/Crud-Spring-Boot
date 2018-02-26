package br.com.teste.netshoes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.teste.netshoes.entity.Pato;

@Repository
public interface PatoRepository extends CrudRepository<Pato, Long> {
	public List<Pato> findAll();

}
