> spring will create bean objs when app is started.

> if bean is assigned lazy annotation , that bean will be skipped.

> By default, the Spring IoC container creates and initializes all singleton beans at time of application start up. 

> We can prevent this pre initialization of a singleton beans by using the @Lazy annotation.




The default behavior of Spring is to create all defined beans at the startup of the application. 
If we consider the fact that such initialization can be quite time consuming, 
it seems reasonable to execute heavy operations before users start to burden our server.

But do we really always need all application components loaded into memory? 
You probably heard about the Pareto principle and the fact it applies to software development as well. 
After identification of less used features, it’s worth to consider lazy initialization for connected beans, 
especially if they consume valuable resources.
