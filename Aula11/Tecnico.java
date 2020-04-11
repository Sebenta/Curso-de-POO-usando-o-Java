/**
 *
 * @author Code36u4r60
 */
public class Tecnico extends Pessoa {

    private String registoProfissional;

    public String getRegistoProfissional() {
        return registoProfissional;
    }

    public void setRegistoProfissional(String registoProfissional) {
        this.registoProfissional = registoProfissional;
    }

    public void praticar() {
        System.out.println(nome + " está a praticar.");
    }
}
