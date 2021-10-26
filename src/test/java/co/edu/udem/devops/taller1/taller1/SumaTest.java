package co.edu.udem.devops.taller1.taller1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumaTest {
    @Test
    void suma() {
        Suma suma = new Suma(3,5);
        int resultado = suma.resultado;
        assertEquals(8,resultado);
    }
}
