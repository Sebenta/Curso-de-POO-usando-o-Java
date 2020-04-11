/**
 *
 * @author Code36u4r60
 */
public class Mamifero extends Animal {

    protected String corPelo;

    public Mamifero() {
    }

    public Mamifero(String corPelo) {
        this.corPelo = corPelo;
    }

    public Mamifero(String corPelo, float peso, int idade, int membros) {
        super(peso, idade, membros);
        this.corPelo = corPelo;
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

}
