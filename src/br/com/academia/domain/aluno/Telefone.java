package br.com.academia.domain.aluno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Telefone implements Serializable {

	

	@Column(name = "CELULAR_NUMERO", nullable = false, length = 9)
	private Integer numeroCelular;

	
	public Integer getNumeroCelular() {
		return numeroCelular;
	}

	public void setNumeroCelular(Integer numeroCelular) {
		this.numeroCelular = numeroCelular;
	}

	@Override
	public String toString() {
		return "Telefone [numeroCelular=" + numeroCelular + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numeroCelular == null) ? 0 : numeroCelular.hashCode());
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
		Telefone other = (Telefone) obj;
		if (numeroCelular == null) {
			if (other.numeroCelular != null)
				return false;
		} else if (!numeroCelular.equals(other.numeroCelular))
			return false;
		return true;
	}
}
