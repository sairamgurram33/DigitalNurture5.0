import React from 'react';

const ListofPlayers = () => {
  const players = [
    { name: 'Jack', score: 50 },
    { name: 'Michael', score: 70 },
    { name: 'John', score: 40 },
    { name: 'Ann', score: 61 },
    { name: 'Elisabeth', score: 61 },
    { name: 'Sachin', score: 95 },
    { name: 'Dhoni', score: 100 },
    { name: 'Virat', score: 80 },
    { name: 'Rohit', score: 75 },
    { name: 'Yuvraj', score: 60 },
    { name: 'Raina', score: 65 }
  ];

  const playersBelow70 = players.filter((player) => player.score < 70);

  return (
    <div className="glass-panel">
      <h1>List of Players</h1>
      <ul>
        {players.map((player, index) => (
          <li key={index}>
            <span>Mr. {player.name}</span>
            <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{player.score}</span>
          </li>
        ))}
      </ul>

      <h1 style={{marginTop: '2rem'}}>Players with Scores Below 70</h1>
      <ul>
        {playersBelow70.map((player, index) => (
          <li key={index}>
            <span>Mr. {player.name}</span>
            <span style={{fontWeight: 'bold', color: '#f87171'}}>{player.score}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default ListofPlayers;
