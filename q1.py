# Algoritmo BubbleSort implementado em Python
# Questão 01 da prova prática SERPRO 2023
# Apague os comentários para debug

def ordenacao(numeros):
 # print("\n")
 n=1
 while(n!=0):
  x=0
  n=0
  for y in range(x+1, len(numeros)):
   # print(str(numeros[x]) + " e " + str(numeros[y]))
   if(numeros[x] > numeros[y]):
    temp = numeros[y]
    numeros[y] = numeros[x]
    numeros[x] = temp
    n+=1
   x = y
  # print(numeros)
 return numeros

numeros = [8, 5, 4, 2, 1] #{set} = não pode ser um set pois um set é não-ordenado
print("Lista Desordenada: ")
print(numeros)
print("Lista Ordenada:\n" + str(ordenacao(numeros)))