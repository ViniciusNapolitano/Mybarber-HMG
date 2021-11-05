package br.com.project.mybarber.model;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

@Entity
public class Servico {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	
	@NotNull
	private String nomeServico;
	
	@OneToMany
	private List<Agendamento> agendamento;
	
	
	@Deprecated
	public Servico(){
		
	}
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeServico() {
		return nomeServico;
	}

	public void setNomeServico(String nomeServico) {
		this.nomeServico = nomeServico;
	}

	@Override
	public int hashCode() {
		return Objects.hash(agendamento, id, nomeServico);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servico other = (Servico) obj;
		return Objects.equals(agendamento, other.agendamento) && Objects.equals(id, other.id)
				&& Objects.equals(nomeServico, other.nomeServico);
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", nomeServico=" + nomeServico + ", agendamento=" + agendamento + "]";
	}

	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}

	public Servico(Long id, @NotNull String nomeServico, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nomeServico = nomeServico;
		this.agendamento = agendamento;
	}


	
	
	

}
