#### Note
        spring security uses BcryptPasswordEncode
        so manually create crypt password and save to db for this demo


#### project dependencies : 
        
          mysql, jdbc, security, thymeleaf, web



#### Db name : spring_auth

#### tables : 

          create table users(
            username varchar(50) not null primary key,
            password varchar(100) not null,
            enabled boolean not null
          );
          create table authorities (
            username varchar(50) not null,
            authority varchar(50) not null,
            constraint fk_authorities_users foreign key(username) references users(username)
          );
          create unique index ix_auth_username on authorities (username,authority);


          insert into users(username,password,enabled)
            values('admin','$2a$10$6yCg7n5OrnIxoj..AQvR7uIUFFMMmWaK3tuM0AXTLT9REs2oQSpZ2',true);


          insert into authorities(username,authority) 
            values('admin','ROLE_ADMIN');


          password : admin@123 // use BCryptPasswordEncoder
  
---
#### manually generating BCryptPasswordEncoder

          use : spring security jar in pom

          import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
          for password encoder
          String encoded=new BCryptPasswordEncoder().encode("admin@123");

---
using basic auth popup : all requests going throuhg auth , default page is pop up login

      use below code for default popup : 
      
       @Override
        protected void configure(HttpSecurity http) throws Exception {
         //all request pass through authentication 
          http.authorizeRequests().anyRequest().hasAnyRole("ADMIN", "USER")
          .and()
          .httpBasic(); // Authenticate users with HTTP basic authentication
        }


