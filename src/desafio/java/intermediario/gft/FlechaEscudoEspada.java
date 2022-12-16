package desafio.java.intermediario.gft;

/*
* Desafio: Flecha, Escudo ou Espada
* Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar,
* o professor pediu para que vocês fizessem um jogo que já existe com alguma modificação.
* A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar Pedra para *
*  Flecha, Papel para Escudo e Tesoura para Espada.
*
* Então, vocês escolheram um número para representar cada um dos parâmetros. Sendo:
1 - Flecha
2 - Escudo
3 - Espada

Entrada
* A entrada vão ser dois números representando cada um dos parâmetros.
* Sendo a primeira entrada o jogador e a segunda o inimigo.

* Saída
* A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas.
* A saída deve ser sem as aspas.

* ENTRADA
1
1
SAIDA
"Empatou"

ENTRADA
1
2
SAIDA
"Perdeu"

ENTRADA
3
2
SAIDA
"Ganhou"
* */

import java.util.Scanner;

public class FlechaEscudoEspada {

    public static void main(String[] args) {
        // write your code here

        Scanner leitor = new Scanner(System.in);
        System.out.println("Jogador nº1. Digite um número de 1 a 3 (1-Flecha, 2-Escudo ou 3 Espada)");
        int jogadaJogador = leitor.nextInt();
        System.out.println("Jogador nº2. Digite um número de 1 a 3 (1-Flecha, 2-Escudo ou 3 Espada)");
        int jogadaInimigo = leitor.nextInt();

        if (jogadaJogador == 1){
            if (jogadaInimigo == 1){
                System.out.println("Empatou, ambos foram flechados");
            } else if(jogadaInimigo == 2){
                System.out.print("Perdeu, jogador nº2 defendeu a flecha do jogador nº 1 com o escudo");
            } else if(jogadaInimigo == 3){
                System.out.print("Ganhou, jogador nº2 usou a espada e foi flechado pelo jogador nº1.");
            }
        } else if(jogadaJogador == 2){
            if (jogadaInimigo == 1){
                System.out.print("Ganhou, jogador nº1 se defendeu da flecha do jogador nº2 com escudo");
            } else if(jogadaInimigo == 2){
                System.out.print("Empatou, ambos usaram escudo");
            } else if(jogadaInimigo == 3){
                System.out.print("Perdeu, jogador nº2 quebrou o escudo do jogador  nº1 com a espada");
            }
        } else if(jogadaJogador == 3){
            if (jogadaInimigo == 1){
                System.out.print("Perdeu, jogador nº2 usou a flecha e jogador nº1 estava usando espada");
            } else if(jogadaInimigo == 2){
                System.out.print("Ganhou, jogador nº1 quebrou o escudo do jogador nº2 com a espada");
            } else if(jogadaInimigo == 3){
                System.out.print("Empatou, ambos usaram espada");
            }
        }
    }
}