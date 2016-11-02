
package br.cesjf.lpwsd;

import java.util.Date;

public class Aluno {
    private String nome;
    private Date dataMatricula;
    private int matricula;
    private boolean adimplente;
            
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

    public void setAdimplente(boolean adimplente) {
        this.adimplente = adimplente;
    }
}
