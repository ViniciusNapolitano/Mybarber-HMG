package br.com.project.mybarber.model.repositoy;

import org.springframework.data.repository.CrudRepository;

import br.com.project.mybarber.model.Agendamento;
import br.com.project.mybarber.model.Servico;

public interface ServicoRepository extends CrudRepository<Servico,Long>  {
Iterable<Servico> findByAgendamento(Agendamento agendamento);
}
