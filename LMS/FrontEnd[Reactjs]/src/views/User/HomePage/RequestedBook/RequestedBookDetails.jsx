
import React from "react";
import RequestedBookTable from "views/User/HomePage/RequestedBook/RequestedBookTable.jsx";
import SideBar from "views/User/SideBar/SideBar.jsx";
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
             <RequestedBookTable/>

          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;
