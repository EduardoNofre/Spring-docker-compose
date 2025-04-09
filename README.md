 <p align="center">
  <img src="https://github.com/EduardoNofre/Spring-docker-compose/blob/main/hq720.jpg" alt="Sublime's custom image"/>  
</p>

 <h1 align="center">
         Aprenda a utilizar o Spring DevTools e o Spring Docker Compose na prática!
 </h1>

 - ## Os primeiros passos.
   
   ### ➜ ## Criar o projeto Java.
         O Projeto pode ser criado na sua IDE favorita.
   
   ### ➜  Incluir as dependecias abaixo.
   
                 		<!-- SPRING BOOT DEVTOOLS -->
                 		<dependency>
                 			<groupId>org.springframework.boot</groupId>
                 			<artifactId>spring-boot-devtools</artifactId>
                 			<scope>runtime</scope>
                 			<optional>true</optional>
                 		</dependency>
                 
                 		<!-- SPRING BOOT DOCKER COMPOSE -->
                 		<dependency>
                 			<groupId>org.springframework.boot</groupId>
                 			<artifactId>spring-boot-docker-compose</artifactId>
                 			<scope>runtime</scope>
                 			<optional>true</optional>
                 		</dependency>
                 
                 		<!-- DRIVE MYSQL -->
                 		<dependency>
                 			<groupId>com.mysql</groupId>
                 			<artifactId>mysql-connector-j</artifactId>
                 			<scope>runtime</scope>
                 		</dependency>
                 
                 		<!-- OPENAPI UI -->
                 		<dependency>
                 			<groupId>org.springdoc</groupId>
                 			<artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
                 			<version>2.8.5</version>
                 		</dependency>
                 
                 		<!-- PROJECT LOMBOK -->
                 		<dependency>
                 			<groupId>org.projectlombok</groupId>
                 			<artifactId>lombok</artifactId>
                 			<optional>true</optional>
                 		</dependency>

    ➜ ##Ter o docker desktop instalado na maquina.

   
   
