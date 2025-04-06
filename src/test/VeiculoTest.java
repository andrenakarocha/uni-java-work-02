import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    void testCalcularCustoAluguelCurto() {
        // Testa o cálculo do custo para um período curto sem desconto. (Requisito)
        Veiculo carro = new Veiculo("Sedan", 50.0);
        assertEquals(150.0, carro.calcularCusto(3), 0.001);
    }

    @Test
    void testCalcularCustoAluguelLongoComDescontoPadrao() {
        // Testa o cálculo do custo para um período longo com o desconto padrão de 10%. (Requisito)
        Veiculo carro = new Veiculo("SUV", 100.0);
        assertEquals(630.0, carro.calcularCusto(7), 0.001); // 100 * 7 * 0.9
    }

    @Test
    void testDescontoNaoAplicado() {
        // Testa se o desconto padrão não é aplicado para um período menor que 7 dias. (Requisito)
        Veiculo moto = new Veiculo("Scooter", 30.0);
        assertEquals(120.0, moto.calcularCusto(4), 0.001);
    }

    @Test
    void testCalcularMultaAtraso() {
        // Testa o cálculo da multa por atraso na devolução. (Implementação Adicional)
        Veiculo caminhao = new Veiculo("Caminhão", 200.0);
        assertEquals(8.0, caminhao.calcularMultaAtraso(2), 0.001); // 200 * 0.02 * 2
    }

    @Test
    void testDescontoProgressivoPara10Dias() {
        // Testa o cálculo do custo com desconto progressivo para 10 dias. (Implementação Adicional)
        Veiculo van = new Veiculo("Van", 150.0);
        assertEquals(1350.0, van.calcularCustoComDescontoProgressivo(10), 0.001); // 150 * 10 * 0.9
    }

    @Test
    void testDescontoProgressivoPara15DiasOuMais() {
        // Testa o cálculo do custo com desconto progressivo para 15 dias ou mais. (Implementação Adicional)
        Veiculo onibus = new Veiculo("Ônibus", 300.0);
        assertEquals(3825.0, onibus.calcularCustoComDescontoProgressivo(15), 0.001); // 300 * 15 * 0.85
    }

    @Test
    void testCalcularCustoZeroDias() {
        // Testa o cálculo do custo para 0 dias de aluguel. (Teste de Cenário Extremo)
        Veiculo bicicleta = new Veiculo("Bicicleta", 10.0);
        assertEquals(0.0, bicicleta.calcularCusto(0), 0.001);
    }

    @Test
    void testCriarVeiculoComValorDiariaNegativo() {
        // Testa a tentativa de criar um veículo com valor da diária negativo. (Teste de Cenário Extremo)
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("Carro Antigo", -50.0));
    }

    @Test
    void testCalcularCustoComDiasNegativos() {
        // Testa a tentativa de calcular o custo com um número negativo de dias. (Teste de Cenário Extremo)
        Veiculo jetski = new Veiculo("Jetski", 80.0);
        assertThrows(IllegalArgumentException.class, () -> jetski.calcularCusto(-2));
    }

    @Test
    void testCalcularMultaComDiasAtrasoNegativos() {
        // Testa a tentativa de calcular a multa com um número negativo de dias de atraso. (Teste de Cenário Extremo)
        Veiculo lancha = new Veiculo("Lancha", 250.0);
        assertThrows(IllegalArgumentException.class, () -> lancha.calcularMultaAtraso(-1));
    }
}
