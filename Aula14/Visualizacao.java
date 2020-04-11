/**
 *
 * @author Code36u4r60
 */
public class Visualizacao {

    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        espectador.viuMaisUm();
        filme.maisUmaView();
    }

    public Video getFilme() {
        return filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Gafanhoto getEspectador() {
        return espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public void avaliar() {
        filme.setAvaliacao(5);
    }

    public void avaliar(int nota) {
        filme.setAvaliacao(nota);
    }

    public void avaliar(float porc) {
        filme.setAvaliacao((int)(porc / 10));
    }

    @Override
    public String toString() {
        return "Visualizacao{" + "espectador=" + espectador + ", filme=" + filme + '}';
    }

}
