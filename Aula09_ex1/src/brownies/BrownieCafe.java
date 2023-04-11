package brownies;

public class BrownieCafe extends Brownie {

    public BrownieCafe(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Brownies.Brownie de Cafe ---");
        super.mostraInfo();
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando no carrinho de compras um: " + nome);
        super.addCarrinhoDeCompras();
    }

    public void adicionaCafe(){
        System.out.println("Adicionando café ao " + this.nome + "!!");
    }
}
