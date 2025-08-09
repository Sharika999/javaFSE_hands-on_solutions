import React from 'react';

function App() {
  const officeSpaces = [
    {
      name: "ZenSpace Co-Working",
      rent: 55000,
      address: "Banjara Hills, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=Office+1"
    },
    {
      name: "WorkNest Office",
      rent: 75000,
      address: "Madhapur, Hyderabad",
      image: "https://via.placeholder.com/300x200?text=Office+2"
    }
  ];

  return (
    <div>
      <h1>Office Space Rental App</h1>
      {officeSpaces.map((office, index) => (
        <div key={index} style={{ border: '1px solid gray', margin: '10px', padding: '10px' }}>
          <h2>{office.name}</h2>
          <img src={office.image} alt={office.name} width="300" />
          <p><strong>Address:</strong> {office.address}</p>
          <p style={{ color: office.rent < 60000 ? 'red' : 'green' }}>
            <strong>Rent:</strong> ₹{office.rent}
          </p>
        </div>
      ))}
    </div>
  );
}

export default App;
