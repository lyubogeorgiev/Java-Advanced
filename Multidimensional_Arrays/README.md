Lab 01 - Compare Matrices
-

Comparing two two dimensional int arrays by comparing their two dimension sizes first, and if they are equal then
comparing element by element for equality. 

Lab 02 - Position of
-

Iterating through a two-dimensional array to find all occurrences of a given number and print the indexes. If the number
doesn't exist in the array, then print "not found".

Lab 03 - Intersection of two matrices
- 

The problem of finding the intersection of two matrices was solved by creating 3rd matrix and comparing the elements of
first and the second matrices one by one and then if they are equal add the element to the third matrix at the same
position. If the elements are not the same then add * to the first matrix on that row and column position.

Lab 04 - Sum Matrix Elements
-

Read a matrix from the console, then iterate through each element and add to sum. At the end printing the dimensions of
the array - rows and columns, and the third row of output is the sum of elements. As there are a few way to solve this 
problem, oe of the ways is without creating an array - just straight forward read the numbers from the console and add 
them to the sum. Because the lesson is for two-dimensional arrays specifically, the problem is solved by using a
two-dimensional array - putting all elements and then loop through them to sum them.

Lab 05 - Maximum Sum of 2x2 Sub Matrix
-

Iterating through each 2x2 submatrix inside the main matrix and find each ones sum. Store the maximum sum so far in a
variable and compare the next one with it. If the new maximum sum is bigger than the last maximum sum, then change the
value of the variable to the new maximum sum. Create a 2x2 array to store the values of the sub matrix with the maximum
sum.

Lab 06 - Print Diagonals of Square Matrix
-

Printing diagonals of a square matrix. To print the main diagonal simply loop through the matrix from 0 to matrix.length - 1.
To print the second diagonal create a for loop with 2 variables inside, the first variable will iterate the rows from the last
one to the first one and the second variable iterates through the columns from the first to the last. 

Lab 07 - FInd The Real Queen
-

To find the real queen, which is the only q symbol in the matrix where there is no other q on the same row, col or any diagonals
we iterate through the matrix and check every single q for it. We use 4 different methods to check the row, columns,
main diagonal and second diagonal. According to the principle of a single responsibility of a method, the methods for
checking the diagonals should be separated into 2 different methods each where one will check the upper part of each diagonal
and the second will check the lower part of each diagonal. 

Lab 08 - Wrong Measurement
-

Looping through an two-dimensional array and compare the value with the wrong value. If the value is the same as the
wrong value, it has to be replaced with a sum of all neighbouring values if there is a neighbour value and if the 
neighbour value is not wrong value, too. At the end printing the matrix with the replaced values.

Exercise 01 - Fill The Matrix
-

Filling the matrix 2 different ways different from the traditional way. The problem is solved by playing with loops to 
iterate through the matrix in different pattern to fill it the desired way. 

Exercise 02 - Matrix of Palindromes
-

Filling the matrix with palindromes related to the rows and columns of the matrix. The first symbol is a which 
corresponds to 97 from the ASCII table. Once we find the number of the desired char symbol according to the rules to be 
calculated we cast it from int to char. 

Exercise 03 - Diagonal Difference
- 

Created 2 methods to find the sum of the primary and the secondary diagonal values respectively. After finding the 2 
sum in the main method calculated the absolute value of their difference by using the abs() function form the Math class.

Exercise 04 - Maximal Sum
-

We have a main array which values are entered on the console by the user. The task is to find the 3x3 matrix inside the 
main one with the maximal sum of its elements. All the 3x3 matrix that are inside the main matrix are iteraded through 
with 2 loops. There is a valuable for the maximal sum which value is initially set to minimum integer value in Java. We 
also keep track of the row and column of the first element of the matrix with the biggest sum of its elements, so we are
 printing this matrix on the console at the end.

Exercise 05 - Matrix Shuffling
-

Looping through a user input, checking if it is correct. If the input is correct, swapping 2 of the matrix cells values. 
If the input is not correct, printing a message to the user that the input is not correct.

Exercise 06 - String Matrix Rotation
-

Collecting an input with a rotation command and number in () in the beginning. The collecting strings for our matrix. 
The initial string collecting is done by using a List data structure, and keep track of the longest string. When the input 
of the strings is done, by the word END, then creating a matrix of characters with row equal to the number of strings 
and columns equal to the size of the longest string entered. The empty places in th matrix are filled with empty characters. 
To rotate different degrees we created a method, which takes the matrix and the degree to which is it rotated. The matrix 
isn't actually modified anyway when rotating, it is just the sequence of printing its elements.

Exercise 07 - Crossfire
-

Complicated problem of eliminating elements of a matrix. The tricky part is that the main point of fire might be out of 
the matrix, but some of the matrix cells could be still affected by the fire. All the affected cells and completely 
affected rows are initially set to -1 when they are affected and then a method is created which moves them to the end. 
While printing the resulting matrix, we are ignoring the cells that are set to -1 and printing only cells that have a 
value different than -1.