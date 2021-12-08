# password-generator

Generate temporary password is now a requirement on almost every website now-a-days. In case a user forgets the password, system generates a random password adhering to password policy of the company. 

**Technologies**

* Spring Boot - Back end
* Thymeleaf - Front end
* Docker

**Install**

* Install JDK java 11
* Install docker and docker compose
* Install maven
* Eclipse/IDEA/other tools

**Running password-generator**

1. **Git clone password-generator project**
 ```
 https://github.com/NhlamuloChauke/password-generator.git
 ```
 ```
 git checkout develop
 ```
2. **Run password-generator project(using MAVEN)**
 ```
 cd password-generator/password-generator
 mvn clean install
 mvn spring-boot:run  
```
**After successful password-generator maven build, access password-generator below:**
* http://localhost:8083/password-generator
