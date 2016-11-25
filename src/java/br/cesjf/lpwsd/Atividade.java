
package br.cesjf.lpwsd;

import java.util.Date;

public class Atividade {
    private String descricao;
    private double valor;
    private boolean aberta;

    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
    
    public boolean getAberta() {
        return aberta;
    }
}
