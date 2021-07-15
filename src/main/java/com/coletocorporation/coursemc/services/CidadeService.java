package com.coletocorporation.coursemc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coletocorporation.coursemc.domain.Cidade;
import com.coletocorporation.coursemc.repositories.CidadeRepository;

@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;

	public List<Cidade> findCidades(Integer estadoId) {
		return repo.findCidades(estadoId);
	}
}
