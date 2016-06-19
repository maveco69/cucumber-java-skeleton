#language: pt
#encoding: UTF-8
Funcionalidade: Calculadora

  Cenário: Somar dois elementos
    Dado informo o número "2"
    E informo o número "2"
    Quando realizo a soma
    Então o resultado será "4"

  Cenário: Subtrair dois numeros
    Dado informo o número "10"
    E informo o número "5"
    Quando realizo a subtração
    Então o resultado será "5"

  Cenario: Multiplicar dois elementos
    Dado informo o número "2"
    E informo o número "3"
    Quando realizo a multiplicação
    Então o resultado será "6"

  Cenario: Dividir dois numeros
    Dado informo o número "35"
    E informo o número "5"
    Quando realizo a divisão
    Então o resultado será "7"

  Cenário: Somar vários elementos
    Dado informo o número "2"
    E informo o número "2"
    E informo o número "2"
    Quando realizo a soma
    Então o resultado será "6"

  Cenario: Dividir por zero
    Dado informo o número "4"
    E informo o número "0"
    Quando realizo a divisão
    Então apresentar mensagem "Divisão por zero."

  Cenario: Informar a raiz quadrada
    Dado informo o número "9"
    Quando realizo a raiz quadrada
    Então o resultado será "3"

  Cenário: Somar dois elementos com ponto flutuante
    Dado informo o número "2,2"
    E informo o número "3"
    Quando realizo a soma
    Então o resultado será "5,2"