/**
 *
 * @author Code36u4r60
 */
public class Video implements AcoesVideo {

    private int totalAvaliacao;
            
    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video() {
        this.totalAvaliacao = 0;
    }

    public Video(String titulo) {
        this.totalAvaliacao = 0;
        this.titulo = titulo;
        this.avaliacao = 0;
        this.views = 0;
        this.curtidas = 0;
        this.reproduzindo = false;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        totalAvaliacao += avaliacao;
        this.avaliacao = totalAvaliacao / views;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public void maisUmaView() {
        views++;
    }

    @Override
    public void play() {
        reproduzindo = true;
    }

    @Override
    public void pause() {
        reproduzindo = false;
    }

    @Override
    public void like() {
        curtidas++;
    }

    @Override
    public String toString() {
        return "Video{"
                + "titulo=" + titulo
                + ", avaliacao=" + avaliacao
                + ", views=" + views
                + ", curtidas=" + curtidas
                + ", reproduzindo=" + reproduzindo
                + '}';
    }

}
