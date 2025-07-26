# ReactJS Hands-On Lab – Student Management Portal

This project is part of **Week 6 assignment** for the Java FSE program. It is a simple React app named **StudentApp** that displays basic content using React components.

## Folder Name
`2_ReactJS_HOL`

## 🔧 Features Implemented
- A React app created using `create-react-app`
- Three components: **Home**, **About**, and **Contact**
- All components display specific messages in the browser

##  Screenshots
Screenshots of the output are included in the `outputs/` folder for reference.

---

##  Conceptual Answers

### 1. Explain React components
React components are **reusable UI building blocks** in a React application. They allow you to divide the UI into small, independent, and manageable pieces. Components can be either **class-based** or **function-based**.

---

### 2. Identify the differences between components and JavaScript functions

| JavaScript Function                        | React Component                              |
|-------------------------------------------|----------------------------------------------|
| Performs logic or calculation             | Returns JSX to render UI                     |
| No JSX involved                            | Can return JSX (HTML-like syntax)            |
| Not part of the React DOM lifecycle        | Rendered by React into the DOM               |
| No state or lifecycle                      | Can have state and lifecycle (especially in class components) |

---

### 3. Identify the types of components
There are two types of React components:
- **Class Components** – Created using ES6 classes that extend `React.Component`
- **Function Components** – Simple JavaScript functions that return JSX (recommended with hooks)
- 
---

### 4. Explain class component
A **class component** is a JavaScript class that extends `React.Component`. It must include a `render()` method to return JSX.

```jsx
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
```jsx

---

### 5. Explain function component
A function component is a plain JavaScript function that returns JSX. These are simpler and more commonly used in modern React with hooks.

function Welcome(props) {
  return <h1>Hello, {props.name}</h1>;
}

---


### 6. Define component constructor
The constructor method is used in class components to initialize state and bind methods.



constructor(props) {
  super(props);
  this.state = { count: 0 };
}

---

### 7. Define render() function
The render() method is required in class components. It returns the JSX that React will render to the DOM.



render() {
  return <div>Hello World</div>;
}
