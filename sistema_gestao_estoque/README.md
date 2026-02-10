# Sistema de Gestão de Estoque - Enterprise Edition

Projeto desenvolvido em Spring Boot com arquitetura inspirada em Clean Architecture.

## Tecnologias
- Java 17
- Spring Boot 3
- JPA / Hibernate
- Bean Validation
- OpenAPI (Swagger)
- H2 Database
- Docker

## Arquitetura
- domain → Entidades
- application → Serviços e DTOs
- infrastructure → Persistência
- interfaces → Controllers

## Executar localmente
mvn spring-boot:run

Swagger:
http://localhost:8080/swagger-ui.html

## Docker
1. mvn clean package
2. docker build -t estoque-app .
3. docker run -p 8080:8080 estoque-app

## Autor
Elias Ribeiro dos Reis
