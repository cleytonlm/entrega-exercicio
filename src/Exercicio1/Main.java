package Exercicio1;

import Exercicio1.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa cleyton = new Pessoa("cleyton",1.60,98);
        Pessoa gabriela = new Pessoa ("gabriela",1.50,40);

        cleyton.andar();
        gabriela.comer();

    }
}
