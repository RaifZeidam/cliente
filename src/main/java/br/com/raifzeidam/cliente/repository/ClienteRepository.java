package br.com.raifzeidam.cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.raifzeidam.cliente.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
