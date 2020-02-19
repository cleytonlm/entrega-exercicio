package Exercicio4;

public class Pessoa {
    private String nome;
    private Integer idade;
    private String cidadeNascimento;


    public Pessoa(String nome, Integer idade, String cidadeNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.cidadeNascimento = cidadeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getCidadeNascimento() {
        return cidadeNascimento;
    }

    public void setCidadeNascimento(String cidadeNascimento) {
        this.cidadeNascimento = cidadeNascimento;
    }
    public void exibirDados (){
        System.out.println(this.getNome() + " " + this.getIdade() + " " + this.getCidadeNascimento() );
    }
}
