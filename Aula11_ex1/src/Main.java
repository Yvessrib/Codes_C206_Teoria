public class Main {

    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Pitolomeu",50);
        Lontra lontra = new Lontra("Cleber", 35);
        Boi boi = new Boi("Jeferson", 80);

        cachorro.mostraInfo();
        lontra.mostraInfo();
        boi.mostraInfo();

        cachorro.emitirSom();
        lontra.emitirSom();
        boi.emitirSom();

        lontra.nadar();


    }
}