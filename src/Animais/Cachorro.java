package Animais;

public class Cachorro {

    public String nome;
    public String Raca;
    public String Cor;
    public int Altura;
    public double peso;
    public int tamanhoRabo;
    public String estadoEspirito;
    public String Comer;
    public String Latir;


    public String Comer(String fome){
        if(fome.equals("esta com fome")){
            this.Latir = "comer comida";
        } else{
            this.Latir = "pedir carinho";
        }
        return Comer;
    };

    public String Latir(String lata) {
       if(lata.equals("ouvir um barulho estranho")){
            this.Latir = "AU AU AU...";
       }else if(lata.equals("Ouvir outro cachorro latindo")){
            this.Latir = "Uivar!";
       }else if(lata.equals("se ver ou animal")){
            this.Latir = "latir bastante";
       }
       return Latir;
    }

    public String pegar() {
        return "Bolinha";
    }

    public String interagir(String acao) {
        if (acao.equals("carinho")) {
            this.estadoEspirito = "feliz";

        } else if(acao.equals("Levar para pessear")){
            this.estadoEspirito = "Alegre";
            
        } else if(acao.equals("pisar na patinha")){
            this.estadoEspirito = "Triste";

        } else if(acao.equals("pisar no rabo")){
            this.estadoEspirito = "Bravo";

        } else if (acao.equals("vai dormir!")) {
            this.estadoEspirito = "chateado";

        } else {
            this.estadoEspirito = "neutro";

        }
        return estadoEspirito;
    }
}
