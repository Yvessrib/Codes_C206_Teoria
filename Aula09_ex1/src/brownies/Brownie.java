package brownies;

public class Brownie {

    protected String nome;
    protected double preco;
    protected String sabor;
    static int precoTotal = 0;

    public Brownie(String nome, double preco, String sabor) {
        this.nome = nome;
        this.preco = preco;
        this.sabor = sabor;
    }

    public void mostraInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preco: " + preco);
        System.out.println("Sabor: " + sabor);
    }

    public void calculaValorTotalCompra() {
        System.out.println("Valor total ta compra: R$ " + precoTotal);
    }

    public void addCarrinhoDeCompras() {
        precoTotal += preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getSabor() {
        return sabor;
    }
}

