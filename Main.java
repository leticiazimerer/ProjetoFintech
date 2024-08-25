public class Main {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Leticia", "123.456.789-00", "leticia@example.com", "senha123", true);
        usuario.criarConta();

        Receita receita = new Receita("PIX", "Salário", 5000.00, java.time.LocalDate.now());
        receita.cadastrarReceita();

        Despesa despesa = new Despesa("Cartão de Crédito", "Compras", 300.00, java.time.LocalDate.now());
        despesa.cadastrarDespesa();

        Extrato extrato = new Extrato(java.util.Arrays.asList("Receita 1", "Despesa 1"));
        extrato.filtrarExtrato(30);
        extrato.mostrarTransacoes();

        GraficoGastos grafico = new GraficoGastos(java.util.Map.of("Compras", 300.00, "Salário", 5000.00));
        grafico.gerarGrafico();
    }
}
