import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Code36u4r60
 */
public class Luta {

    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Luta() {
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    ///////////////////
    //Public Method
    ///////////////////
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1 == l2) {
            System.out.println("São o mesmo lutador...");
            return;
        }
        if (!l1.getCategoria().equalsIgnoreCase(l2.getCategoria())) {
            System.out.println("São de categorias diferentes...");
            return;
        }
        aprovado = true;
        desafiado = l1;
        desafiante = l2;
    }

    public void lutar() {
        if (!aprovado) {
            System.out.println("Luta não aprovada");
            return;
        }
        System.out.println("Desafiado: ");
        desafiado.apresentar();
        System.out.println("----------------------------------");
        System.out.println("Desafiante: ");
        desafiante.apresentar();
        Random rand = new Random();
        int num = rand.nextInt(3);

        System.out.println("=============================================");
        switch (num) {
            case 0:
                System.out.println("Empate...");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
                break;
            case 1:
                System.out.println(desafiado.getNome() + " ganhou...");
                desafiado.ganharLuta();
                desafiante.perderLuta();
                break;
            case 2:
                System.out.println(desafiante.getNome() + " ganhou...");
                desafiante.ganharLuta();
                desafiado.perderLuta();
                break;
            default:
        }
        System.out.println("=============================================");
    }

}
