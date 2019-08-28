package com.peldaspring.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.peldaspring.domain.Cikk;

public interface CikkRepository extends CrudRepository<Cikk, Long> {

	//SELECT * FROM CIKK
	List<Cikk> findAll();
	
	//SELECT * FROM STORY WHERE posted IN (SELECT max(posted) FROM story) LIMIT 1;
	Cikk findFirstByOrderByKozzetetelDesc();

	Cikk findByCim(String cim);
}
