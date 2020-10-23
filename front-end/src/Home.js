import React from 'react';
import './styles/Home.css'
import kele from './kele.jpg'


class Home extends React.Component {
  render() {
    return (
      <div className="good1">
       <img className="kele" src={kele} alt="kele" />
       <p className="name">可乐1</p>
       <p className='price'>单价：1元/瓶</p>
      </div> 
    );
  }
}
export default Home;
