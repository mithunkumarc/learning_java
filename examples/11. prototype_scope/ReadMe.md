
        When defining a <bean> you have the option of declaring a scope for that bean. 
        For example, to force Spring to produce a new bean instance each time one is needed, 
        you should declare the bean's scope attribute to be prototype. 
        Similarly, if you want Spring to return the same bean instance each time one is needed, 
        you should declare the bean's scope attribute to be singleton.


> singleton

        This scopes the bean definition to a single instance per Spring IoC container (default).
	
> prototype

        This scopes a single bean definition to have any number of object instances.

> request

        This scopes a bean definition to an HTTP request. Only valid in the context of a web-aware Spring ApplicationContext.

> session

        This scopes a bean definition to an HTTP session. Only valid in the context of a web-aware Spring ApplicationContext.
 	

> global-session : application scope

        This scopes a bean definition to a global HTTP session. 
        Only valid in the context of a web-aware Spring ApplicationContext.

