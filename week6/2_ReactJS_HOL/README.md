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
A class component is a JavaScript class that extends React.Component. It must include a render() method and can use state and lifecycle methods.

### 5. Explain function component
A function component is a simple JavaScript function that returns JSX. It’s commonly used in modern React and can use hooks like useState and useEffect.

### 6. Define component constructor
The constructor() is a method used inside class components to initialize the component’s state and bind methods. It runs before the component mounts.

### 7. Define render() function
The render() method is required in class components. It returns the JSX that describes what should appear on the screen.

 




