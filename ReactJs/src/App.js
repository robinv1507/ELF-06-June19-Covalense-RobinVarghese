import React from 'react';
import ToDoList from './components/ToDoList';
import ToDoItems from './components/ToDoItems';
import './components/todolist.css';
import BootstrapComponent from './components/BootstrapHeader';
import BootstrapFooter from './components/BTSPFooter';
import BootstrapCarousel from './components/BootstrapCarousel';
class  App extends React.Component {
  constructor(){
    super()
    this.state={
      images:[
     'https://cdn.pixabay.com/photo/2019/07/26/09/23/lake-4364335_960_720.jpg',
     'https://cdn.pixabay.com/photo/2014/02/27/16/10/spring-276014_960_720.jpg',
      ]
    }
  }
  render(){
    
  return (  
    <div className="App">
     <BootstrapComponent />
     <BootstrapFooter/>
     <BootstrapCarousel images={this.state.images}/>
    </div>
  );
  }
}

export default App;
