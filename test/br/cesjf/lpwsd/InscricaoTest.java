/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpwsd;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Luiz
 */
public class InscricaoTest {
    
    public InscricaoTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test 
    public void testGetAluno() {
        System.out.println("getAluno");
        Inscricao inscricao = new Inscricao();
        assertEquals(null,inscricao.getAluno());
    }
    
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Inscricao inscricao = new Inscricao();
        inscricao.setAluno(null);
        assertEquals(null,inscricao.getAluno());        
    }
    
    @Test 
    public void testGetAtividade() {
        System.out.println("getAtividade");
        Inscricao inscricao = new Inscricao();
        assertEquals(null,inscricao.getAtividade());
    }
    
    @Test
    public void testSetAtividade() {
        System.out.println("setAtividade");
        Inscricao inscricao = new Inscricao();
        inscricao.setAtividade(null);
        assertEquals(null,inscricao.getAtividade());      
    }
    
    @Test
    public void testGetDataInscricao() {
        System.out.println("getDataInscricao");
        Inscricao inscricao = new Inscricao();
        assertEquals(null,inscricao.getDataInscricao());
    }
    
    @Test
    public void testAtualizaMensalidade() {
        System.out.println("atualizaMensalidade");
        Pagamento pagamento = new Pagamento();
        Aluno aluno = new Aluno();
        pagamento.setTaxaManutencao(true);
        assertEquals(false,aluno.isAdimplente());
    }
    
    @Test
    public void testTaxaMatricula() {
        System.out.println("taxaMatricula");
        Inscricao inscricao = new Inscricao();
        double valor = 100;
        double valorFinal = 150;
        assertEquals(valor,valor,inscricao.taxaMatricula(valor));
    }
}
