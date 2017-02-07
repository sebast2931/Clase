/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pitagoras;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 312A-05
 */
public class CalculoTest {
    
    public CalculoTest() {
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
     * Test of Hipotenusa method, of class Calculo.
     */
    @Test
    public void testHipotenusa() {
        System.out.println("Hipotenusa");
        double a = 3;
        double b = 4;
        double expResult = 5;
        double result = Calculo.Hipotenusa(a, b);
        assertEquals(expResult, result, 0.0);
       
    }
    
}
