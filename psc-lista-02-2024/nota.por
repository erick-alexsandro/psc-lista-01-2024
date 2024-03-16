programa {
  inclua biblioteca Matematica
  funcao inicio() {
    real grade1
    real grade2
    real grade3
    real grade4

    escreva("Escreva a primeira nota: ")
    leia(grade1)
    
    escreva("Escreva a segunda nota: ")
    leia(grade2)

    escreva("Escreva a terceira nota: ")
    leia(grade3)

    escreva("Escreva a quarta nota: ")
    leia(grade4)

    escreva("A média foi ", Matematica.arredondar((grade1 + grade2 + grade3 + grade4)/4, 2))
  }
}
