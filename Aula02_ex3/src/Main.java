import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Qual a sua NPA? ");
        int NPA = entrada.nextInt();
        int NFA;

        if(NPA >= 60){
            System.out.println("Parabéns!! Você passou na disciplina!");
        }
        else if(NPA >= 30){
            System.out.print("Infelizmente você não passou direto, informar o valor da NP3: ");
            int NP3 = entrada.nextInt();

            NFA = (NPA + NP3)/2;
            if(NFA >= 50){
                System.out.println("Parabéns!! Você passou na disciplina!");
            }
            else{
                System.out.println("Infelizmente você reprovou na disciplina :(");
            }
        }
        else{
            System.out.println("Infelizmente você reprovou na disciplina :(");
        }

        entrada.close();

    }
}