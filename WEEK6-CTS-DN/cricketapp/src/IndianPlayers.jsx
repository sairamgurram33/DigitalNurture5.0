import React from 'react';

const IndianPlayers = () => {
  const indianPlayers = ["Sachin", "Dhoni", "Virat", "Rohit", "Yuvraj", "Raina"];
  const [first, second, third, fourth, fifth, sixth] = indianPlayers;
  
  const T20Players = ["FirstPlayer", "SecondPlayer", "ThirdPlayer"];
  const RanjiTrophyPlayers = ["FourthPlayer", "FifthPlayer", "SixthPlayer"];
  const mergedPlayers = [...T20Players, ...RanjiTrophyPlayers];

  return (
    <div className="glass-panel">
      <h1>Indian Players</h1>
      
      <h2>Odd Players</h2>
      <ul>
        <li>First: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{first}</span></li>
        <li>Third: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{third}</span></li>
        <li>Fifth: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{fifth}</span></li>
      </ul>

      <h2>Even Players</h2>
      <ul>
        <li>Second: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{second}</span></li>
        <li>Fourth: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{fourth}</span></li>
        <li>Sixth: <span style={{fontWeight: 'bold', color: 'var(--accent)'}}>{sixth}</span></li>
      </ul>

      <h2>Merged Players from T20 and Ranji Trophy</h2>
      <ul>
        {mergedPlayers.map((player, index) => (
          <li key={index}>
            <span>{player}</span>
          </li>
        ))}
      </ul>
    </div>
  );
};

export default IndianPlayers;
