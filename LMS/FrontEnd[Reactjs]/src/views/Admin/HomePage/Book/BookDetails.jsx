
import React from "react";
import BookTable from "views/Admin/HomePage/Book/BookTable.jsx";

import SideBar from "views/Admin/SideBar/SideBar.jsx";
class Home extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
    this.state = {
      bean:JSON.parse(localStorage.getItem("userBean"))
    };
  }
  render() {
    
    return (
      <div>
       {/*  <HomeHeader name={this.state.bean.name}/> */}
       {/*  <HomeHeader/> */}
             <br></br>
             <SideBar name={this.state.bean.name}/>
             <BookTable/>

          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;
