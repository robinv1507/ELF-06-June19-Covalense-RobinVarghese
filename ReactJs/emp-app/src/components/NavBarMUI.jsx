
import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import AppBar from '@material-ui/core/AppBar';
import Toolbar from '@material-ui/core/Toolbar';
import Typography from '@material-ui/core/Typography';
import { BrowserRouter as Router, Route, Link } from 'react-router-dom';
import ViewAccounts from './ViewAccount';
import CreateAccount from './CreateAccount';
const useStyles = makeStyles({
  root: {
    flexGrow: 1,
  },
});

export default function(props){
  const classes = useStyles();
  return (
      <Router>
    <div className={classes.root}>
      <AppBar position="static" color="default">
        <Toolbar>
          <Typography variant="h6" color="inherit">
           Employee
          </Typography><br></br>
          <Typography variant="h6" color="inherit">
         <Link to="/">CreateAccount</Link><br></br>
          </Typography>
          <Typography variant="h6" color="inherit">
           <Link to="/viewaccounts">ViewAccount</Link>
          </Typography>
        </Toolbar>
      </AppBar>
    </div>
    <Route exact path="/" component={CreateAccount}></Route>
    <Route  path="/viewaccounts" component={ViewAccounts}></Route>
    </Router>
  );
}
