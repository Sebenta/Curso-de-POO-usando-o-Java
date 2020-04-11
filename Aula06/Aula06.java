/**
 *
 * @author Code36u4r60
 */
public class Aula06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ControleRemoto c = new ControleRemoto();
       c.ligar();
       c.maisVolume();
       //c.ligarMudo();
       c.play();
       
       c.abrirMenu();
       c.fecharMenu();
    }
    
}
