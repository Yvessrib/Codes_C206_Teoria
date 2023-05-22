import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        List<Double> listaDouble = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            listaDouble.add(new Random().nextDouble()*100);
        }

        System.out.println("Antes da ordenação");

        for(Double doubles_nao_ordenado : listaDouble){
            System.out.println(doubles_nao_ordenado);
        }

        Collections.sort(listaDouble);

        System.out.println("Depois da ordenação");

        for(Double doubles_ordenado : listaDouble){
            System.out.println(doubles_ordenado);
        }

    }
}