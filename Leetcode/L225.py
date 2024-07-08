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

    # PUSH an element to the STACK
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

    # Get the last value of the list
    def getLast(self):
        if self._last is None:
            raise IndexError("deque is empty")
        return self._last.val

############################################################
#  class  MyStack
# 225. Implement Stack using Queues
# https://leetcode.com/problems/implement-stack-using-queues
###########################################################
class MyStack:
    def __init__(self):
        self._s = Slist()

    def push(self, x: int) -> None:
        self._s.prepend(x)

    def pop(self) -> int:
        return self._s.popTopmost()

    def top(self) -> int:
        return self._s.getTop()

    def empty(self) -> bool:
        return self._s.isEmpty()