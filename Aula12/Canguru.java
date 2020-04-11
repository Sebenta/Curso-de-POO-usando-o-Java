/**
 *
 * @author Code36u4r60
 */
public class Canguru extends Mamifero {

    public Canguru() {
    }

    public Canguru(String corPelo) {
        super(corPelo);
    }

    public Canguru(String corPelo, float peso, int idade, int membros) {
        super(corPelo, peso, idade, membros);
    }

    public void usarBolsa() {
        System.out.println("Usando a Bolsa");
    }

    @Override
    public void locomover() {
        System.out.println("Saltar");
    }

}
