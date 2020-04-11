/**
 *
 * @author Code36u4r60
 */
public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando;

    public Funcionario() {
    }

    public Funcionario(String setor, boolean trabalhando) {
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public Funcionario(String setor, boolean trabalhando, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.setor = setor;
        this.trabalhando = trabalhando;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public void mudarTrabalho() {
        trabalhando = !trabalhando;
    }
/*
    @Override
    public String toString() {
        return "Funcionario{" + "setor=" + setor + ", trabalhando=" + trabalhando + '}';
    }*/

    
}
