# Data-Structure-Algorithm
# data-structure-algorithm
# Data Structure algorithm(In Java)
# Data Structure:
### *A named location that can be used to store and organize data.
## ->Types of data strucuture:
## 1.)Primitive Data Structure:
###    * As we know primitive data structure have build in data types in Java they are,
###  i.)Byte    : whole numbers from -128 to 127.
###  ii.)short   : whole numbers from -32,768 to 32,767.
###  iii.)int     : whole numbers from -2,147,483,648 to 2,147,483,647.
###  iv.)float   : floating point number with single precision.
###  v.)char    : individual characters.
###  vi.)boolean : true or false.
###  vii.)long    : large whole numbers.
###  viii.)Double  : floating factor numbers with double precision.
## 2.)Non primitive data structure:
###   *Non-primitive records structures are more complex and are composed of primitive information sorts.They may be, in addition, categorized into two sorts they are
##  2.1)Linear Data structure:
###      *In linear data structure the elements are arranged linearly or in a sequence.
##       i.)Arrays:
###          *A group of identically typed elements placed in an array according to predetermined arrangement.
##       ii.)Stacks:
###           *A last in first out structure in which only topmost element can be added or removed.
##       iii.)Queues:
###            *A first in first out structure in which items inserted first is taken out first from front.
##       iv.)Linked List:
###           *A related list comprises a collection of gadgets refferred to as nodes, each of which have reference to next node and statics inside it.
##  2.2)Non-linear Data structure:
###      *In non linear data structure the data are arranged in a non linear manner.
##       i.)Trees:
###          *Trees are a type of node-based hierarchical structure, with a root node at the top and child nodes branching out of it. Examples include red-black trees, AVL trees, binary search trees, and  binary trees.
##       ii.)Graphs:
###           *A set of nodes linked by using edges, wherein nodes may have any quantity of connections.Graphs are used to symbolize complex relationships among items.
##       iii.)Heap:
###          *A specialized tree-based structure in which every determined node has a value more or smaller than its kids, relying on whether or not it is a max heap or a min heap.
##       iv.)Hash:
###          *Data structures that use a hash function to map keys to values. Examples consist of hash sets and hash maps, which provide green retrieval and storage of statistics based on precise keys. 
## Advantages(Data structure in Java)
###  ->Efficient Data Organization.
###  ->better performance.
###  ->code reusability.
###  ->code simplicity.
###  ->flexibility and adaptability.
###  ->Standardized and well tested.
###  ->scalability. 
###  ->Algorithm Design. 
## 1.)Arrays:
###  *A collection of elements stored at contiguous memory location.
## Functions:
## ->Creating an Array:
###  *Declare and initialize an array with a specific size using the array type and the new keyword.
## ->Accessing Elements:
###  *Use the index to access individual elements in the array.
## ->Modifying Elements:
###  *Update the value of an element by assigning a new value to a specific index in the array.
## ->Finding Length: 
###  *Use the length attribute to determine the array's length.
## ->Iterating through the Array: 
###  *Use loops to go through each element in the array and execute.
## Advantages:
### 1.)Structured data organization.
### 2.)Random access of elements.
### 3.)Fixed Size.
### 4.)Sorting and searching works well.
### 5.)Can be compatible(Used in various frameworks).
## Disadvantages:
### 1.)Fixed Size.
### 2.)Memory Wastage due to unused elements.
### 3.)Insertion and deletion overhead.
### 4.)Lack of flexibility.
## 2.)Arraylist:
###   *ArrayList in Java is a dynamic data structure(changes its size and structure during execution) that allows for the storage and manipulation(performing operations) of elements.It is part of the Java Collections Framework and is implemented using an array internally.
## Functions:
## ->Creating an Arraylist:
###  *Declare and initialize an ArrayList using the ArrayList class and specify the element type within the angle brackets.
## ->Adding elements:
###  *Use the add method to append elements at the end of the ArrayList.
## ->Accessing elements:
###  *Use the get technique to retrieve the price of detail at a selected index.
## ->Modifying elements:
###  *Update the cost of detail at a specific index for the usage of the set approach.
## ->Finding size:
###  *Use the dimensions method to get the cutting-edge quantity of factors in the ArrayList.
## ->Removing elements:
###  *Use the remove approach to delete a detail at a specific index or via providing the object reference.
## ->Iteration through the arraylist:
###  *Use loops to iterate over each element in the ArrayList and perform operations on them.
## Advantages:
### 1.)Dynamic size(changes its size at runtime).
### 2.)Easy element Manipulation(easy to perform operations).
### 3.)Random Access(Allows random access of data using index).
## Disadvantage:
### 1.)Higher memory overhead(requires more memory to store internal structure).
### 2.)Slower insertion and deletion(insertion and deletion in large list can consume more time).
### 3.)Limited performance for search(searching an element in a unsorted array can take more itertions until the element found).
## 3.)Linked List:
###   *A linked list is a linear data structure in which elements are stored in separate objects called nodes. A reference link to the following node in the sequence is included in each node's data element. The list's final node links to null, indicating that the list has ended.Unlike arrays,linked lists do not require contiguous memory(stored in a sequential or uninterrupted manner in the system) allocation. Each node in a linked list can be allocated independently,allowing for dynamic memory allocation and efficient insertion and deletion operations.
## Functions:
## ->Creating a linkedlist:
###  *Declare and initialize a LinkedList using the LinkedList class.
## ->Adding elements:
###  *Use the add method to append elements at the end of the LinkedList.
## ->Accessing elements:
###  *Use the get method to retrieve the value of an element at a specific index.
## ->Modifying elements:
###  *Update the value of an element at a particular index using the set method.
## ->Removing elements:
###  *Use the remove method to delete an element at a specific index or by providing the object reference.
## Advantages:
### 1.)Dynamic size.
### 2.)efficient insertion and deletion.
### 3.)No contiguous memory requirement.
### 4.)Easy modification.
## Disadvantage:
### 1.)Slower random access.
### 2.)Increased memory overhead(requires additional memory for reference and nodes).
### 3.)Inefficient Search(sequential iteration).
## 4.)Stack:
### A linear data structure that holds a linear, ordered sequence of elements.
## Functions:
## ->Create a stack:
###  *A Stack is created using Stack<T> where T is the data type.
## ->Push: 
###  *The .push(element) method adds an element to the top of the stack.
## ->Pop:
###  *The .pop() method removes and returns the top element of the stack.
## ->Peek:
###  *The .peek() method returns the top element without removing it.
## ->IsEmpty:
###  *The .isEmpty() method checks if the stack is empty.
## ->Size:
###  *The .size() method returns the number of elements in the stack.
## ->Iteration:
###  *for each loop and while loop(is done by .pop()).
## Features:
## ->LIFO behavior:
###  *The last element pushed onto the stack is the first one to be popped out, making it suitable for applications where the order of insertion and removal is important.
## ->Limited access:
###  *Stacks typically provide restricted Access to elements. You can only access the topmost element, and to reach other elements, you need to pop the elements above them.
## ->Dynamic size:
###  * Stacks can be implemented using arrays or linked lists, allowing for a dynamic size. They can grow or shrink as needed during runtime.
## Advantages:
### 1.)Simplicity(easy to understand and implement).
### 2.)Efficiency.
### 3.)Function call management(efficiently manage function and variable storage).
### 4.)undo/redo functionality(satck enable us to undo and redo operations).
## Disadvantage:
### 1.)Limited access(access is restricted to the top of the stack).
### 2.)Size restrictions(stack may have size limitations depending on the imlementation).
### 3.)Not suitable for all scenarios(stack have a specific behavior that is not suitable for other cases).
## 5.)Queue:
###   *A queue is a linear data structure in Java that follows the First-In-First-Out (FIFO) principle. It represents a collection of elements where elements are inserted at the rear and removed from the front.
## Functions:
## ->Enqueue:
###  * Adding an element to the rear of the queue.
## ->Dequeue:
###  *Removing an element from the front of the queue.
## ->Peek:
###  *Retrieve the element at the front of the queue without removing it.
## ->Size:
###  *Determining the number of elements in the queue.
## ->Empty check:
###  *Checking if the queue is empty.
## Advantages:
### 1.)FIFO behavior(preserve the format of original sequence).
### 2.)Efficient Insertion and removal.
### 3.)Synchronization(safe for concurrent programs).
### 4.)Standardized Interface(easily interchangable between different queues).
## Disadvantage:
### 1.)No random access.
### 2.)Limited size.
### 3.)Inefficient Search(requires dequeuing until a match found, high time complexity).
## 6.)Hashmap:
###   *A HashMap is a data structure in Java that provides a way to store and retrieve key-value pairs. It is part of the Java Collections Framework and is implemented based on the hash table data structure.
## Functions:
## ->put(key,value):
###  *Inserts the specified key-value pair into the HashMap.
## ->get(key):
### *Retrieves the value associated with the specified key.
## ->containsKey(key): 
###  *Checks if the HashMap contains the specified key.
## ->containsValue(value): 
###  *Checks if the HashMap contains the specified value.
## ->remove(key): 
###  *Removes the key-value pair associated with the specified key from the HashMap.
## ->size(): 
###  *Returns the number of key-value pairs in the HashMap.
## ->isEmpty():
###  *Checks if the HashMap is empty.
## ->keySet():
###  *Returns a Set containing all the keys in the HashMap.
## ->values(): 
###  *Returns a Collection containing all the values in the HashMap.
## ->clear(): 
### *Removes all the key-value pairs from the HashMap.
## Advantages:
### 1.)Efficient Retrieval (provides fast retrieval of values based on keys).
### 2.)Flexible Key-Value Pairing (HashMap allows any non-null object as a key, enabling custom-defined keys for storing and retrieving data).
### 3.)Dynamic Size (grow or shrink in size).
### 4.)Compatibility with Java Collections Framework (allowing seamless integration with other Collection classes).
## Disadvantages:
### 1.)Lack of Ordering (does not preserve the order of elements).
### 2.)Increased Memory Overhead (requires additional memory for hash codes).
### 3.)Slower Iteration (Iterating over a HashMap can be slower compared to arrays or lists).
## 7.)Hashset:
###   *HashSet is a data structure in Java that implements the Set interface and stores elements in a hash table.
## Features:
## ->Stores unique elements:
###  *HashSet does not allow duplicate elements. Each element in the HashSet is unique.
## ->Uses hash-based lookup:
###  *HashSet uses the hash value of each element to determine its storage location, providing efficient element retrieval.
## ->Unordered collection: 
###  *The elements in a HashSet are not stored in a specific order. The order of elements may change over time.
## vAdvantages:
### 1.)Fast element lookup (efficiently to check if an element exists in the set).
### 2.)No duplicate elements (handles duplicate elements and ensures that each element is unique).
### 3.)Integration with Java Collections Framework (it compatible with other collection classes in the Java Collections Framework).
## Disadvantage:
### 1.)No guaranteed order (does not maintain the order of elements).
### 2.)No indexing (does not provide direct indexing)
### 3.)Higher memory overhead (requires additional memory to store hash values).
## 8.)TreeSet:
###   *TreeSet is an implementation of the SortedSet interface in Java that uses a self-balancing binary search tree called a red-black tree to store elements in sorted order.
## Functions:
## ->add(element):
###  *Adds an element to the TreeSet while maintaining the sorted order.
## ->remove(element): 
###  *Removes the specified element from the TreeSet.
## ->contains(element):
###  *Checks if the TreeSet contains the specified element.
## ->size():
###  *Returns the number of elements in the TreeSet.
## ->first(): 
###  *Returns the first (lowest) element in the TreeSet.
## ->last():
###  *Returns the last (highest) element in the TreeSet.
## ->higher(element):
###  *Returns the least element in the TreeSet that is strictly greater than the given element.
## ->lower(element):  
###  *Returns the greatest element in the TreeSet that is strictly less than the given element.
## Advantages:
### 1.)Sorted Order (maintains the elements in a sorted order).
### 2.)No Duplicate Elements (does not allow duplicate elements).
### 3.)Efficient Operations.
### 4.)Navigable Set Operations (provides additional navigational methods).
## Disadvantages:
### 1.)Overhead (requires additional memory).
### 2.)Slower Insertion and Removal (involve maintaining the sorted order of elements).
### 3.)Limited Customization (is primarily designed for natural ordering or a single custom comparator).
## 9.)TreeMap:
###   *TreeMap is a class in Java that implements the Map interface and provides a sorted key-value mapping based on the natural order of the keys or a custom comparator.
## Functions:
## ->put(key, value): 
###  *Inserts a key-value pair into the TreeMap.
## ->get(key): 
###  *Retrieves the value associated with the specified key.
## ->containsKey(key): 
###  *Checks if the TreeMap contains a specific key.
## ->remove(key): 
###  *Removes the key-value pair associated with the specified key.
## ->size():
###  *Returns the number of key-value pairs in the TreeMap.
## ->keySet():
###  *Returns a set of all keys in the TreeMap.
## ->values():
###  *Returns a collection of all values in the TreeMap.
## ->entrySet():
###  *Returns a set of key-value pairs in the TreeMap.
## Advantages:
### 1.)Sorted Ordering (maintains the keys in sorted order).
### 2.)Key-Value Mapping (stores key-value pairs).
### 3.)Red-Black Tree Implementation: TreeMap uses a balanced binary search tree (Red-Black Tree) internally, ensuring efficient performance even for large datasets.
### 4.)Support for Custom Comparators: TreeMap allows the use of custom comparators to define the sorting order of the keys, providing flexibility in sorting criteria.
## Disadvantages:
### 1.)Memory Overhead (requires additional memory to store the internal tree structure).
### 2.)Slower Insertion and Deletion.
### 3.)Limited Performance for Unsorted Data (performs efficiently for sorted data).
## 10.)Graph:
###    *Graphs are data structure that represents a collection of interconnected nodes or vertices. They are composed of vertices and edges, where vertices  represent entities and edges represent the relationships between those entities.
## Advantages:
### 1.)Versatility(represent a wide variety of real-world relationships and problems across different fields).
### 2.)Relationship Representation(how different entities or objects are connected to each other).
### 3.)Efficient Search and Traversal(the process of systematically visiting every node (vertex) in a graph while minimizing the number of operations needed).
### 4.)Modeling Complex Relationships(using a graph data structure to represent intricate connections between different entities).
## Disadvantages:
### 1.)Space Complexity (the amount of memory an algorithm needs to store and manipulate the graph data while executing).
### 2.)The complexity of Operations (the smallest number of AND, OR and NOT operations required to compute its adjacency function starting from variables and their negations).
### 3.)Difficulty in Maintenance (the challenge of updating or modifying a graph efficiently, especially when dealing with complex relationships between nodes and edges).
## 11.)Tree:
###    *A tree is a widely used data structure in computer science that represents a hierarchical structure. It consists of nodes connected by edges, where each node can have zero or more child nodes.
## functions:
## ->Insertion: 
###  *Add a new node to the tree.
## ->Deletion: 
###  *Remove a node from the tree.
## ->Search:
###  *Find a specific node or element in the tree.
## ->Traversal: 
###  *Traverse the tree in different orders, such as in-order, pre-order, or post-order.
## ->Height/Depth:
###  *Calculate the height or depth of the tree.
## ->Balance:
###  *Ensure the tree remains balanced to maintain efficient operations.
## Advantages:
### 1.)Hierarchical Structure (a natural way to represent hierarchical relationships).
### 2.)Efficient Search (making them suitable for storing and retrieving sorted data.).
### 3.)Fast Insertion and Deletion (offer efficient insertion and deletion operations).
### 4.)Ordered Iteration (traversal of a binary search tree gives elements in a sorted order).
## Disadvantages:
### 1.)High Memory Overhead (require additional memory to store node references or pointers).
### 2.)Complex Implementation (Implementing and maintaining a tree data structure can be more complex).
### 3.)Limited Operations (do not support efficient operations).
