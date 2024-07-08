############################################################
# Author - Darshan Gohil
# Copyright - Darshan Gohil June 2024
# Problem 225 - Implementing STACK using Singly-list(Python) 
########################################################### 

class ListNode:
    # NOTHING CAN BE CHANGED HERE
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

############################################################
#  class  Slist
###########################################################   
class Slist:
    def __init__(self):
        # NOTHING CAN BE CHANGED HERE
        self._first = None
        self._last = None
        self._len = 0

    #############################
    # All public functions BELOW
    # YOU CAN HAVE ANY NUMBER OF PRIVATE FUNCTIONS YOU WANT
    #############################

    # Add a node to the front of the list
    def prepend(self, val):
        new_node = ListNode(val, self._first)
        self._first = new_node
        if self._len == 0:
            self._last = new_node
        self._len += 1
    
    # Retrieve the topmost node from the stack
    def popTopmost(self):
        if self._first is None:
            raise IndexError("pop from empty stack")
        value = self._first.val
        self._first = self._first.next
        self._len -= 1
        if self._len == 0:
            self._last = None
        return value

    # Getting the topmost value of the stack
    def getTop(self):
        if self._first is None:
            raise IndexError("stack is empty")
        return self._first.val

    # To check if the list is empty before popping
    def isEmpty(self):
        return self._len == 0

    # Return the length of the list
    def __len__(self):
        return self._len
    
    # Add a node to the end of the list - queue
    def append(self, val):
        new_node = ListNode(val)
        if self._last is None:
            self._first = self._last = new_node
        else:
            self._last.next = new_node
            self._last = new_node
        self._len += 1

    # Remove a node from the end of the list
    def popLast(self):
        if self._last is None:
            raise IndexError("pop from empty deque")
        if self._first == self._last:
            value = self._last.val
            self._first = self._last = None
        else:
            current = self._first
            while current.next != self._last:
                current = current.next
            value = self._last.val
            self._last = current
            self._last.next = None
        self._len -= 1
        return value
    
    def getLast(self):
        if self._last is None:
            raise IndexError("deque is empty")
        return self._last.val


############################################################
#  MyCircularQueue
# 622. Design Circular Queue
# https://leetcode.com/problems/design-circular-queue/
########################################################### 

class MyCircularQueue:
    def __init__(self, k: int):
        self._K = k 
        self._s = Slist()

    def enQueue(self, value: int) -> bool:
        if self.isFull():
            return False
        self._s.append(value)
        return True

    def deQueue(self) -> bool:
        if self.isEmpty():
            return False
        self._s.popTopmost()
        return True

    def Front(self) -> int:
        return self._s.getTop()

    def Rear(self) -> int:
        if self._s._last is None:
            raise IndexError("queue is empty")
        return self._s._last.val

    def isEmpty(self) -> bool:
        return self._s.isEmpty()

    def isFull(self) -> bool:
        return len(self._s) >= self._K

# Implementation
# Instantiate the MyCircularQueue object
cq = MyCircularQueue(3)

# Test the isEmpty method on an empty queue
print("Is the circular queue empty?", cq.isEmpty())  # Expected: True

# Test the enQueue method
print("Enqueue 10:", cq.enQueue(10))  # Expected: True
print("Enqueue 20:", cq.enQueue(20))  # Expected: True
print("Enqueue 30:", cq.enQueue(30))  # Expected: True
print("Enqueue 40 (should fail):", cq.enQueue(40))  # Expected: False
print("Is the circular queue full?", cq.isFull())  # Expected: True

# Test the Front and Rear methods
print("Front element:", cq.Front())  # Expected: 10
print("Rear element:", cq.Rear())  # Expected: 30

# Test the deQueue method
print("Dequeue:", cq.deQueue())  # Expected: True
print("Front element after dequeue:", cq.Front())  # Expected: 20

# Test the enQueue method again
print("Enqueue 40:", cq.enQueue(40))  # Expected: True
print("Rear element after enqueue:", cq.Rear())  # Expected: 40

# Test the isEmpty and isFull methods again
print("Is the circular queue empty?", cq.isEmpty())  # Expected: False
print("Is the circular queue full?", cq.isFull())  # Expected: True

# Dequeue all elements to test edge cases
print("Dequeue:", cq.deQueue())  # Expected: True
print("Dequeue:", cq.deQueue())  # Expected: True
print("Dequeue:", cq.deQueue())  # Expected: True
print("Is the circular queue empty?", cq.isEmpty())  # Expected: True

# Try dequeuing from an empty queue to see the error handling
print("Dequeue from empty queue:", cq.deQueue())  # Expected: False

# Try getting the front element from an empty queue to see the error handling
try:
    print("Front element from empty queue:", cq.Front())  # This should raise an IndexError
except IndexError as e:
    print("Error:", e)  # Expected: queue is empty

# Try getting the rear element from an empty queue to see the error handling
try:
    print("Rear element from empty queue:", cq.Rear())  # This should raise an IndexError
except IndexError as e:
    print("Error:", e)  # Expected: queue is empty
