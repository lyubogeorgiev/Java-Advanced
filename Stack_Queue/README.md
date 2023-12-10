Stacks and Queues
-

Lab 1 - Browser History
-

Lab 02 - Simple Calculator
-

Lab 03 - Decimal to Binary Converter
-

Lab 04 - Matching Brackets
-

The problem was solved by reading the input string character by character. When an open bracket character is read from the input string, its index in the string is pushed to a stack. When a closing bracket is read from the inout string, its index is taken as end index, and the topmost element in the stack is taken as a start index. Then a substring between start and end indexes is printed on the console. 

Lab 05 - Printer Queue
-

The solution of a printer queue was implemented by using a Queue data structure. The files to be printed could be canceled one by one, or if the printer queue is empty and the user tries to cancel a print job, it displays a message that "The printer is on Standby". Then all the files are printer in order of FIFO until the queue is empty. 

Lab 06 - Hot Potato
-

The Hot Potato labs' solution was implemented by simulation the circle of kids that are passing the hot potato between each other by using a queue data structure. The number of rounds n at which a kid goes out is defined by the user as a second input variable. The loop with the potato passing through the kids going until the circle has only 1 kid left inside, in ither words, the while loop breaks when the queue size reaches 1.
