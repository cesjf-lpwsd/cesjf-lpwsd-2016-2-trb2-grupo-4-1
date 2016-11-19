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
public class PagamentoTest {
    
    public PagamentoTest() {
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
        Pagamento pagamento = new Pagamento();
        assertEquals(null,pagamento.getAluno());
    }
    
    @Test
    public void testSetAluno() {
        System.out.println("setAluno");
        Pagamento pagamento = new Pagamento();
        pagamento.setAluno(null);
        assertEquals(null,pagamento.getAluno());
    }
    
    @Test
    public void testGetDataPagamento() {
        System.out.println("getDataPagamento");
        Pagamento pagamento = new Pagamento();
        assertEquals(null,pagamento.getDataPagamento());
    }
    
    @Test
    public void testSetDataPagamento() {
        System.out.println("setDataPagamento");
        Pagamento pagamento = new Pagamento();
        pagamento.setDataPagamento(null);
        assertEquals(null,pagamento.getDataPagamento());
    }
    
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        Pagamento pagamento = new Pagamento();
        double test = 0.0;
        assertEquals(test,test,pagamento.getValor());
    }
    
    @Test 
    public void testSetValor(){
        System.out.println("setValor");
        Pagamento pagamento = new Pagamento();
        pagamento.setValor(177.0);
        double test = 177.0;
        assertEquals(test,test,pagamento.getValor());
    }
}
