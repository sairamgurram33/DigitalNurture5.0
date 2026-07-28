import React, { useState } from 'react';
import ListofPlayers from './ListofPlayers';
import IndianPlayers from './IndianPlayers';
import './App.css';

function App() {
  const [flag, setFlag] = useState(true);

  return (
    <div className="App">
      <div className="controls-panel glass-panel">
        <button className="toggle-btn" onClick={() => setFlag(!flag)}>
          Toggle Flag (Current: {flag ? 'true' : 'false'})
        </button>
      </div>
      
      {flag ? <ListofPlayers /> : <IndianPlayers />}
    </div>
  );
}

export default App;
