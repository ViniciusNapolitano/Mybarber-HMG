package br.com.project.mybarber.model;


import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	private String nome;
	
	
	
	private String email;
	
	
	private String contato;
	
	
	@OneToOne
	private Agendamento agendamento;

	
	@Deprecated
	public Cliente(){
		
	}
	
	
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getContato() {
		return contato;
	}


	public void setContato(String contato) {
		this.contato = contato;
	}


	public Agendamento getAgendamento() {
		return agendamento;
	}


	public void setAgendamento(Agendamento agendamento) {
		this.agendamento = agendamento;
	}


	@Override
	public int hashCode() {
		return Objects.hash(agendamento, contato, email, id, nome);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(agendamento, other.agendamento) && Objects.equals(contato, other.contato)
				&& Objects.equals(email, other.email) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}


	public Cliente(Long id, @NotNull String nome, String email, String contato, Agendamento agendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.contato = contato;
		this.agendamento = agendamento;
	}


	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", contato=" + contato + ", agendamento="
				+ agendamento + "]";
	}

	
	
	
	

}