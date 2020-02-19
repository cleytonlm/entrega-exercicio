package Exercicio4;

public class Funcionario extends Pessoa {
    private Integer numeroMatricula;

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(Integer numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public Funcionario(String nome, Integer idade, String cidadeNascimento, Integer numeroMatricula) {
        super(nome, idade, cidadeNascimento);
        this.numeroMatricula = numeroMatricula;

    }
}
