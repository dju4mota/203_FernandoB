class Pessoa():
    nome = None
    idade = None
    sexo = None

    def __init__(self, nome, idade, sexo):
        self.nome = nome
        self.idade = idade
        self.sexo = sexo


class Cidadao(Pessoa):
    cpf = None

    def __init__(self, nome, idade, sexo, cpf):
        super().__init__(nome, idade, sexo)
        self.cpf = cpf

    def mostraInfo(self):
        print("Nome: " + self.nome)
        print("Idade: " + str(self.idade))
        print("Sexo: " + self.sexo)
        print("CPF: " + self.cpf)

nome = input("Digite o nome: ")
idade = input("Digite a idade: ")
sexo = input("Digite o sexo: ")
cpf = input("Digite o cpf: ")

cidadao = Cidadao(nome, idade, sexo, cpf)

cidadao.mostraInfo()
