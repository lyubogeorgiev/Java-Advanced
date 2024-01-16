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

Lab07 - Cities by Continent and Country
-

Two nested LinkedHashMaps are used to solve the problem in order to preserve the order of entrance. The first Map has 
for the the continent name, for value has a nested Map which have key - country name and value is a List of cities. 

Lab 08 - Academy Graduation
-

Created a map with key students name and value a List of students grades. Iterating through the map and created a method 
which is used to calculate the average grade with which each student has graduated. 

Lab09 - Largest Three Numbers
-

Created a list and sorting the list in reverse order at the moment of entering the elements into the list. 

Exercise 01 - Unique Usernames
-

In order to store only unique usernames entered by the user from the console we are storing them in a Set.

Exercise 02 - Sets of Elements
-

Used the existing function of the Set class retainAll to find all the elements that are present in both sets.

Exercise 03 - Periodic Table
-

TreeSet was used to keep only unique elements and also to preserve the order in which they are entered.

Exercise 04 - Count Symbols
-

TreeMap is used to count symbols in a line entered on the console by a user. Key is the character and for value we store 
integer values, which will be increased by one if the same character has already been added as a key. 

Exercise 05 - Phonebook
-

A HashMap is used to simulate a phonebook. The key is the name and the value is the phone number, both stored as strings. 

Exercise 06 - Fix Emails
-

A LinkedHashMap is used to preserve the order at which the entries are entered. The key in the map is the name of the 
person and the value is persons' email address. Email addresses which are ending in "us", "uk", or "com" are not eligible 
to be stored in the maps, so we filter them before putting the entry to the map by using the function endsWith() which 
is a part of the String class.

Exercise 07 - Hands of Cards
-

Every player has a deck of cards. At the end we need to calculate each players points. To store all the players and their 
decks of cards we are using a LinkedHashMap to preserve the order of appearance. The key of the map is String which is 
players' name. The value is a Set of cards, which makes sure a player cannot have the same card more than once. They are 
playing with multiple decks.

Exercise 08 - User Logs
-

The main map has usernames as key and another map which has IP address as a key and a count of messages from every ip 
address as a value. 

Exercise 09- Population Counter
-

This exercise is about sorting Maps by its values. This is implemented by converting the Map to List<Map.Entry<K, V>>.
Then a List.sort() function is used to get the lists sorted by values. 

Exercise 10 - Logs Aggregator
-

To keep track of the usernames with the IPs and usernames with the duration we are using 2 Maps. First map has a key of 
username and a value of a list of durations. The second map has username as a key and value a Set of IP addresses as 
the IP addresses in the output need to be only unique. 