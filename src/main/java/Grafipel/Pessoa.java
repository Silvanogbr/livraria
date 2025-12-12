package Grafipel;
@SuppressWarnings("all")

public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;
    private String estadoAt;

    //metodo personalizado
    public void fazerNiver(){
        this.idade++;
    }

    //metodo construtor
    public Pessoa(String nome, int idade, String sexo, String estadoAt) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.estadoAt = estadoAt;
    }

    /* metodos especiais (Getters e Setters) */

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoAt() {
        return estadoAt;
    }

    public void setEstadoAt(String estadoAt) {
        this.estadoAt = estadoAt;
    }
}


