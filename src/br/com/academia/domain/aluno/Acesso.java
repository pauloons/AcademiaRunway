package br.com.academia.domain.aluno;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name = "ENTRADA_SAIDA")
public class Acesso implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID",nullable = false)
    private int id;
	
	@ManyToOne
	@JoinColumn(name = "ID_ALUNO", nullable = false)
    private Aluno aluno = new Aluno();
    
    @Column(name = "DATAENTR",nullable = true, length = 9)
    private LocalDate dataEntr;
    
    @Column(name = "DATASAID",nullable = false, length =9)
    private LocalDate dataSaid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public LocalDate getDataEntr() {
        return dataEntr;
    }

    public void setDataEntr(LocalDate dataEntr) {
        this.dataEntr = dataEntr;
    }

    public LocalDate getDataSaid() {
        return dataSaid;
    }

    public void setDataSaid(LocalDate dataSaid) {
        this.dataSaid = dataSaid;
    }

    @Override
    public String toString() {
        return "Acesso{" +
                "id=" + id +
                ", aluno=" + aluno +
                ", dataEntr=" + dataEntr +
                ", dataSaid=" + dataSaid +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Acesso acesso = (Acesso) o;
        return id == acesso.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
