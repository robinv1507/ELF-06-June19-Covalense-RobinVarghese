
import React from "react";

import SideBar from "views/Librarian/SideBar/SideBar.jsx";
import BookCard from "views/Librarian/HomePage/BookCard.jsx";
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
       {/*  <HomeHeader name={this.state.bean.name}/> */}
       {/*  <HomeHeader/> */}
             <br></br>
             <SideBar/>
             <BookCard/>
          {/* <div>
           <HomeData/>

          </div> */}
      </div>
    );
  }
}


export default Home;