
import React from "react";
import ReactDOM from "react-dom";
import { createBrowserHistory } from "history";
import {  Router, Route, Switch } from "react-router-dom";

import "assets/scss/material-kit-react.scss?v=1.7.0";

// pages for this product
import Home from "views/HomePage/Home.jsx";
import LoginPage from "views/LoginPage/LoginPage.jsx";
import Register from "views/Register/Register.jsx";
import AdminHome from "views/Admin/HomePage/Home.jsx";
import UserDetails from "views/Admin/HomePage/User/UserDetails.jsx";
import BookDetails from "views/Admin/HomePage/Book/BookDetails.jsx";
import  LibrarianDetails from "views/Admin/HomePage/Librarian/LibrarianDetails.jsx"; 
import BorrowBookDetails from "views/Admin/HomePage/BorrowBook/BorrowBookDetails.jsx";
import BorrowedBookDetails from "views/User/HomePage/BorrowedBook/BorrowBookDetails.jsx"
import UserHome from "views/User/HomePage/Home.jsx";
import BookList from "views/User/HomePage/Book/BookDetails.jsx"
import RequestedBookDetails from "views/User/HomePage/RequestedBook/RequestedBookDetails.jsx";
import LibrarianHome from "views/Librarian/HomePage/Home.jsx";
import BookDetailsLb from "views/Librarian/HomePage/Book/BookDetails.jsx";
import RequestBookList from "views/Librarian/HomePage/RequestedBook/RequestedBookDetails.jsx";
import SearchBookDetails from "views/User/HomePage/Book/BookSearch/SearchBookDetails.jsx";

var hist = createBrowserHistory();

ReactDOM.render(
  <Router  history={hist}>
    <Switch>
    {/* Admin */}
      <Route exact path="/adminHome" component={AdminHome} />
      <Route exact path="/login" component={LoginPage} />
      <Route path="/register" component={Register} />
      <Route path="/userDetails" component={UserDetails} />
      <Route path="/bookDetails" component={BookDetails} />
      <Route path="/librarianDetails" component={LibrarianDetails} />
    <Route path="/borrowBookDetails" component={BorrowBookDetails} />
{/* user */}
    <Route exact path="/userHome" component={UserHome} />
    <Route exact path="/borrowedBookDetails" component={BorrowedBookDetails} />
     <Route exact path="/requestedBookDetails" component={RequestedBookDetails} />
    <Route exact path="/bookList" component={BookList} />  
    <Route exact path="/searchBookDetails" component={SearchBookDetails} />
 {/* Librarian */}
    <Route exact path="/lbHome" component={LibrarianHome} />
    <Route exact path="/bookListLibrary" component={BookDetailsLb} />
    <Route exact path="/userRequestList" component={RequestBookList} />
    </Switch>
  </Router>,
  document.getElementById("root")
);
