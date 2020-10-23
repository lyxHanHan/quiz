import React, {Component} from 'react';
import './styles/Order.css'

class Order extends Component {
  render() {
    // const dataSource = [
    //   {
    //     key: '1',
    //     name: '胡彦斌',
    //     age: 32,
    //     address: '西湖区湖底公园1号',
    //   },
    //   {
    //     key: '2',
    //     name: '胡彦祖',
    //     age: 42,
    //     address: '西湖区湖底公园1号',
    //   },
    // ];
    
    // const columns = [
    //   {
    //     title: '姓名',
    //     dataIndex: 'name',
    //     key: 'name',
    //   },
    //   {
    //     title: '年龄',
    //     dataIndex: 'age',
    //     key: 'age',
    //   },
    //   {
    //     title: '住址',
    //     dataIndex: 'address',
    //     key: 'address',
    //   },
    // ];
    return (
      <div className="order list">
        {/* <Table dataSource={dataSource} columns={columns} />; */}
      <tr>
           <th>名字</th>
           <th>单价</th>
           <th>数量</th>
           <th>单位</th>
           <th>操作</th>
      </tr>
     <tr>
           <th>可乐1</th>
           <th>1</th>
           <th>2</th>
           <th>瓶</th>
           <button>删除</button>
      </tr> 
      </div>
    );
  }
}
export default Order;
