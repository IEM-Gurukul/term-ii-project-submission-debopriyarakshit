[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title

LIBRARY MANAGEMENT SYSTEM

## Problem Statement (max 150 words)

The Library Management System is a software application developed using Java and Object-Oriented Programming principles. It is designed to manage the basic functions of a library such as adding books, issuing books, returning books, and maintaining records.

## Target User

To implement Object-Oriented Programming concepts such as classes, objects, encapsulation, and abstraction.

## Core Features

Model
The Model represents the data and the business logic of the application.
It includes classes such as Book, User, and Library.
View
The View is responsible for displaying data to the user.
In this project, a console-based interface is used.
Controller
The Controller acts as a bridge between the Model and View.
It processes user input and updates the model accordingly.





## OOP Concepts Used

- Abstraction:Abstraction is used to hide internal implementation details and show only essential features of the system.
The user interacts with simple methods like addBook(), issueBook(), and returnBook() without knowing how the operations are performed internally.
Classes like Library provide high-level functionalities while hiding internal data handling.
- Inheritance:Inheritance allows one class to acquire properties and behaviors of another class.
In an advanced version of this project, a common Person class can be created.
Student and Librarian classes can inherit from the Person class.
This promotes code reuse and reduces redundancy.
- Polymorphism:Polymorphism allows methods to perform different tasks based on the object or input.
Method overloading can be used for functions like searching books:
Search by ID
Search by Title
Method overriding can be used if subclasses redefine parent class behavior.
- Exception Handling:Exception handling is used to manage runtime errors and prevent program crashes.
Handles invalid inputs (e.g., wrong book ID)
Prevents issuing already issued books
Uses try-catch blocks to ensure smooth program execution
- Collections / Threads:Java Collections Framework is used for efficient data storage and manipulation.
ArrayList is used to store books
Provides dynamic resizing
Enables easy searching and iteration



## Proposed Architecture Description
The Library Management System is designed using the MVC (Model-View-Controller) architecture, which separates the application into three components:
Model: Handles data and business logic (e.g., Book, User, Library classes)
View: Displays information to the user through a console interface
Controller: Processes user input and connects the Model and View
Working:
The user interacts with the View, the Controller processes the request, the Model performs the operation, and the result is displayed back through the View.
Advantages:
Better code organization
Easy maintenance
Scalable and flexible design


## How to Run
The Library Management System is designed using the MVC (Model-View-Controller) architecture, which separates the application into three components:
Model: Handles data and business logic (e.g., Book, User, Library classes)
View: Displays information to the user through a console interface
Controller: Processes user input and connects the Model and View
Working:
The user interacts with the View, the Controller processes the request, the Model performs the operation, and the result is displayed back through the View.
Advantages:
Better code organization
Easy maintenance
Scalable and flexible design


## Git Discipline Notes
Minimum 10 meaningful commits required.
Initial commit
Created project structure and added basic files
Added Book class
Implemented attributes and methods for book management
Added User class
Created user structure with basic details
Implemented Library class
Added functionality to store and manage books
Added methods for adding and displaying books
Implemented addBook() and showBooks()
Implemented issue book functionality
Added logic to issue books and update status
Implemented return book functionality
Added logic to return books and update availability
Created View class (LibraryView)
Designed console-based user interface
Created Controller class (LibraryController)
Connected Model and View components
Added Main class and program flow
Integrated all components and started execution