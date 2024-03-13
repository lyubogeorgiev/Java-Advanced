Lab 01 - L01Jar of T
-

Simple Generic class, called L01Jar. Behind the L01Jar there is a functionality of a stack. To implement it 
is used ArrayDeque.

Lab 02 - Generic Array Creator
-

Creating a static method create of a class ArrayCreator with one reload. It is tricky to create a generic array creator 
method as there is a need of unchecked typecasting, which is not error safe. 

L03 - Generic Scale
-

We make sure to write <T extends Comparable<T>> to make sure the Generic type that scale accepts is comparable. 

L04 - List Utilities
-

We are creating a static methods to get min and max elements of a list, passed to the method. Again, we have to 
make sure that the Generic type T extends Comparable<T>, otherwise the output might produce an error. 

Exercise 01 - Generic Box
-

Generic box that contains 1 element of any type. To override the toString() method displaying the class name by 
using variable_name.getClass().getName();

Exercise 02 - Generic Box Integer
-

The same Generic box class from he previous exercise, but test it with Integer instead of String this time. 

Exercise 03 - Generic Swap Method Strings
-

Using the same Generic Box class from the previous two exercises. Testing it in Main by creating a List of boxes 
and then swapping 2 of the values by indexes.

Exercise 04 - Generic Swap Method Integer
-

Same as the previous problem, but we use a Method to swap boxes, and also they are of type Integer.