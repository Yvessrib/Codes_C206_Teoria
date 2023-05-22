public abstract class Brownie implements Comparable <Brownie>{

    String nome;
    int preco;

    public Brownie(String nome, int preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public int compareTo(Brownie o) {
        return  Integer.compare(o.preco,this.preco);
    }
}
