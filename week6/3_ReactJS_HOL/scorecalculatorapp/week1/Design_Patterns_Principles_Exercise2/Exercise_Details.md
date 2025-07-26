## Creating the Java Project

For this exercise, I started by creating a new Java project named **FactoryMethodPatternExample** in my IDE.  
This helped me organize all the interfaces, abstract classes, and concrete classes needed for the Factory Method Pattern properly.

I kept each document class in a separate file so that it’s clear which class does what and makes it easier to maintain.

---

## Implementing the Factory Method

After setting up the basic structure, I created an abstract class called `DocumentFactory` with a method named `createDocument()`.  
This method defines how new document objects are created, but the actual type is decided by the concrete subclasses.

Then, I wrote separate factory classes like `WordDocumentFactory`, `PdfDocumentFactory`, and `ExcelDocumentFactory` — each one extends `DocumentFactory` and provides its own version of `createDocument()` to return the right document type.

This way, the document management system can create different types of documents without changing the client code.  
It also makes adding new document types easy in the future.
