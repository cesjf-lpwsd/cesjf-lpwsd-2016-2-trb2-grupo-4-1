
package br.cesjf.lpwsd;

import java.util.Date;
import java.util.List;

public class Aluno {
    private String nome;
    private Date dataMatricula;
    private int matricula;
    private boolean adimplente;
    private List<Atividade> atividades;
            
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public Date getDataMatricula() {
        return dataMatricula;
    }
    
    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
    
    public int getMatricula() {
        return matricula;
    }
    
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public boolean isAdimplente() {
        return adimplente;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }
    
    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }
}
