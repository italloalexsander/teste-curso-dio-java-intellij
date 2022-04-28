package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
//        int a = 5;
//        int b = 3;
//        System.out.println("Hello World " + (a + b));
        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro1 = new Livro("O problema dos 3 corpos", 308);
        System.out.println(livro1);
    }

}

class Livro{
    private String nome;
    private Integer numpg;

    public Livro(String nome, Integer numpg) {
        this.nome = nome;
        this.numpg = numpg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpg() {
        return numpg;
    }

    public void setNumpg(Integer numpg) {
        this.numpg = numpg;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpg=" + numpg +
                '}';
    }
}