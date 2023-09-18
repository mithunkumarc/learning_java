Reentrant : 

    
    public sync void firstMethod()
    	this.secondMethod();// lets say thread 1 executing firstMethod()
     
    public sync void secondMethod();
    	//when thread 1 whic exe firstmethod, control comes here
    	// then it is called re-entrant
