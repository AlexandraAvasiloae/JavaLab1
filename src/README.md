#Lab 1

##Compulsory (1p) 
```
Write a Java application that implements the following operations:

(done)1. Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :)
(done)2. Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
(done)3. Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
(done)4. Compute the result obtained after performing the following calculations:
    multiply n by 3;
    add the binary number 10101 to the result;
    add the hexadecimal number FF to the result;
    multiply the result by 6;
(done)5. Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
(done)6. Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].

OUTPUT:
Hello world!
C
C++
C#
Python
Go
Rust
JavaScript
PHP
Swift
Java
Willy-nilly, this semester I will learn Java

Process finished with exit code 0

```
##Optional (2p)

```
(done) Let n be an integer given as a command line argument. Validate the argument!
(done) Create a n x n matrix, representing the adjacency matrix of a random graph .
(done- without geometric shapes) Display on the screen the generated matrix (you might want to use the geometric shapes from the Unicode chart to create a "pretty" representation of the matrix).
(done) Verify if the generated graph is connected
(not done)display the connected components (if it is not).
(done) Assuming that the generated graph is connected, implement an algorithm that creates a partial tree of the graph. Display the adjacency matrix of the tree.
(partially done) For larger n display the running time of the application in nanoseconds (DO NOT display the matrices). Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
(done)Launch the application from the command line, for example: java Lab1 100.

OUTPUT:

1. 
C:\Users\Alexandra\IdeaProjects\FirstJava\src>javac Graph.java

C:\Users\Alexandra\IdeaProjects\FirstJava\src>java Graph
-1
Specify the argument!

2. n=3
C:\Users\Alexandra\IdeaProjects\FirstJava\src>javac Graph.java

C:\Users\Alexandra\IdeaProjects\FirstJava\src>java Graph 3
The graph is connected
The adjacency matrix of the graph is:
[0, 1, 1]
[1, 0, 1]
[1, 1, 0]
The adjacency matrix of the partial tree is:
[0, 1, 0]
[1, 0, 1]
[0, 1, 0]

3. n=10
C:\Users\Alexandra\IdeaProjects\FirstJava\src>java Graph 10
The graph is not connected
The graph has 2 connected components
The adjacency matrix of the graph is:
[0, 1, 1, 1, 0, 1, 0, 0, 0, 0]
[1, 0, 0, 0, 0, 1, 0, 1, 1, 0]
[1, 0, 0, 1, 1, 0, 1, 0, 0, 1]
[1, 0, 1, 0, 1, 0, 1, 0, 0, 0]
[0, 0, 1, 1, 0, 1, 1, 1, 1, 1]
[1, 1, 0, 0, 1, 0, 1, 1, 0, 1]
[0, 0, 1, 1, 1, 1, 0, 1, 1, 1]
[0, 1, 0, 0, 1, 1, 1, 0, 1, 0]
[0, 1, 0, 0, 1, 0, 1, 1, 0, 0]
[0, 0, 1, 0, 1, 1, 1, 0, 0, 0]




```
