# 🏦 Simulador Bancário em Java

Um sistema simples de gerenciamento bancário via linha de comando (CLI), desenvolvido para demonstrar conceitos fundamentais de Programação Orientada a Objetos (POO) em Java.

## 📋 Sobre o Projeto

Este projeto simula as operações básicas de um banco, permitindo a criação de contas, movimentação financeira e consulta de dados. O foco principal é a estruturação do código seguindo princípios de encapsulamento e separação de responsabilidades.
Funcionalidades

* **Criar Conta:** Gera um número de conta aleatório e vincula a um titular.
* **Depositar:** Adiciona saldo com validação de valores positivos.
* **Sacar:** Remove saldo com validação de disponibilidade financeira.
* **Transferir:** Move valores entre contas (valida a conta de origem, destino e saldo).
* **Listar Contas:** Exibe todas as contas cadastradas no banco (memória).

## 🚀 Tecnologias Utilizadas

* **Linguagem:** Java (JDK 8 ou superior)
* **Conceitos:**
    * Programação Orientada a Objetos (POO)
    * Encapsulamento (private, getters/setters)
    * Coleções (ArrayList)
    * Tratamento de Exceções (try-catch)

## 📂 Estrutura do Projeto

O código foi refatorado para separar responsabilidades em arquivos distintos:

| Arquivo     | Responsabilidade                                                                                               |
| ------------|:--------------------------------------------------------------------------------------------------------------:|
| Conta.java  | Modelo: Define o objeto Conta, seus atributos (saldo, número, titular) e regras de negócio (sacar, depositar). |
| Banco.java  | Gerenciador: Atua como o banco de dados em memória, armazenando e buscando as contas na lista.                 |
| Main.java   | Interface: Gerencia a interação com o usuário (Menu), entrada de dados e execução do programa.                 |


## 🧠 Aprendizados

Este projeto serve como exemplo prático de:

* Como interligar objetos em Java.
* Como proteger dados sensíveis usando modificadores de acesso.
* Como manipular listas dinâmicas de objetos.
* Lógica de programação para validação de transações financeiras.
