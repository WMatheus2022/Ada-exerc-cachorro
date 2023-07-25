package Animais;

public class Cachorro extends Animal {

    static int numeroCachorros;
    private int tamanhoRabo;

    // cachorro2
    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo,
        String estadoEspirito) {
        super(nome, cor, peso);
        this.nome = nome;
        this.cor = cor;
        this.altura = altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;

        numeroCachorros++;
    }

    public static int getNumeroCachorros() {
        return numeroCachorros;
    }

    public static void setNumeroCachorros(int numeroCachorros) {
        Cachorro.numeroCachorros = numeroCachorros;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }

    public String Pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho":
                this.estadoEspirito = "feliz";
                break;
            case "Levar para pessear":
                this.estadoEspirito = "Alegre";
                break;
            case "pisar na patinha":
                this.estadoEspirito = "Triste";
                break;
            case "pisar no rabo":
                this.estadoEspirito = "Bravo";
                break;
            case "vai dormir!":
                this.estadoEspirito = "chateado";
                break;
            default:
                this.estadoEspirito = "neutro";
                break;
        }

        return this.estadoEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro [nome=" + nome + "]";
    }

    @Override
    public void soar() {
        System.out.println("Au Au!!!");
    }

}
