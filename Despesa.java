import java.time.LocalDate;

public class Despesa {

    private String tipoDespesa;
    private String descricao;
    private double valor;
    private LocalDate dataPagamento;

    public Despesa() {
    }

    public Despesa(String tipoDespesa, String descricao, double valor, LocalDate dataPagamento) {
        this.tipoDespesa = tipoDespesa;
        this.descricao = descricao;
        this.valor = valor;
        this.dataPagamento = dataPagamento;
    }

    public void cadastrarDespesa() {
        System.out.println("Despesa cadastrada: " + descricao + ", Valor: " + valor);
    }
}

