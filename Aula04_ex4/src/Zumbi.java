public class Zumbi {

    double vida;
    String nome;

    double mostraVida(){
        System.out.println("A vida do zumbi e: " + this.vida);
        return 0;
    }

    boolean transfereVida (Zumbi zumbiAlvo, double quantia){

        if(vida >= quantia){
            vida -= quantia;
            zumbiAlvo.vida += quantia;
            return true;
        }
        else{
            System.out.println("O zumbi " + nome + " não pode fazer transferência de " + quantia + " pontos de vida para o zumbi " + zumbiAlvo.nome + " pois o zumbi " + nome + " so tem " + vida + " pontos de vida");
            return false;
        }
    }
}
