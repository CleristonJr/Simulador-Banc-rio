import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta c : contas) {
            if (c.getNumeroConta() == numero) {
                return c;
            }
        }
        return null;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
