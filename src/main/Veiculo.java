import java.util.Scanner;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    /**
     * Construtor da classe Veiculo. (Requisito)
     * Inicializa um novo veículo com o modelo e o valor da diária.
     *
     * @param modelo      O modelo do veículo (String).
     * @param valorDiaria O valor da diária para alugar o veículo (double).
     * @throws IllegalArgumentException Se o valor da diária for menor ou igual a zero.
     */
    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria <= 0) {
            throw new IllegalArgumentException("O valor da diária deve ser positivo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    /**
     * Retorna o modelo do veículo.
     *
     * @return O modelo do veículo (String).
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Retorna o valor da diária do veículo.
     *
     * @return O valor da diária (double).
     */
    public double getValorDiaria() {
        return valorDiaria;
    }

    /**
     * Calcula o custo total do aluguel com base na quantidade de dias. (Requisito)
     * Aplica o desconto padrão, se elegível.
     *
     * @param dias A quantidade de dias de aluguel (int).
     * @return O custo total do aluguel (double).
     * @throws IllegalArgumentException Se o número de dias for negativo.
     */
    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("O número de dias não pode ser negativo.");
        }
        double custo = valorDiaria * dias;
        return descontoPadrao(dias, custo); // Chama o método de desconto padrão
    }

    /**
     * Aplica um desconto de 10% se o aluguel for por 7 dias ou mais. (Requisito)
     * Este método é privado e chamado por calcularCusto.
     *
     * @param dias      A quantidade de dias de aluguel (int).
     * @param custoBase O custo base do aluguel antes do desconto (double).
     * @return O custo do aluguel com o desconto aplicado (double).
     */
    private double descontoPadrao(int dias, double custoBase) {
        if (dias >= 7) {
            return custoBase * 0.9; // 10% de desconto
        }
        return custoBase;
    }

    /**
     * Calcula a multa por devolução atrasada. (Implementação Adicional)
     * A multa é calculada como 2% do valor da diária por dia de atraso.
     *
     * @param diasAtraso O número de dias de atraso na devolução (int).
     * @return O valor da multa por atraso (double).
     * @throws IllegalArgumentException Se o número de dias de atraso for negativo.
     */
    public double calcularMultaAtraso(int diasAtraso) {
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("Os dias de atraso não podem ser negativos.");
        }
        // Exemplo de multa: 2% do valor da diária por dia de atraso
        return valorDiaria * 0.02 * diasAtraso;
    }

    /**
     * Define a taxa de desconto progressivo com base no número de dias. (Implementação Adicional)
     *
     * @param dias A quantidade de dias de aluguel (int).
     * @return A taxa de desconto a ser aplicada (double).
     */
    public double descontoProgressivo(int dias) {
        if (dias >= 15) {
            return 0.85; // 15% de desconto para 15 dias ou mais
        } else if (dias >= 10) {
            return 0.90; // 10% de desconto para 10 a 14 dias
        }
        return 1.0; // Sem desconto progressivo adicional
    }

    /**
     * Calcula o custo total do aluguel com desconto progressivo aplicado. (Implementação Adicional)
     *
     * @param dias A quantidade de dias de aluguel (int).
     * @return O custo total do aluguel com desconto progressivo (double).
     * @throws IllegalArgumentException Se o número de dias for negativo.
     */
    public double calcularCustoComDescontoProgressivo(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("O número de dias não pode ser negativo.");
        }
        double custoBase = valorDiaria * dias;
        return custoBase * descontoProgressivo(dias);
    }

    /**
     * Retorna uma representação em String do objeto Veiculo.
     *
     * @return Uma String formatada com o modelo e o valor da diária do veículo.
     */
    @Override
    public String toString() {
        return "Veículo [modelo=" + modelo + ", valorDiaria=R$" + String.format("%.2f", valorDiaria) + "]";
    }
}
