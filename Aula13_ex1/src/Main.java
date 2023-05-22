public class Main {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Yves",126522246);
        Cliente c2 = new Cliente("Victor", 15207636);
        Cliente c3 = null;

        Conta conta = new Conta(2000,1000);

        conta.addCliente(c1);
        conta.addCliente(c2);
        conta.addCliente(c3);

        conta.mostraInfo();

        System.out.println("A main foi executada até o final");
    }
}