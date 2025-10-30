# Inicializamos la variable de suma
suma_total = 0

# Iteramos desde el número 100 hasta el 1 (range(100, 0, -1) incluye el 100 y excluye el 0)
for numero in range(100, 0, -1):
    # Acumulamos cada número a la suma total
    suma_total = suma_total + numero

print("La suma de los números del 100 al 1 es:", suma_total)
# Output: 5050
