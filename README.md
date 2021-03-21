# Design-Patterns

**Design pattern is a general, reusable solution to a commonly occurring problem within a given context in software design.**

**Christopher Alexander** says " each pattern describes a problem which occurs over and over again in our environment then describes a solution to that problem. You can use this solution million times over without ever doing it the same way twice.

For example: 

              Problem: Building a city/town
			  
              Solution: Walls-doors
              
By using this wall and doors solution we can build buildings and cities based on our own plans. To understand this first think the solution without walls and doors 🙂. 

> It is not a finished design that can be transformed directly into source or machine code. Rather, it is a description or template for how to solve a problem that can be used in many different situations.

## History of design patterns:

**"Christopher Alexander"** was the first person who invented all the above Design Patterns in 1977.

Later the Gang of Four - Design patterns, elements of reusable object-oriented software book was written by a group of four persons named as **Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides** in 1995.

 That's why all the 23 Design Patterns are known as **Gang of Four (GoF)** Design Patterns.

## Catalogue of design patterns:
### Abstract factory pattern: 
> Abstract Factory Pattern says that just define an interface or abstract class for creating families of related (or dependent) objects but without specifying their concrete sub-classes.

### Adaptor pattern:
>An Adapter Pattern says that just "converts the interface of a class into another interface according to the client expectations". It overcomes the problem of incompatible interfaces.

### Builder pattern:
>It seperates the complex objects construction from it's representation in order to create different representations with the same construction process.

### Bridge pattern:
>Bridge design pattern is used to decouple a class into two parts – abstraction and it’s implementation – so that both can evolve in future without affecting each other. It increases the loose coupling between class abstraction and it’s implementation.

### Chain of responsibility:
>As the name suggests, the chain of responsibility pattern creates a chain of receiver objects for a request. This pattern decouples sender and receiver of a request based on type of request.
>In simple terms "avoid coupling the sender of a request to its receiver by giving multiple objects a chance to handle the request". 

### Command pattern: 
>A Command Pattern says that "encapsulate a request under an object as a command and pass it to invoker object. Invoker object looks for the appropriate object which can handle this command and pass the command to the corresponding object and that object executes the command".

### Composite pattern:
>Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. 

### Decorator pattern:
>Decorator design pattern is used to add additional features or behaviors to a particular instance of a class, while not modifying the other instances of same class.

### Factory method pattern:
>Factory Method Pattern says that just define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate. In other words, subclasses are responsible to create the instance of the class.

### Fly weight pattern:
>Flyweight design pattern enables use sharing of objects to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context.

### Facade pattern:
>Facade design pattern provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.

### Interpreter pattern:
>Interpreter pattern specifies how to evaluate sentences in a language, programatically. It helps in building a grammar for a simple language, so that sentences in the language can be interpreted.

### Iterator pattern:
>Iterator pattern provides a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

### Mediator pattern: 
>Mediator pattern is used to reduce communication complexity between multiple objects or classes. This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling. 

### Memento pattern:
>Memento pattern is used to restore state of an object to a previous state. It is also known as snapshot pattern.

### Prototype pattern:
>Prototype design pattern is used in scenarios where application needs to create a large number of instances of a class, which have almost same state or differ very little.

### Proxy pattern:
>In proxy design pattern, a proxy object provide a surrogate or placeholder for another object to control access to it. Proxy is heavily used to implement lazy loading related usecases where we do not want to create full object until it is actually needed.

### Observer pattern:
>Observer pattern defines a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically. It is also referred to as the publish-subscribe pattern.

### State pattern:
>In state pattern allows an object to alter its behavior when its internal state changes. The object will appear to change its class. There shall be a separate concrete class per possible state of an object.

### Singleton pattern:
>This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class

### Strategy pattern:
>This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class. This means a class behavior or its algorithm can be changed at run time.

### Template method pattern:
>Template method pattern defines the sequential steps to execute a multi-step algorithm and optionally can provide a default implementation as well (based on requirements).

### Visitor pattern:
>Visitor pattern is used when we want a hierarchy of objects to modify their behavior but without modifying their source code.






## Organanizing the catalogue of design patterns:
Basically, design patterns are categorized into two parts:

Core Java (or JSE) Design Patterns.

JEE Design Patterns.

Core java design patterns are classified into two categories:

## Purpose:
Purpose describes what pattern does.Purpose divides the core java design patterns into three categories. 
They are **creational, structural, and behavioural patterns**.
			
 ### 1.Creational patterns: 
 Creational patterns often used in place of direct instantiation with constructors.They make the creation process more adaptable and dynamic. In particular, they can provide a great deal of flexibility about which objects are created,how those objects are created, and how they are initialized.

 ### 2.Structural patterns: 
 Structural design patterns show us how to glue different pieces of a system together in a flexible and extensible fashion. These patterns help us guarantee that when one of the parts changes, the entire application structure does not need to change.

### 3.Behavioural patterns:
It characterize the ways in which classes or objects interact and distribute responsibilities.In these design patterns,the interaction between the objects should be in such a way that they can easily talk to each other and still should be loosely coupled.

That means the implementation and the client should be loosely coupled in order to avoid hard coding and dependencies.


   Creational patterns    | Structural patterns   | Behavioural patterns
------------------        | ----------------------|---------------------
 Abstract Factory Pattern | Adapter Pattern       | Chain Of Responsibility Pattern
 Builder Pattern          | Bridge Pattern        | Command Pattern
 Factory Pattern          | Composite Pattern     | Interpreter Pattern
 Prototype Pattern        | Decorator Pattern     | Iterator Pattern
 Singleton Pattern        | Facade Pattern        | Mediator Pattern
   \_                     | Flyweight Pattern     | Memento Pattern
   \_                     | Proxy Pattern         | Observer Pattern
   \_                     |_				      | State Pattern
   \_		              |_			          | Strategy Pattern
   \_		   	          |_				      | Template Pattern
   \_			          |_				      | Visitor Pattern
   
## Scope: 
It specifies whether the pattern applies primarily to objects or classes. Scope divides the design patterns into two types. 

They are: 
### 1. Objects:
These design patterns deals with the object relationships. The objects design patterns are dynamic means changed at run time.

### 2. Class:
It deals with relationship between classes and their subclasses. The relationships are established through interface. These are static and compile time.
   
   ![Design patterns based on scope](https://user-images.githubusercontent.com/40607314/111921169-1ae91d80-8ab9-11eb-9de9-bbf421c4defc.png)
   
We can also classify the design patern in the following ways:
* Some patterns are used together with another paterns. For example composite pattern is used with visitor and interpreter.
* Some patterns are alternatives to another patterns. For example prototype pattern is alternative to abstract factory pattern.
* Some patterns structure is same but different intence. For example composit and decorator patterns have almost same structure but different intense.
* Like these there are many ways to organize the design patterns 😕.

## Selection of a design pattern:
* Considering how design patterns solve design problems.
* Scan the intent section(purpose or goal of the design pattern).
* Study how patterns interrelated.
* Study the pattern like a purpose.(know the similarities and differences)
* study the cause of redesign.
* Considering what should be variable in your design and design aspects.

[here is the detailed article for selecting appropriate design pattern 👍](https://github.com/devtwin/Design-Patterns/selection-of-pattern/steps.md) 

## How to use design pattern:
* Read the pattern once for an overview.
* Go back and study the structure, participants, and collaborations.
* Study the sample code/example.
* Choose the names for pattern participants that are meaningful in application context.
* Define classes.
* Define application specific names for operations in the patern.
* Implement the operations. 🥰

## How to solve design problem using design patterns:
1. Finding the appropriate objects
2. Determine object granularity
3. Specifying object inteface
4. Specifying object implementation
5. Putting reuse mechanisms

## Advantages of design patterns:
* They are reusable in multiple projects.
* They provide the solutions that help to define the system architecture.
* They capture the software engineering experiences.
* They provide transparency to the design of an application.
* They are well-proved and testified solutions since they have been built upon the knowledge and experience of expert software developers.
* Design patterns don?t guarantee an absolute solution to a problem. They provide clarity to the system architecture and the possibility of building a better system.


``` java
/**
 * 
 * @author SUBBARAYUDU CHAKALI
 *
 */
public class Author {

	private static final String emailId = "subbu@devtwin.com";
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Author subbu = new Author();
		subbu.sayThanks();
		subbu.callToAction();

	}
/**
 * Constructor from superclass
 */
	public Author() {
		super();
	}
/**
 * This method greets the user for reading this entire article 
 */
	private void sayThanks() {
		System.out.println("Thanks for your time :) ");
		System.out.println("Will see you in the next targeted article");
	}
/**
 * This method is used for call to action by providing mail id
 */
	private void callToAction() {
		System.out.println("If you have any queries mail to " + emailId);
	}

}

```
