# 📚 Gestión de Tareas Académicas - Arquitectura Hexagonal

## 📌 Descripción

Este proyecto consiste en el desarrollo de una aplicación básica para la gestión de tareas académicas, implementada en Java y estructurada bajo el enfoque de arquitectura hexagonal (Ports & Adapters).

La aplicación permite a un usuario crear, listar y completar tareas, facilitando el seguimiento de actividades pendientes de forma organizada.

---

## 🎯 Problema que resuelve

Muchas veces los estudiantes no cuentan con una herramienta simple para organizar sus tareas académicas.
Este sistema permite registrar y controlar dichas tareas de manera estructurada.

---

## ⚙️ Funcionalidades

* Registrar una tarea
* Listar tareas
* Marcar tarea como completada
* Validar que el título no esté vacío
* Identificar tareas por ID

---

## 🧠 Arquitectura utilizada

Se implementa el patrón de arquitectura hexagonal, el cual separa el sistema en diferentes capas:

### 🔹 Dominio

Contiene la lógica de negocio principal.

* Tarea.java
* Reglas:

  * El título no puede estar vacío
  * Una tarea puede cambiar su estado a completada

---

### 🔹 Casos de uso (Application)

Contienen la lógica de la aplicación:

* CrearTarea.java
* ListarTareas.java
* CompletarTarea.java

---

### 🔹 Puertos (Ports)

Definen contratos que conectan el dominio con el exterior:

* TareaRepository.java (interfaz)

---

### 🔹 Adaptadores (Infrastructure)

**Adaptador de salida:**

* InMemoryRepository.java (almacenamiento en memoria)

**Adaptador de entrada:**

* Main.java (interfaz por consola)

---

## 📁 Estructura del proyecto

```
src/
│
├── domain/
│   └── Tarea.java
│
├── application/
│   ├── CrearTarea.java
│   ├── ListarTareas.java
│   └── CompletarTarea.java
│
├── ports/
│   └── TareaRepository.java
│
├── infrastructure/
│   └── InMemoryRepository.java
│
└── Main.java

test/
└── domain/
    └── TareaTest.java
```

---

## 🧪 Pruebas unitarias

Se implementaron pruebas unitarias utilizando JUnit para validar:

* Creación de tareas
* Validación de título vacío
* Cambio de estado de una tarea

Archivo de pruebas:

```
test/domain/TareaTest.java
```

---

## 🛠️ Tecnologías utilizadas

* Java
* Programación Orientada a Objetos (POO)
* Arquitectura Hexagonal
* JUnit (pruebas unitarias)
* Visual Studio Code

---

## ▶️ Instrucciones de ejecución

### 🔹 Ejecutar la aplicación

1. Abrir el proyecto en Visual Studio Code
2. Abrir el archivo `Main.java`
3. Clic en Run

---

### 🔹 Ejecutar pruebas

1. Instalar extensiones de Java en VS Code
2. Abrir `TareaTest.java`
3. Ejecutar los tests con Run Test

---

## 🧭 Ejemplo de uso

Al ejecutar el sistema se muestra:

```
1. Crear tarea
2. Listar tareas
3. Completar tarea
4. Salir
```

---

## 📌 Explicación de puertos y adaptadores

* El sistema define un puerto (`TareaRepository`) que establece cómo se deben gestionar las tareas.
* El adaptador `InMemoryRepository` implementa ese puerto, almacenando los datos en memoria.
* El `Main` funciona como adaptador de entrada, permitiendo la interacción del usuario.

---

## ✅ Ventajas de la arquitectura

* Separación clara de responsabilidades
* Facilita mantenimiento del código
* Permite cambiar la persistencia sin afectar el dominio
* Mejora la escalabilidad

---

## 📌 Conclusión

La arquitectura hexagonal permite desarrollar aplicaciones desacopladas, facilitando su evolución y mantenimiento.
Este proyecto demuestra cómo separar el dominio de la infraestructura, logrando un diseño limpio y organizado.

---

## 👨‍💻 Autor

Proyecto desarrollado con fines académicos.
