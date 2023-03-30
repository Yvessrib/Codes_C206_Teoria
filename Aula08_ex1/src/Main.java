import br.inatel.cdg.inimigo.Asteroide;
import br.inatel.cdg.jogador.Nave;

public class Main {
    public static void main(String[] args) {

        Nave nave1 = new Nave("Millennium Falcon", 50, "Explosivo");
        Nave nave2 = new Nave("Espaçonaaaveee", 30, "Normal");

        Asteroide a1 = new Asteroide("Asteroide1", "Grande");
        Asteroide a2 = new Asteroide("Asteroide2", "Pequeno");

        nave1.atirar(a1);
        nave2.atirar(a1);

        nave1.atirar(a2);
        nave2.atirar(a2);
    }
}