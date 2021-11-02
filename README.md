# Robô Irrigador :robot::leaves:
Robô programado para realizar a irrigação de uma horta a partir de algumas informações que são inseridas no mesmo.

####	Rodando o projeto

* Clone o projeto para sua máquina.
* Abra-o em uma IDE de sua preferência.
*  Rode o projeto
* (Foi idealizado para rodar no console)

####	O projeto

O projeto foi desenvolvido com uma simples divisão de tarefas. A classe...

- Interface do Usuário, é responsável por apresentar as informações para o usuário.
- Validação do Sistema, é responsável por receber e validar informações do usuário.
- Horta, tem os atributos: linha e coluna - (A fim de que a horta possa ser dimensionada pela quantidade de linhas e colunas). E o método: mostrar horta - (A fim de mostrar a horta no console)
- Posição, tem os atributos: linha e coluna - (A fim de servir como coordenada dentro da horta)
- Robô, tem os atributos: orientação atual, posição atual e trajeto do robô - Lista de string - (A fim de configurar/controlar o robô para movimenta-lo). E o método: meu trajeto - (A fim de saber as melhores decisões para irrigar todos os canteiros solicitados).
- Irrigação, tem os atributos Horta, Robô e Posições para irrigar e o método Inicializar horta a fim de criar o momento da irrigação
