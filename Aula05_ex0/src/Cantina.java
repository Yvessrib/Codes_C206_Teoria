public class Cantina {

    String nome;
    Salgado[] salgados = new Salgado[5];

    public void addSalgado(Salgado NovoSalgado){
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] == null){
                salgados[i] = NovoSalgado;
                break;
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Lista de salgados da cantina: " + this.nome);
        for(int i = 0; i < salgados.length; i++){
            if(salgados[i] != null){
                System.out.println(salgados[i].nome);
            }
        }
    }
}
