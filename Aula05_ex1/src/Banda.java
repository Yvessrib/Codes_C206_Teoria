public class Banda {

    String nome;
    String genero;
    Empresario empresario;
    Membro[] membros = new Membro[5];
    Musica[] musicas = new Musica[5];

    public Banda(String nome, String genero) {
        this.nome = nome;
        this.genero = genero;
    }

    public void mostraInfo(){

        System.out.println("A banda " + nome + " do gênero " + genero);
        System.out.println("Possui esses membros: ");
        for(int i = 0; i < membros.length; i++){
            if(membros[i] != null){
                System.out.println( (i+1) + " - " + membros[i].nome + " - " + membros[i].funcao);
            }
        }

        System.out.println("Possui essas músicas: ");
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] != null){
                System.out.println( (i+1) + " - " + musicas[i].nome + " - " + musicas[i].duracao);
            }
        }

        if(empresario == null){
            System.out.println("Não há empresário");
        }
        else{
            System.out.println("Empresário da banda chama " + empresario.nome + " - cnpj - " + empresario.cnpj);
        }


    }

    public void addMusicaNova(Musica musica){
        for(int i = 0; i < musicas.length; i++){
            if(musicas[i] == null){
                musicas[i] = musica;
                break;
            }
        }
    }

    public void addMembroNovo(Membro membro){
        for(int i = 0; i < membros.length; i++){
            if(membros[i] == null){
                membros[i] = membro;
                break;
            }
        }
    }
}

