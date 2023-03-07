public class Main {
    public static void main(String[] args) {

        //Criando arma e pesonagem
        Arma a1 = new Arma("Pistola", 15, 25, "Medio alcance");
        Personagem p1 = new Personagem();

        //
        p1.nome = "Yves";
        p1.pontos = 50;
        p1.arma = a1;

        System.out.println("Yves está com " + p1.pontos + " de vida");
        p1.tomarDano();
        System.out.println("Yves está com " + p1.pontos + " de vida");

        p1.arma.mostraInfoArma();
        p1.usarArma();
        p1.arma.mostraInfoArma();

    }
}