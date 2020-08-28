 > The representations returned for REST resources contain not only data but also links to related resources. Thus, the design of the representations is crucial to the design of the overall service.
 
 
 > Hypermedia as the Engine of Application State (HATEOAS) is a component of the REST application architecture that distinguishes it from other network application architectures.
 
 If you request data from a server. lets say you are requesting for information of User.   
 Hateos webservice will send user information along with related/useful links related to user.  
 for example :  
 
         {
          user : { //user data... }
          links : {
              myapp:8080/userlist
              myapp:8080/getuser
              myapp:8080/deleteuser/userid
          }
         }


#### spring boot : available in guide. make sure add dependencies "spring web and spring hateos"
