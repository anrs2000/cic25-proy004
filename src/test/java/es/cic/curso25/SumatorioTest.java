package es.cic.curso25;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumatorioTest {
    Sumatorio sumatorio;

    @BeforeEach
    void preparacion(){
        sumatorio = new Sumatorio();
    }

    @Test
    void testLanzar() {
        sumatorio.lanzar();
        assertEquals(55, sumatorio.getTotal());
    }
}
