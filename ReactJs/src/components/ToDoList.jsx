import React,{Component} from 'react';
import Button from 'react-bootstrap/Button';


class ToDoList extends Component {

       componentDidUpdate(){
              this.props.inputElement.current.focus()
       }

   
  render(){ 
  return (
    <div className="todoMain">

           <div className="header">
               <form onSubmit={this.props.addItem}>
                   <input  placeholder="   enter your plans............" 
                  style={{backgroundColor:this.props.color}}
                 //  onKeyUp={this.state.} 
       
                   ref={this.props.inputElement}
                   value={this.props.currentItem}
                   onChange={this.props.handleInput}/>
                    <Button variant="primary"  className="addtask" type="submit">Add Task</Button>
                   </form>
            </div>
     
      
     </div>
    );
 }
}

export default ToDoList;
