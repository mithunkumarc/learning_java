it is like promise in javascript : supplyAsync(//lambda) runs in commonPool thread.  

what is commonPool : any thread other than main thread.(we dont care)  

if commonPool thread completes before main thread, the output will be handover to main thread.   

you can use cascading thenRun() thenApply(//lambda) after completableFutuer completes task.  
 
      eg : completeableFutureInstance.thenRun().thenRun()...
