public class Personagem {

    //
    String nome;
    int pontos;
    Arma arma; //Agregação

    /*
    public Personagem(String nome, int pontos, Arma arma) {

        this.nome = nome;
        this.pontos = pontos;
        this.arma = arma;
    }

    Agregação
    public Personagem(String nome, int pontos, String nomeArma, int poder, int resistencia, String descricao) {

        this.nome = nome;
        this.pontos = pontos;
        this.arma = new Arma(nomeArma,poder,resistencia,descricao);
    }
    */

    //
    public void usarArma(){
        arma.resistencia -= 2;
    }

    //
    public void tomarDano(){
        pontos -= 5;
    }
}
