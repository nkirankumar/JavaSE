click [here](http://docs.oracle.com/javase/7/docs/index.html) for Java SE Documentation

![GitHub Logo](./images/Hierarchy.PNG)

Collections framework
=====================
* Collection(interface)
* Collections(class)
* List(interface)
* Set(interface)
* SortedSet(interface)
* NavigableSet(interface)
* Queue(interface)
* Map(interface)
* NavigableMap(interface)

**List**:
>Collection(I)(1.2)
 * List(I)(1.2)
   * ArrayList(C)(1.2)
   * LinkedList(C)(1.2)
   * Vector(C)(1.0)
	 * Stack(C)(1.0)
	
*Note*: 1.0-Legacy classes

**Set**:Duplicates are not allowed & insertion order is not preserved
>Collection(I)(1.2)
 * Set(I)(1.2)
   * HashSet(C)(1.2)
   * LinkedHashSet(C)(1.4)
  
**SortedSet**:If we want to represent a group of individual objects, according to some sorting order
>Collection(I)(1.2)
 * Set(I)(1.2)
   * SortedSet(I)(1.2)
  	 * NavigableSet(I)(1.6)
  	   * TreeSet(C)(1.2)
  	   
**Queue**:If we want to represent a group of individual objects, prior to processing
>Collection(I)(1.2)
 * Queue(I)(1.5)
   * PriorityQueue(C)
   * BlockingQueue(I)
  	  * PriorityBlockingQueue(C)
  	  * LinkedBlockingQueue(C)
  	  
**PriorityQueue**: We know that Queue follows First-In-First-Out model but sometimes we need to process the objects in the queue based on the priority. That is when Java PriorityQueue is used.

1. It is an unbounded queue based on a priority heap
2. The elements of the priority queue are ordered according to their natural ordering, or by a *Comparator* provided at queue construction time, depending on which constructor is used
3. A priority queue does not permit *null* elements
4. A priority queue relying on natural ordering also does not permit insertion of non-comparable objects (doing so may result in **ClassCastException**)
5. The *head* of this queue is the least element with respect to the specified ordering
6. The queue retrieval operations *poll, remove, peek,* and *element* access the element at the head of the queue
7. The Iterator provided in method *iterator()* is not guaranteed to traverse the elements of the priority queue in any particular order. If you need ordered traversal, consider using *Arrays.sort(pq.toArray())*
8. Note that this implementation is not synchronized.
9. **PriorityQueue** is not thread safe, so java provides **PriorityBlockingQueue** class that implements the *BlockingQueue* interface to use in java multithreading environment

*Implementation note*: this implementation provides O(log(n)) time for the enqueing and dequeing methods (*offer, poll, remove()* and *add*); linear time for the *remove(Object)* and *contains(Object)* methods; and constant time for the retrieval methods (*peek, element, and size*).

**Map**:If we want to represent a group of objects as key-value pairs.Duplicate keys are not allowed, but values can be duplicated.
>Map(I)(1.2)
 * HashMap(C)(1.2)
   * LinkedHashMap(C)(1.4)
 * IdentityHashMap(C)(1.4)
 * WeakHashMap(C)(1.2)
 * HashTable(C)(1.0)
   * Properties(C)(1.0)
   
>Dictionary(Abstract class)
 * HashTable(C)
   * Properties(C)

*Note*: Map is not child interface of collection

**SortedMap**:If we want to represent a group of objects as key-value pairs according to some sorting order.
    Sorting should be based on keys but not based on values.
>Map(I)(1.2)
 * SortedMap(I)(1.2)
   * NavigableMap(I)(1.6)
  	 * TreeMap(C)(1.2)
