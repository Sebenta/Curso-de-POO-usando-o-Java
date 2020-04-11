/**
 *
 * @author Code36u4r60
 */
public class Aluno extends Pessoa {

    private String matr;
    private String curso;

    public Aluno() {
    }

    public Aluno(String matr, String curso) {
        this.matr = matr;
        this.curso = curso;
    }

    public Aluno(String matr, String curso, String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.matr = matr;
        this.curso = curso;
    }

    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr() {
        System.out.println("Matrícula será cancelada");
    }
/*
    @Override
    public String toString() {
        return "Aluno{" +super.toString()+ "matr=" + matr + ", curso=" + curso + '}';
    }*/

    
}
