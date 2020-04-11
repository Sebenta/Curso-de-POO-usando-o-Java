/**
 *
 * @author Code36u4r60
 */
public class Professor extends Pessoa {

    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void receberAumento(float aumento) {
        salario += aumento;
    }
}
