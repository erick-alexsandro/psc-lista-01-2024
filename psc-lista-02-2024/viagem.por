programa {
  inclua biblioteca Matematica
  funcao inicio() {
    real germanyPrice
    real portugalPrice
    real italyPrice
    inteiro groupOf

    escreva("O pre�o atual da passagem para a Alemanha: ")
    leia(germanyPrice)

    escreva("O pre�o atual da passagem para Portugal: ")
    leia(portugalPrice)

    escreva("O pre�o atual da passagem para a It�lia: ")
    leia(italyPrice)

    escreva("N�mero de pessoas que far�o as viagens: ")
    leia(groupOf)

    real total = (germanyPrice + portugalPrice + italyPrice)*groupOf

    escreva("O valor total � de R$", Matematica.arredondar(total, 2))
  }
}
