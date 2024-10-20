package org.factoriaf5;

import org.factoriaf5.loop.LoopMetodos;

public class Main {
    public static void main(String[] args) {
        LoopMetodos loopMetodos = new LoopMetodos();
        String[] resultado = loopMetodos.multiplicar(5);
        for (String linea : resultado) {
            System.out.println(linea);
        }
    }       
}