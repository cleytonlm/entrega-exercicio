package Exercicio3;

public class Exercicio3 {
    private String titulo;
    private String autor;
    private Integer numpaginas;

    public Exercicio3(String titulo, String autor, Integer numpaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numpaginas = numpaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }


    public Integer getNumpaginas() {
        return numpaginas;
    }

}
