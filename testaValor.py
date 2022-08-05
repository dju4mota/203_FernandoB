from math import pow

numero = float(input("Digite um número: "))

novoNumero = pow(numero, 3)

if novoNumero == 100:
    print("O número é 100")
elif novoNumero > 100:
    print(f"O número {novoNumero} é maior que 100")
else:
    print(f"O número {novoNumero} é menor que 100")
