package desafio.java.intermediario.gft;
/*
* Desafio
* Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
* Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para
* satisfazer seu apetite.
*
* Entrada
* A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
* Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia
* que  cada amigo deseja.
*
* Saída
* Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:
*
* Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim,
* pelo menos 2 pizzas devem ser encomendadas para ter o número necessário de fatias.
*
* Entrada
* 1
* 5
* Saída
* 2
*
* Explicação: Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias.
*  Assim, pelo menos 2 pizzas devem ser encomendadas para ter o número necessário de fatias.
*
*/

import java.util.Scanner;

public class QuantidadeNecessaria {

    public static void main(String[] args) {
        final int SLICE = 4;  // Cada pizza é composta por 4 fatias.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de testes deseja fazer :");
     int T = scanner.nextInt(); // T número de casos de teste.

        while (T-->0) {
            System.out.println("Digite a quantidade de amigos :");
            int N = scanner.nextInt(); // N para o número de amigos
            System.out.println("Digite a quantidade de fatias que 1 amigo deseja comer :");
            int X = scanner.nextInt(); // X para a quantidade de fatia que cada amigo deseja.

            if ((N * X) % SLICE == 0) {
                System.out.println("Quantidade de pizza " + (N * X) / SLICE);
            } else {
                System.out.println("Quantidade de pizza" + (N * X) / SLICE + 1);
            }
        }
    }
}