/**
 *
 * @author Code36u4r60
 */
public class Livro implements Publicacao {

    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.pagAtual = 0;
        this.aberto = false;
        this.leitor = leitor;
    }

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

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public boolean isAberto() {
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
    public String toString() {
        return "Livro:"
                + "\n Titulo: " + titulo
                + "\n Autor: " + autor
                + "\n TotPaginas: " + totPaginas
                + "\n PagAtual: " + pagAtual
                + "\n Aberto: " + aberto
                + "\n Leitor:\n" + leitor;
    }

    @Override
    public void abrir() {
        aberto = true;
    }

    @Override
    public void fechar() {
        aberto = false;
        pagAtual = 0;
    }

    @Override
    public void folhear(int p) {
        aberto = true;
        pagAtual = p <= totPaginas ? p : totPaginas;
    }

    @Override
    public void avancarPag() {
        if (aberto) {
            pagAtual += pagAtual < totPaginas ? 1 : 0;
        }
    }

    @Override
    public void voltarPag() {
        if (aberto) {
            pagAtual -= pagAtual > 0 ? 1 : 0;
        }
    }

}
