public class Lontra extends Mamifero implements Aquatico{

    public Lontra(String nome, double vida) {
        super(nome, vida);
    }

    @Override
    void emitirSom() {
        System.out.println("A lontra " + nome + " está está squicando!");
    }

    @Override
    public void nadar() {
        System.out.println("A lontra " + nome + " está nadando!");
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Infos da Lontra ---");
        super.mostraInfo();
    }
}
