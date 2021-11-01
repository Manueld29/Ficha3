package Ex1;

public class Calculadora {

    public Calculadora(){
    }
    //metodos
    public double soma(double num1,double num2){
        return num1 + num2;
    }
    public double subtracao(double num1, double num2){
        return num1 - num2;
    }
    public double multiplicacao(double num1, double num2){
        return num1 * num2;
    }
    public double divisao(double num1, double num2){
        return num1 / num2;
    }

    public double soma(double num1,double num2,double num3){return num1 + num2 + num3;}
    public double subtracao(double num1, double num2,double num3){
        return num1 - num2 - num3;
    }
    public double multiplicacao(double num1, double num2,double num3){
        return num1 * num2 *num3;
    }
    public double divisao(double num1, double num2,double num3){
        return num1 / num2 / num3;
    }
}