import React, { useState } from 'react';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const GuestPage = () => (
    <div>
      <h2>Welcome, Guest!</h2>
      <p>You can browse flight details, but booking requires login.</p>
      <button onClick={() => setIsLoggedIn(true)}>Login</button>
    </div>
  );

  const UserPage = () => (
    <div>
      <h2>Welcome, User!</h2>
      <p>Here are your booking options:</p>
      <ul>
        <li>Flight: Hyderabad → Bangalore | ₹4500</li>
        <li>Flight: Delhi → Mumbai | ₹5300</li>
      </ul>
      <button onClick={() => setIsLoggedIn(false)}>Logout</button>
    </div>
  );

  return (
    <div style={{ padding: '20px' }}>
      <h1>Ticket Booking App</h1>
      {isLoggedIn ? <UserPage /> : <GuestPage />}
    </div>
  );
}

export default App;
