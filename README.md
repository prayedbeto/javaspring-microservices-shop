# Proyecto de Microservicios con Java y Spring

> ⚠️ **Precaución:** Este proyecto es solo para fines educativos y no debe usarse en producción sin antes realizar revisiones de seguridad y pruebas exhaustivas.

## Descripción

Este proyecto es una arquitectura de microservicios desarrollada en Java utilizando el framework Spring. Cada microservicio es independiente y se comunica mediante APIs REST.

## Tecnologías

- Java 17+
- Spring Boot
- Spring Cloud
- Spring Data JPA
- Eureka (Service Discovery)
- Spring Cloud Gateway (API Gateway)
- Base de datos relacional (por ejemplo, PostgreSQL/MySQL)
- Docker (opcional)

## Estructura del Proyecto

```
microservices-project/
│
├── service-a/
├── service-b/
├── api-gateway/
├── discovery-server/
└── README.md
```

## Cómo ejecutar

1. Clonar el repositorio.
2. Configurar las variables de entorno y archivos `application.yml` de cada servicio.
3. Iniciar el servidor de descubrimiento (`discovery-server`).
4. Iniciar el API Gateway.
5. Iniciar los microservicios.

## Comandos útiles

```bash
# Compilar todos los servicios
./mvnw clean install

# Ejecutar un servicio
cd service-a
./mvnw spring-boot:run
```

## Contribución

1. Haz un fork del repositorio.
2. Crea una rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit.
4. Envía un pull request.

## Licencia

Este proyecto está bajo la licencia MIT.