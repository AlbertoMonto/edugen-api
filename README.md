# EduGen API

API REST con Spring Boot para una plataforma educativa que gestiona contenidos de aprendizaje (resúmenes, tests, explicaciones) y usuarios con distintos roles. Es la base del backend de mi proyecto de fin de grado.

> Proyecto en desarrollo. Lo construyo siguiendo un curso de Spring Boot y con ayuda de Claude como apoyo para resolver dudas y revisar el código.

## Tecnologías

- Java 21
- Spring Boot 4
- Maven

## Cómo arrancarla

Desde la carpeta del proyecto:

```
.\mvnw.cmd spring-boot:run
```

(En Mac o Linux: `./mvnw spring-boot:run`). La API queda disponible en `http://localhost:8080`.

## Endpoints

| Método | Ruta | Descripción |
|---|---|---|
| GET | `/api/contenidos` | Lista de contenidos educativos |
| GET | `/api/contenidos/destacado` | Un contenido destacado |
| GET | `/api/usuarios` | Lista de usuarios con su rol |

Ejemplo de respuesta de `/api/contenidos`:

```json
[
  {"id": 1, "titulo": "Introducción a Python", "tipo": "resumen", "nivel": "secundaria"}
]
```

## Estructura del proyecto

- `models`: clases que representan los datos de la aplicación (`Contenido`, `Usuario`).
- `controllers`: reciben las peticiones HTTP y devuelven la respuesta en JSON (`ContenidoController`, `UsuarioController`).

Por ahora los datos están escritos a mano en los controladores. El objetivo es ir separando responsabilidades por capas.

## Próximos pasos

- Capa de servicio y repositorios con Spring Data JPA
- Base de datos (H2 al principio, PostgreSQL después)
- DTO y validación de datos
- Tests con JUnit y Mockito
- Autenticación con JWT y roles (administrador, profesor y estudiante)
- Integración con una API de IA generativa para crear contenidos automáticamente