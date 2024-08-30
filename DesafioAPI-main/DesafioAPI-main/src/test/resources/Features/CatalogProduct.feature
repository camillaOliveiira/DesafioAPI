#language: pt
#Author: Camila Oliveira
#Version: 1.0
#Encoding: UTF-8

Funcionalidade:  Pesquisar produto

  @TESTEcamila
  Cenario: Pesquisar um produto Mice
    Dado que quero pesquisar pelo produto Mice
    Quando realizo a requisição
    Entao valido que o status code é 200
    E valido que a categoria retornada é Mice