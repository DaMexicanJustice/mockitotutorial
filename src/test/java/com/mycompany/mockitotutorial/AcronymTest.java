/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mockitotutorial;

import com.mycompany.mockitotutorial.exceptions.AcronymNotFoundException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

/**
 *
 * @author Låne PC
 */
public class AcronymTest {
    
    private static AcronymUser au;
    private static AcronymInterface ia;
    
    public AcronymTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        au = new AcronymUser();
        ia = mock(AcronymInterface.class);
        au.setAcronymUser(ia);
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
    public void testGetAcronym() throws AcronymNotFoundException {
        // TODO review the generated test code and remove the default call to fail.
        String expResult = "North Atlantic Treaty Organization";
        when(ia.getInitialPhrase("NATO")).thenReturn(expResult);
        String result = au.getInitialPhrase("NATO");
        assertTrue(result.equals(expResult));
    }
    @Test(expected=AcronymNotFoundException.class)
    public void testExceptionThrown() throws AcronymNotFoundException {
        // TODO review the generated test code and remove the default call to fail.
        when(ia.getInitialPhrase("NETTO")).thenThrow(AcronymNotFoundException.class);
        au.getInitialPhrase("NETTO");
    }
    
}
