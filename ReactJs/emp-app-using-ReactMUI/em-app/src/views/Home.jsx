
import React from "react";


import HomeHeader from "views/HomeHeader.jsx";
import HomeData from "views/HomeData.jsx"

class Home extends React.Component {
  render() {
    
    return (
      <div>
        <HomeHeader/>
          <div>
            <HomeData/>
          </div>
      </div>
    );
  }
}


export default Home;
