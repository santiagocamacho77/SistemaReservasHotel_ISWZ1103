# 🏨 Sistema de Gestión de Reservas – Hotel Cielo Verde

> Aplicación Java desarrollada como parte de la **Consigna Formativa RC5** para la materia **Programación II (ISWZ1103)** en la Universidad de las Américas.

---

## 🎯 Objetivo del Proyecto

Desarrollar un sistema básico de gestión de reservas hoteleras aplicando los principios fundamentales de la **Programación Orientada a Objetos (POO)**, trabajando colaborativamente en equipo y respetando la distribución de roles técnicos y funcionales.

---

## 👨‍💻 Roles del Equipo

| Integrante         | Rol                                   | Responsabilidades principales                                                                 |
|--------------------|----------------------------------------|-----------------------------------------------------------------------------------------------|
| 🟦 **Santiago Camacho** | Líder de equipo y Diseñador de clases | Estructura del sistema, diseño de clases `Hotel`, `Habitación` y `Reserva`, coordinación general. |
| 🟨 **Liliana Sibri**     | Programadora Principal               | Implementación de métodos y lógica interna, creación de reservas, subida del código a GitHub.     |
| 🟩 **Santiago Ramírez**  | Tester y Documentador                | Consultas de disponibilidad, pruebas completas del sistema, evidencias y documentación.         |

---

## 🔧 Funcionalidades Implementadas

- ✅ Ver disponibilidad de habitaciones
- ✅ Crear una nueva reserva
- ✅ Mostrar detalle de cada reserva con nombre, habitación, tipo, precio y fecha
- ✅ Manejo de habitaciones por tipo (estándar o suite) con precio diferente
- ✅ Consola interactiva para usuario

---

## 🧱 Clases Java Utilizadas

### 🟦 `Hotel.java`
> 🖋 *Diseño por Santiago Camacho*  
> 💻 *Programación por Liliana Sibri*

Maneja la lógica central del sistema: lista de habitaciones, reservas, cargar habitaciones demo, mostrar disponibilidad y crear reservas.

---

### 🟦 `Habitacion.java`
> 🖋 *Diseño por Santiago Camacho*  
> 💻 *Programación por Liliana Sibri*

Representa cada habitación del hotel. Tiene atributos como número, tipo y estado (disponible/ocupada). Calcula el precio según el tipo.

---

### 🟦 `Reserva.java`
> 🖋 *Diseño por Santiago Camacho*  
> 💻 *Programación por Liliana Sibri*

Guarda los datos de una reserva específica, como el nombre del cliente, la habitación asignada y la fecha.

---

### 🟨 `Main.java`
> 💻 *Programación conjunta por Santiago Camacho y Liliana Sibri*  
> 🔍 *Probado por Santiago Ramírez*

Interfaz de consola simple que permite al usuario elegir entre ver disponibilidad, crear una reserva o salir.

---

## 🧪 Pruebas del Sistema

> 🟩 *Realizadas por Santiago Ramírez*

Las pruebas se centraron en:
- Verificar la correcta reserva de habitaciones disponibles
- Intentar reservar habitaciones ya ocupadas
- Comprobar el mensaje de habitación no encontrada
- Verificar el correcto cálculo del precio

📂 Las evidencias se encuentran en la carpeta `/evidencias`.

---

## 📂 Estructura del Proyecto
## 🧠 Aprendizajes y Reflexión

Este proyecto nos permitió aplicar los pilares fundamentales de la **Programación Orientada a Objetos (POO)** en un caso práctico y realista. Además, reforzamos habilidades blandas como el trabajo colaborativo, planificación de tareas y comunicación en equipo.

### 🔑 Principios aplicados:
- Encapsulamiento y abstracción de clases.
- Separación de responsabilidades por clase y por integrante.
- Uso de colecciones (`ArrayList`) para manejar habitaciones y reservas.
- Gestión de flujo mediante `Scanner` en consola para la interacción con el usuario.

---

## 🛠 Herramientas utilizadas

- 💻 **Lenguaje:** Java
- 🧠 **IDE:** IntelliJ IDEA
- 🗂️ **Control de versiones:** Git + GitHub
- 📸 **Evidencias:** Capturas y video almacenados en `/evidencias`
- 🧪 **Pruebas:** Manuales con diferentes escenarios de reserva

---

## 📦 Repositorio del Proyecto

Puedes consultar el código completo y las evidencias en el siguiente enlace:

🔗 [https://github.com/santiagocamacho77/SistemaReservasHotel_ISWZ1103](https://github.com/santiagocamacho77/SistemaReservasHotel_ISWZ1103)


---

## 🏁 Conclusión

Trabajar en este sistema nos permitió simular cómo se organiza un equipo real de desarrollo de software. A través del reparto de roles, el uso de GitHub y la integración del código, logramos cumplir con los objetivos de la consigna y entregar un producto funcional, limpio y bien documentado.

---

## ✍️ Créditos

- 👨‍💼 **Santiago Camacho** – Líder de equipo, diseñador de clases y estructura general.
- 👩‍💻 **Liliana Sibri** – Programación principal e implementación de lógica de reservas.
- 🧪 **Santiago Ramírez** – Pruebas funcionales, evidencias y documentación del proyecto.

---

📅 *Trabajo realizado en mayo de 2025 para la asignatura Programación II – Universidad de las Américas (UDLA)*



