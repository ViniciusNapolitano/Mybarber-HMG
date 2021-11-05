package br.com.project.mybarber.model.repositoy;

import org.springframework.data.repository.CrudRepository;

import br.com.project.mybarber.model.Agendamento;

public interface AgendamentoRepository extends CrudRepository<Agendamento,Long> {
Agendamento findByid(Long id);
}
