<h1 align="center"> 🚗💨 Projeto Locadora de Veículos - Classe Veiculo 💨🚗</h1>

**Aluno:** André Nakamatsu Rocha - RM 555004

Este projeto desenvolve uma classe `Veiculo` em Java ☕ para gerenciar os veículos de uma locadora, oferecendo funcionalidades essenciais e extras para uma experiência completa!

## ✨ Funcionalidades Implementadas ✨

- **➕ Criação de Veículos:** Inicialize objetos `Veiculo` com seu modelo (🛻, 🏍️, 🚌) e o valor da diária (💰).
- **🗓️ Cálculo de Aluguel:** Estime o custo total do aluguel baseado no número de dias (🔢).
- **📉 Desconto Padrão:** Receba um desconto de 10% ao alugar por 7 dias ou mais! 🎉
- **⏰ Multa por Atraso:** Calcule a multa por devolver o veículo após o prazo (2% do valor da diária por dia de atraso ⚠️).
- **🪜 Descontos Progressivos:** Alugue por mais tempo e pague menos!
  - 10 dias ou mais: 10% de desconto 🤩
  - 15 dias ou mais: 15% de desconto 🥳
- **✅ Testes Unitários:** Validação robusta do comportamento da classe com JUnit, cobrindo cenários normais e também situações extremas (🚫 0 dias, valores negativos).

## 🧪 Como Executar os Testes 🧪

Para garantir a qualidade do código, os testes unitários podem ser facilmente executados através da sua IDE preferida (com suporte a JUnit), ou utilizando as ferramentas de build:

- **Maven:** Execute `mvn test` no seu terminal. <img src="https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=ApacheMaven&logoColor=white" alt="Maven"/>
- **Gradle:** Execute `gradle test` no seu terminal. <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=Gradle&logoColor=white" alt="Gradle"/>

## 📂 Estrutura do Projeto 📂

```
├── src/
│   ├── main/
│   │   ├── Main.java         # Classe principal com interação do usuário
│   │   └── Veiculo.java      # Classe que representa o veículo
│   └── test/
│       └── VeiculoTest.java  # Classe com os testes unitários
└── README.md                     # Este arquivo! 📖
```

## 💡 Observações Adicionais 💡

- O construtor da classe `Veiculo` verifica se o valor da diária é válido (positivo!). 👍
- Os métodos de cálculo (custo e multa) também validam as entradas para evitar erros inesperados. 🛡️
- A implementação dos descontos progressivos demonstra uma abordagem criativa para incentivar aluguéis de longa duração. 🚀

```
git clone https://github.com/dolthub/dolt
cd Projeto-Locadora-Veiculos
```

Divirta-se explorando o código e não hesite em contribuir! 😉
