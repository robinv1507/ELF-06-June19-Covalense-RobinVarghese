
import React from 'react';

import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import ViewAccounts from './ViewAccount';
import CreateAccount from './CreateAccount';

export default function Navbar(props){
  return (
      <Router>
   <nav className="navbar navbar-expand-lg navbar-light bg-light">
 <h1>Employee</h1>
  <button className="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span className="navbar-toggler-icon"></span>
  </button>

  <div className="collapse navbar-collapse" id="navbarSupportedContent">
    <ul className="navbar-nav mr-auto">
      <li className="nav-item active">
      <Link to="/">CreateAccount</Link>
      </li>
      <li className="nav-item">
      <Link to="/viewaccounts">ViewAccount</Link>
      </li>
     

      
    </ul>
  </div>
</nav>
<Route exact path="/" component={CreateAccount}></Route>
    <Route  path="/viewaccounts" component={ViewAccounts}></Route>
</Router>
  );
}
