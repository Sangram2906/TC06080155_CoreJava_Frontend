package session__10;

/*1. Arrays -
 *   homogeneous data type element.
 *   no readymade method support 
 *   hold both primitives & object types
 *   
 *2. Legacy classes-
 *	 Firstly collection added in J2SE 1.2 & original classes reengineered to support collectn interface called legacy classes
 *	 All redesigning by JDK5 to suuport generics.
 *	 synchronized
 *	 legacy characters - Enumeration(l), Dictionary(AC), Vector(c), Stack(c), HashTable(c), Properties(c)
 *	
 *3. Collection framework
 *	 Memory point of view collection r highly recommend to use
 *	 Performance point of view not recommend
 *	 Holds both homogeneous & heterogeneous elements
 *	 based on standard data structure and method support is available
 *	 No concrete class  
 *	                           Collection(l)(1,2V)
 *
 *										|
 *    ------------------------------------------------------------------------------------------------------
 *    |                                  |                                                            |
 *    List)                             Set(I)                                                      Queue(I)
 *    |                                 /     \                                                     /     \
 *    ArrayList(C)               HashSet(c) SortedSet(I)                                  Priority Queue  BlockingQueue(c)
 *    |                              |          |
 *    
 *    
 *    
 *    
 *    **Diference b/w ArrayList and vector */