import React from 'react';
import ToDoList from './components/ToDoList';
import ToDoItems from './components/ToDoItems';
import './components/todolist.css';
import BootstrapComponent from './components/BootstrapComponent';

class  App extends React.Component {
  inputElement=React.createRef()
  constructor(){
    super()
    this.state={
      items:[],currentItem:{text:'',key:''},
      color:'#e9f7e9'
    }
    
  }
  handleInput=e=>{
    const itemText=e.target.value
    const currentItem={text:itemText,key:Date.now()}
    this.setState({currentItem})
    console.log("handleInput")
    this.setState({color:'#f1ff717d'})
    
  }
  addItem=e=>{
    e.preventDefault();
    const newItem=this.state.currentItem
    if(newItem.text!==''){
      console.log(newItem)
      const items=[...this.state.items,newItem]
      this.setState({
        items:items,currentItem:{text:'',key:''}
      })
    }
    console.log("")
  }
  deleteItem=key=>{
    const filterItem=this.state.items.filter(item=>{
      return item.key!==key
    })
    this.setState({items:filterItem})
  }
  render(){
    console.log(this.state.color)
  return (  
    <div className="App">
     <BootstrapComponent />
        <h1 style={{color:'green'}}>ToDo List</h1>
        <ToDoList addItem={this.addItem}
                   inputElement={this.inputElement}
                   handleInput={this.handleInput}
                   currentItem={this.currentItem}
               color={this.state.color}
        
        />
       
        <ToDoItems entries={this.state.items} deleteItem={this.deleteItem} />
  
    </div>
  );
  }
}

export default App;
