#Implement Stack as a QUEUE 
class MyQueue:
    def __init__(self):
        self._primaryStack = []
        self._tempStack = []

    def enqueue(self, x: int) -> None:
        # To enqueue an element, simply push it onto the primary stack
        self._primaryStack.append(x)

    def dequeue(self) -> int:
        # Check if the temporary stack is empty and if yes, transfer elements from the primary stack
        if not self._tempStack:
            while self._primaryStack:
                self._tempStack.append(self._primaryStack.pop())
        # Pop from the temporary stack to dequeue an element
        if self._tempStack:
            return self._tempStack.pop()
        else:
            raise IndexError("dequeue from empty queue")

    def front(self) -> int:
        # Similar to dequeue, but instead of popping, just return the top element of the temporary stack
        if not self._tempStack:
            while self._primaryStack:
                self._tempStack.append(self._primaryStack.pop())
        if self._tempStack:
            return self._tempStack[-1]
        else:
            raise IndexError("front from empty queue")

    def isEmpty(self) -> bool:
        # The queue is empty if both stacks are empty
        return not self._primaryStack and not self._tempStack

    def isFull(self) -> bool:
        # In a dynamic data structure like this, the queue is never full
        return False

# Implementation
queue = MyQueue()

# Test the isEmpty method on an empty queue
print("Is the queue empty?", queue.isEmpty())  # Expected: True

# Test the enqueue method
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)
print("After enqueueing 10, 20, 30:")

# Test the front method
print("Current front element:", queue.front())  # Expected: 10

# Test the dequeue method
print("Dequeued element:", queue.dequeue())  # Expected: 10
print("Current front element after dequeue:", queue.front())  # Expected: 20

# Test the enqueue method again
queue.enqueue(40)
print("After enqueueing 40:")

# Test the front method again
print("Current front element:", queue.front())  # Expected: 20

# Test the isEmpty method again
print("Is the queue empty?", queue.isEmpty())  # Expected: False

# Test the dequeue method until the queue is empty
print("Dequeued element:", queue.dequeue())  # Expected: 20
print("Dequeued element:", queue.dequeue())  # Expected: 30
print("Dequeued element:", queue.dequeue())  # Expected: 40

# The queue should be empty now
print("Is the queue empty?", queue.isEmpty())  # Expected: True

# Try dequeuing from an empty queue to see the error handling
try:
    queue.dequeue()  # This should raise an IndexError
except IndexError as e:
    print("Error:", e)  # Expected: dequeue from empty queue

# Try getting the front element from an empty queue to see the error handling
try:
    queue.front()  # This should raise an IndexError
except IndexError as e:
    print("Error:", e)  # Expected: front from empty queue
