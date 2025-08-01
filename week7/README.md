## ES6 Concepts – Theory

### Features of ES6

- Introduced `let` and `const` for better variable scoping.
- Arrow functions provide a concise syntax for writing functions.
- Template literals allow embedded expressions in strings.
- Destructuring helps extract values from arrays or objects easily.
- Spread and Rest operators improve function argument handling.
- Classes and class inheritance provide a cleaner way to create objects.
- Promises simplify asynchronous programming.
- Modules (`import` and `export`) enable modular code.
- New data structures like `Map`, `Set`, `WeakMap`, and `WeakSet`.

---

### JavaScript `let`

`let` allows you to declare block-scoped variables. It helps avoid issues related to variable hoisting and accidental re-declaration.

---

### Difference Between `var` and `let`

`var` is function-scoped and allows re-declaration. `let` is block-scoped and avoids re-declaration within the same scope, making your code more predictable and less error-prone.

---

### JavaScript `const`

`const` is also block-scoped but used to declare constants. The value cannot be reassigned. However, objects and arrays declared with `const` can still have their contents modified.

---

### ES6 Class Fundamentals

ES6 introduces a cleaner syntax for defining classes and creating objects. It supports constructors and methods inside a class structure, improving readability and reusability of code.

---

### ES6 Class Inheritance

Inheritance allows one class to acquire the properties and methods of another class using `extends`. The `super()` function is used to call the constructor of the parent class. This improves code modularity and reduces redundancy.

---

### Arrow Functions

Arrow functions provide a concise way to write functions and do not have their own `this` binding. They are often used in callbacks and functional programming patterns.

---

### `Set()` and `Map()`

- `Set` is a collection of unique values. It automatically removes duplicates and allows only unique elements.
- `Map` is a collection of key-value pairs where keys can be of any data type. It maintains the order of insertion and offers better performance for frequent additions and deletions.
