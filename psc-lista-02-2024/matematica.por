programa {
  inclua biblioteca Matematica
  funcao inicio() {
    real number1
    real number2

    escreva("Escreva o primeiro n�mero: ")
    leia(number1)
    
    escreva("Escreva o segundo n�mero: ")
    leia(number2)

    escreva(number1, " + ", number2, " = ", Matematica.arredondar(number1 + number2, 2), "\n")
    escreva(number1, " - ", number2, " = ", Matematica.arredondar(number1 - number2, 2), "\n")
    escreva(number1, " X ", number2, " = ", Matematica.arredondar(number1 * number2, 2))
    
  }
}
