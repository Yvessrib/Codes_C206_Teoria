package brownies;

public class BrownieNutella extends Brownie {

    public BrownieNutella(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Brownies.Brownie de Nutella ---");
        super.mostraInfo();
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando no carrinho de compras um: " + nome);
        super.addCarrinhoDeCompras();
    }

    public void adicionaNutella(){
        System.out.println("Adicionando nutella ao " + this.nome + "!!");
    }
}
