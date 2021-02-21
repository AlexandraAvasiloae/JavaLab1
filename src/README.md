# Foobar

Foobar is a Python library for dealing with word pluralization.

## Installation

Use the package manager [pip](https://pip.pypa.io/en/stable/) to install foobar.

```bash
pip install foobar
```

## Usage

```python
import foobar

foobar.pluralize('word') # returns 'words'
foobar.pluralize('goose') # returns 'geese'
foobar.singularize('phenomena') # returns 'phenomenon'
```
#Lab 1

##Compulsory (1p)
```
Write a Java application that implements the following operations:

1. Display on the screen the message "Hello World!". Run the application. If it works, go to step 2 :)
2. Define an array of strings languages, containing {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"}
3. Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
4. Compute the result obtained after performing the following calculations:
    multiply n by 3;
    add the binary number 10101 to the result;
    add the hexadecimal number FF to the result;
    multiply the result by 6;
5. Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
6. Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
```
##Optional (2p)

```Let n be an integer given as a command line argument. Validate the argument!
Create a n x n matrix, representing the adjacency matrix of a random graph .
Display on the screen the generated matrix (you might want to use the geometric shapes from the Unicode chart to create a "pretty" representation of the matrix).
Verify if the generated graph is connected and display the connected components (if it is not).
Assuming that the generated graph is connected, implement an algorithm that creates a partial tree of the graph. Display the adjacency matrix of the tree.
For larger n display the running time of the application in nanoseconds (DO NOT display the matrices). Try n > 30_000. You might want to adjust the JVM Heap Space using the VM options -Xms4G -Xmx4G.
Launch the application from the command line, for example: java Lab1 100.

```
