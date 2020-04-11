/**
 *
 * @author Code36u4r60
 */
public class Aula14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Video video[] = new Video[3];
        video[0] = new Video("Aula 1 de POO");
        video[1] = new Video("Aula 12 de PHP");
        video[2] = new Video("Aula 10 de HTML5");

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("juba", "Jubileu", 22, "M");
        g[1] = new Gafanhoto("creuzita", "Creuza", 12, "F");

        /*
        System.out.println("Vídeos: ");
        System.out.println(video[0]);
        System.out.println(video[1]);
        System.out.println(video[2]);
        System.out.println("Gafanhotos: ");
        System.out.println(g[0]);
        System.out.println(g[1]);
         */
        Visualizacao v[] = new Visualizacao[5];

        v[0] = new Visualizacao(g[0], video[2]);
        v[0].avaliar();

        v[1] = new Visualizacao(g[0], video[1]);

        v[2] = new Visualizacao(g[1], video[2]);
        v[2].avaliar(8);

        v[3] = new Visualizacao(g[0], video[2]);
        v[3].avaliar(100f);

        System.out.println(v[0]);
        System.out.println(v[1]);

    }

}
