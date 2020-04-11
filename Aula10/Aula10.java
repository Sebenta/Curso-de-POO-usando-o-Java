/**
 *
 * @author Code36u4r60
 */
public class Aula10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa p1 = new Pessoa();
        
        Aluno p2 = new Aluno();
        
        Professor p3 = new Professor();
        
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p2.setNome("Maria");
        p3.setNome("Cláudia");
        p4.setNome("Fabiana");
        
        p1.setSexo("M");
        p4.setSexo("F");
        
        p2.setIdade(18);
        
        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");
        
        //p1.receberAumento(550.20f);
        //p2.mudarTrabalho();
        //p4.cancelarMatr();
        
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);
        
    }

}
