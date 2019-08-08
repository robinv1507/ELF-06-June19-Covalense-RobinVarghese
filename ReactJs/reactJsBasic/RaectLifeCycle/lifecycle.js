class LifeCycle extends React.Component {
    constructor(props) {
      super(props);
      console.log("constructor ");
      this.state = {name: "robin",checked:true};
    }
    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps");
       /*  return {name:'Sundara'}; */
       return null;
      }
      
    render() {
        console.log("render LifeCycle");
        if(this.state.checked){
      return (
        <div>
           <h1> {this.state.name}</h1>
           <button onClick={this.changeName}>ChangeName</button>

        </div>
       
      );
        }
        else{
            return  <h1> checked state is false</h1>
        }
    }
    componentDidMount() {
        console.log("componentDidMount LifeCycle");
        return null;
      }

    shouldComponentUpdate() {
        console.log("shouldComponentUpdate LifeCycle");
        return true;
      }
      getSnapshotBeforeUpdate( ) {
        console.log("getSnapshotBeforeUpdate LifeCycle");
        return "snapshot";

      }
      componentDidUpdate(props,state,snapshot) {
        console.log("componentDidUpdate LifeCycle");
        console.log(snapshot);
      }
      changeName=()=>{
        this.setState({name: "blue"});
      }

  }

  //********************************************************************************** */
  class Child extends React.Component {
    constructor(props) {
      super(props);
      console.log("constructor  Child");
      this.state = {name: "robin",checked:true};
    }
    static getDerivedStateFromProps() {
        console.log("getDerivedStateFromProps");
       /*  return {name:'Sundara'}; */
       return null;
      }
      
    render() {
        console.log("render Child");
        if(this.state.checked){
      return (
        <div>
           <h1>Child</h1>
           <button onClick={this.changeName}>ChangeName</button>

        </div>
       
      );
        }
        else{
            return  <h1> checked state is false</h1>
        }
    }
    componentDidMount() {
        console.log("componentDidMount LifeCycle");
        return null;
      }

    shouldComponentUpdate() {
        console.log("shouldComponentUpdate LifeCycle");
        return true;
      }
      getSnapshotBeforeUpdate( ) {
        console.log("getSnapshotBeforeUpdate LifeCycle");
        return "snapshot";

      }
      componentDidUpdate(props,state,snapshot) {
        console.log("componentDidUpdate LifeCycle");
        console.log(snapshot);
      }
      changeName=()=>{
        this.setState({name: "blue"});
      }

  }
  ReactDOM.render(<div><LifeCycle /><Child /></div>, document.getElementById('root'));