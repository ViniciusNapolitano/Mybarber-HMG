package br.com.project.mybarber.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Agendamento {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private Date data;
	
	
	@ManyToOne
	private Barbeiro barbeiro;
	
	
	@ManyToOne
	private Servico servico;

	@OneToOne
	private Cliente cliente;
	
	@Deprecated
	public Agendamento(){
		
	}
	
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public Barbeiro getBarbeiro() {
		return barbeiro;
	}


	public void setBarbeiro(Barbeiro barbeiro) {
		this.barbeiro = barbeiro;
	}


	public Servico getServico() {
		return servico;
	}


	public void setServico(Servico servico) {
		this.servico = servico;
	}


	@Override
	public int hashCode() {
		return Objects.hash(barbeiro, data, id, servico);
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agendamento other = (Agendamento) obj;
		return Objects.equals(barbeiro, other.barbeiro) && Objects.equals(data, other.data)
				&& Objects.equals(id, other.id) && Objects.equals(servico, other.servico);
	}


	@Override
	public String toString() {
		return "Agendamento [id=" + id + ", data=" + data + ", barbeiro=" + barbeiro + ", servico=" + servico + "]";
	}


	public Agendamento(Long id, @NotNull Date data, Barbeiro barbeiro, Servico servico,Cliente cliente) {
		super();
		this.id = id;
		this.data = data;
		this.barbeiro = barbeiro;
		this.servico = servico;
		this.cliente= cliente;
	}


	
}
