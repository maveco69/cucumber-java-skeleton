#language: pt
#encoding: UTF-8
Funcionalidade: Calculadora
  Eu como um usuário
  Quero uma calculadora
  Para poder realizar cálculos matemáticos

  Cenario: Realizo a soma de dois elementos
    Dado que informo o número "2"
    Dado que informo o número "4"
    Quando realizo a soma dos números
    Entao o resultado deve ser "6"

  Cenario: Realizo a soma de três elementos
    Dado que informo o número "2"
    Dado que informo o número "4"
    Dado que informo o número "5,5"
    Quando realizo a soma dos números
    Entao o resultado deve ser "11,5"

  Cenario: Realizo a divisão de dois elementos inteiros
    Dado que informo o número "4"
    Dado que informo o número "2"
    Quando realizo a divisao dos números
    Entao o resultado deve ser "2"

  Cenario: Realizo a divisão de dois elementos com decimal
    Dado que informo o número "2"
    Dado que informo o número "1,6"
    Quando realizo a divisao dos números
    Entao o resultado deve ser "1,25"