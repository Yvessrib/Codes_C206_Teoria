import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //Criando uma entrada de dados
        int num = entrada.nextInt(); //Entrando com o número de alunos

        switch (num){ //Estrutura de switch

            case 10:
            case 20:
                System.out.println("A sala a ser usada será I-16");
                break;
            case 30:
                System.out.println("A sala a ser usada será I-22");
                break;
            default:
                System.out.println("Nenhuma sala está disponível para esse número de alunos!");
        }

        entrada.close(); //Fechando a saída
    }
}