/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.calcolatricetest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Studente
 */
public class UtenteTest {
    
    public UtenteTest() {
    }

    /**
     * Test of getNome method, of class Utente.
     */
    @Test
    public void testGetNome() {
    }

    /**
     * Test of setNome method, of class Utente.
     */
    @Test
    public void testSetNome() {
    }

    /**
     * Test of getEta method, of class Utente.
     */
    @Test
    public void testGetEta() {
    }

    /**
     * Test of setEta method, of class Utente.
     */
    @Test
    public void testSetGetEta() {
        Utente u1=new Utente("Lucinao",20);
        u1.setEta(-3);
        assertEquals(0, u1.getEta());
        
    }

    /**
     * Test of toString method, of class Utente.
     */
    @Test
    public void testToString() {
    }
    
}
