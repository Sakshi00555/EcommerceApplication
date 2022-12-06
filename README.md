# Ecommerce_Web
This project performs fundamental operations of an e-commerce website, where our customer's data is validated, mapped, processed with business logic & persisted in the database.

 
## Used Tech Stack & Tools:
1. JAVA
2. Spring
3. Spring Boot
4. Spring data JPA
5. Hibernate
6. MySQL
7. Git
8. GitHub

[![](https://skillicons.dev/icons?i=java,spring,hibernate,mysql,git,github)]()

## Modules
1. Login Module
2. Customer Module
3. Restaurant Module
4. Order Module
5. Bill Module
6. Item Module
7. Cart Module
8. Exception Module

## Installation & Run

1. clone our Project into your local machine.
      - open any terminal
      - git clone https://https://github.com/Sakshi00555/Ecommerce_Web.git
2. Open Your STS
3. Goto File -> Import -> Select Maven -> Choose Existing Maven -> Click on browse -> Choose the project location -> Select the project -> Finish
4. All done, good to go!

* Before running the API server, you should update the database config inside the [application.properties](https://github.com/Sakshi00555/Ecommerce_Web/blob/main/EcommerceWebsite/src/main/resources/application.properties) file. 
* Update the port number, username and password as per your local database config.

```
   

#changing the server port
server.port=8080
#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/miniproject
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=root

#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


#For invalid url exception
spring.mvc.throw-exception-if-no-handler-found=true
spring.web.resources.add-mappings=false

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER



```

## ER Diagram



