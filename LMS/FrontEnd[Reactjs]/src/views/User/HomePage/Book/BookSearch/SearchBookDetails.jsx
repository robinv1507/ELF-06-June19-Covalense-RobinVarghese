
import React from "react";
import BookTable from "views/User/HomePage/Book/BookSearch/SearchBookTable.jsx";

import SideBar from "views/User/SideBar/SideBar.jsx";
class Home extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
     this.state = {
      bean:JSON.parse(localStorage.getItem("userBean"))
    }; 
    console.log("object",this.state.bean);

  }
  render() {
    
    return (
      <div>
       {/*  <HomeHeader name={this.state.bean.name}/> */}
       {/*  <HomeHeader/> */}
             <br></br>
             <SideBar userName={this.state.bean.name} />
             <BookTable/>

          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;
