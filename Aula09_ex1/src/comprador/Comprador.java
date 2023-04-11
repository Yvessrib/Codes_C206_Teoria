package comprador;

import brownies.Brownie;

public class Comprador {

    private String nome;
    private Double saldo;

    public Comprador(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    public void efetuarCompra(Brownie brownie){
        System.out.println("\n-------------");
        brownie.addCarrinhoDeCompras();
        brownie.calculaValorTotalCompra();
        System.out.println("Comprador comprou o brownie "+ brownie.getNome());
        saldo -= brownie.getPreco();
    }

    public Double getSaldo() {
        return saldo;
    }
}
