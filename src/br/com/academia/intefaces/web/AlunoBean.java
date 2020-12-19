package br.com.academia.intefaces.web;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import br.com.academia.domain.aluno.Aluno;

@Named
@RequestScoped
public class AlunoBean implements Serializable {
	
private Aluno aluno = new Aluno();

public Aluno getAluno() {
	return aluno;
}

public void setAluno(Aluno aluno) {
	this.aluno = aluno;
}


}
