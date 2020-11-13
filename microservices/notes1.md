spring cloud config :  
centralized, versioned configuration  
management for distributed applications  

Spring cloud config :  

1.Configuration Management
2.Spring cloud config
a.server side
b.client side 

3.Reposiotry organization  


Application Configuration :   
- connections to resources, other applications  

Configuration Options  
1. package configuraion files with applicaiton  
- Requires rebuild, restart  


2.Configuration files in common file system  
- unavailable in cloud   

3. use environment variables  
- Done differently on different platforms
- Large # individual variables to manage/duplicate

4. Use a cloud vender specific solution  
- coupling application to specific environment  
like heroku  



Other challenges  
1. Manual work, brittle(dependent services configs)  
2. Deployment activities(restart/rebuild)   
3. version control(Traceablility)  



Spring Cloud Config :  
Provides centralized, externalized, secured  
, easy to reach source of application configuration  

Spring Cloud Bus :   
provides simple way to notify clients  
to config changes  

Spring Cloud Netflix Eureka  
- Service Discovery - Allows applications  
to register themselves as clients   


Spring Cloud Config : config information  
backed by source control   

client connect over http and retrice   
their configuraion settings  


spring cloud config server :   



https://github.com/javadevjournal/javadevjournal  
