import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Criando uma entrada de dados
        Random rand = new Random();
        int x = rand.nextInt(10) + 1; //Gera número aleatório entre 1 e 10
        System.out.println("Um número aleatório entre 1 e 10 foi gerado!");
        int num;

        do{
            System.out.print("Qual número foi gerado? ");
            num = entrada.nextInt(); //Testando novo número

            if(num > x){
                System.out.println("Erouuu!! Tente digitar um número MENOR!");
            }
            else if(num < x) {
                System.out.println("Erouuu!! Tente digitar um número MAIOR!");
            }

        }while (num != x);

        System.out.println("BOA! Você acertou o número!");
        entrada.close();
    }
}