package org.factoriaf5.loop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class TestLoopMetodos {

    @Test
    public void testMultiplicar() {
        LoopMetodos loopMetodos = new LoopMetodos();
        String[] valorEsperado = {
            "5 x 1 = 5",
            "5 x 2 = 10",
            "5 x 3 = 15",
            "5 x 4 = 20",
            "5 x 5 = 25",
            "5 x 6 = 30",
            "5 x 7 = 35",
            "5 x 8 = 40",
            "5 x 9 = 45",
            "5 x 10 = 50"
        };
        assertArrayEquals(valorEsperado, loopMetodos.multiplicar(5));

    }

}
