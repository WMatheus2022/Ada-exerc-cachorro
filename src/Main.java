import Animais.Cachorro;

public class Main {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro1 = new Cachorro();

        cachorro1.nome = "Luky";
        cachorro1.Raca = "Pitbull";
        cachorro1.Cor = "Caramelo";
        cachorro1.Altura = 60;
        cachorro1.peso = 5.5;
        cachorro1.tamanhoRabo = 3;

        System.out.println("ouviu "+ cachorro1.Latir("ouvir um barulho estranho"));
        System.out.println("O cachorro pegou uma " + cachorro1.pegar());

        System.out.println("O cachorro esta " + cachorro1.interagir("carinho"));
        System.out.println("O cachorro esta " + cachorro1.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro1.interagir("vai dormir!"));

    }
}
