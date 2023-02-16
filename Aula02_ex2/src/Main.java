import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.print("Qual a quantidade de pedidos? ");
        Scanner entrada = new Scanner(System.in);
        int num = entrada.nextInt();
        int soma = 0;
        float media;

        for (int i = 1; i <= num; i++) {

            System.out.print("Número de lanches do pedido " + i + ": ");
            int lanche = entrada.nextInt();
            soma = soma + lanche;
        }

        media = soma / num;

        System.out.print("O total de lanches foi: " + soma);
        System.out.print("A média de lanches foi: " + media);

        entrada.close();
    }
}