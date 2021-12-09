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
* http://localhost:8083/

**See our home page below:**

![1](https://user-images.githubusercontent.com/17588855/145350660-1001b1cd-15a6-4240-b386-e7187f348138.png)

**To generate a random password, select the length of your choice from the dropdown and 
  and click 'Generate Button' button to generate. Please see below:**
  
![2](https://user-images.githubusercontent.com/17588855/145350694-d8b846f0-2959-4972-b48f-b4193b1ca33b.png)

**To copy your random generated password click 'Copy Password!' button as shown below:**

![Screenshot 2021-12-09 at 09 11 18](https://user-images.githubusercontent.com/17588855/145350725-7a0d8015-18c6-4acf-8573-c2cef3bc5a74.png)

**REFERENCES**
* Please follow the link read more about generating password in java: https://www.tutorialspoint.com/Generating-password-in-Java
