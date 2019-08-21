
import React from "react";
import SideBar from "views/Librarian/SideBar/SideBar.jsx";

import BookTable from "views/Librarian/HomePage/Book/BookTable.jsx";
class Home extends React.Component {
  constructor(props) {
    super(props);
    
    // we use this to make the card to appear after the page has been rendered
    /* this.state = {
      bean:JSON.parse(localStorage.getItem("bean"))
    }; */
  }
  render() {
    
    return (
      <div>
       {/*  <HomeHeader name={this.state.bean.name}/> */}
       {/*  <HomeHeader/> */}
             <br></br>
             <SideBar/>
             <BookTable/>

          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;
