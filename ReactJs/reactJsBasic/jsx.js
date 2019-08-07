
const name="robin"
const element=<h1>Hi welcome to JSX</h1>

function Welcome(props) {
    return (
        <div>
        <h1 style={{color:'blue'}}>{props.name}</h1>
        {/* <button onClick={()=>alert('Button')}>Click me</button> */}
        <button onClick={alert.bind(this,'Button')}>Click me</button>
        
        </div>
    )
    
}//end of Welcome
/******Class component */
class Message extends React.Component{
    constructor(props){
        super(props);
        this.state={
            name:'robin'
        }
       // this.ChangeMessage=this.ChangeMessage.bind(this);
        //this.clickLink=this.clickLink.bind(this);
    }
    render(){
        return (
            <div>
            <h1 style={{color:'blue'}}>{this.state.name}</h1>
            <button onClick={this.ChangeMessage}>Change Message </button>
            <a href="https://material-ui.com/" onClick={this.clickLink}>Links</a>
            </div>
        )
     }
     ChangeMessage=()=>{
         this.setState({name:"Alia Bhat"})

     } 
     clickLink=(event)=>{

            event.preventDefault();
     }
}//end of Message

/* ReactDOM.render(element, document.getElementById('root')); */
/*  ReactDOM.render(<Welcome name={name} />, document.getElementById('root')); */
ReactDOM.render(<Message  />, document.getElementById('root'));