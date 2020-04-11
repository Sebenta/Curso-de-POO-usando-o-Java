/**
 *
 * @author Code36u4r60
 */
public class Caneta {

    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void status() {
        System.out.println(
                "Modelo: " + this.modelo
                + "\nCor: " + this.cor
                + "\nPonta: " + this.ponta
                + "\nCarga: " + this.carga
                + "\nTampada? " + this.tampada
        );
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO! Não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
