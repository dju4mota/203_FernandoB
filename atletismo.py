class Pessoa():
    nome = None
    idade = None

    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def envelhecer(self):
        self.idade += 1
        
class Atleta(Pessoa):
    peso = None
    aposentado = None

    def __init__(self, nome, idade, peso):
        super().__init__(nome, idade)
        self.peso = peso
    
    def aquecer(self):
        print("Atleta aquecido")

    def aposentar(self):
        self.aposentado = True
    
class Corredor(Atleta):

    def correr(self):
        print("Corredor correndo ...")

class Nadador(Atleta):

    def nadar(self):
        print("Nadador nadando ...")

class Ciclista(Atleta):

    def pedalar(self):
        print("Ciclista pedalando ...")

    
# corredor
corredor1 = Corredor("Vanderlei", 27, 75)
corredor1.aquecer()
corredor1.correr()

# nadador
nadador1 = Nadador("Vanderlei", 27, 75)
print("Esta aposentado?")
if nadador1.aposentado:
    print("Sim")
else:
    print("Não")

nadador1.nadar()
nadador1.envelhecer()
nadador1.aposentar()