package brownies;

public class BrownieDoceDeLeite extends Brownie {

    public BrownieDoceDeLeite(String nome, double preco, String sabor) {
        super(nome, preco, sabor);
    }

    @Override
    public void mostraInfo() {
        System.out.println("--- Brownies.Brownie de Doce de Leite ---");
        super.mostraInfo();
    }

    @Override
    public void addCarrinhoDeCompras() {
        System.out.println("Adicionando no carrinho de compras um: " + nome);
        super.addCarrinhoDeCompras();
    }

    public void adicionaDoceDeLeite(){
        System.out.println("Adicionando doce de leite ao " + this.nome +"!!");
    }
}
