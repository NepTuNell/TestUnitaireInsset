/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor./home/insset/TestUnitaireInsset/src/test/java/com/mycompany/testunitaireinsset/NombreParfait/ParfaitIT.java
 */
package com.mycompany.testunitaireinsset.NombreParfait;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author insset
 */
public class ParfaitTest {
    
    public ParfaitTest() {
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
     * Test of estDivisiblePar method, of class Parfait.
     */
    @Test
    public void testEstDivisiblePar() {
        Parfait NbParfait = new Parfait();
        int number2 = 6;
        int number1 = 2;
        boolean resultExpected = NbParfait.estDivisiblePar(number1, number2);
        assertTrue("OK",resultExpected);
    }

    /**
     * Test of diviseurs method, of class Parfait.
     */
    @Test
    public void testDiviseurs() {
        Parfait NbParfait = new Parfait();
        long value = 11;
        long[] results = NbParfait.diviseurs(value);
        long[] expected = {1,11};
        assertArrayEquals(results, expected);
    }

    /**
     * Test of estParfait method, of class Parfait.
     */
    @Test
    public void testEstParfait() {
        Parfait NbParfait = new Parfait();
        long value = 6;
        boolean result = NbParfait.estParfait(value);
        assertTrue("Ok", result);
    }

    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultTrue() {
        Parfait NbParfait = new Parfait();
        long value = 6;
        String expected = "le nombre 6 est parfait";
        String result = NbParfait.formaterResult(true, value);
        assertEquals(result, expected);
    }
    
    /**
     * Test of formaterResult method, of class Parfait.
     */
    @Test
    public void testFormaterResultFalse() {
        Parfait NbParfait = new Parfait();
        long value = 5;
        String expected = "le nombre 5 n'est pas parfait";
        String result = NbParfait.formaterResult(false, value);
        assertEquals(result, expected);
    }
    
}
