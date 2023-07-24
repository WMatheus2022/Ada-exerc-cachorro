package Animais;

public class Cachorro {

    private String nome;
    private String Raca;
    private String Cor;
    private int Altura;
    private double peso;
    private int tamanhoRabo;

    //cachorro1
    public Cachorro(){}; // constrtur padrao

    //cachorro2
    public Cachorro(String nome, String raca, String cor, int altura, double peso, int tamanhoRabo,
            String estadoEspirito) {
        this.nome = nome;
        Raca = raca;
        Cor = cor;
        Altura = altura;
        this.peso = peso;
        this.tamanhoRabo = tamanhoRabo;
        this.estadoEspirito = estadoEspirito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String raca) {
        Raca = raca;
    }

    public String getCor() {
        return Cor;
    }

    public void setCor(String cor) {
        Cor = cor;
    }

    public int getAltura() {
        return Altura;
    }

    public void setAltura(int altura) {
        Altura = altura;
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

    public String estadoEspirito;
    public String Comer;
    public String Latir;
    public String Pegar;

    public String Comer(String fome) {

        switch (fome) {
            case "esta com fome":
                this.Comer = "comer comida";
                break;
            default:
                this.Comer = "pedir carinho";
                break;
        }

        /*
         * if(fome.equals("esta com fome")){
         * this.Comer = "comer comida";
         * } else{
         * this.Comer = "pedir carinho";
         * }
         */
        return this.Comer;
    };

    public String Latir(String lata) {

        switch (lata) {
            case "ouvir um barulho estranho":
                this.Latir = "AU AU AU...";
                break;
            case "Ouvir outro cachorro latindo":
                this.Latir = "Uivar!";
                break;
            case "se ver ou animal":
                this.Latir = "latir bastante";
                break;
            default:
                this.Latir = "ficar quieto";
                break;

        }

        /*
         * if(lata.equals("ouvir um barulho estranho")){
         * this.Latir = "AU AU AU...";
         * }else if(lata.equals("Ouvir outro cachorro latindo")){
         * this.Latir = "Uivar!";
         * }else if(lata.equals("se ver ou animal")){
         * this.Latir = "latir bastante";
         * }else{
         * this.Latir = "ficar quieto";
         * }
         */
        return this.Latir;
    }

    public String Pegar(String pega) {
        switch (pega) {
            case "Jogar Bolinha":
                this.Pegar = "Pegar bolinha";
                break;
            case "Jogar osso":
                this.Pegar = "Pegar osso";
                break;
            case "Jogar graveto":
                this.Pegar = "Pegar graveto";
                break;
            default:
                this.Pegar = "Pedir para brincar";
                break;

        }
        return this.Pegar;
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

        /*
         * if (acao.equals("carinho")) {
         * this.estadoEspirito = "feliz";
         * 
         * } else if(acao.equals("Levar para pessear")){
         * this.estadoEspirito = "Alegre";
         * 
         * } else if(acao.equals("pisar na patinha")){
         * this.estadoEspirito = "Triste";
         * 
         * } else if(acao.equals("pisar no rabo")){
         * this.estadoEspirito = "Bravo";
         * 
         * } else if (acao.equals("vai dormir!")) {
         * this.estadoEspirito = "chateado";
         * 
         * } else {
         * this.estadoEspirito = "neutro";
         * 
         * }
         */
        return this.estadoEspirito;
    }
}
