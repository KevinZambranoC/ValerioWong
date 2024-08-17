# Valerio Wong - Gestión de Horas de Uso en Laboratorio de Informática

Este proyecto en Java está diseñado para gestionar eficientemente las horas de uso en un laboratorio de informática. La aplicación organiza y controla el acceso a las salas del laboratorio, permitiendo calcular el tiempo disponible y listar las salas con mayor y menor uso.

## Características Principales

- **Clase `Sala`:** Define las características básicas de una sala, incluyendo su capacidad, identificador y las carreras que tienen acceso a ella.
  
- **Clase `Maquina`:** Hereda de `Sala` y agrega la funcionalidad necesaria para calcular el tiempo disponible en la sala, basándose en las horas ya ocupadas.
  
- **Clase `Implementacion`:** Carga los datos de las salas, calcula el uso total del laboratorio, identifica la sala con menor uso, y lista las tres salas con mayor tiempo de ocupación.

## Contexto Académico

Este proyecto fue desarrollado como parte de un parcial de la materia **Programación I** en la Universidad Experimental del Táchira (UNET). Su propósito es aplicar conceptos fundamentales de Programación Orientada a Objetos (POO) para resolver un problema real en un entorno académico.
