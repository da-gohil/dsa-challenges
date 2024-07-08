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
#  MyCircularDeque
# 641. Design Circular Deque
# https://leetcode.com/problems/design-circular-deque
###########################################################
class MyCircularDeque:
    def __init__(self, k: int):
        self._K = k
        self._s = Slist()

    def insertFront(self, value: int) -> bool:
        if self.isFull():
            return False
        self._s.prepend(value)
        return True

    def insertLast(self, value: int) -> bool:
        if self.isFull():
            return False
        self._s.append(value)
        return True

    def deleteFront(self) -> bool:
        if self.isEmpty():
            return False
        self._s.popTopmost()
        return True

    def deleteLast(self) -> bool:
        if self.isEmpty():
            return False
        self._s.popLast()
        return True

    def getFront(self) -> int:
        if self.isEmpty():
            return -1  # Return -1 if the deque is empty
        return self._s.getTop()

    def getRear(self) -> int:
        if self.isEmpty():
            return -1  # Return -1 if the deque is empty
        return self._s.getLast()

    def isEmpty(self) -> bool:
        return self._s.isEmpty()

    def isFull(self) -> bool:
        return len(self._s) >= self._K
