To execute programs, use sping starter app, it imports reactive core jar

https://github.com/vinsguru/java-reactive-programming-course  

#### which operator to use? 

    https://projectreactor.io/docs/core/release/reference/index.html#which-operator


#### Spring webflux response best practice

    return response as Flux or mono

        ex : 
            not a good practice
            var resultList = process(); // outside pipeline, blocking operation
            retur Flux.fromIterable(resultList);

            good practice(check syntax)
            return Flux.( output of process) // part of pipeline
            
