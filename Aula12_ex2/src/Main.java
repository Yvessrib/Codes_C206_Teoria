import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Brownie> listaBrownie = new ArrayList<>();

        BrownieCafe bc1 = new BrownieCafe("Cafe1",10);
        BrownieCafe bc2 = new BrownieCafe("Cafe2",12);

        BrownieNutella bn1 = new BrownieNutella("Nutella1",15);
        BrownieNutella bn2 = new BrownieNutella("Nutella2",8);

        BrownieLeite bl1 = new BrownieLeite("Leite1",6);
        BrownieLeite bl2 = new BrownieLeite("Leite2",20);

        listaBrownie.add(bc1);
        listaBrownie.add(bc2);
        listaBrownie.add(bn1);
        listaBrownie.add(bn2);
        listaBrownie.add(bl1);
        listaBrownie.add(bl2);

        System.out.println("--- Antes de Ordenar ---");
        for(Brownie brownie : listaBrownie){
            System.out.println(brownie.nome + " : " + brownie.preco);
        }
        System.out.println("\n--- Depois de Ordenar ---");
        Collections.sort(listaBrownie);

        for(Brownie brownie : listaBrownie){
            System.out.println(brownie.nome + " : " + brownie.preco);
        }

    }
}