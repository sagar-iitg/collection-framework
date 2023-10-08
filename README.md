##  Java Collection-Framework



_**General Intro**_

Added in Java version 1.2\
Collection is nothing but a group of Objects\
Present in java.util package\
Framework provides us the architecture to manage these "group of objects" i.e
add,update,delete,search etc\
Iterable Interface is added in java 1.5


_** Why we need Java Collections Framework **_

Prior to JCF, we have array, vector, hash tables\
But problem with that is,there is no common interface, so its difficult to remember
the methods for each\


_**Comparator vs Comparable**_



_**Comparator**

Comparator is a member of the Java Collections Framework.\
This is a functional interface and can therefore be used as the assignment target for a lambda expression or method reference\
Comparators can be passed to a sort method (such as Collections.sort or Arrays.sort)\








_**List- Interface**_

ArrayList- Class\
LinkedList- Class\
Vector- Class\
Stack- Class

**_Map-Interface_**

**_HashMap_**

A HashMap contains values based on the key.\
It contains only unique elements.\
It may have one null key and multiple null values.\
It maintains no order.


Hashtable\
It may have not have any null key or value.\
It is synchronized.\
It is a legacy class.\
A Hashtable is an array of list. Each list is known as a bucket. The position of bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.\

TreeMap\
It cannot have null key but can have multiple null values.\
A TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.\
It is same as HashMap instead maintains ascending order(Sorted using the natural order of its key).\
It contains only unique elements\

**LinkedHashMap**\
It is same as HashMap instead maintains insertion order.\
It may have one null key and multiple null values\
It contains only unique elements.\
A LinkedHashMap contains values based on the key.

_**Set-Interface**_


_**Queue Interface**_

Queue is an Interface,child of collection interface\
generally queue follows FIFO approach, but there are exceptions like PriorityQueue\
Supports all methods available in collection + some other methods mentioned below\






_**StringBuffer**_\
It is Mutable Sequence of Characters\
Efficient\
ThreadSade\
makes it little slower\

StringBuilder and StringBuffer -









