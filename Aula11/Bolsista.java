/**
 *
 * @author Code36u4r60
 */
public class Bolsista extends Aluno {

    private float bolsa;

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + nome);
    }

    @Override
    public void pagarMensalidade() {
        System.out.println(nome + " é bolsista! Pagamento facilitado.");
    }
}
