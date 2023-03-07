public class Main {
    public static void main(String[] args){

        Zumbi chris = new Zumbi();
        Zumbi anna = new Zumbi();

        //Alocando os valores da instancia Chris
        chris.nome = "Chris";
        chris.vida = 100;

        //Alocando os valores da instancia Anna
        anna.nome = "Anna";
        anna.vida = 200;

        //Mostrando a vida dos dois
        chris.mostraVida();
        anna.mostraVida();

        //Chris apontando para o memso lugar que anna
        chris = anna;

        //Mostrando q os valores sao iguais
        chris.mostraVida();
        anna.mostraVida();

        //Alterando qualquer uma das instancias, altera as duas, pois agora, são o mesmo objeto
        chris.vida = 300;

        //Mostrando os valores
        chris.mostraVida();
        anna.mostraVida();

    }
}