package org.factoriaf5.loop;

public class LoopMetodos {
    public String[] multiplicar(int num) {
        String[] tabla = new String[10];
        for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
            tabla[multiplicador - 1] = num + " x " + multiplicador + " = " + (num * multiplicador);
        }
        return tabla;
    }
}
