todo  
	
	https://javarevisited.blogspot.com/2018/07/top-9-java-programming-books-best-must-read.html
	https://www.stackchief.com/

#### some examples are in java 8 

	1.kafka-example

#### uninstall/install

  		https://linuxhint.com/uninstall-java-ubuntu/

		https://linuxhint.com/install_oracle_jdk11_ubuntu/
  		https://www.rosehosting.com/blog/how-to-install-java-17-lts-on-ubuntu-20-04/
		
		
##### installing openjdk 11

        download tar file
        extract to opt folder
        mithun@localhost:~/Downloads$ sudo tar -xzf openjdk-11_linux-x64_bin.tar.gz -C /opt
        set home
        mithun@localhost:/opt$ export JAVA_HOME=/opt/jdk-11/
        set path
        mithun@localhost:/opt$ export PATH=$PATH:$JAVA_HOME/bin
        
        
##### two option : set java globally or locally
	
        globally : no need to set java path locally
			login to rootuser
			sudo -
			password : mithun123
			# create gedit file
			put JAVA_HOME and PATH variables in file openjdk.sh
			save openjdk.sh in folder "etc/profile.d"

	Locally : 
                in home folder , there is a hidden file called .profile, set java path in this file
		mithun@linux:~$ gedit ~/.profile
		above command opens .profile in gedit
		add path as mentioned below
			
		export JAVA_HOME=/opt/jdk-11/
		PATH="$HOME/bin:$HOME/.local/bin:$PATH:$JAVA_HOME/bin"


		# check java version
		mithun@linux:~$ source .profile
		mithun@linux:~$ java -version
		# source command to load file again to reflect changes        
        
#### set java path in bashrc 

		home> sudo nano ~/.bashrc
		 
		export JAVA_HOME=/opt/jdk-11/
		export PATH="$HOME/bin:$HOME/.local/bin:$PATH:$JAVA_HOME/bin"


        
##### set java path for eclipse
        open eclipse.ini file
        set below command before vmargs
        ##
                -vm 
                /opt/jdk-11/bin/java
        ##
        
        
> source video : https://www.youtube.com/watch?v=TaIzZU28xVs



#### concurrency vs parallelism
	concurrency : shared data bw threads : synchronisation
	parallelism : no shared data bw threads : sync not required
	
#### tutorials

	https://www.javainuse.com/spring/sprboot
	https://bezkoder.com/
	https://github.com/javadevjournal/javadevjournal
	https://github.com/roytuts/spring-boot
	https://github.com/darbyluv2code/fullstack-angular-and-springboot  
	https://github.com/darbyluv2code/spring-and-hibernate-for-beginners
	https://www.javaguides.net/
	https://knpcode.com/
 	https://github.com/lokeshgupta1981
  	https://github.com/lokeshgupta1981/Spring-Boot3-Demos
   	https://zetcode.com/all/#java
    	https://www.youtube.com/watch?v=ybQAmFsVQqA : maven : multi module and plugins
	
	
#### algorithms 

	https://github.com/TheAlgorithms/Java
	
	
#### watch

	https://blogs.oracle.com/javamagazine/
	https://bezkoder.com/
	https://github.com/javadevjournal/javadevjournal
	https://github.com/BruceEckel/OnJava8-Examples
	


#### to learn

		 Multithreading concepts to learn.
		-> Runnable, Callable
		-> Futures
		-> Join
		-> Locks
		-> Race conditions
		-> Deadlock
		-> thread dumps
		-> Concurrency utilities
		-> volatile
		-> Java memory model
		
#### explore

	https://github.com/Apress
        https://github.com/PacktPublishing
	https://github.com/thombergs/code-examples
	https://www.java4s.com/
 	https://docs.oracle.com/en/java/javase/17/index.html
