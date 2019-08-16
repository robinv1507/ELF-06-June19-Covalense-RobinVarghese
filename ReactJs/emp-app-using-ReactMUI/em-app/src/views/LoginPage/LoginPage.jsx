
import React from "react";
// nodejs library to set properties for components
import PropTypes from "prop-types";
// @material-ui/core components
import withStyles from "@material-ui/core/styles/withStyles";
import InputAdornment from "@material-ui/core/InputAdornment";
import Icon from "@material-ui/core/Icon";
// @material-ui/icons
import Email from "@material-ui/icons/Email";
import People from "@material-ui/icons/People";
// core components
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

class LoginPage extends React.Component {
  constructor(props) {
    super(props);
    // we use this to make the card to appear after the page has been rendered
    this.state = {
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
  render() {
    const { classes, ...rest } = this.props;
    return (
      <div>
        <Header
          absolute
          color="transparent"
          brand="Employee Management Portal"
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
                  <form /* className={classes.form} */ >
                    <CardHeader color="primary" className={classes.cardHeader}>
                      <h4>Login</h4>
                    
                    </CardHeader>
                  
                    <CardBody>
                    <Input style={{width:'100%'}} id="id" type="number"
                              placeholder="Employee Id"
                                inputProps={{
                                          'aria-label': 'description',
                                          'color':'red'
                                           }}
                                  />
                     {/*  <CustomInput
                        labelText="Employee Id"
                        id="first"
                        formControlProps={{
                          fullWidth: true
                        }}
                        inputProps={{
                          type: "number",
                          required:true,
                          endAdornment: (
                            <InputAdornment position="end">
                              <People className={classes.inputIconsColor} />
                            </InputAdornment>
                          )
                        }}
                      /> */}
                     
                      <CustomInput
                        labelText="Password"
                        id="password"
                       onSubmit={this.goHome}
                        formControlProps={{
                          fullWidth: true
                        }}
                        inputProps={{
                          type: "password",
                          required:true,

                          endAdornment: (
                            <InputAdornment position="end">
                              <Icon className={classes.inputIconsColor}>
                               
                              </Icon>
                            </InputAdornment>
                          ),
                          autoComplete: "off"
                        }}
                      />
                    </CardBody>
                    <CardFooter className={classes.cardFooter}>
                    <Link to="/register"> <Button   color="success" size="mm">
                       Register
                      </Button>
                      </Link>
                      <Link to="/home">
                        <Button   type="submit" color="primary" size="mm">
                        Login
                      </Button></Link> 
                      
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
