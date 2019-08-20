
import React from "react";
import HomeHeader from "views/NavBar/HomeHeader.jsx";
import HomeData from "./HomeData.jsx";

class Home extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
    this.state = {
      bean:JSON.parse(localStorage.getItem("bean"))
    };
  }
  render() {
    
    return (
      <div>
        <HomeHeader name={this.state.bean.name}/>
           
             <br></br>
          <div>
           <HomeData/>

          </div>
      </div>
    );
  }
}


export default Home;
