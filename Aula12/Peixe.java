/**
 *
 * @author Code36u4r60
 */
public class Peixe extends Animal {

    private String corEscama;

    public Peixe() {
    }

    public Peixe(String corEscama) {
        this.corEscama = corEscama;
    }

    public Peixe(String corEscama, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corEscama = corEscama;
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void soltarBolha(){
        System.out.println("Bolha");
    }
    
    @Override
    public void locomover() {
        System.out.println("Nadar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer substâncias");
    }

    @Override
    public void emitirSom() {
        System.out.println("Não faz som");
    }

}
