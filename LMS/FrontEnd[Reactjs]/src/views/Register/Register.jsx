
import React from "react";
// nodejs library to set properties for components
import PropTypes from "prop-types";
// @material-ui/core components
import withStyles from "@material-ui/core/styles/withStyles";
import InputAdornment from "@material-ui/core/InputAdornment";
import Icon from "@material-ui/core/Icon";

import Header from "components/Header/Header.jsx";
import GridContainer from "components/Grid/GridContainer.jsx";
import GridItem from "components/Grid/GridItem.jsx";
import Button from "components/CustomButtons/Button.jsx";
import Card from "components/Card/Card.jsx";
import CardBody from "components/Card/CardBody.jsx";
import CardHeader from "components/Card/CardHeader.jsx";
import CardFooter from "components/Card/CardFooter.jsx";
import CustomInput from "components/CustomInput/CustomInput.jsx";
import Input from '@material-ui/core/Input';
import loginPageStyle from "assets/jss/material-kit-react/views/loginPage.jsx";
import { Link } from 'react-router-dom';
//import Button from '@material-ui/core/Button';
import image from "assets/img/bg9.jpg";
import Axios from "axios";
import Typography from '@material-ui/core/Typography';

class LoginPage extends React.Component {
  constructor(props) {
    super(props);
    // we use this to make the card to appear after the page has been rendered
    this.state = {
      id:'',
      password:'',
      cardAnimaton: "cardHidden"
    };
  }

  componentDidMount() {

    // we add a hidden class to the card and after 700 ms we delete it and the transition appears
    setTimeout(
      function() {
        this.setState({ cardAnimaton: "" });
      }.bind(this),
      700
    );
  }

  validateEmployee(event){

    event.preventDefault();
  Axios.post('http://localhost/emp-springrest/login/',null,
  {params : {id:this.state.id,password:this.state.password}})
  .then((res)=>{
    
     if(res.data.msg=="Succesfull")
    {
      let empdata=res.data.data[0];
      console.log("empdata",empdata)
      localStorage.setItem("bean",JSON.stringify(empdata))

 console.log("bean",localStorage.getItem("bean"))
      this.props.history.push('/home');


    } else{
      alert("invalid Id or password");

    }
    console.log('Res',res);
  })
  .catch((err)=>{
    console.log('err',err)
  })

  }

  render() {
    const { classes, ...rest } = this.props;
    return (
      <div>
        <Header
          absolute
          color="transparent"
          brand="Library Management System"
          /* rightLinks={<HeaderLinks />}
          {...rest} */
        />
        <div
          className={classes.pageHeader}
          style={{
            backgroundImage: "url(" + image + ")",
          
            backgroundSize: "cover",
            backgroundPosition: "top center"
          }}
        >
          <div className={classes.container}>
            <GridContainer justify="center">
              <GridItem xs={12} sm={12} md={4}>
                <Card className={classes[this.state.cardAnimaton]}>
                  <form onSubmit={this.validateEmployee.bind(this)} >
                    <CardHeader color="primary" className={classes.cardHeader}>
                      <h4>Register</h4>
                    
                    </CardHeader>
                  
                    <CardBody>
                    
                    <Input style={{width:'100%'}} id="id" type="text"
                              placeholder="User Name"
                              onChange={(event)=>{
                                this.setState({id:event.target.value})
                              }}
                              value={this.state.id}
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  /><br></br><br></br>
                                 <Input style={{width:'100%'}} id="id" type="email"
                              placeholder="Email"
                              onChange={(event)=>{
                                this.setState({id:event.target.value})
                              }}
                              value={this.state.id}
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  /><br></br><br></br>
                                   <Input style={{width:'100%'}} id="phoneNo" type="number"
                              placeholder="phoneNo"
                              onChange={(event)=>{
                                this.setState({id:event.target.value})
                              }}
                              value={this.state.id}
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  /><br></br><br></br>
                     <Input style={{width:'100%'}} id="password" type="password"
                              placeholder="Password"
                              onChange={(event)=>{
                                this.setState({password:event.target.value})
                              }}
                              value={this.state.password}
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  /><br></br><br></br>
                                   <Input style={{width:'100%'}} id="cpassword" type="password"
                              placeholder="Conform Password"
                              onChange={(event)=>{
                                this.setState({password:event.target.value})
                              }}
                              value={this.state.password}
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  /><br></br>
                     
                     
                    </CardBody>
                    <CardFooter className={classes.cardFooter}>
                    <Button  type="submit"  align="center" color="success" size="mm">
                       Register
                      </Button>
                     
                      <Link to="/login"> <Button   color="primary" size="mm">
                        Login
                        </Button>
                        </Link>
                    
                    </CardFooter>
                   
                  </form>
                </Card>
              </GridItem>
            </GridContainer>
          </div>
{/*           <Footer whiteFont /> */}
        </div>
      </div>
      //<Route exact path="/home" component={ProfilePage}></Route>
 
    );
  }
}

LoginPage.propTypes = {
  classes: PropTypes.object
};

export default withStyles(loginPageStyle)(LoginPage);
