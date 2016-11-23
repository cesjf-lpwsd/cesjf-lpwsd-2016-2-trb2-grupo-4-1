
package br.cesjf.lpwsd;

import java.util.Date;

public class Inscricao {
    private Aluno aluno;
    private Atividade atividade;
    private Date dataInscricao;
    
    public Aluno getAluno() {
        return aluno;
    }
    
    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    public Atividade getAtividade() {
        return atividade;
    }
    
    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }
    
    public Date getDataInscricao() {
        return dataInscricao;
    }
    
    public void setDataInscricao(Date dataInscricao) {
        this.dataInscricao = dataInscricao;
    }
    
    public void atualizaMensalidade() {
        aluno.setMensalidade(aluno.getMensalidade()+atividade.getValor());
    }
}
