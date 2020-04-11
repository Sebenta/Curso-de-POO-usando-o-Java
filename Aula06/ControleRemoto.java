/**
 *
 * @author Code36u4r60
 */
public class ControleRemoto implements Controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto() {
        this(50, false, false);
    }
    
    public ControleRemoto(int volume, boolean ligado, boolean tocando) {
        this.volume = volume;
        this.ligado = ligado;
        this.tocando = tocando;
    }
    
    private boolean isTocando() {
        return tocando;
    }
    
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
    
    private int getVolume() {
        return volume;
    }
    
    private void setVolume(int volume) {
        this.volume = volume;
    }
    
    private boolean isLigado() {
        return ligado;
    }
    
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    
    @Override
    public void ligar() {
        setLigado(true);
    }
    
    @Override
    public void desligar() {
        setLigado(false);
    }
    
    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.println("Volume: " + this.getVolume());
        for (int i = 0; i <= this.getVolume(); i += 10) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    @Override
    public void fecharMenu() {
        System.out.println("Fechado");
    }
    
    @Override
    public void maisVolume() {
        if (isLigado()) {
            setVolume(getVolume() + 5);
        }
    }
    
    @Override
    public void menosVolume() {
        if (isLigado()) {
            setVolume(getVolume() <= 5 ? 0 : getVolume() - 5);
        }
    }
    
    @Override
    public void ligarMudo() {
        if (isLigado() && getVolume() > 0) {
            setVolume(0);
        }
    }
    
    @Override
    public void desligarMudo() {
        if (isLigado() && getVolume() == 0) {
            setVolume(5);
        }
    }
    
    @Override
    public void play() {
        if (isLigado() && !isTocando()) {
            setTocando(true);
        }
    }
    
    @Override
    public void pause() {
        if (isLigado() && isTocando()) {
            setTocando(false);
        }
    }
    
}
