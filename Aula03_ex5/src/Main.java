import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Criando uma entrada de dados
        Random rand = new Random();
        int x = rand.nextInt(10) + 1; //Gera número aleatório entre 1 e 10

        System.out.println("Um número aleatório entre 1 e 10 foi gerado!");
        System.out.print("Qual número foi gerado? ");
        int num = entrada.nextInt(); //Tentativa de entrar com o número

        while (num != x) { //Repetição para tentar advinhar número
            System.out.print("Qual número foi gerado? ");
            num = entrada.nextInt(); //Testando novo número
        }

        System.out.println("BOA! Você acertou o número!");
        entrada.close();

    }
}