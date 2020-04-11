/**
 *
 * @author Code36u4r60
 */
public class Lutador {

    private final float PESO_LEVE = 52.2f;
    private final float PESO_MEDIO = 70.4f;
    private final float PESO_PESADO = 84f;
    private final float PESO_MAX = 120.2f;

    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador() {
    }

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public Lutador(Lutador lutador) {
        this.nome = lutador.getNome();
        this.nacionalidade = lutador.getNacionalidade();
        this.idade = lutador.getIdade();
        this.altura = lutador.getAltura();
        this.peso = lutador.getPeso();
        this.categoria = lutador.getCategoria();
        this.vitorias = lutador.getVitorias();
        this.derrotas = lutador.getDerrotas();
        this.empates = lutador.getEmpates();
    }

    
    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso < PESO_LEVE) {
            this.categoria = "Inválida";
        } else if (this.peso < PESO_MEDIO) {
            this.categoria = "Leve";
        } else if (this.peso < PESO_PESADO) {
            this.categoria = "Médio";
        } else if (this.peso <= PESO_MAX) {
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválida";
        }
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    ///////////////////////
    //Public Method
    ///////////////////////
    public void apresentar() {
        System.out.println("-------------------"
                + "\nLutador: " + getNome()
                + "\nOrigem:  " + getNacionalidade()
                + "\nIdade: " + getIdade() + " anos"
                + "\nAltura: " + getAltura() + "mt"
                + "\nPeso:  " + getPeso() + "Kg"
                + "\nVitórias: " + getVitorias()
                + "\nDerrotas: " + getDerrotas()
                + "\nEmpates: " + getEmpates());
    }

    public void status() {
        System.out.println("-------------------"
                + "\nLutador: " + getNome()
                + "\nCategoria:  " + getCategoria()
                + "\nVitórias: " + getVitorias()
                + "\nDerrotas: " + getDerrotas()
                + "\nEmpates: " + getEmpates());
    }

    public void ganharLuta() {
        setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        setEmpates(getEmpates() + 1);
    }

    
}
