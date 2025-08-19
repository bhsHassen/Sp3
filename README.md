# monitoring (Spring Boot 3.3 / Java 17 / Oracle)

API de suivi des jobs (IN/OUT) exposant **le dernier statut par job** grâce à une requête Oracle `ROW_NUMBER()`.

## Tech
- Java 17
- Spring Boot 3.3
- Spring Data JPA (Hibernate / Oracle)
- Oracle JDBC `ojdbc11`

## Configuration
Éditer `src/main/resources/application.yml` :
```yaml
spring:
  datasource:
    url: jdbc:oracle:thin:@//host:port/SERVICE
    username: CSR
    password: changeMe
```
> Remplace `host`, `port`, `SERVICE`, `username`, `password`.

## Lancement
```bash
mvn clean spring-boot:run
```
Endpoint : `GET http://localhost:8080/jobs`

## Requête SQL (dernier statut par job)
Voir `JobRepository#getLatestJobExecutions()`.
