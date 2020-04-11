import java.util.AbstractCollection;
import java.util.ArrayList;

/**
 *
 * @author Code36u4r60
 */
public class Aula07_08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Lutador> lutadores = new ArrayList<>();
        uploadLutadores(lutadores);
        /*
        apresentar(lutadores, 0);
        ganhar(lutadores, 0);
        apresentar(lutadores, 0);
         */

        Luta luta1 = new Luta();
        luta1.marcarLuta(lutadores.get(0), lutadores.get(2));
        luta1.lutar();
        //apresentar(lutadores, 0);
        //apresentar(lutadores, 1);
    }

    public static void uploadLutadores(AbstractCollection lutadores) {
        lutadores.add(new Lutador(
                "Pretty Boy",
                "França",
                31, 1.75f, 68.9f,
                11, 3, 1));

        lutadores.add(new Lutador(
                "Putscript",
                "Brasil",
                29, 1.68f, 57.8f,
                14, 2, 3));

        lutadores.add(new Lutador(
                "Snapshadow",
                "EUA",
                35, 1.65f, 80.9f,
                12, 2, 1));

        lutadores.add(new Lutador(
                "Dead Code",
                "Austrália",
                28, 1.93f, 81.6f,
                13, 0, 2));

        lutadores.add(new Lutador(
                "UFOCobol",
                "Brasil",
                37, 1.70f, 119.3f,
                5, 4, 3));

        lutadores.add(new Lutador(
                "Nerdaart",
                "EUA",
                30, 1.81f, 105.7f,
                12, 2, 4));
    }

    public static void apresentar(ArrayList<Lutador> lutadores, int id) {
        lutadores.get(id).apresentar();
    }

    public static void ganhar(ArrayList<Lutador> lutadores, int id) {
        lutadores.get(id).ganharLuta();
    }

    public static void perder(ArrayList<Lutador> lutadores, int id) {
        lutadores.get(id).perderLuta();
    }

    public static void empatar(ArrayList<Lutador> lutadores, int id) {
        lutadores.get(id).empatarLuta();
    }

}
