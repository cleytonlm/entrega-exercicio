package Exercicio2;

public class Triangulo {
    private double altura ;
    private double base;

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void calcular(){
        var resultado = (this.base * this.altura) / 2 ;
        System.out.println(resultado);
    }

}
