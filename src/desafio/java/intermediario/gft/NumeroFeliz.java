package desafio.java.intermediario.gft;
/*
* Desafio Número Feliz
* Um número feliz é um número definido pelo seguinte processo:
* Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
* Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que
* não inclua 1.
* Aqueles números para os quais esse processo termina em 1 são felizes.
* Retorna true se n for um número feliz e false se não for.
*
* Escreva um algoritmo para determinar se o número n é feliz.
*
* Entrada
* A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se
* o número é feliz ou não.
*
* Saída
* Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.
*
* Confira exemplo abaixo:
* Exemplo 1
* Entrada:19
* Saída: true
* Exemplo 2
* Entrada: 2
* Saída: false
*
* Explicação:
* 1² + 9² = 82
* 8² + 2² = 68
* 6² + 8² = 100
* 1² + 0² + 0² = 1
*

*/

import java.util.Scanner;

public class NumeroFeliz {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int numero = leitor.nextInt();
        int soma = 0;
        int registra = numero;

        while ((registra > 9)) {
            while (registra > 0) {
                int restoDivisao = registra % 10;
                soma = soma + (int) Math.pow(restoDivisao, 2);
                registra = registra / 10;

            }
            registra = soma;
            soma = 0;
        }
        if (registra == 1) {
            System.out.println("true - Número Feliz: " + numero);
        } else {
            System.out.println("false - Número Triste: " + numero);
        }

    }
}
