package br.com.attornatus.repositories;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.attornatus.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{
	
	@Transactional
	public List<Estado> findAllByOrderByNome();
}
