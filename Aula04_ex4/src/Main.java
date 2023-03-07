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

        if(chris.transfereVida(anna,50)){
            System.out.println("Fazendo o zumbi Chris transferir 50 pontos de vida para o zumbi Anna");
            chris.mostraVida();
            anna.mostraVida();
        }

        if(chris.transfereVida(anna,75)){
            System.out.println("Fazendo o zumbi Chris transferir 75 pontos de vida para o zumbi Anna");
            chris.mostraVida();
            anna.mostraVida();
        }

        if(anna.transfereVida(anna,300)){
            System.out.println("Fazendo o zumbi Anna trasnferir 300 pontos de vida para o zumbi Anna");
            chris.mostraVida();
            anna.mostraVida();
        }
    }
}