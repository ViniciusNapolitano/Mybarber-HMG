package br.com.project.mybarber.model.repositoy;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.project.mybarber.model.Agendamento;
import br.com.project.mybarber.model.Cliente;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente,Long> {

	Iterable<Cliente> findByAgendamento(Agendamento agendamento);
	
	
}


