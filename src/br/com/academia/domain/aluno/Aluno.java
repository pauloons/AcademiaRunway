package br.com.academia.domain.aluno;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {

	public enum Sexo {
		masculino, feminino
	}

	public enum Situacao {
		ativo, inativo, pendente
	}

	@Column(name = "NOME")
	private String nome;

	@Id
	@Column(name = "ID_ALUNO", nullable = false, length = 8)
	private int matricula;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "SEXO", nullable = false, length = 2)
	private Sexo sexo;

	@Column(name = "RG", nullable = false, length = 10)
	private int rg;

	@Column(name = "DATANASC", nullable = false, length = 9)
	private LocalDate dataNasc;
	
	@Column(name = "EMAIL")
	private String email;

	@Embedded
	private Endereco endereco = new Endereco();

	@Embedded
	private Telefone telefone = new Telefone();
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name = "SITUACAO", length = 1)
	private Situacao situacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	public void setSituacao(Situacao situacao) {
		this.situacao = situacao;
	}
	
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", sexo=" + sexo + ", rg=" + rg + ", dataNasc="
				+ dataNasc + ", endereco=" + endereco + ", telefone=" + telefone + ", situacao=" + situacao +", email=" + email + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + matricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (matricula != other.matricula)
			return false;
		return true;
	}

}
