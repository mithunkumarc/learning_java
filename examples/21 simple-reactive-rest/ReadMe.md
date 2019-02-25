#### project dependencies : 
	
    reactive web


#### webflux : 
    a lightweight functional programming model in which functions are used to route and handle requests and 
    contracts are designed for immutability

#### router : 

    Router functions are used to route the requests to the corresponding HandlerFunction.
    Router functions are evaluated in order: if the first route does not match, the second is evaluated, and so on. 

#### handler : 

    handler function 
    receives request from router and sends response.
    ServerRequest and ServerResponse are immutable interfaces that offer JDK 8-friendly access to the HTTP request and response. 
    Both request and response provide Reactive Streams back pressure against the body streams. 
    The request body is represented with a Reactor Flux or Mono. 
    The response body is represented with any Reactive Streams Publisher, including Flux and Mono. 

    Mono : string
    Flux : json
