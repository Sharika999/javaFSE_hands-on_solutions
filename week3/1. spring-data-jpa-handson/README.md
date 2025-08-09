# Week 3 – Spring Data JPA Hands‑On



This Spring Boot project demonstrates CRUD operations using Spring Data JPA, Hibernate, and MySQL.



## Technologies

\- Java 11, Spring Boot 2.4.3, Spring Data JPA, Hibernate, MySQL, Maven



## Structure

\- `Country` entity, `CountryRepository`, and `CountryService`

\- Application demonstrates add, fetch, update, delete operations

\- Configured with `application.properties` and MySQL database


## 📚 Difference Between JPA, Hibernate, and Spring Data JPA

- **JPA (Java Persistence API)**:  
  A specification that defines how Java applications should interact with databases. It provides abstract interfaces like `EntityManager`, `EntityTransaction`, `@Entity`, etc., but no implementation.

- **Hibernate**:  
  A JPA implementation. Executes all JPA operations, including SQL generation, session and transaction management. It offers advanced features like batching, caching, and lazy loading.

- **Spring Data JPA**:  
  A Spring project built on top of JPA (and Hibernate). Simplifies JPA’s `EntityManager` usage with ready-made repository interfaces (e.g., `JpaRepository`) and auto-generated queries from method names.

**In simple terms:**
- JPA = *What* persistence layers should do  
- Hibernate = *How* JPA works under the hood  
- Spring Data JPA = *What developers actually use* for faster repository development



## Key Concept Differences



\- \*\*JPA\*\*: Specification for persistence  

\- \*\*Hibernate\*\*: Implementation of JPA  

\- \*\*Spring Data JPA\*\*: Abstraction over JPA for rapid development



## Run

```bash

mvn clean install

mvn spring-boot:run



