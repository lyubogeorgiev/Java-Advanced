Lab 01 - Parking Lot
-

Implementing a LinkedHashSet to simulate a parking lot. We enter cars to the parking lot by their license plate number 
and also removing them the same way. At the end we print all the cars which are in the parking lot in order of their 
appearance. If the parking lot is empty, then we print the message "Parking Lot is Empty" on the console.

Lab 02 - SoftUni Party
-

Using a TreeSet to sort VIP guests which start with number in the beginning of the set.

Lab 03 - "Voina" - Number Game
-

Using two LinkedHashSets to represent every players' stacks and preserve the order of the cards. To iterate through the 
stacks using iterator().next(), removing every card and inserting back to the winners stack respectively.

Lab 04 - Count Real Numbers
-

Using LinkedHashMap to count the occurrences of numbers in an user input array of doubles. 

Lab 05 - Average Students Grades
-

Using a TreeMap to store all the students grades and keep in lexicographic order of names. The key will be the student 
name and the value of the map will be a list of the grades. We are using a list in order to be able to add more and more 
grades in the future. To calculate the average grade for each student, we created a function. 

Lab 06 - Product Shop
-

The problem is solved by using a nested Map into the main map. Keep track of the store, and the products in each store 
and each products' prices. For the main map we need to order the stores in lexicographic order which makes use for 
TreeMap. For the inside Map with the products and prices in each store, we need to keep in order of inserting the 
products which will use LinkedHashMap for it.