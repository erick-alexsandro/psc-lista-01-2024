programa {
    inclua biblioteca Matematica
  funcao inicio() {
    real price 
    real quantity

    escreva("O pre�o atual do litro da gasolina: ")
    leia(price)

    escreva("A quantidade de litro vendida: ")
    leia(quantity)

    escreva("Dever� ser pago R$", Matematica.arredondar(price * quantity, 2))
  }
}
