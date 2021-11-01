package Ex1;

import Ex1.Calculadora;

public class FazCalculos2 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma = " + calculadora.soma(3, 5, 8));
        System.out.println("Multiplicação = " + calculadora.multiplicacao(3, 5, 8));
    }
}

