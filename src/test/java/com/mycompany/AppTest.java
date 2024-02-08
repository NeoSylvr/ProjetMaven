package com.mycompany;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    //méthode qui retourne "hello world"
    @Test
    public void testAdd() {
        int result = 3 + 4; // Additionne 3 et 4
        assertEquals(7, result); // Vérifie que le résultat de l'addition est égal à 7
    }

    @Test
    public void testMinus() {
        int result = 3 - 4; // Soustrait 4 de 3
        assertEquals(-1, result); // Vérifie que le résultat de la soustraction est égal à -1
    }
}
