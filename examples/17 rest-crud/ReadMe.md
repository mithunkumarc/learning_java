#### project dependencies : 

          devtools
          jpa
          mysql
          web


##### application.properties : table name : mentioned in entity User

          ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
          spring.datasource.url = jdbc:mysql://localhost:3306/users_database?useSSL=false&allowPublicKeyRetrieval=true
          spring.datasource.username = root
          spring.datasource.password = root


          ## Hibernate Properties
          # The SQL dialect makes Hibernate generate better SQL for the chosen database
          spring.jpa.properties.hibernate.dialect = org.hibernate.dialect.MySQL5InnoDBDialect

          # Hibernate ddl auto (create, create-drop, validate, update)
          spring.jpa.hibernate.ddl-auto = update


> use rest client for crud 


#### listing all users

          request type : get
          http://localhost:8080/api/v1/users



#### create user

        request type : post
        http://localhost:8080/api/v1/users

        send below data in body field individually :  

        //first user
        {
          "firstName":"shrikanth",
          "lastName":"gk",
          "emailId":"gk.shrikanth@gmail.com"

        }

        //second user
        {
          "firstName":"biswas",
          "lastName":"das",
          "emailId":"das.biswas@gmail.com"		
        }


#### list users after adding
        
          list users : get : http://localhost:8080/api/v1/users

            [
                {
                    "id": 1,
                    "firstName": "shrikanth",
                    "lastName": "gk",
                    "emailId": "gk.shrikanth@gmail.com"
                },
                {
                    "id": 2,
                    "firstName": "biswas",
                    "lastName": "das",
                    "emailId": "das.biswas@gmail.com"
                }
            ]


#### update user 

          request type : put  
          users/{id}
          url : http://localhost:8080/api/v1/users/2
          {
            "firstName": "viswas",
                  "lastName": "das",
                  "emailId": "das.viswas@gmail.com"
          }


#### deleting user

          request type : delete 
          /users/{id}
          http://localhost:8080/api/v1/users/2





