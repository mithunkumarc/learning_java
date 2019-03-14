dependencies : 
      
          jpa , mysql

application.properties


          ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
          ## create database users_database
          ##create database users_database;
          ## use users_database;

          spring.datasource.url = jdbc:mysql://localhost:3306/users_database?useSSL=false
          spring.datasource.username = root
          spring.datasource.password = root


          ## Hibernate Properties
          # The SQL dialect makes Hibernate generate better SQL for the chosen database
          spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

          # Hibernate ddl auto (create, create-drop, validate, update)
          spring.jpa.hibernate.ddl-auto = update


source : 
            https://www.javaguides.net/2018/09/spring-boot-2-hibernate-5-mysql-crud-rest-api-tutorial.html




#### hibernate ddl operations

                validate: validate that the schema matches, make no changes to the schema of the database, 
                you probably want this for production.

                update: update the schema to reflect the entities being persisted

                create: creates the schema necessary for your entities, destroying any previous data.

                create-drop: create the schema as in create above, but also drop the schema at the end of the session. 
                This is great in early development or for testing.
