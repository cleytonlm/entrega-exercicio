package Exercicio4;

public class Main {

        public static void main (String[] args){

            Cliente cliente = new Cliente("beatriz", 23,"bahia","14939394854");
            Funcionario funcionario = new Funcionario("cleyton",38, "São Paulo",344331);

            cliente.exibirDados();
            funcionario.exibirDados();
        }
    }   

