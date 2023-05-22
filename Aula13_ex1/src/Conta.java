import java.util.HashSet;
import java.util.Set;

public class Conta {

    private float saldo;
    private float limite;
    private Set<Cliente> clientes = new HashSet<>();

    public Conta(float saldo, float limite) {
        this.saldo = saldo;
        this.limite = limite;
    }

    public void addCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public void mostraInfo() {
        System.out.println("Saldo: " + saldo);
        System.out.println("Limite: " + limite);

        for(Cliente cliente : clientes){
            try{
                System.out.println("Nome do cliente: " + cliente.getNome());
                System.out.println("Cpf do cliente: " + cliente.getCpf());
            }catch (NullPointerException e){
                System.out.println("Não existe cliente nessa posição");
                System.out.println("O erro: " + e + " foi encontrado");
            }
        }
    }
}
