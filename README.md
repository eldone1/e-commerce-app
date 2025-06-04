# 🛒 Proyecto E-Commerce - Microservicios con Java y Spring Boot

Este es un proyecto de **e-commerce** desarrollado bajo una arquitectura de **microservicios**, utilizando tecnologías modernas para construir un sistema escalable, mantenible y preparado para entornos de producción.

---

## 🚀 Tecnologías Utilizadas

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Data MongoDB
  - Spring Cloud Config
  - Spring Boot Actuator
- **MongoDB**
- **Docker**
- **Arquitectura de Microservicios**
- **Logging con Spring Boot y SLF4J**
- **Manejo Centralizado de Excepciones**
- **Spring Validation**
- **OpenAPI / Swagger** (documentación de APIs)
- **Config Server / Discovery Server** (si aplica)

---

## 🧩 Estructura del Proyecto

El sistema está compuesto por los siguientes microservicios:

| Microservicio               | Descripción                          |
|-----------------------------|--------------------------------------|
| `product-microservice`      | Gestión de productos                 |
| `order-microservice`        | Gestión de pedidos                   |
| `customer-microservice`     | Gestión de usuarios/clientes         |
| `inventory-microservice`    | Gestión de stock                     |
| `api-gateway`               | Puerta de entrada para las APIs      |
| `config-server`             | Configuración centralizada           |
| `discovery-server`          | Registro y descubrimiento de servicios (Eureka) |

---

## ⚙️ Prerrequisitos

- Java 17
- Docker y Docker Compose
- MongoDB (si no se usa Docker)
- Maven 3.8+

---

