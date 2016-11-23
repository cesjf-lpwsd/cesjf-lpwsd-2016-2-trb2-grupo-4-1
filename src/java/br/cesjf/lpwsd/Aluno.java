
package br.cesjf.lpwsd;

public class Aluno {
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
}
