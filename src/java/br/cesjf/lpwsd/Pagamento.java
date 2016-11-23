
package br.cesjf.lpwsd;

import java.util.Date;

public class Pagamento {
    private Aluno aluno;
    private Date dataPagamento;
    private double valor;
    private boolean taxaManutencao;

    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public boolean isTaxaManutencao() {
        return taxaManutencao;
    }
    
    public void setTaxaManutencao(boolean taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    public void atualizaAdimplencia() {
        if (isTaxaManutencao()) {
            aluno.setAdimplente(false);
        }
    }
}