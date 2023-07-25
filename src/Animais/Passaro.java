package Animais;

public class Passaro extends Animal{
    
    public Passaro(String nome, String cor, double peso) {
        super(nome, cor, peso);
    }

    static int numeroPassaros;


    @Override
    public void soar() {
        System.out.println("Piu Piu!!!");
    }


}
