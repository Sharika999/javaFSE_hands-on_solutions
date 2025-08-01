import React, { useState } from 'react';

function App() {
  const [count, setCount] = useState(0);
  const [message, setMessage] = useState("");
  const [amount, setAmount] = useState("");
  const [converted, setConverted] = useState(null);

  const increment = () => {
    setCount(prev => prev + 1);
    sayHello();
  };

  const decrement = () => {
    setCount(prev => prev - 1);
  };

  const sayHello = () => {
    setMessage("Hello! Counter was increased.");
  };

  const sayWelcome = (msg) => {
    setMessage(msg);
  };

  const handleClick = (e) => {
    setMessage("I was clicked (Synthetic Event)");
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    const euroRate = 0.011;
    setConverted((parseFloat(amount) * euroRate).toFixed(2));
  };

  return (
    <div style={{ padding: '20px' }}>
      <h1>Event Examples App</h1>

      <h2>Counter: {count}</h2>
      <button onClick={increment}>Increment</button>
      <button onClick={decrement}>Decrement</button>

      <hr />
      <button onClick={() => sayWelcome("Welcome!")}>Say Welcome</button>

      <hr />
      <button onClick={handleClick}>OnPress</button>

      <hr />
      <form onSubmit={handleSubmit}>
        <label>Enter amount in ₹: </label>
        <input
          type="number"
          value={amount}
          onChange={(e) => setAmount(e.target.value)}
        />
        <button type="submit">Convert</button>
      </form>
      {converted && <p>Amount in Euros: €{converted}</p>}

      <hr />
      <p><strong>Message:</strong> {message}</p>
    </div>
  );
}

export default App;
