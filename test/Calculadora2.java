/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ASUS_X455L
 */
public class Calculadora2 {
    
    public Calculadora2() {
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
    public void testsuma(){
        System.out.println("test suma");
        int resultado=calc.suma(3, 2);
        int esperado=5;
        assertEquals(esperado, resultado);
    }
    
    @Test
    public void testanssuma(){
        System.out.println("test anssuma");
        calc.suma(3, 2);
        int resultado=calc.ans();
        int esperado=5;
        assertEquals(esperado, resultado);
    }

}
