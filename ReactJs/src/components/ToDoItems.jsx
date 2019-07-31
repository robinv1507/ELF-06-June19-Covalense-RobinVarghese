import React, { Component } from 'react'

export default class ToDoItems extends Component {
    createTasks=item=>{
        return (<div className="todoMain">
        <li key={item.key} style={{color:'black'}} >
        {item.text}
          <button type="button" onClick={()=>this.props.deleteItem(item.key)}>&times;</button> 
        </li></div>)
    }
    render() {
        const todoentries=this.props.entries
        const listItems=todoentries.map(this.createTasks)

        return (
           <ul className="theList">{listItems}</ul>
        )
    }
}
