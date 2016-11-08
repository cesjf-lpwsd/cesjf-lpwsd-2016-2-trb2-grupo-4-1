
package br.cesjf.lpwsd;

import java.util.Date;

public class Pagamento {
    private Date dataPagamento;
    private Double valor;
    private boolean taxaManutencao;
    private boolean pago;
    
    public Date getDataPagamento() {
        return dataPagamento;
    }
    
    public void setDataPagamento(Date dataPagamento) {
        this.dataPagamento = dataPagamento;
    }
    
    public Double getValor() {
        return valor;
    }
    
    public void setValor(Double valor) {
        this.valor = valor;
    }
    
    public boolean isTaxaManutencao() {
        return taxaManutencao;
    }
    
    public void setTaxaManutencao(boolean taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }
    
    public boolean isPago() {
        return pago;
    }
    
    public void setPago(boolean pago) {
        this.pago = pago;
    }
}
