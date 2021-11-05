package br.com.project.mybarber.model.repositoy;

import org.springframework.data.repository.CrudRepository;

import br.com.project.mybarber.model.Agendamento;
import br.com.project.mybarber.model.Barbeiro;

public interface BarbeiroRepository extends CrudRepository<Barbeiro, Long> {

	
	Iterable<Barbeiro> findByAgendamento(Agendamento agendamento);
	
	
}
