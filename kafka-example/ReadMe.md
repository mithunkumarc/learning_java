#### version : windows 10 , java 8 , spring boot 2.3 , kafka : 2.12 - 2.5 , zookeper : 3.5.8

#### steps : install zookeeper and run before running kafka.

          1. download zookeper and kafka binary 
          2. set environment path for both kafka and zookeeper
          3. save zookeeper and kafka in c: folder , if path is big, command prompt doesnt take long commands
          4. Rename “zoo_sample.cfg” to “zoo.cfg” in C:\zookeeper\conf
          5. create new folder "data" inside zookeeper folder , paste this path in zoo.cfg file
             ex : dataDir=C:\\apache-zookeeper-3.5.8-bin\\data
          6. open commandprompt : run zkserver command, starts zookeeper at port 2181
             zkserver will start the zookeeper on the defualt port which is 2181, you can change the default port in zoo.cfg file
          7. edit server.properties file from config folder in kafka.
             edit this property : log.dirs=C:\\Users\\mitchann\\Downloads\\tutorial\\kafka_2.12-2.5.0\\kafka-logs
             create folder kafka-logs in kafka folder
          8. run kafka : C:\kafka_2.12-2.5.0\bin\windows> kafka-server-start.bat ../../config/server.properties

#### source : 

          https://medium.com/@shaaslam/installing-apache-kafka-on-windows-495f6f2fd3c8
          https://medium.com/@shaaslam/installing-apache-zookeeper-on-windows-45eda303e835
          
#### github project springboot : before you run spring boot project, run zookeper and kafka server

          https://github.com/eugenp/tutorials/tree/master/spring-kafka/src/main
          dependencies : kafka and fasterxml jackson : check pom
          
