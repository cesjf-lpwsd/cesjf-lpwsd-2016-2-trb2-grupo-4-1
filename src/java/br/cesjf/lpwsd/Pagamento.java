
package br.cesjf.lpwsd;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pagamento implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
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
    
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
}