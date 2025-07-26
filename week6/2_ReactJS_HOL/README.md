# ReactJS Hands-On Lab – Student Management Portal

This project is part of Week 6 assignment for the Java FSE program. It is a simple React app named **StudentApp** that displays basic content using React components.

##  Folder Name
`2_ReactJS_HOL`

## 🔧 Features Implemented

- A React app created using `create-react-app`
- Three components: `Home`, `About`, and `Contact`
- All components display specific messages in the browser

## Screenshots

Screenshots of the output are included in the `outputs` folder for reference.

---

##  Conceptual Answers

###  1. Explain React components

React components are reusable and independent blocks of UI that can be rendered in a React application. Components help break the UI into smaller, manageable pieces. They can be class-based or function-based.

---

###  2. Differences between components and JavaScript functions

| JavaScript Function                | React Component                           |
|-----------------------------------|-------------------------------------------|
| Performs a specific task or logic | Returns JSX that represents UI            |
| No JSX involved                   | Can return JSX (HTML-like syntax)         |
| Not rendered by React             | Rendered as part of the React DOM         |
| No state or lifecycle             | Can have state and lifecycle (in classes) |

---

###  3. Types of components

1. **Class Component** – ES6 classes that extend `React.Component`
2. **Function Component** – Simple functions that return JSX

---

###  4. Explain class component

A class component is a JavaScript class that extends `React.Component`. It must include a `render()` method to return JSX.

Example:
```jsx
class Welcome extends React.Component {
  render() {
    return <h1>Hello, {this.props.name}</h1>;
  }
}
