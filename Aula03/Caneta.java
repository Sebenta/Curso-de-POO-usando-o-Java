/**
 *
 * @author Code36u4r60
 */
public class Caneta {

    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void status() {
        System.out.println(
                "Modelo: " + this.modelo
                + "\nCor: " + this.cor
                + "\nPonta: " + this.ponta
                + "\nCarga: " + this.carga
                + "\nTampada? " + this.tampada
        );
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
