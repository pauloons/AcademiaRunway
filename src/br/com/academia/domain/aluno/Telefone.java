package br.com.academia.domain.aluno;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Telefone implements Serializable {
    
	@Column(name = "NUMERO",nullable = false, length = 14)
	private int numero;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefone{" +
                "numero=" + numero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Telefone telefone = (Telefone) o;
        return numero == telefone.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numero);
    }
}
