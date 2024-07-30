# README

## Table of Contents
1. [Basic Concepts](#basic-concepts)
   - [ArrayList](#arraylist)
   - [Tuple](#tuple)
   - [Set](#set)
   - [Dictionary](#dictionary)
   - [Hash Collision](#hash-collision)
   - [Maximum Number in n-Bit Computer](#maximum-number-in-n-bit-computer)
   - [Don't Care Values](#dont-care-values)
   - [Constructor Return Type](#constructor-return-type)
   - [Pass by Value and Pass by Reference](#pass-by-value-and-pass-by-reference)
   - [Dynamic Memory Allocation](#dynamic-memory-allocation)
2. [Data Structures](#data-structures)
   - [Stack](#stack)
   - [Queue](#queue)
   - [Circular Queue](#circular-queue)
   - [Singly Linked List](#singly-linked-list)
3. [Mathematical Series](#mathematical-series)
   - [Harmonic Series](#harmonic-series)
   - [Arithmetic Series](#arithmetic-series)
4. [Programming Concepts](#programming-concepts)
   - [Recursion](#recursion)
   - [Homogeneous Containers](#homogeneous-containers)
   - [Heterogeneous Containers](#heterogeneous-containers)
5. [Hashing](#hashing)
6. [Graph Data Structure](#graph-data-structure)
7. [Algorithms](#algorithms)
   - [Two Pointer Algorithm](#two-pointer-algorithm)
   - [Reverse a Number - Two-Finger Algorithm](#reverse-a-number-two-finger-algorithm)
   - [Counting Sort Algorithm](#counting-sort-algorithm)
   - [Table Doubling Algorithm](#table-doubling-algorithm)
   - [Graph Traversal Algorithms](#graph-traversal-algorithms)
     - [Depth-First Search (DFS)](#depth-first-search-dfs)
     - [Breadth-First Search (BFS)](#breadth-first-search-bfs)
   - [Greedy Algorithm](#greedy-algorithm)
     - [Kruskal’s Algorithm](#kruskals-algorithm)
     - [Huffman Coding](#huffman-coding)

## Basic Concepts

### ArrayList
**Definition**: A dynamic array that allows for random access and resizes automatically.

**Key Characteristics**:
- **Order**: Maintains the order of elements.
- **Indexing**: Supports indexing (i.e., elements can be accessed via their position).
- **Mutability**: Elements can be modified, added, or removed.
- **Duplicates**: Allows duplicate elements.

**Performance**:
- **Access Time**: O(1) for index-based access.
- **Insertion/Deletion**: O(n) in the worst case, due to potential shifting of elements.

### Tuple
**Definition**: An immutable, ordered collection of elements. In Python, tuples are used; in Java, a similar concept can be created using classes or other constructs.

**Key Characteristics**:
- **Order**: Maintains the order of elements.
- **Indexing**: Supports indexing.
- **Mutability**: Immutable (cannot be modified once created).
- **Duplicates**: Allows duplicate elements.

**Performance**:
- **Access Time**: O(1) for index-based access.
- **Insertion/Deletion**: Not applicable (immutable).

### Set
**Definition**: A collection of unique elements with no specific order.

**Key Characteristics**:
- **Order**: Does not maintain order (in Python, order is preserved as of Python 3.7+ but it's not a characteristic of sets).
- **Indexing**: Does not support indexing.
- **Mutability**: Elements can be added or removed, but the set itself is mutable.
- **Duplicates**: Does not allow duplicate elements.

**Performance**:
- **Access Time**: O(1) for membership tests.
- **Insertion/Deletion**: O(1) on average.

### Dictionary
**Definition**: A collection of key-value pairs where each key is unique and maps to a value.

**Key Characteristics**:
- **Order**: Maintains insertion order (as of Python 3.7+).
- **Indexing**: Uses keys (not integer indices) to access values.
- **Mutability**: Keys and values can be modified, added, or removed, but keys must be immutable.
- **Duplicates**: Keys must be unique, but values can be duplicated.

**Performance**:
- **Access Time**: O(1) on average for key-based access.
- **Insertion/Deletion**: O(1) on average for adding or removing key-value pairs.

### Hash Collision
A hash collision occurs when two different inputs produce the same hash value. In the context of hash functions, this means that despite having different data or objects, their hash codes are identical.

### Maximum Number in n-Bit Computer
The maximum number that can be stored in an n-bit computer is \(2^n - 1\).

### Don't Care Values
In a set, don't care values refer to values that are ignored or not considered when evaluating certain conditions or operations.

### Constructor Return Type
A constructor does not have a return type because its sole purpose is to initialize an object. Constructors implicitly return the instance of the class they are constructing.

### Pass by Value and Pass by Reference
- **Pass by Value**: The function receives a copy of the argument's value, so changes to the parameter do not affect the original argument.
- **Pass by Reference**: The function receives a reference to the actual argument, so changes to the parameter affect the original argument.

### Dynamic Memory Allocation
Dynamic memory allocation allows a program to request memory during runtime, providing flexibility to handle varying data sizes and improving memory management.

## Data Structures

### Stack
A stack is a data structure that follows the Last In, First Out (LIFO) principle.

**Operations**:
1. **PUSH**: Add an element to the stack.
2. **POP**: Remove the most recently added element.
3. **TOP**: Access the top element without removing it.
4. **isFull**: Check if the stack is full.
5. **isEmpty**: Check if the stack is empty.

### Queue
A queue is a data structure that follows the First In, First Out (FIFO) principle.

**Operations**:
1. **Enqueue**: Add an element to the end of the queue.
2. **Dequeue**: Remove the element from the front of the queue.
3. **Front**: Get the element at the front without removing it.
4. **isFull**: Check if the queue is full.
5. **isEmpty**: Check if the queue is empty.

### Circular Queue
A circular queue is a queue where the last position is connected back to the first position.

**Operations**:
1. **Enqueue**: Add an element to the end of the queue.
2. **Dequeue**: Remove the element from the front of the queue.
3. **Front**: Get the element at the front without removing it.
4. **Rear**: Get the element at the rear without removing it.
5. **isFull**: Check if the queue is full.
6. **isEmpty**: Check if the queue is empty.

### Singly Linked List
A singly linked list consists of nodes where each node contains data and a reference to the next node.

**Operations**:
1. **Insertion**: Add a node at a specified position.
2. **Deletion**: Remove a node from a specified position.
3. **Traversal**: Traverse from the head node to the last node.
4. **Search**: Find a node with a specific value.
5. **Update**: Modify the data of a node.

## Mathematical Series

### Harmonic Series
The harmonic series is the sum of the reciprocals of positive integers. Despite the terms getting smaller, the series diverges, meaning it grows without bound as more terms are added.

### Arithmetic Series
An arithmetic series is the sum of the terms of an arithmetic sequence, where each term is obtained by adding a constant difference to the preceding term.

## Programming Concepts

### Recursion
Recursion is a programming technique where a function calls itself to solve smaller instances of the same problem.

**Components**:
- **Base Case**: Stops the recursion by providing a direct solution.
- **Recursive Case**: Function calls itself with a modified argument.

**Considerations**:
- **Stack Overflow**: Can occur if the recursion depth is too deep.
- **Performance**: Recursive solutions can be less efficient due to function call overhead.
- **Tail Recursion**: Some languages optimize tail-recursive functions to reduce stack depth.

### Homogeneous Containers
**Definition**: Collections that store elements of the same type.

**Examples in Java**:
- `ArrayList`: A dynamic array of specified type.
- `HashSet`: A set of unique elements of specified type.
- `LinkedList`: A doubly-linked list of specified type.

### Heterogeneous Containers
**Definition**: Collections that store elements of different types.

**Examples in Java**:
- `Object Array`: An array that can store different types of elements.
- `HashMap`: A map storing key-value pairs of different types.

## Hashing

### Hash
A fixed-size value generated from input data.

### Hashing
The process of generating a hash value using a hash function.

### Hash Function
An algorithm that converts input data into a hash value.

### Hash Table
A data structure that uses hashing to manage and retrieve data efficiently.

### Collisions
Occur when different inputs produce the same hash value.

## Graph Data Structure
A graph represents relationships between pairs of entities.

**Components**:
- **Vertices (Nodes)**: Fundamental units representing entities.
- **Edges (Arcs)**: Connections or relationships between vertices.

**Types of Graphs**:
- **Undirected Graph**: Bidirectional edges.
- **Directed Graph (Digraph)**: Unidirectional edges.
- **Weighted Graph**: Edges have weights.
- **Unweighted Graph**: Edges have no weights.
- **Cyclic Graph**: Contains at least one cycle.
- **Acyclic Graph**: No cycles.
- **Connected Graph**: Every vertex is reachable from every other vertex.
- **Disconnected Graph**: Some vertices are not reachable from others.
- **Complete Graph**: Every pair of distinct vertices is connected.

**Graph Representations**:
- **Adjacency Matrix**: A 2D array indicating edge presence.
- **Adjacency List**: An array of lists where each list represents connected vertices.

## Algorithms

### Two Pointer Algorithm
An algorithmic technique that uses two pointers to solve problems efficiently, typically in sorting or searching.

### Reverse a Number - Two-Finger Algorithm
An algorithm to reverse the digits of a number using two pointers or indices.

### Counting Sort Algorithm
A non-comparison-based sorting algorithm that counts occurrences of each value to determine positions in the sorted array.

### Table Doubling Algorithm
Used in dynamic arrays and hash tables to handle growth by doubling the size of the array. Consider amortized conditions for efficiency.

### Graph Traversal Algorithms

#### Depth-First Search (DFS)
Explores as far as possible along a branch before backtracking. Uses a stack (explicitly or via recursion).

#### Breadth-First Search (BFS)
Explores all neighbors at the present depth level before moving on to the next level. Uses a queue.

### Greedy Algorithm
Aims to make the optimal local choice at each step with the hope of finding the global optimum.

**Examples**:
- **Kruskal’s Algorithm**: Finds the Minimum Spanning Tree by selecting the smallest weight edge that doesn't form a cycle.
- **Huffman Coding**: A data compression algorithm that builds a prefix-free binary code based on character frequencies.

