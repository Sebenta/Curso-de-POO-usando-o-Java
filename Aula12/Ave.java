/**
 *
 * @author Code36u4r60
 */
public class Ave extends Animal {

    private String corPena;

    public Ave() {
    }

    public Ave(String corPena) {
        this.corPena = corPena;
    }

    public Ave(String corPena, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPena = corPena;
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
    
    public void fazerNinho(){
        System.out.println("Construindo ninho");
    }

    @Override
    public void locomover() {
        System.out.println("Voar");
    }

    @Override
    public void alimentar() {
        System.out.println("Comer frutas");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de ave");
    }

}
