import java.util.List;

public class Extrato {

    private List<String> transacoes;

    public Extrato() {
    }

    public Extrato(List<String> transacoes) {
        this.transacoes = transacoes;
    }

    public void filtrarExtrato(int dias) {
        System.out.println("Filtrando extrato dos últimos " + dias + " dias.");
    }

    public void mostrarTransacoes() {
        System.out.println("Exibindo transações.");
    }
}

