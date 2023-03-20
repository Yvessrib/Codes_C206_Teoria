
public class Main {
    public static void main(String[] args) {

        //Criando banda
        Banda band = new Banda("Caskets", "Rock");

        //Criando membros
        Membro m1 = new Membro("Matt Flood", "Vocalista");
        Membro m2 = new Membro("Craig Robinson", "Guitarrista");
        Membro m3 = new Membro("James Lazenby", "Baterista");
        Membro m4 = new Membro("Chris McIntosh", "Baixista");
        Membro m5 = new Membro("Benji Wilson", "Guitarrista");

        //Adicionando mesmbros na banda
        band.addMembroNovo(m1);
        band.addMembroNovo(m2);
        band.addMembroNovo(m3);
        band.addMembroNovo(m4);
        band.addMembroNovo(m5);

        //Criando musicas
        Musica mu1 = new Musica("Glass Hearts",3.44);
        Musica mu2 = new Musica("Lost in Echos",3.37);
        Musica mu3 = new Musica("Drowned in Emotion",3.42);

        //Adicionando musicas na banda
        band.addMusicaNova(mu1);
        band.addMusicaNova(mu2);
        band.addMusicaNova(mu3);

        //Criando empresario
        Empresario empre = new Empresario("Yves", 12386838);

        //Adicionando empresario
        band.empresario = empre;

        //Mostrando as informações
        band.mostraInfo();


    }
}