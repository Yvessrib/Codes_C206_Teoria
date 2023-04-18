import brownies.BrownieCafe;
import brownies.BrownieDoceDeLeite;
import brownies.BrownieNutella;
import comprador.Comprador;

public class Main {
    public static void main(String[] args) {

        BrownieNutella bn = new BrownieNutella("Nutellinha", 7,"Nutella");
        BrownieCafe bc = new BrownieCafe("Cafezito", 6,"Café");
        BrownieDoceDeLeite bd = new BrownieDoceDeLeite("Latte", 7, "Doce de leite");
        Comprador comp = new Comprador("Yves", 50.00);

        bn.mostraInfo();
        bc.mostraInfo();
        bd.mostraInfo();

        bn.adicionaNutella();
        bc.adicionaCafe();
        bd.adicionaDoceDeLeite();

        comp.efetuarCompra(bn);
        comp.efetuarCompra(bc);
        comp.efetuarCompra(bd);

        System.out.println("Saldo final do cliente: R$ " + comp.getSaldo());

    }
}