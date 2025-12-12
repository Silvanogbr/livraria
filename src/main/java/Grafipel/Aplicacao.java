package Grafipel;
@SuppressWarnings("all")

public class Aplicacao {
    public static void main(String[] args) {

        Pessoa[]p = new Pessoa[3];
        Livro[]l = new Livro[3];

        p[0] = new Pessoa("Lais", 17, "Feminino");
        p[1] = new Pessoa("Bruno", 17, "Macho");
        p[2] = new Pessoa("Gabriel Simão", 17, "Macho Alpha");

        l[0] = new Livro("Verity", "Colleen Hoover", 320, p[0]);
        l[1] = new Livro("Jurassic Park", "Michel Crichton",528, p[1]);
        l[2] = new Livro("Vivendo uma vida autêntica", "Marco Túlio", 160, p[2]);

       l[2].folhear(161);
       System.out.println(l[2].detalhes());
    }
}