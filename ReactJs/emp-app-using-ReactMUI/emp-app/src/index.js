
import React from "react";
import ReactDOM from "react-dom";
import { createBrowserHistory } from "history";
import {  Router, Route, Switch } from "react-router-dom";

import "assets/scss/material-kit-react.scss?v=1.7.0";

// pages for this product
import Home from "views/HomePage/Home.jsx";
import LoginPage from "views/LoginPage/LoginPage.jsx";
import RegisterEmployee from "views/createAccount/RegisterEmployee.jsx"



var hist = createBrowserHistory();

ReactDOM.render(
  <Router  history={hist}>
    <Switch>
      <Route exact path="/home" component={Home} />
      <Route exact path="/login" component={LoginPage} />
      <Route path="/register" component={RegisterEmployee} />
    </Switch>
  </Router>,
  document.getElementById("root")
);
