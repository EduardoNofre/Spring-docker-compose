 <p align="center">
  <img src="https://github.com/EduardoNofre/Spring-docker-compose/blob/main/hq720.jpg" alt="Sublime's custom image"/>  
</p>

 <h1 align="center">
         Aprenda a utilizar Spring Docker Compose na prática!
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

                   		<!-- javafaker -->
                		<dependency>
                			<groupId>com.github.javafaker</groupId>
                			<artifactId>javafaker</artifactId>
                			<version>0.15</version>
                		</dependency>

### ➜ Ter o docker desktop instalado na maquina.
   Para instalar é facil é só ir na pagina do docker fazer download de acordo com seu S.o e instalar.

### ➜ Observação.

1 - Para executar o seu projeto o docker desktop deve esta sendo execuatdo em sua maquina.
    Caso contrario vai da erro.
         
2 - Ao executar o seu projeto pela primiera vez vai demorar um pouco pois o docker irá fazer o pull das imagens para a sua maquina.<br>
    Quais as imagens ira baixa.<br>
    Imagem: MYSQL.<br>
    Porque imagem do MYSQL?<br>
     Na nossa dependencia do projeto temos o drive do MYSQL logo o docker vai fazer um pull do mysql e subir na sua maquina.<br>
### ➜ Como verificar se a imagem do MYSQL esta sendo execuata?.<br>
 1 - abra um terminal qualquer em sua maquina e execute o comando 'docker ps'.<br>
    Saida:.<br>
    
             C:\java-estudos-2025\Spring-docker-compose>docker ps
             CONTAINER ID   IMAGE          COMMAND                  CREATED             STATUS             PORTS                                NAMES
             c2421b2f576f   mysql:latest   "docker-entrypoint.sâ€¦"   About an hour ago   Up About an hour   33060/tcp, 0.0.0.0:53837->3306/tcp   springbootdockercompose-mysql-1
   

   
   
