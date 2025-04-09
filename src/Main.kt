// 📌 Projeto: Simulador de Caixa Eletrônico
// 🎯 Objetivo: Criar um menu interativo que permita o usuário consultar saldo, depositar, sacar e sair do sistema.
// 🧠 Conceitos-chave: loops, when, entrada de dados, controle de fluxo e validação de input.

fun main() {

    // 1️⃣ Crie uma variável mutável para armazenar o saldo inicial (ex: 1000.0).
    // Dica: use Double para representar dinheiro com casas decimais.
    var saldo: Double = 1000.0
    // 2️⃣ Inicie um loop que continue rodando até o usuário escolher sair.
    // Dica: use um `do-while` para mostrar o menu ao menos uma vez.
    do {
        // 3️⃣ Dentro do loop, exiba o menu com as opções:
        // 1 - Consultar saldo
        // 2 - Depositar
        // 3 - Sacar
        // 0 - Sair
        // Dica: use println para mostrar e readln().toIntOrNull() para ler a opção.
        println("\n========= MENU DO CAIXA ELETRÔNICO =========")
        println("1️⃣  Consultar saldo")
        println("2️⃣  Depositar")
        println("3️⃣  Sacar")
        println("0️⃣  Sair")
        println("============================================")
        print("👉 Escolha uma opção: ")

        val opcao = readln().toIntOrNull()

        when (opcao) {
            1 -> println("\n💰 Saldo atual: R$ %.2f".format(saldo))
            2 -> {
                print("\n💵 Quanto deseja depositar? R$: ")
                val valorDeposito = readln().toDoubleOrNull()

                if (valorDeposito != null && valorDeposito > 0) {
                    saldo += valorDeposito
                    println("Depositado com sucesso")
                    println("Saldo atual: R$ %.2f".format(saldo))
                } else {
                    println("Valor invalido para deposito.")
                }
            }

            3 -> {
                print("\n🏧 Quanto deseja sacar? R$: ")
                val valorSaque = readln().toDoubleOrNull()

                if (valorSaque != null && valorSaque > 0) {
                    if (valorSaque < saldo)
                        saldo -= valorSaque
                    println("Saque realizado com sucesso.")

                } else {
                    println("Saldo insuficiente. Seu saldo é de R$ %.2f".format(saldo))

                }
            }

            0 -> println("Encerrando o sistema. Até logo!")

            else -> println("Opcao invalida tente novamente!")

        }
        println("--------------------------------------------")
    } while (opcao != 0)

}