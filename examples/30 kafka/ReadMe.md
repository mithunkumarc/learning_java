kafka is like jms messaging library

#### 1. download kafka libray : 

        https://kafka.apache.org/quickstart

#### 2. start zookeeper first before starting kafka

        https://zookeeper.apache.org/doc/r3.4.14/zookeeperStarted.html
        make sure you have conf/zoo.cfg: or convert zoo-sample.cfg to zoo.cfg
        
        zookeeper > bin/zkServer.sh start

        default port of zookeeper : 2181

#### 3.start kafka server (broker)

        kafka > bin/kafka-server-start.sh config/server.properties
        
        default port of zookeeper : 9092


#### 4.follow source code, using application.yaml as application.properties


#### 5. send post request in rest client

        http://localhost:9000/kafka/publish?message=test
        
        //send any message, message=anymessage
        
        or goto terminal 
        
        curl -X POST -F 'message=test' http://localhost:9000/kafka/publish
        
        
#### 6.see the output in spring boot app console

        [nio-9000-exec-3] com.example.demo.engine.Producer         : #### -> Producing message -> test
        [ntainer#0-0-C-1] com.example.demo.engine.Producer         : #### -> Consumed message -> test
        
#### 7. flow : 

      request will goto restcontroller 
      restcontroller sending message through producer with a topic
      consumer also subscribed to same topic , it will receive message 
      
      
#### reference : 

       https://medium.com/oril/spring-boot-with-apache-kafka-2b1ecb88a63f
       https://github.com/igorkosandyak/spring-boot-kafka
       https://www.confluent.io/blog/apache-kafka-spring-boot-application
