/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.cesjf.lpwsd;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aluno
 */
public class AlunoTest {
    
    public AlunoTest() {
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
    public void testGetNome() {
        System.out.println("getNome");
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getNome());
    }
    
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Aluno aluno = new Aluno();
        aluno.setNome("Teste");
        assertEquals("Teste", aluno.getNome());
    }
    
    @Test
    public void testIsAdimplente() {
        System.out.println("isAdimplente");
        Aluno aluno = new Aluno();
        assertEquals(false, aluno.isAdimplente());
    }
    
    @Test
    public void testSetAdimplente() {
        System.out.println("setAdimplente");
        Aluno aluno = new Aluno();
        aluno.setAdimplente(true);
        assertEquals(true, aluno.isAdimplente());
    }
    
    @Test
    public void testGetCpf() {
        System.out.println("getCpf");
        Aluno aluno = new Aluno();
        assertEquals(null,aluno.getCpf());
    }
    
    @Test
    public void testSetCpf() {
        System.out.println("setCpf");
        Aluno aluno = new Aluno();
        aluno.setCpf("CPF");
        assertEquals("CPF",aluno.getCpf());
    }
    
    @Test
    public void testGetMensalidade() {
        System.out.println("getMensalidade");
        Aluno aluno = new Aluno();
        double teste = 0.0;
        assertEquals(teste,teste,aluno.getMensalidade());
    }
    
    @Test
    public void testSetMensalidade() {
        System.out.println("getMensalidade");
        Aluno aluno = new Aluno();
        aluno.setMensalidade(170.0);
        double teste = 170.0;
        assertEquals(teste,teste,aluno.getMensalidade());
    }
}
