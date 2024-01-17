Lab 01 - Read File
-

Reading a txt file byte by byte. Each byte has to be printed on the console separated by a white space. Using FileInputStream 
class to read the file, try-catch with resources, which will automatically close the resources when the execution is finished. 
Reading bytes while nextByte is different than -1. If there is no more byte to be read the fileInputStream.read() returns 
-1 and this is our condition to stop reading. 