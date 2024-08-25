import java.time.LocalDate;

public class Receita {

    private String tipoReceita;
    private String descricao;
    private double valor;
    private LocalDate dataRecebimento;

    public Receita() {
    }

    public Receita(String tipoReceita, String descricao, double valor, LocalDate dataRecebimento) {
        this.tipoReceita = tipoReceita;
        this.descricao = descricao;
        this.valor = valor;
        this.dataRecebimento = dataRecebimento;
    }

    public void cadastrarReceita() {
        System.out.println("Receita cadastrada: " + descricao + ", Valor: " + valor);
    }
}

