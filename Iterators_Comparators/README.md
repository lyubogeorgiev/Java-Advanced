Lab 01 - Book
-

The idea is that the constructor and setAuthor method can have a variable length of arguments - 0 or more.

Lab 02 - Library
-

Created a Library class which has an Array of type Book inside. Library class implements Iterable<> interface, and 
implements its method iterator() which is of type Iterator<>. There is an inside class of type Iterator<Book> which 
implements Iterator<> interface and its two methods hasNext() and next(). I the inside class there is also a counter 
to keep track on the position of the iterator.

Lab 03 - Comparable Book
-

Implemented Comparable<Book> interface to the Book class and its method compareTo(Book other). The method compareTo() 
returns -1, 0, or 1 by design. We are comparing books by Author, and if the Authors are equal, then by year. 

Lab 04 - Book Comparator
-

Created an external Class BookComparator that implemented the interface Comparator<Book> and its method compare. The 
difference between this way to compare and the one with a method compareTo() inside the Book class is that here we can 
compare any 2 books by just passing book1 and books2 to BookComparator.compare();

Exercise 01 - Listy Iterator
-

A class ListyIterator will implement Interface Iterator<String>. The class itself will have a container which will is a 
List of Strings. The class is tested in the Main method according to the requirements.

Exercise 02 - Collection
-

ListyIterator class implements Interface Iterable<>. Inside the class have another class which implements 
interface Iterator<>.

Exercise 03 - Stack Iterator
-

Created a nested class Iterator<T> into the StackIterator class. The main was implemented according to the requirements. 
Created a method in main, which returns only an array of Integer by separating the command out of the array.

Exercise 04 - Froggy
-

The specific thing here is to make the Iterator<> iterate over the odd indexes first and then iterate over the even indexes 
till the end of the container Array.

Exercise 05 - Comparing Objects
-

Implementing Comparable<> interface to the class person and overriding the compareTo() method 
to specify how an Object of type Person will compare to another object of Person class.

Exercise 06 - Strategy Pattern
-

Creates 2 classes NameComparator and AgeComparator which both extend the Comparator<Person> class. Each of the comparator 
classes are comparing the Person object according to the requirements. 2 TreeSets were created as one is using the first 
Comparator class and the other one is using the second Comparator class. TreeSet(new NameComparator()); The toString() 
method is overridden in the class Person.