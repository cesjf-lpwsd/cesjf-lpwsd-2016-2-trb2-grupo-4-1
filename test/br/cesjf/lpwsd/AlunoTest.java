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

    /**
     * Test of getNome method, of class Aluno.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getNome());
    }

    /**
     * Test of setNome method, of class Aluno.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        Aluno aluno = new Aluno();
        aluno.setNome("Teste");
        assertEquals("Teste", aluno.getNome());
    }

    /**
     * Test of getDataMatricula method, of class Aluno.
     */
    @Test
    public void testGetDataMatricula() {
        System.out.println("getDataMatricula");
        Aluno aluno = new Aluno();
        assertEquals(null, aluno.getDataMatricula());
    }

    /**
     * Test of setDataMatricula method, of class Aluno.
     */
    @Test
    public void testSetDataMatricula() {
        System.out.println("setDataMatricula");
        Date dataMatricula = new Date();
    }

    /**
     * Test of getMatricula method, of class Aluno.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Aluno aluno = new Aluno();
        assertEquals(0, aluno.getMatricula());
    }

    /**
     * Test of setMatricula method, of class Aluno.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        Aluno aluno = new Aluno();
        aluno.setMatricula(20161108);
        assertEquals(20161108, aluno.getMatricula());
    }

    /**
     * Test of isAdimplente method, of class Aluno.
     */
    @Test
    public void testIsAdimplente() {
        System.out.println("isAdimplente");
        Aluno aluno = new Aluno();
        assertEquals(false, aluno.isAdimplente());
    }

    /**
     * Test of setAdimplente method, of class Aluno.
     */
    @Test
    public void testSetAdimplente() {
        System.out.println("setAdimplente");
        Aluno aluno = new Aluno();
        aluno.setAdimplente(true);
        assertEquals(true, aluno.isAdimplente());
    }
}
