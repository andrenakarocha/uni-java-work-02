# Projeto Locadora de Veículos - Classe Veiculo

# Aluno:

## André Nakamatsu Rocha - RM 555004

Este projeto implementa uma classe `Veiculo` em Java para representar veículos de uma locadora.

## Funcionalidades Implementadas:

- Criação de objetos `Veiculo` com modelo e valor da diária.
- Cálculo do custo total do aluguel com base na quantidade de dias.
- Aplicação de desconto de 10% para aluguéis de 7 dias ou mais.
- Cálculo de multa por devolução atrasada (2% do valor da diária por dia de atraso).
- Implementação de descontos progressivos para aluguéis mais longos (10% para 10-14 dias, 15% para 15+ dias).
- Testes unitários abrangentes utilizando JUnit para validar o comportamento da classe, incluindo cenários normais e extremos.

## Como Executar os Testes:

Os testes unitários podem ser executados na IDE (com suporte a JUnit), utilizando Maven (`mvn test`) ou Gradle (`gradle test`), dependendo da configuração do projeto.

## Estrutura do Projeto:

```
├── src/
│   ├── main/
│   │     └── Main.java
    │     └── Veiculo.java
    └── teste/
│          └── VeiculoTest.java
└── README.md
```

## Observações:

- O construtor da classe `Veiculo` realiza a validação do valor da diária.
- Os métodos de cálculo de custo e multa também validam os parâmetros de entrada.
- Foram implementados descontos adicionais para demonstrar criatividade e cobrir mais cenários de negócio.
