class Header extends React.Component{
    constructor(props){
        super(props);
        
        console.log("props value"+this.props);
    }
    render(){
        return React.createElement("ul",null,
        this.props.item.map((val,index)=>{
           return React.createElement("li",{key:index},val);
        })  );    
       // return React.createElement("h1",null,"Header");
  }
}

//footer
class Footer extends React.Component{
    render(){return React.createElement("h1",null,"Footer");
    
}
}
const items=['bag','pencil','pen'];
const header=React.createElement(Header,{item:items});
const footer=React.createElement(Footer);
const myapp=React.createElement("div",null,header,footer);
ReactDOM.render(myapp, document.getElementById('root'));
