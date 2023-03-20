public class Main {
    public static void main(String[] args) {

        Cantina c1 = new Cantina();
        c1.nome = "Cantina do Inatel";

        Salgado s1 = new Salgado();
        s1.nome = "Coxinha";

        Salgado s2 = new Salgado();
        s2.nome = "Pastel de queijo";

        Salgado s3 = new Salgado();
        s3.nome = "Enroladinho de Presunto e Queijo";

        c1.addSalgado(s1);
        c1.addSalgado(s2);
        c1.addSalgado(s3);

        c1.mostraInfo();
    }
}