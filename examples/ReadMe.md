requisites 
* spring tool suite 4
* java 11
* spring boot 2.2.0


devtools dependency : used for hotreload : sometimes better to restart


project structure  : 

springbootapp main() : base package : 
        all other packages must be inside base package 
        
        Eg : 
          com.example
                SpringbootApp.java
          com.example.controller
          com.example.config
          com.example.view


examples :

        https://howtodoinjava.com/wp-content/downloads/
        https://github.com/RameshMF/spring-boot-tutorial



#### crud repository vs jpa repository

        JPA : crud with persistence functions commit ,flush
        crud : only crud

        JpaRepository extends PagingAndSortingRepository which in turn extends CrudRepository.

        Their main functions are:

            CrudRepository mainly provides CRUD functions.
            PagingAndSortingRepository provides methods to do pagination and sorting records.
            JpaRepository provides some JPA-related methods such as flushing the persistence context and 
            deleting records in a batch.

                 
               JpaRepository will have all the functions of CrudRepository and     PagingAndSortingRepository. 
               
               So if you don't need the repository to have the functions provided by 
               JpaRepository and PagingAndSortingRepository , use CrudRepository.
