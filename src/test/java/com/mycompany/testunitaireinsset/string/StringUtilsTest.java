/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.testunitaireinsset.string;

import java.util.Map;
import java.util.TreeMap;
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
public class StringUtilsTest {
    
    public StringUtilsTest() {
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
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsChaineValide() {
        StringUtils Utils = new StringUtils();
        String value = "toto";
        
        try {
            Boolean result = Utils.isChaineValide(value);
            assertTrue("Ok", result);
        } catch (IllegalArgumentException exp) {
            assertEquals("Il faut au moins deux caractere en entrée", exp.getMessage());
        }
         
    }
    
    /**
     * Test of isChaineValide method, of class StringUtils.
     */
    @Test
    public void testIsNotChaineValide() {
        StringUtils Utils = new StringUtils();
        String value = "t";
        
        try {
            Boolean result = Utils.isChaineValide(value);
            assertTrue("Ok", result);
        } catch (IllegalArgumentException exp) {
            assertEquals("Il faut au moins deux caractere en entrée", exp.getMessage());
        }
         
    }

    /**
     * Test of inverse method, of class StringUtils.
     */
    @Test
    public void testInverse() {
        StringUtils Utils = new StringUtils();
        String value = "toto";
        String expected = "otot";
        String result = Utils.inverse(value);
        assertEquals(expected, result);
    }

    /**
     * Test of isPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsPalindrome() {
       StringUtils Utils = new StringUtils();
       String value = "kayak";
       Boolean result = Utils.isPalindrome(value);
       assertTrue("OK", result);
    }
    
    /**
     * Test of isNotPalindrome method, of class StringUtils.
     */
    @Test
    public void testIsNotPalindrome() {
       StringUtils Utils = new StringUtils();
       String value = "hello";
       Boolean result = Utils.isPalindrome(value);
       assertFalse("OK", result);
       
    }

    /**
     * Test of compterOccurences method, of class StringUtils.
     */
    @Test
    public void testCompterOccurences() {
        StringUtils Utils = new StringUtils();
        String value = "toto";
        Map<String, Integer> map;
        map = new TreeMap<>();
        map.put("t", 2);
        map.put("o", 2);
        map.put("t", 2);
        map.put("o", 2);
        Map<String, Integer> result = Utils.compterOccurences(value);
        assertTrue(map.equals(result));
    }
    
}
