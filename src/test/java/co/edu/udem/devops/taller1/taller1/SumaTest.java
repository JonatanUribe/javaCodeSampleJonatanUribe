package co.edu.udem.devops.taller1.taller1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumaTest {
    
    @Test
    void suma() {
        Suma suma = new Suma(3,5);
        int resultado = suma.getResultado();
        assertEquals(8,resultado);
    }
    
}
