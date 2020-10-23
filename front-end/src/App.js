import React from 'react';
// import './App.css';
import './styles/App.css'
import Order from './Order';
import Home from './Home';
import Add from './Add';


function App() {
  return (
    <div className="App">
      <div className="Item">
        <span className="Item1">商城</span>
        <span className="Item2">订单</span>
        <span className="Item3">添加商品</span>
      </div>
      <div>
        <Home />
        <Order/>
        <Add/>
      </div>
    </div>
  );
}

export default App;
