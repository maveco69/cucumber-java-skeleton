#language: pt
#encoding: UTF-8
Funcionalidade: Calculadora
  Eu como um usu�rio
  Quero uma calculadora
  Para poder realizar c�lculos matem�ticos

  Cenario: Realizo a soma de dois elementos
    Dado que informo o n�mero "2"
    Dado que informo o n�mero "4"
    Quando realizo a soma dos n�meros
    Entao o resultado deve ser "6"

  Cenario: Realizo a soma de tr�s elementos
    Dado que informo o n�mero "2"
    Dado que informo o n�mero "4"
    Dado que informo o n�mero "5,5"
    Quando realizo a soma dos n�meros
    Entao o resultado deve ser "11,5"

  Cenario: Realizo a divis�o de dois elementos inteiros
    Dado que informo o n�mero "4"
    Dado que informo o n�mero "2"
    Quando realizo a divisao dos n�meros
    Entao o resultado deve ser "2"

  Cenario: Realizo a divis�o de dois elementos com decimal
    Dado que informo o n�mero "2"
    Dado que informo o n�mero "1,6"
    Quando realizo a divisao dos n�meros
    Entao o resultado deve ser "1,25"