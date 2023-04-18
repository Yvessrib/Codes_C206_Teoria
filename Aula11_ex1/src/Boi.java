public class Boi extends Mamifero{

    public Boi(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("O boi " + nome + "está mugindo!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Boi ---");
        super.mostraInfo();
    }
}
