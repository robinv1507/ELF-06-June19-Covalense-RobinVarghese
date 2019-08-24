
import React from "react";

import SideBar from "views/User/SideBar/SideBar.jsx";
import BookCard from "views/User/HomePage/BookCard.jsx";
class Home extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
    this.state = {
      userSession:JSON.parse(localStorage.getItem("userBean"))
    };
    console.log("object",this.state.userSession.name);
  }
  render() {
    
    return (
      <div>
       {/*  <HomeHeader name={this.state.bean.name}/> */}
       {/*  <HomeHeader/> */}
             <br></br>
             <SideBar userName={this.state.userSession.name}/>
             <BookCard/>
          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;
