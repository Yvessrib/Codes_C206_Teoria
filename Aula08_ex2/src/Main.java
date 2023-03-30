public class Main {

    public static void main(String[] args) {

        Bloco b1 = new Bloco();
        Bloco b2 = new Bloco();
        Bloco b3 = new Bloco();
        Bloco b4 = new Bloco();
        Bloco b5 = new Bloco();

        System.out.println("Blocos atuais do jogo: " + Bloco.getNumBlocos());

        Jogador jogador = new Jogador();
        jogador.destruirBloco(b1);

        System.out.println("Blocos atuais do jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPonto());

        jogador.destruirBloco(b2);
        System.out.println("Blocos atuais do jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPonto());

        jogador.destruirBloco(b3);
        System.out.println("Blocos atuais do jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPonto());

        jogador.destruirBloco(b4);
        System.out.println("Blocos atuais do jogo: " + Bloco.getNumBlocos());
        System.out.println("Pontuação do jogador: " + jogador.getPonto());

        jogador.destruirBloco(b5);

        Conversor.converter(jogador.getPonto());



    }
}