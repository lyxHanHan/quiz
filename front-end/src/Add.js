import React from 'react';
import './styles/Add.css'

class Add extends React.Component {
  render() {
    return (
      <div className="add order">
       <h3>添加商品</h3>
       <div className="message">
        <div styleName="item">
          <p>名称：</p>
          <input></input>
        </div>
        <div styleName="item">
          <p>价格：</p>
          <input className="answer"></input>
        </div>
        <div styleName="item">
          <p>单位：</p>
          <input></input>
        </div>
        <div styleName="item">
          <p>图片：</p>
          <input></input>
        </div>
      </div>
      <button  className="button">提交</button>
      <footer className="footer">TW Mail @2018 Created By Forchen</footer>
    </div>
    );
  }
}
export default Add;
