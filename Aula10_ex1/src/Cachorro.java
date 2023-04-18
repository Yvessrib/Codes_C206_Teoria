public class Cachorro extends Mamifero{

    public Cachorro(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("O cachorro " + nome + " está latindo!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos do Cachorro ---");
        super.mostraInfo();
    }
}
