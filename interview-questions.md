why base class constructor is called

        when object is created , child class constructor calls parent class constructor.
        1. parent class declare all common variables of subclasses, so initialize them use super.

        advantage of inheritance : reuse variables/logic



Mixins/interfaces : 

        mixins are not allowed in java as it doesnot support multiple inheritance.
        java supports interfaces. interfaces can be used as mixin but implementation is provided by implementing class.
        the similar thing about mixin and interface is they don't have instance variables, they have only functions.
        the difference between mixin and interface(java) is , mixin contains method with implementation. but interface don't.
        purpose of mixn and interface(java is strict: contract) to provide many optional features.
        syntax of mixin look like inheritance in python.
        mixin vs class in python. mixin don't contain any instance varaibles but class contain instance variables.
        No use of creating instance of mixin as there is not state to modify. ( instantiation of interface not possible in java)
        object of class impl interface possible, because class has state to modify, it can use interface method todo it.

classloaders : 

        https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/ClassLoader.html


reflection : 

        https://www.oracle.com/technical-resources/articles/java/javareflection.html
