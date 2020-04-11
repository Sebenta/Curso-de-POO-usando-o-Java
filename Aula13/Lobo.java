/**
 *
 * @author Code36u4r60
 */
public class Lobo extends Mamifero {

    public Lobo() {
    }

    public Lobo(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    @Override
    public void emitirSom() {
        System.out.println("Auuuuuuuuuuuuuuuuuu");
    }
}
