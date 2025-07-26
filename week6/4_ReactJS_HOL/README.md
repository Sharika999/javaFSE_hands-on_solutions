# 4_ReactJS_HOL - Blog Posts React App

This is a simple React.js hands-on lab project created as part of the **Java FSE Week 6** module.

It demonstrates the use of:
- Class components
- State management
- Lifecycle methods (`componentDidMount`, `componentDidCatch`)
- Fetch API for external data
- Component composition using props

---

##  React Component Lifecycle

###  Why is Component Lifecycle Important?

Component lifecycle methods allow you to **hook into key moments** in a component’s life:
- When it is **created**, **rendered**, **updated**, and **removed**.
- Helps you **fetch data**, **handle cleanup**, and **respond to changes** efficiently.

###  Benefits:
- Control over **render timing and logic**
- Clean handling of **external resources** (e.g., timers, APIs)
- Helps in **optimizing performance**
- Allows error handling through lifecycle events like `componentDidCatch`

---

##  Lifecycle Hook Methods

| Phase       | Method Name           | Purpose                                      |
|-------------|-----------------------|----------------------------------------------|
| Mounting    | `constructor()`       | Initialize state                             |
|             | `componentDidMount()` | Called once after the component is mounted   |
| Updating    | `componentDidUpdate()`| Called after state or props change           |
| Error       | `componentDidCatch()` | Catch and handle errors                      |
| Unmounting  | `componentWillUnmount()`| Cleanup (e.g., clear timers, cancel requests)|

---

##  Component Rendering Sequence

When a class component renders, this is the typical sequence:

1. `constructor()` — component is initialized  
2. `render()` — UI is created based on state/props  
3. `componentDidMount()` — runs after component is added to DOM  
4. (Later) `componentDidUpdate()` — runs on state/prop change  
5. `componentWillUnmount()` — runs before component is destroyed  
6. `componentDidCatch()` — runs when there's an error

---



