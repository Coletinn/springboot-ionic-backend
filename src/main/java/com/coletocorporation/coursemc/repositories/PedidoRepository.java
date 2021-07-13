package com.coletocorporation.coursemc.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.coletocorporation.coursemc.domain.Cliente;
import com.coletocorporation.coursemc.domain.Pedido;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Integer> {
	
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}
