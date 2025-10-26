# --- Importación de librerías ---
import pandas as pd        # Manejo y análisis estructurado de datos en formato tabular
import numpy as np         # Soporte para cálculos numéricos y generación de datos aleatorios
import matplotlib          # Biblioteca base para la creación de gráficos y visualizaciones
import chardet             # Detección automática de la codificación de archivos de texto
matplotlib.use('Agg')      # Evita errores de interfaz gráfica al generar imágenes sin entorno gráfico
import matplotlib.pyplot as plt  # Módulo de Matplotlib para crear y personalizar gráficos


# --- Detección de codificación del archivo ---
with open('employee_survey.csv', 'rb') as f:
    result = chardet.detect(f.read(50000))
    print(result)


# --- A) Lectura de datos y detección de valores nulos ---
datos = pd.read_csv("employee_survey.csv", encoding="ISO-8859-1")

# Mostrar nombres originales de las columnas
print("Columnas originales del CSV:")
print(datos.columns.tolist())

# Detección de valores nulos por columna
print("\nValores nulos por columna:")
print(datos.isna().sum())

# Eliminación opcional de filas con valores nulos
# (solo si existen datos faltantes que puedan afectar el análisis)
datos.dropna(inplace=True)


# --- B) Renombrar columnas ---
datos.rename(columns={
    "ID del empleado": "Empleado_Clave",
    "Fecha de incorporación": "Fecha_Contrato",
    "Género": "Genero_Empleado",
    "Puntuación de fatiga mental": "Fatiga_mental"
}, inplace=True)

# Confirmar cambio de nombres
print("\nColumnas renombradas:")
print(datos.columns.tolist())


# --- C) Crear columna Sueldo ficticia si no existe ---
if "Sueldo" not in datos.columns:
    np.random.seed(42)
    datos["Sueldo"] = np.random.randint(1800, 5500, size=len(datos))
    print("\nColumna 'Sueldo' creada con valores simulados.")


# --- D) Gráfico de barras: Género vs Sueldo ---
plt.figure(figsize=(8, 5))
plt.bar(datos["Genero_Empleado"], datos["Sueldo"], color="skyblue")
plt.title("Relación entre Género del Empleado y Sueldo")
plt.xlabel("Género del Empleado")
plt.ylabel("Sueldo")
plt.grid(axis='y')
plt.tight_layout()
plt.savefig("grafico_barras_genero_sueldo.png")
plt.close()


# --- E) Gráfico de dispersión: Sueldo vs Fatiga mental ---
plt.figure(figsize=(8, 5))
plt.scatter(datos["Sueldo"], datos["Fatiga_mental"], color="purple")
plt.title("Relación entre Sueldo y Fatiga Mental")
plt.xlabel("Sueldo del Empleado")
plt.ylabel("Nivel de Fatiga Mental")
plt.tight_layout()
plt.savefig("grafico_dispersion_sueldo_fatiga.png")
plt.close()


# --- F) Eliminación de la columna 'Sueldo' ---
datos.drop(columns=["Sueldo"], inplace=True)

print("\nColumna 'Sueldo' eliminada. Columnas finales:")
print(datos.columns)
