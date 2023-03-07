public class Motor {

    String cilindradas;
    float velocidadeMaxima;

    //Constructor do motor
    public Motor(String cilindradas, float velocidadeMaxima) {
        this.cilindradas = cilindradas;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    //
    public void mostraInfo(){
        System.out.println("O kart possui " + cilindradas + " cilindradas");
        System.out.println("O kart possui " + velocidadeMaxima + " de velocidade maxima");
    }

}
