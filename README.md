# 🚀 Exercícios de Algoritmos e Programação - Java 

Este repositório contém as soluções em **Java** para a lista de exercícios da disciplina de **Programação de Soluções Computacionais**. Os exercícios práticos focam na manipulação de coleções dinâmicas utilizando a classe `ArrayList` e na lógica de estruturas condicionais e de repetição.

---
🏫 **Instituição:** Centro Universitário UNA  
📚 **Disciplina:** Algoritmos e Programação / Programação de Soluções Computacionais  
👨‍🏫 **Professor:** Daniel Henrique Matos de Paiva  
---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java (versão 8 ou superior)
* **Estrutura de Dados:** `java.util.ArrayList`
* **Entrada de Dados:** `java.util.Scanner` (Configuração regional padrão brasileira - decimais utilizam `,`)

---

## 📋 Descrição dos Exercícios

### 🌡️ 1. Média de Temperaturas Anuais (`Exercicio1.java`)
Recebe a temperatura média de cada um dos 12 meses do ano e as armazena em uma lista. 
* Calcula a média anual das temperaturas.
* Exibe todas as temperaturas que ficaram acima da média anual, acompanhadas pelo nome do mês por extenso (ex: 1 – Janeiro, 2 – Fevereiro...).

### 🕵️‍♂️ 2. Investigação Criminal (`Exercicio2.java`)
Utiliza um `ArrayList` para gerenciar 5 perguntas direcionadas a um suspeito de um crime:
1. *"Telefonou para a vítima?"*
2. *"Esteve no local do crime?"*
3. *"Mora perto da vítima?"*
4. *"Devia para a vítima?"*
5. *"Já trabalhou com a vítima?"*

O programa analisa as respostas positivas (`"sim"`) e emite uma classificação:
* **2 respostas:** Suspeita
* **3 a 4 respostas:** Cúmplice
* **5 respostas:** Assassino
* **Menos de 2:** Inocente

### 📊 3. Análise Estatística de Notas (`Exercicio3.java`)
Lê uma quantidade indeterminada de notas informadas pelo usuário, encerrando a entrada de dados quando o valor `-1` for digitado. Ao final, o programa processa a lista e exibe:
* A quantidade de valores lidos.
* Todos os valores na ordem em que foram informados (lado a lado).
* Todos os valores na ordem inversa (um abaixo do outro).
* A soma de todas as notas.
* A média aritmética das notas.
* A quantidade de notas que ficaram acima da média calculada.
* A quantidade de notas que ficaram abaixo do valor 7,0.
* Mensagem personalizada de encerramento.

### 💰 4. Faixas de Comissão de Vendedores (`Exercicio4.java`)
Resolve o problema de cálculo de rendimentos de vendedores com base em comissão. Cada vendedor recebe \$200 fixos por semana mais 9% das suas vendas brutas. 

O programa utiliza um `ArrayList` como um **array de contadores** para agrupar e exibir quantos vendedores receberam salários dentro de cada uma das seguintes faixas:
* \$200 - \$299
* \$300 - \$399
* \$400 - \$499
* \$500 - \$599
* \$600 - \$600
* \$700 - \$799
* \$800 - \$899
* \$900 - \$999
* \$1000 em diante

---

## 🚀 Como Executar o Projeto

1. Certifique-se de ter o **JDK (Java Development Kit)** instalado na sua máquina.
2. Clone este repositório:
   ```bash
   git clone https://github.com
   ```
3. Acesse a pasta do projeto e compile os arquivos desejados via terminal:
   ```bash
   javac Exercicio1.java
   ```
4. Execute o programa compilado:
   ```bash
   java Exercicio1
   ```

📌 *Nota importante: Como o projeto não utiliza a importação `Locale`, certifique-se de digitar números decimais utilizando a **vírgula** (ex: `25,5` e não `25.5`) se o seu sistema operacional estiver configurado em português.*
