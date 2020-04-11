/**
 *
 * @author Code36u4r60
 */
public class Cachorro extends Mamifero {

    public Cachorro() {
    }

    public Cachorro(String corPelo) {
        super(corPelo);
    }

    public Cachorro(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    @Override
    public void emitirSom() {
        System.out.println("Au Au Au RRRRRrrr Au Au");
    }

    public void enterrarOsso() {
        System.out.println("Enterrando o osso");
    }

    public void abanarRabo() {
        System.out.println("Abanar o rabo");
    }
}
