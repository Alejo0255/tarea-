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

- Registrar una tarea
- Listar tareas
- Marcar tarea como completada
- Validar que el título no esté vacío
- Identificar tareas por ID

---

## 🧠 Arquitectura utilizada

Se implementa el patrón de arquitectura hexagonal, el cual separa el sistema en diferentes capas:

### 🔹 Dominio
Contiene la lógica de negocio principal.

- Tarea.java
- Reglas:
  - El título no puede estar vacío
  - Una tarea puede cambiar su estado a completada

---

### 🔹 Casos de uso (Application)
Contienen la lógica de la aplicación:

- CrearTarea.java
- ListarTareas.java
- CompletarTarea.java

---

### 🔹 Puertos (Ports)
Definen contratos que conectan el dominio con el exterior:

- TareaRepository.java (interfaz)

---

### 🔹 Adaptadores (Infrastructure)

**Adaptador de salida:**
- InMemoryRepository.java (almacenamiento en memoria)

**Adaptador de entrada:**
- Main.java (interfaz por consola)

---

## 📁 Estructura del proyecto
