import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Virat', score: 90 },
    { name: 'Rohit', score: 85 },
    { name: 'Rahul', score: 45 },
    { name: 'Pant', score: 35 },
    { name: 'Jadeja', score: 77 },
    { name: 'Bumrah', score: 60 },
    { name: 'Shami', score: 88 },
    { name: 'Ashwin', score: 68 },
    { name: 'Kohli', score: 95 },
    { name: 'Surya', score: 72 },
    { name: 'Gill', score: 50 }
  ];

  const filtered = players.filter(p => p.score < 70);

  return (
    <div>
      <h2>All Players</h2>
      <ul>
        {players.map((p, i) => (
          <li key={i}>{p.name} - {p.score}</li>
        ))}
      </ul>
      <h2>Players with score below 70</h2>
      <ul>
        {filtered.map((p, i) => (
          <li key={i}>{p.name}</li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
