project dependencies : mysql,jpa



transient

    the entity has just been instantiated and is not associated with a persistence context. 
    It has no persistent representation in the database and typically no identifier value has been assigned 
    (unless the assigned generator was used).


managed, or persistent

    the entity has an associated identifier and is associated with a persistence context. 
    It may or may not physically exist in the database yet.


detached

    the entity has an associated identifier but is no longer associated with a persistence context 
    (usually because the persistence context was closed or the instance was evicted from the context)

removed

    the entity has an associated identifier and is associated with a persistence context, 
    however, it is scheduled for removal from the database.




Flushing

        is the process of synchronizing the state of the persistence context with the underlying database. 
        The EntityManager and the Hibernate Session expose a set of methods, 
        through which the application developer can change the persistent state of an entity.
        when to use : if state of object changes in persistance context



