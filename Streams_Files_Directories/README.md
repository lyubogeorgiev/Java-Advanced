Lab 01 - Read File
-

Reading a txt file byte by byte. Each byte has to be printed on the console separated by a white space. Using FileInputStream 
class to read the file, try-catch with resources, which will automatically close the resources when the execution is finished. 
Reading bytes while nextByte is different than -1. If there is no more byte to be read the fileInputStream.read() returns 
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