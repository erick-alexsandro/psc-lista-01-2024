programa {
  inclua biblioteca Matematica
  funcao inicio() {
    real germanyPrice
    real portugalPrice
    real italyPrice
    inteiro groupOf

    escreva("O preço atual da passagem para a Alemanha: ")
    leia(germanyPrice)

    escreva("O preço atual da passagem para Portugal: ")
    leia(portugalPrice)

    escreva("O preço atual da passagem para a Itália: ")
    leia(italyPrice)

    escreva("Número de pessoas que farão as viagens: ")
    leia(groupOf)

    real total = (germanyPrice + portugalPrice + italyPrice)*groupOf

    escreva("O valor total é de R$", Matematica.arredondar(total, 2))
  }
}
