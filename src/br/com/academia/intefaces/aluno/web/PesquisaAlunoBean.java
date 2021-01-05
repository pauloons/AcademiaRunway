package br.com.academia.intefaces.aluno.web;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.academia.application.service.AlunoService;
import br.com.academia.domain.aluno.Aluno;

@Named
@SessionScoped

public class PesquisaAlunoBean implements Serializable {

	@Inject
	private FacesContext facesContext;
	
	@EJB
	private AlunoService alunoService;

	private String matricula;
	private String nome;
	private Integer telefone;
	private Integer rg;

	private List<Aluno> alunos;

	public String excluir(String matricula) {
		alunoService.delete(matricula);
		return pesquisar();
	}

	public String pesquisar() {
			alunos = alunoService.listAlunos(matricula, nome, rg, telefone);
		return null;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public AlunoService getAlunoService() {
		return alunoService;
	}

	public void setAlunoService(AlunoService alunoService) {
		this.alunoService = alunoService;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public Integer getRg() {
		return rg;
	}

	public void setRg(Integer rg) {
		this.rg = rg;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

}
