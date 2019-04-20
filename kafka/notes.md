Topics : a particular stream of data
  identified by name, can have any number of topics
  
  Topics are split in partitions (back up /shards)
  
  each partition may run on different system
  
  partitions are similar to mango db : replica
  
  single kafka cluster you may have single partition
 
 at the time of creation of topic , config how many partition your want
 eg: partition 0, partition 1 and partition 2
 
    messages goes into partition, has an incremental id called offset 
    offset numbers are ordered
    
      p0 :   0 1 2 3 4 5 6 7 8 9 10 11...    # 0  1 2 .. offset numbers of each messages, offset are immutable
      p1 : 0 1 2 3 4 5 6 7 8 9
      p2 : 0 1 2 3 4 5 6 7 8 9 
      
      one of partition is master others acts like replica or slave and ready to become master incase master breaks
      
---

Brokers : server

kafka cluster : composed of multiple broker

each broker is identified with its ID

each broker contains certain topic partitions

single node(computer) cluster contains only one broker

broker 101(partition 0) broker 102(partition 1) and broker 103(partition 2)

A good number to get started is 3 brokers , but some big clusters have over 100 brokers

---
example : brokers with topics

topic a with 3 partition, topic b has 2 partitions

broker 101 : Topic A : partition 0 : Topic B Partition 1

Broker 102 : Topic A : partition 2 : Topic B : partition 0

Broker 103 : Topic A : partition 1 : <no partion for topic b>


---

topic replication factor : Topics should have a replication factor > 1 (usually between 2 and 3)

This way if a broker is down, another broker can serve the data

Example : Topic A with 2 partition and replication factor of 2

cluster with three brokers

broker 101 partion 0 topic a

broker 102  partion 1 topic a,  partion 0 topic a

brokder 103 partion 1 topic a

even if 102 breaks , data still available in 101 and 103


at any point of time only one broker can be a learder for given partion

only the leader can receive and serve data for a partion

the other brokers will synchronize the data

therefore each partition has none leader and multiple ISR(in sync replica)

leader and ISR decided by zookeeper

--- 

producer : write data to topics (which is made of partitions(master and replicas))

automatically know to which broker and partition to write to

in case of broker failure, producer will automatically recover


producer : send data to broker 101(topic a : partion p0) ,broker 102(topic a : p1) and broker 103(topic a : p2)

producer can choose to receive acknowledgment of data writes to partitions(to avoid data loss)

acks : acknowledgement

acks : 0, producer dont wait for acknowledgmement , possible data loss
acks : 1, producer will wait for leader/master broker acknowledgement , limited data loss
acks : all : leader + replica acknowledgemnt : no data loss


---

producer : message keys

producer can choose to send a key with the messsage (string ,number) 
if key = null, data is sent round robin (broker 101 then 102 then 103)
if key is sent, then all messages for that key will always go to the same partition
a key is basically sent if you need message ordering for a specific field (ex : truck id)

eg: producer messages may use key as data eg Truck id, employee id, customer id
key with 123 : always will goto partition 0(same partition)
key with 234 : always will goto partition 1(same partition)
      
---


consumers : 
read data from topic(identified by name)
knwo which broker to read from
in cas of broker failur, consumer know how to recover
data is rad in order within each partition. uses offset id


brokder 101 : p2 : ta : ..... : consumer
broker 102 : p1 : ta .... : consuer

---
consumer groups : may be for diff for diff app

consumers read data in consumer groups

each consumer within a group reads from exclusive partitions

if you have more consumers than partitions, some consumers will be inactive

---

consumer offset 

kafka stores the offsets at withc a consumer group has been reading

offset commited live in a kafka topic name __consumer_offsets

when a consumer in a group has processed data recevied from kafka, it should be committing the offsets



-----------

kafka broker disconvery: 

every kafka broker is also called bootstrap server
that means that you only need to connect to one broker, and you will be connected to the entire cluster.
each broker knows about all brokers, topics and partitions (metadata)


---
kafka cluster (group of brokers)

kafka client can connect to any broker
broker sends lists of brokers to kafka client
kafka client connects to wanted broker



--- 
zookeeper : 

manages brokers : keeps list of them
select learder for partitions

sends notification to kafka, status of topic, broker. etc

kafka cant work without zookeeper : 

operates with an odde number of server






if a consumer dies, it will be alble to read back from where it left off thanks to the committed consumer offsets
























