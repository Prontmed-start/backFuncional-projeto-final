package com.prontmed.projeto.entidades;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agendamento {

	private Long id;
	private String nome;
	private String cpf;
	private String data;
	private String horario;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
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

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	//@Override
	//public String toString() {
		//return Agendamento [id= + id + , nome= + nome + , cpf= + cpf + , data= + data + , horario= + horario
		//		+ ];
	//}
}