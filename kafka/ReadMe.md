#### step 1 : start zookeeper because kafka uses it

        kafka : link to download lib and documentation to start kafka
        https://kafka.apache.org/quickstart
        before starting kafka, make sure you have started zookeeper

        https://zookeeper.apache.org/
        goto documenation
        select latest stable version : https://zookeeper.apache.org/doc/r3.4.14/ 
        click on getting started
        create file conf/zoo.cfg
          //demo config or use zoo-sample.fg to zoo.cfg
          tickTime=2000
          dataDir=/var/lib/zookeeper
          clientPort=2181
          
        mitun@mithun-Latitude-E6230:~/ide/zookeeper-3.4.14$ bin/zkServer.sh start

        default port of zookeeper : 2181




#### step 2 : start kafka server : watch documentation

          mitun@mithun-Latitude-E6230:~/ide/kafka_2.12-2.2.0$ bin/kafka-server-start.sh config/server.properties
          default port of kafka : 9092



#### step 3 : create producer and consumer 

            open two eclipse ides : 

            run : simpleproducer.java 
              Message sent successfully

            run : simpleconsumer.java

            Subscribed to topic kafka_test 
              offset = 30, key = 0, value = 0 (value can be any string value)
              offset = 31, key = 1, value = 1
              offset = 32, key = 2, value = 2
              offset = 33, key = 3, value = 3
              offset = 34, key = 4, value = 4
              offset = 35, key = 5, value = 5
              offset = 36, key = 6, value = 6
              offset = 37, key = 7, value = 7
              offset = 38, key = 8, value = 8
              offset = 39, key = 9, value = 9


---
spring boot kafka

https://www.javainuse.com/spring/spring-boot-apache-kafka-hello-world

https://github.com/thepracticaldeveloper/kafka-spring-boot-example
