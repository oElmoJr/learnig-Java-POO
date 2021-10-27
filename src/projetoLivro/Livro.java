package projetoLivro;

public class Livro implements Publicacao {
    private Pessoa leitor;
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto; 

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        this.pagAtual = 0;
        this.aberto = false;
    }
    
    public String detalhes() {
        return "Livro{" 
                    + " \ntitulo = " + titulo + ", "
                    + " \nautor = " + autor + ", " 
                    + " \ntotPaginas = " + totPaginas + ", "
                    + " \npagAtual = " + pagAtual + ", "
                    + " \naberto = " + aberto + ", "
                    + " \nleitor = " + leitor.getNome()
                + "\n}";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    public int getTotPaginas() {
        return totPaginas;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }
    public Pessoa getLeitor() {
        return leitor;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    public boolean isAberto() {
        return aberto;
    }
    
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    public int getPagAtual() {
        return pagAtual;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
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


