Lab 01 - Read File
-

Reading a txt file byte by byte. Each byte has to be printed on the console separated by a white space. Using FileInputStream 
class to read the file, try-catch with resources, which will automatically close the resources when the execution is finished. 
Reading bytes while nextByte is different from -1. If there is no more byte to be read the fileInputStream.read() returns 
-1 and this is our condition to stop reading. 

Lab 02 - Write to a File
-

Using FileInputStream class to read from the file. Using if-statement to filter the symbols that doesn't have to be 
written to the output file. Write byte by byte to the output file by using the FileOutputStream class.

Lab 03 - Copy Bytes
-

Reading the file byte by byte, and printing the decimal representation of each byte. If the symbol is new line character 
or space character, then printing the character representation to the input.

Lab 04 - Extract Integers
-

Using Scanner class to read from the file, which helps to extract integers from the file and write them to the output file 
according to the requirements each on a new line.

Lab 05 - Write Every Third Line
-

To implement the solution we are using Path class to get the path combined with Files class to read and write the entire file 
and put each line as an entry of ArrayList<String>. Then created a new list where will store every third line of the 
original list, and the writing the entire new list with line to the output file.

Lab 06 - Sort Lines
-

Using Paths class and Files class to read and write from/to files. First reading the input file and storing all lines 
into a list. Then making a new list where storing the sorted lines. Finally writing the new list with sorted lines to 
the output file.

Lab 07 - List Files
-

Using the File class to read if the file is Directory or File. Also using the File class' method listAllFiles() to 
create an Array of Files and list them with their sizes respectively by getting their size using the File.length() 
function.

Lab 08 - Nested Folders
-

Recursively listing all the nested folders' names.

Lab 09 - Serialize Custom Object
-

Creating a custom object. Serializing into a file by using ObjectOutputStream and then deserializing it back into a new 
object by using the ObjectInputStream class. Printing the new object to the console.

Exercise 01 - Sum Lines
-

Using BufferedReader with FileReader to read line by line from a txt file. Sum all ascii values for each character on 
each line and print the sum for each line on the console. 

Exercise 02 - Sum Bytes
-

Reading the file byte by byte. Sum all bytes of the file without the \r\n symbols for new line. The ascii codes for 
these symbols are 13 and 10, so we put a condition, if the byte which is read is 10 or 13 then we don't add it to the sum.

Exercise 03 - All Capitals
-

Using FileReader class wrapped in a BufferedReader to read the file line by line. Once reading a current line from the file 
converting all characters to UpperCase by using the String method .toUpperCase and then writing the current line to the new 
file with PrintStream class.

Exercise 04 - Count Character Types
-

Created 2 sets for Vowels and Punctuation marks which are used as lookup tables later. Created a Map with String as a key 
and integer as a value to keep count of the character types. Reading the file with FileReader and BufferedReader byte by byte 
and determining which character type is is by using the lookup tables that we created in the beginning. Finally iterating 
over the map and writing each entry set of the map as a line to the output file by using the PrintStream class.

Exercise 05 - Line Numbers
-

Reading the input file line by line by using BufferedReader and FileReader. Using a integer variable for a line counter. 
Writing to the output file line by line while adding the line numbers in front of each line. 