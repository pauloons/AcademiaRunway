package br.com.academia.domain.aluno;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Embeddable
@Table(name = "ENDERECO")
public class Endereco implements Serializable {
    @Column(name = "RUA", nullable = false, length = 128)
	private String rua;
    
    @Column(name = "NUMEROCASA",nullable = false ,length = 128)
    private String numeroCasa;
    
    @Column(name ="COMPLEMENTO", nullable = false,length = 256 )
    private String complemento;
    
    @Column(name = "CIDADE",nullable = false,length = 100)
    private String cidade;
    
    @ManyToOne
    @JoinColumn(name = "ID_ESTADO")
    private Estado estado;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numeroCasa;
    }

    public void setNumero(String numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
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
		Endereco other = (Endereco) obj;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Endereco [rua=" + rua + ", numero=" + numeroCasa + ", complemento=" + complemento + ", cidade=" + cidade
				+ ", estado=" + estado + "]";
	}

}
