package Exercicio4;

public class Cliente extends Pessoa {

    private String cpf ;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void exibirDados(){
        System.out.println( this.getNome() + " " + this.getIdade() + " " + this.getCidadeNascimento() + " " + cpf);
    }

    public Cliente(String nome, Integer idade, String cidadeNascimento, String cpf) {
        super(nome, idade, cidadeNascimento);
        this.cpf = cpf;
    }
}
