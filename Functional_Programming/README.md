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