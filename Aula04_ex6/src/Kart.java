import javax.swing.plaf.IconUIResource;

public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    //Usando o construtor com Composição
    public Kart(String nome, String cilindradas, float velocidadeMaxima) {
        this.nome = nome;
        this.motor = new Motor(cilindradas, velocidadeMaxima); //Criando motor por composição
    }

    //Método de fazer o kart pular
    public void pular(){
        System.out.println("O kart " + nome + " pulou!");
    }

    //Método de fazer o kart usar turbo
    public void soltarTurbo(){
        System.out.println("O kart " + nome + " está soltando o turbo!!");
    }

    //Método de fazer o kart realizar Drift
    public void fazerDrift(){
        System.out.println("O kart " + nome + " está fazendo drift");
    }

}
