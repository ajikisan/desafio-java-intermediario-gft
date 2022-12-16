### Desafio Técnico Intermediário GFT em Java
<p>Aluna: Mirian Ajiki Molicawa </p>
<p>Digital Innovation One </p>
<p>Data: 15/12/2022 </p>


### Desafio 1: Diferença entre Dígitos
<p> 
<p> O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto
<p> e a soma dos seus dígitos.
<p> Entrada: 234
<p> • Para encontrar o produto do valor, os dígitos deverão ser multiplicados.
<p>    Produto de dígitos = 2 * 3 * 4 = 24
<p> • A soma, basta realizar uma adição entre os dígitos.
<p>    Soma dos dígitos = 2 + 3 + 4 = 9
<p> • A diferença, é necessário substrair o resultado final dos dois valores.
<p> Saída
<p>   A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos.
<p>   Resultado = 24 - 9 = 15
<p>
<p>

### Desafio 2: Emboscada no RPG
<p>  Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados.
<p>  Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin.
<p>  Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens :
<p> 
<p> • Vida: Pontos que devem ser maiores que 0, se não o personagem morre.
<p> • Ataque: Pontos que definem quanto de dano ele inflingirá nos outros personagens.
<p> • Defesa: Pontos que definem quanto dano será mitigado quando ele levar um ataque.
<p> 
<p>  O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu ataque
<p>  ou a sua defesa. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma
<p>  deve ser DOBRADA.
<p> 
<p>  O dano causado ao jogador é calculado dessa forma:
<p>  vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))
<p> 
<p>  O dano causado ao inimigo é calculado dessa forma:
<p>  vidaDoInimigo - (ataqueDoJogador + dados)
<p> 
<p>  Caso o jogador sobreviva a emboscada, ele contra-ataca.
<p> 
<p>  Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar
<p>  esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.
<p> 
<p>  Entrada
<p>  A entrada serão seis parâmetros nessa ordem:
<p>  Dados;
<p>  Vida do Jogador;
<p>  Ataque do Jogador;
<p>  Defesa do Jogador
<p>  Vida do Inimigo;
<p>  Ataque do Inimigo;
<p> 
<p>  Saída
<p>  A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar
<p>  se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as
<p>  respectivas ocorrências.
<p> 


### Desafio 3: Flecha, Escudo ou Espada
<p>  Você e seus amigos estão em uma aula de criação de jogos. Para inspirar os alunos e treinar,
<p>  o professor pediu para que vocês fizessem um jogo que já existe com alguma modificação.
<p>  A escolha de vocês foi "Pedra, Papel e Tesoura" e a modificação foi mudar Pedra para
<p>  Flecha, Papel para Escudo e Tesoura para Espada.
<p> 
<p>  Então, vocês escolheram um número para representar cada um dos parâmetros, sendo:
<p>  1 - Flecha
<p>  2 - Escudo
<p>  3 - Espada
<p> 
<p> Entrada
<p>  A entrada vão ser dois números representando cada um dos parâmetros.
<p>  Sendo a primeira entrada o jogador e a segunda o inimigo.
<p> 
<p>  Saída
<p>  A saída deve ser se o jogador ganhou, empatou ou perdeu após a análise das duas entradas.
<p>


### Desafio 4: Número Feliz
<p> Um número feliz é um número definido pelo seguinte processo:
<p> Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.
<p> Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que
<p> não inclua 1.
<p> Aqueles números para os quais esse processo termina em 1 são felizes.
<p> Retorna true se n for um número feliz e false se não for.


### Desafio 5: Quantidade Necessária
<p> Cada pizza é composta por 4 fatias. Há N amigos e cada amigo precisa de exatamente X fatias.
<p> Você deverá criar um código capaz de calcular o número mínimo de pizzas que eles devem pedir para
<p> satisfazer seu apetite.
<p>
<p> Entrada
<p> A primeira linha de entrada conterá um único inteiro T, indicando o número de casos de teste.
<p> Cada caso de teste consiste em dois inteiros. N para o número de amigos e X para a quantidade de fatia
<p> que  cada amigo deseja.
<p>
<p> Saída
<p> Para cada caso de teste, produza o número mínimo de pizzas necessário, conforme o exemplo a baixo:
<p>
<p> Existe apenas 1 amigo que precisa 5 fatias. Se ele mandar 1 pizza, ele receberá apenas 4 fatias. Assim,
<p> pelo menos 2 pizzas devem ser encomendadas para ter o número necessário de fatias.
