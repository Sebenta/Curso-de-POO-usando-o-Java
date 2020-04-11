/**
 *
 * @author Code36u4r60
 */
public class Aula12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Animal n = new Animal();
        Mamifero m = new Mamifero("Marrom", 35.3f, 16, 4);
        System.out.println(m.getClass().getSimpleName());
        m.alimentar();
        m.locomover();
        m.emitirSom();
        System.out.println("");

        Reptil r = new Reptil("Prata", 5, 3, 0);
        System.out.println(r.getClass().getSimpleName());
        r.alimentar();
        r.locomover();
        r.emitirSom();
        System.out.println("");

        Peixe p = new Peixe("Douradas", 1.2f, 1, 0);
        System.out.println(p.getClass().getSimpleName());
        p.alimentar();
        p.locomover();
        p.emitirSom();
        System.out.println("");

        Ave a = new Ave("Azul", 1.3f, 3, 2);
        System.out.println(a.getClass().getSimpleName());
        a.alimentar();
        a.locomover();
        a.emitirSom();
        System.out.println("");

        Canguru can = new Canguru("Castanho", 25f, 7, 4);
        System.out.println(can.getClass().getSimpleName());
        can.alimentar();
        can.locomover();
        can.emitirSom();
        can.usarBolsa();
        System.out.println("");

        Cachorro cac = new Cachorro("Preto", 15, 10, 4);
        System.out.println(cac.getClass().getSimpleName());
        cac.alimentar();
        cac.locomover();
        cac.emitirSom();
        cac.enterrarOsso();
        cac.abanarRabo();
        System.out.println("");

        Cobra cob = new Cobra();
        System.out.println(cob.getClass().getSimpleName());
        cob.alimentar();
        cob.locomover();
        cob.emitirSom();
        System.out.println("");

        Tartaruga tar = new Tartaruga();
        System.out.println(tar.getClass().getSimpleName());
        tar.alimentar();
        tar.locomover();
        tar.emitirSom();
        System.out.println("");

        GoldFish gol = new GoldFish();
        System.out.println(gol.getClass().getSimpleName());
        gol.alimentar();
        gol.locomover();
        gol.emitirSom();
        System.out.println("");

        Arara ara = new Arara();
        System.out.println(ara.getClass().getSimpleName());
        ara.alimentar();
        ara.locomover();
        ara.emitirSom();
        System.out.println("");

    }

}
