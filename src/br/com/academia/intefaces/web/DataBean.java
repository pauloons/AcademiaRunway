package br.com.academia.intefaces.web;

import java.io.Serializable;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import br.com.academia.domain.aluno.Aluno.Sexo;
import br.com.academia.domain.aluno.Aluno.Situacao;

@Named
@ApplicationScoped
public class DataBean implements Serializable {

	public Sexo[] getSexos() {
		return Sexo.values();
	}

	public Situacao[] getSituacoes() {
		
		return Situacao.values();
	}
}