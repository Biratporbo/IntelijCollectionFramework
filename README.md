# 📚 Intellij Collection Framework

**A comprehensive Java learning project demonstrating advanced collection management, generics, lambda expressions, streams API, and modern Java 8+ features with practical examples and implementations.**

![Java](https://img.shields.io/badge/Java_8+-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Collections](https://img.shields.io/badge/Collections_API-007396?style=for-the-badge&logo=java&logoColor=white)
![Generics](https://img.shields.io/badge/Generics-FF6B6B?style=for-the-badge&logo=java&logoColor=white)
![Lambda](https://img.shields.io/badge/Lambda_Expressions-4CAF50?style=for-the-badge&logo=java&logoColor=white)

---

## 📝 Project Overview

Intellij Collection Framework is a comprehensive Java project designed to help developers master the Collections Framework, core Java fundamentals, generics, lambda expressions, and streams API. The project provides practical examples and implementations of collection types, methods, functional programming concepts, and modern Java 8+ features to strengthen Java development skills.

## ✨ Key Features & Architecture

* **Collections Management:** Comprehensive implementation of Lists, Sets, Maps, and Queues with detailed examples.
* **Methods & OOP Basics:** Learn how methods work, including parameter passing, return values, and static methods.
* **Generics Deep Dive:** Understand generic classes, methods, and type parameters with real-world implementations.
* **Lambda Expressions:** Master functional programming with lambda expressions and method references.
* **Streams API:** Learn powerful data transformation and filtering operations using streams.
* **Exception Handling:** Explore custom exceptions and proper error handling techniques.
* **Array Operations:** Advanced array manipulation and utility demonstrations.
* **Predicates & Functional Interfaces:** Working with predicates, functions, and custom functional interfaces.

---

## 🗂️ Project Structure

```
src/
├── CollectionFramework/       # Core collection examples
│   ├── ArraysClass/           # Array manipulation and utilities
│   │   ├── Array1.java
│   │   ├── ArraysDemo.java
│   │   └── EmpList.java
│   ├── DColonOperator/        # Method reference examples
│   │   ├── DColonDemo1.java
│   │   └── DColonDemo2.java
│   ├── Generics/              # Generic classes and methods
│   │   ├── GenericClass.java
│   │   ├── GenericMethod.java
│   │   ├── InstanceGenericClass.java
│   │   └── MultipleGenerics.java
│   ├── List/                  # List implementations
│   │   ├── ArrayListCreate.java
│   │   ├── StackCreate.java
│   │   ├── StackDemo.java
│   │   ├── LinkedList/
│   │   │   ├── LinkedListCreate.java
│   │   │   ├── QueueExample.java
│   │   │   └── StackExmaple.java
│   │   └── VectorClass/
│   │       ├── VectorCreate.java
│   │       └── VectorDemo.java
│   ├── Map/                   # Map implementations
│   │   ├── HashMapCreate.java
│   │   ├── HashMapDemo.java
│   │   ├── LinkedHashMapCreate.java
│   │   ├── MapInterfaceCreate.java
│   │   └── TreeMapCreate.java
│   ├── Set/                   # Set implementations
│   │   ├── HashSetCreate.java
│   │   ├── LinkedHashSetCreate.java
│   │   ├── TreeSetCreate.java
│   │   └── SetInterface/
│   │       ├── DifferenceHashSet.java
│   │       ├── HS.java
│   │       ├── InterSectionhashSet.java
│   │       ├── SubHashSet.java
│   │       └── UnionhashSet.java
│   ├── Queues/                # Queue implementations
│   │   ├── DequeCreate.java
│   │   ├── PriorityQueueCreate.java
│   │   ├── QueueCreate.java
│   │   └── QueueDemo.java
│   ├── Predicates/            # Predicate functional interface
│   │   ├── PredicateDemo1.java
│   │   ├── PredicateDemo2.java
│   │   ├── PredicateDemo3.java
│   │   └── PredicateDemo4.java
│   ├── Functions/             # Function interface examples
│   │   └── FunctionDemo1.java
│   └── StringTokenizerClass/  # String tokenization
│       └── STDemo.java
├── Java8/                     # Java 8+ features
│   ├── exStream.java
│   ├── FunctionallInterfaceCreate.java
│   ├── Methods.java
│   ├── DefaultMethod/         # Interface default methods
│   │   ├── DefaultDemo1.java
│   │   └── DefaultDemo2.java
│   ├── LambdaExpressions/     # Lambda expression examples
│   │   ├── LambdaCreation.java
│   │   ├── LambdaDemo1.java through LambdaDemo10.java
│   │   └── [10 comprehensive examples]
│   └── work/
│       └── StreamObject.java
├── Methods/                   # Basic Java method examples
│   ├── Method.java            # Method without params & return type
│   ├── Method_2.java          # Method with return type
│   ├── Method_3.java          # Method with params & return type
│   ├── Method_4.java          # Static method
│   ├── Method_5.java          # Static method accessing static variable
│   ├── Method_6.java          # Instance variable behavior
│   ├── Method_7.java          # Static (class) variable behavior
│   ├── Method_8.java          # Static block vs. static method
│   ├── Method_9.java          # Advanced method concepts
│   ├── Method_10.java         # Additional practical method examples
│   ├── Method_11.java         # Method overloading concepts
│   ├── Method_12.java         # Method interactions & patterns
│   ├── Method_13.java         # Advanced scenarios & real-world usage
│   ├── Method_14.java         # Extended method examples
│   ├── Method_15.java         # Complex method implementations
│   ├── Method_16.java         # Advanced method patterns
│   ├── Method_17.java         # Method overloading with varargs
│   └── README.md
├── StreamsAPI/                # Streams API examples
│   ├── Create1.java
│   ├── Create2.java
│   ├── Convert1.java
│   └── Convert2.java
└── Exception/                 # Exception handling
    ├── Ex.java
    ├── Ex1.java
    ├── Ex3.java
    ├── Exii.java
    ├── MarksException.java
    ├── MyException.java
    └── RethrowExcep.java
```

---

## 🛣️ Module Overview

| Module | Description |
| :--- | :--- |
| **Collections Framework** | Complete implementation of List, Set, Map, and Queue data structures |
| **Methods** | Basic examples of methods, static methods, static blocks, and instance vs. class variables |
| **Generics** | Generic classes, methods, and type parameter handling |
| **Lambda Expressions** | 10+ practical examples of lambda syntax and usage |
| **Streams API** | Data transformation, filtering, mapping, and reduction operations |
| **Exception Handling** | Custom exceptions and error management strategies |
| **Java 8+ Features** | Default methods, functional interfaces, and modern Java concepts |
| **Arrays & Utilities** | Array manipulation and Collections utility methods |

---

## 🚀 How to Use

### Prerequisites
* **Java 8+** installed and configured
* **IntelliJ IDEA** or any Java IDE
* **Maven** or **Gradle** (optional, for build automation)

### Setup Steps

1. **Clone/Download the project:**
   ```bash
   git clone [repository-url]
   cd IntelijCollectionFramework
   ```

2. **Open in IDE:**
   - Open IntelliJ IDEA
   - Select "Open" and navigate to the project folder
   - Let IDE index and configure the project

3. **Run Examples:**
   - Right-click on any `.java` file
   - Select "Run '[ClassName].main()'"
   - Or use terminal: `javac src/CollectionFramework/List/ArrayListCreate.java && java -cp src CollectionFramework.List.ArrayListCreate`

4. **Explore Topics:**
   - Start with `CollectionFramework/ArraysClass/` for basic concepts
   - Move to specific collection types (List, Set, Map, Queue)
   - Progress to `Java8/LambdaExpressions/` for modern syntax
   - Finally explore `StreamsAPI/` for advanced data processing

---

## 🔧 Tech Stack

- **Language:** Java 8+
- **Core APIs:** Collections Framework, Generics, Streams API
- **Features:** Lambda Expressions, Functional Interfaces, Method References
- **Exception Handling:** Custom exceptions and proper error management
- **IDE:** IntelliJ IDEA (recommended)

---

## 📚 Learning Topics Covered

```
✅ ArrayList, LinkedList, Vector
✅ HashSet, LinkedHashSet, TreeSet
✅ HashMap, LinkedHashMap, TreeMap
✅ Queue, Deque, PriorityQueue
✅ Basic Java Methods
✅ Methods with Parameters and Return Types
✅ Static Methods
✅ Static Blocks & Execution Order
✅ Instance vs. Class (Static) Variables
✅ Generic Classes & Methods
✅ Wildcards & Type Parameters
✅ Lambda Expressions (Syntax & Usage)
✅ Functional Interfaces
✅ Streams API (Create, Transform, Collect)
✅ Method References (::)
✅ Predicates & Functions
✅ Exception Handling & Custom Exceptions
✅ String Tokenization
✅ Set Operations (Union, Intersection, Difference)
```

---

## 💡 Quick Start Examples

**Running ArrayList Demo:**
```bash
javac -d . src/CollectionFramework/List/ArrayListCreate.java
java CollectionFramework.List.ArrayListCreate
```

**Running Methods Example:**
```bash
javac -d . src/Methods/Method_4.java
java Methods.Method_4
```

**Running Lambda Expressions:**
```bash
javac -d . src/Java8/LambdaExpressions/LambdaDemo1.java
java Java8.LambdaExpressions.LambdaDemo1
```

**Running Streams API:**
```bash
javac -d . src/StreamsAPI/Create1.java
java StreamsAPI.Create1
```

---

## 📄 License

This project is part of an educational portfolio and is provided as-is for learning and demonstration purposes.

---

## ⚖️ Permissions

![](https://img.shields.io/badge/Use-Allowed-22c55e?style=for-the-badge&labelColor=020617) ![](https://img.shields.io/badge/Modify-Allowed-0ff?style=for-the-badge&labelColor=020617) ![](https://img.shields.io/badge/Distribute-Allowed-facc15?style=for-the-badge&labelColor=020617) ![](https://img.shields.io/badge/Learn-Encouraged-a855f7?style=for-the-badge&labelColor=020617)

---

## ⚠️ Disclaimer

```Diff
- This software is provided "as is"
- No warranty or liability is included
- Use for educational purposes
```

---

❤️ Created for Java Learning & Development 

🫱🫲 I, Me, and Myself !! 
