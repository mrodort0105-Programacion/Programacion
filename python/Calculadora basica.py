# --- CALCULADORA BÁSICA ---

# 1. Pedir y leer los dos números, convirtiéndolos a float.
try:
    num1 = float(input("Introduce el primer número: "))
    num2 = float(input("Introduce el segundo número: "))
except ValueError:
    print("¡ERROR! Por favor, introduce números válidos.")
    exit()

# 2. Pedir y leer la operación.
operacion = input("Introduce la operación (+, -, *, /): ")

# 3. Evaluar la operación seleccionada.

if operacion == '+':
    resultado = num1 + num2
    print(f"Resultado de la SUMA: {resultado}")

elif operacion == '-':
    resultado = num1 - num2
    print(f"Resultado de la RESTA: {resultado}")

elif operacion == '*':
    resultado = num1 * num2
    print(f"Resultado de la MULTIPLICACIÓN: {resultado}")

elif operacion == '/':
    # Manejar el caso especial de división por cero.
    if num2 != 0:
        resultado = num1 / num2
        print(f"Resultado de la DIVISIÓN: {resultado}")
    else:
        print("¡ERROR! No se puede dividir por cero.")

else:
    # Opción si la operación ingresada no coincide con ninguna de las anteriores.
    print("¡ERROR! Operación no válida.")
