Lab 01 - Sort Even Numbers
-

Solving the problem with Functional Programing. In order to do so, we are creating a function of type IntPredicate which 
we will using in the filter and returns only the values that are even numbers. To print the results we are going to map 
the int[] array to object and joining the elements with delimiter by using .collect(Collectors.joining(", ")).

Lab 02 - Sum Numbers
-

Storing the input in List<Integer>. Created 2 Functions that take List<Integer> as parameter and return String. The first 
function returns a count of elements in the List with .size(). The second function returns a sum off all elements. In order 
to be able to use the .sum() function over the IntStream we are mapping Integer values to the primitive int type with 
.mapToInt(Integer::valueOf).

Lab 03 - Count Uppercase Words
-

Creating a Predicate function which returns true or false whether the word is starting with uppercase or not. Using the 
predicate function in stream of words in .filter() to return a collection of the words only starting with uppercase letter. 
printing the size of the collection and then printing each word of the collection on a new line by using .forEach() on List.

Lab 04 - Add VAT
-

Reading a collection of prices which are double. Creating a UnaryOperator function which takes Double and returns Double. 
Stream over the original collection and use the created UnaryOperator unction in map to apply to each element of the collection. 
Using stream to print and format with printf each element on a new line.

Lab 05 - Filter By Age
-

Using a Predicate function to filter the entries by "older" or "younger" than the given age. For printing the result 
using a Function in stream().map() to use only the name, age, or both, according to the rule. Storing the result in a 
List<String> and printing it with .forEach() method line by line.

Lab 06 - Find Even or Odds
-

Creating a List of Integers which contains elements from lower bound to upper bound. Created a Predicate function to 
filter the collection by command. To print the collection on one line, separated by a space, used a stream of the collection, 
mapped to Object and then used the collect(Collectors.joining()) to join the elements with a separator and store it to a 
String in order to print it. 

Exercise 01 - Consumer Print
-

Store the user input in a List first. Creating a Consumer function which takes a String as input and prints it on the 
console. Using List.forEach() and the created consumer function to print each of the list elements to the console.

Exercise 02 - Knights of Honor
-

Storing all names from the user input into a List. Creating a Consumer function which takes string and prints the 
string with addition in front according to the requirement. Finally iterating over the List with functional forEach() 
and printing each element by using the consumer function. 

Exercise 03 - Custom Min Function
-

Storing all numbers from the user input into a set. Creating a Function which takes Set<Integer> as a parameter and 
the output is an Integer which will be the min of the set. At the end just printing the output of the function.

Exercise 04 - Applied Arithmetic
-

Storing the user input into a list of Integers. Creating 3 Functions respectively for add, subtract, and multiply and 
one Consumer to print the resulting list. Creating a Switch-Case to switch over to a command and calling the right Function 
depending on the user command. 

Exercise 05 - Reverse and Exclude
-

Storing the initial collection entered by the user on console in a List<Integer>. Creating a Predicate to filter the 
numbers which are divisible by user entered value n and Function which takes a List and returns a List to reverse it. 
Finally printing everything by mapping it to Strings and joining it with collect(Collectors.joining()) function.

Exercise 06 - Predicate For Names
-

Creating a Predicate which takes a String as input and returns true if the word is less or equal to the desired length 
entered by the user. 

Exercise 07 - Find the Smallest Element
-

Creating a Function which takes List<Integer> which is the list of user input values and returning Integer which is the 
rightmost index of the smallest element in the list. 

Exercise 08 - Custom Comparator
-

Created a custom Comparator which sorts the even numbers first and then smaller numbers before the larger numbers.

Exercise 09 - List Of Predicates
-

Created a Predicate to filter the numbers of the collection that are divisible by the given numbers called divisors. 

Exercise 10 - Predicate Party
-

Checking the condition and command with a series of if-else statements. created Predicate which takes a String parameter 
and checks if the name satisfies a certain condition. Then filtering through the List of names and depending if the name 
which meets the condition has to be removed or doubled according to the main condition, either assign the filtered list 
as our main list or if has to be doubled, then use the List function addAll() to add all elements of the filtered list to 
the main guest list.