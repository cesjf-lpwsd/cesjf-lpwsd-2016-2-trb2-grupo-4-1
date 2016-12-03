
package br.cesjf.lpwsd;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aluno implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private String cpf;
    private boolean adimplente;
    private double mensalidade;
    
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
    
    public boolean isAdimplente() {
        return adimplente;
    }
    
    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }
    
    public double getMensalidade() {
        return mensalidade;
    }
    
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
