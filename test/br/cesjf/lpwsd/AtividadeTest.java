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
public class AtividadeTest {
    
    public AtividadeTest() {
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
    public void testGetDescricao() {
        System.out.println("getDescricao");
        Atividade atividade = new Atividade();
        assertEquals(null,atividade.getDescricao());
    }
    
    @Test
    public void testSetDescricao() {
        System.out.println("setDescricao");
        Atividade atividade = new Atividade();
        atividade.setDescricao("Descricao");
        assertEquals("Descricao",atividade.getDescricao());
    }
    
    @Test 
    public void testGetValor() {
        System.out.println("getValor");
        Atividade atividade = new Atividade();
        double teste = 0.0;
        assertEquals(teste,teste,atividade.getValor());
    }
    
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Atividade atividade = new Atividade();
        double teste = 170.0;
        assertEquals(teste,teste,atividade.getValor());
    }
}
