public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Veiculo("Hatch", 60.0);
        System.out.println(carro);
        System.out.println("Custo para 5 dias: R$" + String.format("%.2f", carro.calcularCusto(5)));
        System.out.println("Custo para 10 dias com desconto: R$" + String.format("%.2f", carro.calcularCustoComDescontoProgressivo(10)));
        System.out.println("Multa por 3 dias de atraso: R$" + String.format("%.2f", carro.calcularMultaAtraso(3)));
    }
}
