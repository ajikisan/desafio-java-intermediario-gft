package desafio.java.intermediario.gft;

/*
* Desafio: Diferença entre Dígitos
* O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto
*  e a soma dos seus digitos.
* Entrada
* • Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
* • A soma, basta realizar uma adição entre os dígitos.
* • A diferença, é necessário substrair o resultado final dos dois valores.
* Saída
* A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.
* Entrada
* 243
* Saída
* 15
* Explicação:
* Produto de dígitos = 2 * 3 * 4 = 24
* Soma dos dígitos = 2 + 3 + 4 = 9
* Resultado = 24 - 9 = 15
*
*
* */

import java.util.Arrays;
import java.util.Scanner;

public class DiferencaEntreDigitos {
          public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

              System.out.println("Digite uma cadeia de números : ");

            int numero = scan.nextInt();

            String numeroEmString = String.valueOf(numero);
            String[] split = numeroEmString.split("");

            int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

            // TODO: Retorne a diferença entre o produto e a soma dos dígitos.

            int produto = 1;     //P = Produto de digitos
            int soma = 0;       // S = Soma dos dígitos
            int resultado = 0;  // R = P - S

            if (numero !=0){
                for (int i=0; i < ints.length; i++){
                    produto = produto * ints[i];
                    soma = soma + ints[i];
                    resultado = produto - soma;
                }

                System.out.println(resultado);
            }else{
                System.out.println("Digite valor diferente de Zero.");
            }
        }
    }


