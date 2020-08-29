server can send you response either in xml or json. Add http header : Accept : Application/xml or Application/json : use postman  
also request data can be sent as xml or json. : use httpheader : contentType : xml/json  


import dependency to make server to support content negotiation : 

            <!-- to disable xml support remove this dependency as browsser gives preference to xml first -->
            <dependency>
              <groupId>com.fasterxml.jackson.dataformat</groupId>
              <artifactId>jackson-dataformat-xml</artifactId>
            </dependency>


dependencies : 

          <dependencies>
            <!-- removed default dependencies -->
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-devtools</artifactId>
              <scope>runtime</scope>
            </dependency>
            <dependency>
              <groupId>com.h2database</groupId>
              <artifactId>h2</artifactId>
              <scope>runtime</scope>
            </dependency>
            <dependency>
              <groupId>org.springframework.boot</groupId>
              <artifactId>spring-boot-starter-data-jpa</artifactId>
            </dependency>
            <dependency>
              <groupId>com.fasterxml.jackson.dataformat</groupId>
              <artifactId>jackson-dataformat-xml</artifactId>
            </dependency>
          </dependencies>

data.sql


          insert into student
          values(10001,'Ranga', 'E1234567');

          insert into student
          values(10002,'Ravi', 'A1234568');
          
StudentController :

            @GetMapping("/students")
            public List<Student> getStudents() {
              return studentRepository.findAll();
            }
            
required : StudentRepsitory , Entity Student id,name, passportnumber       

source : 
https://github.com/in28minutes/spring-boot-examples/tree/master/spring-boot-2-rest-service-content-negotiation
