import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;

public class Main {
    public static void main(String[] args) throws Exception {

        Cachorro cachorro2 = new Cachorro("Pateta", "branco", 70, 15.5, 30, "alegre");

        Gato gato1 = new Gato("felix", "branco", 5.5);

        Passaro passaro1 = new Passaro("gaviao", "lilas", 1.5);

        cachorro2.soar();
        gato1.soar();
        passaro1.soar();
    }
}
