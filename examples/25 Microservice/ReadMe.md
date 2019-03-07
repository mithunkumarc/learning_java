#### microservice : project set up

        create two projects

        book app and gateway app

        gateway app depending on url , req forwards to corresponding app
        if request is about book, forwards request to book



#### project dependencies

        book
         project dependencies : web

        Gateway : 
          project dependencies : web , zuul


#### running project : 
        
        make sure book app is running before you run gateway app

        allocate seperate ports for book and gateway app

        look into application properties




#### book : 

          http://localhost:8090/checked-out
          http://localhost:8090/available


#### Gateway : access book app from gateway
	
	        http://localhost:8080/books/available
