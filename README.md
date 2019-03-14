# 52_List_ofPolymorphicTypes

**implement List_inArraySlots based on an array of Object references.**

#### Concepts
* The Object class sits a the root of Java's hierarchy of classes. That is, every class is a sub-type of Object, usually indirectly, with other types between them.

* So a variable that is declared to hold a reference to an Object can hold a reference to an instance of any class. That is, every object is-A Object, like 
>     Object anObject;

* The anObject variable declared above can not hold a reference to an int, since int is a primitive type. Primitive types are stored as values, not as references to values.

* Java has a built-in class corresponding to each primitive type: Integer, Double, Boolean. Notice the full word "Integer", not "Int", and the initial capital letters, which follow the convention of naming classes with initial caps.
