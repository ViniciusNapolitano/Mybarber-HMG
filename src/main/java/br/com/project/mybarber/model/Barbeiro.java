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
public class Barbeiro {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String nomeBarbeiro;
	
	@OneToMany
	private List<Agendamento> agendamento;

	
	@Deprecated
	public Barbeiro(){
		
	}
	
	
	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getNomeBarbeiro() {
		return nomeBarbeiro;
	}




	public void setNomeBarbeiro(String nomeBarbeiro) {
		this.nomeBarbeiro = nomeBarbeiro;
	}




	public List<Agendamento> getAgendamento() {
		return agendamento;
	}

	public void setAgendamento(List<Agendamento> agendamento) {
		this.agendamento = agendamento;
	}




	@Override
	public int hashCode() {
		return Objects.hash(agendamento, id, nomeBarbeiro);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Barbeiro other = (Barbeiro) obj;
		return Objects.equals(agendamento, other.agendamento) && Objects.equals(id, other.id)
				&& Objects.equals(nomeBarbeiro, other.nomeBarbeiro);
	}




	@Override
	public String toString() {
		return "Barbeiro [id=" + id + ", nomeBarbeiro=" + nomeBarbeiro + ", agendamento=" + agendamento + "]";
	}




	public Barbeiro(Long id, @NotNull String nomeBarbeiro, List<Agendamento> agendamento) {
		super();
		this.id = id;
		this.nomeBarbeiro = nomeBarbeiro;
		this.agendamento = agendamento;
	}


	

}
