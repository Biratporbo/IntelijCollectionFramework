# Methods in Java

This folder contains simple Java examples that demonstrate the basic concepts of methods.

## What is a method?
A method is a block of code that performs a specific task. It helps make programs reusable, organized, and easier to understand.

## Topics covered

- Methods without parameters and without a return type
- Methods without parameters but with a return type
- Methods with parameters and a return type
- Static methods
- Accessing static members from a static method
- Instance variables vs. static (class) variables
- Static blocks and their execution order

## Files in this folder

- Method.java: Demonstrates a method that has no parameters and does not return a value.
- Method_2.java: Demonstrates a method that returns a value.
- Method_3.java: Demonstrates a method that accepts parameters and returns a result.
- Method_4.java: Demonstrates a static method that can be called without creating an object.
- Method_5.java: Demonstrates how a static method can access a static variable and explains why an instance variable cannot be used from a static context.
- Method_6.java: Demonstrates that each object has its own copy of an instance variable.
- Method_7.java: Demonstrates that a static (class) variable is shared by all objects of the class.
- Method_8.java: Demonstrates which one is executed first by the JVM, the static block or the static method.
- Method_9.java: Advanced method concepts and examples.
- Method10.java: Additional practical method examples and use cases.

## Example summary

- A method can perform an action such as adding two numbers.
- It may take input values called parameters.
- It may return a result using the return statement.
- A static method belongs to the class and is called using the class name.
- Static methods can access static variables directly, but they cannot access instance variables without an object.
- Instance variables are unique to each object, while static (class) variables are shared across all objects.
- A static block is executed when the class is loaded, before the `main` method runs.

## How to run
From the project root, you can run a class like this:

```bash
java -cp src Methods.Method_5
java -cp src Methods.Method_6
java -cp src Methods.Method_7
java -cp src Methods.Method_8
java -cp src Methods.Method_9
java -cp src Methods.Method10
```

## Key takeaway
Methods are one of the fundamental building blocks of Java programming. Learning them helps you write cleaner and more efficient code.
