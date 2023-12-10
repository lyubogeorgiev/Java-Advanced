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

Lab 07 - Math Potato
-

The upgrade of the Lab 06 - here we have to keep count ot the rounds as if it's a prime round, nobody can be removed from the circle, only supposed to print the name of the kid who is holding the potato. Another thing as upgrade here is that a PriorityQueue has to be use for this solution instead of a regular Queue, which means that the kids have to be sorted by their names all the time. A function which checks if the round is prime or not is implemented for a code clarity. 

Lab 08 - Browser History Upgrade
-

This is an Upgrade of a Lab 01 Browser history, where there was only back functionality. This solution uses 2 stacks - one for back and one for forward urls to simulate real browser job. If a new URL is input into the browsers url address all the forward stack urls are cleared. 

Exercise 01 - Reverse Numbers with a Stack
-

Straightforward problem to collect a user input on one line with space between the numbers, push all the numbers in a stack and the pull numbers back from the stack and print on the console with a space between each number. 
