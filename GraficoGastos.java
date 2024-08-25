import java.util.Map;

public class GraficoGastos {

    private Map<String, Double> categorias;

    public GraficoGastos() {
    }

    public GraficoGastos(Map<String, Double> categorias) {
        this.categorias = categorias;
    }

    public void gerarGrafico() {
        System.out.println("Gerando gráfico de gastos.");
    }
}

