package Ex1;

import Ex1.Calculadora;

public class FazCalculos {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        System.out.println("Soma = " + calculadora.soma(5.2, 2.7));
        System.out.println("Subtração = " + calculadora.subtracao(5.2, 2.7));
        System.out.println("Multiplicação = " + calculadora.multiplicacao(5.2, 2.7));
        System.out.println("Divisão = " + calculadora.divisao(5.2, 2.7));
    }
}
