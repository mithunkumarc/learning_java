
ribbon load balancing: requests among microservice instances  
Eureka: Naming server : registering microservices  
Feign: Easier REST Clients  

visibility and monitering :   
zipkin distributed tracing: tracing request  
netflix api gateway  

fault tolerance : hystrix : if microservice is down : backup plan : message error  


microservice advantages :   
adapt new technology  
dynamic scaling  
faster release cycles  




feign : can be used as restclient : client/consumer side  
ribbon : name(eureka will provide) discovery(helps client to discover service instance) : used for loadbalancing : client /consumer side  
eureka : all apps register in eureka server   
zuul api gateway : common services like authentication, autorization, : intercept all requests  

sleuth : tract request accross different microservices using id, if there is no id, its difficult to debug using logs  
we cant know which request belong to which logs  
