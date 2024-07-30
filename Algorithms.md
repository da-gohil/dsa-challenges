---

# 📚 Program Structures and Algorithms (PSA - Summer 2024) - Notes

---

## Index
1. [Basic Concepts](#basic-concepts)
   - [ArrayList](#arraylist)
   - [Tuple](#tuple)
   - [Set](#set)
   - [Dictionary](#dictionary)
   - [Hash Collision](#hash-collision)
   - [Maximum Number in n-Bit Computer](#maximum-number-in-n-bit-computer)
   - [Don’t Care Values in a Set](#dont-care-values-in-a-set)
   - [Constructor Return Type](#constructor-return-type)
   - [Pass by Value vs. Pass by Reference](#pass-by-value-vs-pass-by-reference)
   - [Dynamic Memory Allocation](#dynamic-memory-allocation)
   - [Stack](#stack)
   - [Queue](#queue)
   - [Circular Queue](#circular-queue)
   - [Singly Linked List](#singly-linked-list)
   - [Harmonic Series](#harmonic-series)
   - [Arithmetic Series](#arithmetic-series)
   - [Recursion](#recursion)
   - [Homogeneous Containers](#homogeneous-containers)
   - [Heterogeneous Containers](#heterogeneous-containers)
   - [Hash and Hashing](#hash-and-hashing)
   - [Graph Data Structure](#graph-data-structure)
2. [Algorithms](#algorithms)
   - [Two Pointer Algorithm](#two-pointer-algorithm)
   - [Reverse a Number - Two-Finger Algorithm](#reverse-a-number--two-finger-algorithm)
   - [Counting Sort Algorithm](#counting-sort-algorithm)
   - [Table Doubling Algorithm](#table-doubling-algorithm)
   - [Graph Traversal Algorithms](#graph-traversal-algorithms)
     - [Depth-First Search (DFS)](#depth-first-search-dfs)
     - [Breadth-First Search (BFS)](#breadth-first-search-bfs)
   - [Greedy Algorithm](#greedy-algorithm)
     - [Kruskal’s Algorithm](#kruskals-algorithm)
     - [Huffman Coding](#huffman-coding)

---

## Basic Concepts

### 1. ArrayList
- **Definition**: A dynamic array that allows for random access and resizes automatically.
- **Key Characteristics**:
  - **Order**: Maintains the order of elements.
  - **Indexing**: Supports indexing (i.e., elements can be accessed via their position).
  - **Mutability**: Elements can be modified, added, or removed.
  - **Duplicates**: Allows duplicate elements.
- **Performance**:
  - **Access Time**: O(1) for index-based access.
  - **Insertion/Deletion**: O(n) in the worst case, due to potential shifting of elements.

### 2. Tuple
- **Definition**: An immutable, ordered collection of elements. In Python, tuples are used; in Java, a similar concept can be created using classes or other constructs.
- **Key Characteristics**:
  - **Order**: Maintains the order of elements.
  - **Indexing**: Supports indexing.
  - **Mutability**: Immutable (cannot be modified once created).
  - **Duplicates**: Allows duplicate elements.
- **Performance**:
  - **Access Time**: O(1) for index-based access.
  - **Insertion/Deletion**: Not applicable (immutable).

### 3. Set
- **Definition**: A collection of unique elements with no specific order.
- **Key Characteristics**:
  - **Order**: Does not maintain order (in Python, order is preserved as of Python 3.7+ but it's not a characteristic of sets).
  - **Indexing**: Does not support indexing.
  - **Mutability**: Elements can be added or removed, but the set itself is mutable.
  - **Duplicates**: Does not allow duplicate elements.
- **Performance**:
  - **Access Time**: O(1) for membership tests.
  - **Insertion/Deletion**: O(1) on average.

### 4. Dictionary
- **Definition**: A collection of key-value pairs where each key is unique and maps to a value.
- **Key Characteristics**:
  - **Order**: Maintains insertion order (as of Python 3.7+).
  - **Indexing**: Uses keys (not integer indices) to access values.
  - **Mutability**: Keys and values can be modified, added, or removed, but keys must be immutable.
  - **Duplicates**: Keys must be unique, but values can be duplicated.
- **Performance**:
  - **Access Time**: O(1) on average for key-based access.
  - **Insertion/Deletion**: O(1) on average for adding or removing key-value pairs.

### 5. Hash Collision
- **Definition**: A hash collision occurs when two different inputs produce the same hash value. In the context of hash functions, this means that despite having different data or objects, their hash codes are identical.

### 6. Maximum Number in n-Bit Computer
- **Definition**: The maximum number that can be stored in an n-bit computer is \(2^n - 1\).

### 7. Don’t Care Values in a Set
- **Definition**: Values that can be ignored or are not relevant to the specific operation or context.

### 8. Constructor Return Type
- **Explanation**: Constructors don’t have a return type because they are used to initialize objects and do not return any value.

### 9. Pass by Value vs. Pass by Reference
- **Pass by Value**: A copy of the variable is passed, and changes to the copy do not affect the original variable.
- **Pass by Reference**: A reference to the variable is passed, and changes to the reference affect the original variable.

### 10. Dynamic Memory Allocation
- **Definition**: Dynamic memory allocation allows programs to request memory space at runtime, which is useful for handling varying amounts of data and managing memory efficiently.

### 11. Stack
- **Definition**: A stack is a data structure that follows the Last In, First Out (LIFO) principle, meaning the last element added is the first to be removed.
- **Operations**:
  1. **PUSH**: Add an element.
  2. **POP**: Remove the most recently added element.
  3. **TOP**: Get the top element.
  4. **isFull**: Check if the stack is full.
  5. **isEmpty**: Check if the stack is empty.

### 12. Queue
- **Definition**: A queue is a data structure that follows the First In, First Out (FIFO) principle, meaning the first element added is the first to be removed.
- **Operations**:
  1. **Enqueue**: Add an element to the end.
  2. **Dequeue**: Remove the element from the front.
  3. **Front**: Get the front element.
  4. **isFull**: Check if the queue is full.
  5. **isEmpty**: Check if the queue is empty.

### 13. Circular Queue
- **Definition**: A circular queue follows the FIFO principle but connects the last position back to the first position, allowing for efficient use of space.
- **Operations**:
  1. **Enqueue**: Add an element to the end.
  2. **Dequeue**: Remove the element from the front.
  3. **Front**: Get the front element.
  4. **Rear**: Get the rear element.
  5. **isFull**: Check if the queue is full.
  6. **isEmpty**: Check if the queue is empty.

### 14. Singly Linked List
- **Definition**: A singly linked list consists of nodes where each node contains a data element and a reference to the next node. It allows efficient insertion and deletion operations but supports only forward traversal.
- **Operations**:
  1. **Insertion**: Add a node at a specified position.
  2. **Deletion**: Remove a node from a specified position.
  3. **Traversal**: Traverse from the head to the last node.
  4. **Search**: Find a node with a specific value.
  5. **Update**: Modify the data of a specific node.

### 15. Harmonic Series
- **Definition**: The harmonic series is the sum of the reciprocals of positive integers. It diverges, meaning the sum grows without bound as more terms are added.
- **Significance**: Used in mathematics, analysis, and physics.

### 16. Arithmetic Series
- **Definition**: An arithmetic series is the sum of terms in an arithmetic sequence, where each term is obtained by adding a constant difference to the preceding term.

### 17. Recursion
- **Definition**: Recursion is a technique where a function calls itself to solve smaller instances of a problem.
- **Components**:
  - **Base Case**: Stops recursion.
  - **Recursive Case**: Calls itself with a modified argument.
- **Considerations**:
  - **Stack Overflow**: Risk if recursion depth is too deep.
  - **Performance**: Can be less efficient; iterative solutions may be better.
  - **Tail Recursion**: Some languages optimize tail-recursive functions.

### 18. Homogeneous Containers
- **Definition**: Collections storing elements

 of the same type.
- **Examples**:
  - **ArrayList**: Dynamic array of a specified type.
  - **HashSet**: Collection without duplicates.
  - **LinkedList**: Doubly-linked list of a specified type.

### 19. Heterogeneous Containers
- **Definition**: Collections storing elements of different types.
- **Examples**:
  - **Object Array**: Array of different types.
  - **HashMap**: Map with different key and value types.

### 20. Hash and Hashing
- **Hash**: A fixed-size value generated from input data.
- **Hashing**: Process of generating a hash value using a hash function.
- **Hash Function**: Converts input data into a hash value.
- **Hash Table**: Uses hashing to manage and retrieve data.
- **Collisions**: Occur when different inputs produce the same hash value.

### 21. Graph Data Structure
- **Definition**: A collection of nodes (vertices) and edges connecting pairs of nodes. Used to represent relationships and connections.

---

## Algorithms

### 1. Two Pointer Algorithm
- **Definition**: Uses two pointers to efficiently solve problems, often in sorting or searching.

### 2. Reverse a Number - Two-Finger Algorithm
- **Definition**: Reverses digits of a number using two pointers or indices.

### 3. Counting Sort Algorithm
- **Definition**: Non-comparison-based sorting algorithm that counts occurrences of values.

### 4. Table Doubling Algorithm
- **Definition**: Handles dynamic arrays and hash tables by doubling the size of the array. Consider amortized conditions for efficiency.

### 5. Graph Traversal Algorithms

#### a) Depth-First Search (DFS)
- **Definition**: Explores as far as possible along a branch before backtracking. Uses a stack (explicitly or via recursion).

#### b) Breadth-First Search (BFS)
- **Definition**: Explores all neighbors at the present depth level before moving on to the next level. Uses a queue.

### 6. Greedy Algorithm
- **Definition**: Makes optimal local choices at each step to find a global optimum.

#### a) Kruskal’s Algorithm
- **Definition**: Finds the Minimum Spanning Tree (MST) by sorting edges and adding them one by one, avoiding cycles.

#### b) Huffman Coding
- **Definition**: An optimal prefix coding algorithm used for data compression by assigning variable-length codes to input characters.

---

Feel free to tweak or add more details as needed!
