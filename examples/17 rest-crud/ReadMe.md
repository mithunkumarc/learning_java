#### project dependencies : 

          devtools
          jpa
          mysql
          web



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





