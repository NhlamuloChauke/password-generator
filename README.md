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

**See our home page below:**

![1](https://user-images.githubusercontent.com/17588855/145242787-d6be6518-b9b2-4495-8e21-01c28f464430.png)

**To generate a random password, select the length of your choice from the dropdown and 
  and click 'Generate Button' button to generate. Please see below:**
  
![2](https://user-images.githubusercontent.com/17588855/145243846-2445908e-3a49-489f-9814-786ce84bd1b8.png)

**To copy your random generated password click 'Copy Password!' button as shown below:**

![3](https://user-images.githubusercontent.com/17588855/145244346-73389fcd-9680-46a8-850f-2db090524e84.png)

**REFERENCES**
* Please follow the link read more about generating password in java: https://www.tutorialspoint.com/Generating-password-in-Java
