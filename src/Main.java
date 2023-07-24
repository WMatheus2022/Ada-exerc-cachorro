import Animais.Cachorro;

public class Main {
    public static void main(String[] args) throws Exception {

        /*Cachorro cachorro1 = new Cachorro();
        cachorro1.setNome("Luky");
        cachorro1.setRaca("Pitbull");
        cachorro1.setCor("Caramelo");
        cachorro1.setAltura(60);
        cachorro1.setPeso(5.5);
        cachorro1.setTamanhoRabo(3);*/

        Cachorro cachorro2 = new Cachorro("Pateta", "labrador", "branco", 70, 15.5, 30, "alegre");

        System.out.println(cachorro2.getNome());
        System.out.println(cachorro2.getRaca());
        System.out.println(cachorro2.getCor());

        System.out.println("ouviu " + cachorro2.Latir("ouvir um barulho estranho"));
        System.out.println("O cachorro pegou uma " + cachorro2.Pegar("Jogar graveto"));

        System.out.println("O cachorro esta " + cachorro2.interagir("pisar na patinha"));
        System.out.println("O cachorro esta " + cachorro2.interagir("nada"));
        System.out.println("O cachorro esta " + cachorro2.interagir("vai dormir!"));

    }
}
