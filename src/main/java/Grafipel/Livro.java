package Grafipel;
@SuppressWarnings("all")

public class Livro implements Publicacao{

    private String titulo;
    private String autor;
    private int totPag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;


    //metodo personalizados

    public String detalhes() {
        return "\n==================================================================================" +
                "\n" +
                "\n                      " + titulo +
                "\n" +
                "\nAutor: " + autor +
                "\nTotal de Paginas: " + totPag +
                "\nPagina Atual: " + pagAtual +
                "\nAberto: " + aberto +
                "\nLeitor: " + leitor.getNome() +
                "\nSexo do leitor: " + leitor.getSexo() +
                "\nIdade do leitor: " + leitor.getIdade() +
                "\nEstado atual da lenda: " + leitor.getEstadoAt() +
                "\n💪🏿" +
                "\n"+
                "\n==================================================================================";
    }

    //metode construtor

    public Livro(String titulo, String autor, int totPag, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPag = totPag;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

    //metodos especiais
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotPag() {
        return totPag;
    }
    public void setTotPag(int totPag) {
        this.totPag = totPag;
    }
    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrirLivro() {
        this.setAberto(true);
    }
    @Override
    public void fecharLivro() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int p) {
        if (p <= this.getTotPag() && getAberto()) {
            this.setPagAtual(p);
        } else if (!getAberto()) {
            System.out.println("Livro está fechado! Primeiro abrá-o");
        } else {
            System.out.println("Número de Páginas Incorretas!");
        }
    }
    @Override
    public void avancarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}
