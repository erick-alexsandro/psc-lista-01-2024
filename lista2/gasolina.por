programa {
    inclua biblioteca Matematica
  funcao inicio() {
    real price 
    real quantity

    escreva("O preço atual do litro da gasolina: ")
    leia(price)

    escreva("A quantidade de litro vendida: ")
    leia(quantity)

    escreva("Deverá ser pago R$", Matematica.arredondar(price * quantity, 2))
  }
}
