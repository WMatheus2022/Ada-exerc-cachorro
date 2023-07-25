package Animais;

public class Animal {
    
    protected String nome;
    protected String cor;
    protected int altura;
    protected double peso;
    protected String estadoEspirito;
 
    
    public Animal(String nome2, String cor2, double peso2) {
    }

    protected void comer() {
    }

    protected void dormir() {
    }

    public void soar() {
        System.out.println("cri cri");
    }
}
