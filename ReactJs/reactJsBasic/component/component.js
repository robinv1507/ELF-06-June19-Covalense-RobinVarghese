function Header(props1){
    return React.createElement("h1",null,"Header");
}

//footer
function Footer(){
    return React.createElement("h1",null,"Footer");
}
const header=React.createElement(Header,{item:["bag"]});
const footer=React.createElement(Footer);
const myapp=React.createElement("div",null,header,footer);
ReactDOM.render(myapp, document.getElementById('root'));
