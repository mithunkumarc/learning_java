#### resource : resolve same dependencies by name
#### qualifier : helps autowired to resolve dependencies of same type using name

        //autowired cannot resolve incase of same type of dependencies available
	//qualifier is used with autowired
	
        @Autowired
	@Qualifier("hdfc")//or @Qualifier("icici")
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}


Qualifier annotation

        picking particular dependency from group of beans belong to similar type.

        eg : picking icici bank account from group of bank accounts(icici, hdfc.. etc)
        @qualifier annotation used to achieve this by avoiding conflicts.

        The @Qualifier annotation is used to resolve the autowiring conflict, when there are multiple beans of same type.

        The @Qualifier annotation can be used on any class annotated with @Component or on method annotated with @Bean. 
        This annotation can also be applied on constructor arguments or method parameters.

        absence of Qualifier annotation leads to NoUniqueBeanDefinitionException error.
         expected single matching bean but found 2(or more , equal to number of same type of beans you defined)
