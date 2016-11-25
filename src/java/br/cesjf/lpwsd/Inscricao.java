
package br.cesjf.lpwsd;

import java.util.Date;

public class Inscricao {

    static Inscricao matricula(Aluno aluno, Atividade atividade) {
        if(atividade.getAberta()==true) {
            if(aluno.isAdimplente()==true){
                Inscricao inscricao = new Inscricao();
                inscricao.setAluno(aluno);
                inscricao.setAtividade(atividade);
                return inscricao;
            } else return null;
        } else 
            return null;
    }
    
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
    
    public double taxaMatricula(double valor) {
        return valor*1.5;
    }
}
