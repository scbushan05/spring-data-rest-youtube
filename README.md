# Build Complete REST API with Spring Data Rest and MySQL - Employee Management
A simple employee management REST API built with Spring Data Rest that connects to the MySQL database to perform the basic database operations such as Create, Read, Update and Delete

## Requirements

1. Java - 1.8.x

2. Maven - 3.x.x

3. Mysql - 5.x.x

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/scbushan05/spring-data-rest-youtube.git
```

**2. Create Mysql database**
```bash
create database springbootapps
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven (springdatarest)**

```bash
mvn package
java -jar target/springdatarest-v1.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080/api/v1>.

## Explore Rest APIs

The app defines following CRUD APIs.

    GET /api/v1/listemployees
    
    POST /api/v1/listemployees
    
    GET /api/v1/listemployees/{id}
    
    PATCH /api/v1/listemployees/{id}
    
    PUT /api/v1/listemployees/{id}
    
    DELETE /api/v1/listemployees/{id}
    
    GET /api/v1/listemployees/search/name

You can test them using postman or any other rest client.

## Learn more

You can find the tutorial for this application on my blog -

<https://bushansirgur.in/spring-data-rest-example-with-mysql-database-2021/>
