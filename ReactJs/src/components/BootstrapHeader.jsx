import {Navbar} from 'react-bootstrap';
import {Nav} from 'react-bootstrap';
import {NavDropdown} from 'react-bootstrap';
import {Form} from 'react-bootstrap';
import {Button} from 'react-bootstrap';
import {FormControl} from 'react-bootstrap';
import React, { Component } from 'react'

export default class BootstrapComponent extends Component {
    render() {
        return (
            <div>
                <Navbar bg="dark" fixed="top" variant="dark" expand="lg">
  <Navbar.Brand href="#home">React-Bootstrap</Navbar.Brand>
  <Navbar.Toggle aria-controls="basic-navbar-nav" />
  <Navbar.Collapse id="basic-navbar-nav">
    <Nav className="mr-auto">
      <Nav.Link href="#home">Home</Nav.Link>
      <Nav.Link href="#link">Link</Nav.Link>
    
    </Nav>
    <Form inline>
    <Button variant="outline-success">Search</Button>
      <FormControl type="text" placeholder="Search" className="mr-sm-2" />
    <br></br>
      <Button variant="outline-success">SignIn</Button><br></br>
      <Button variant="outline-success">LogIn</Button>
    </Form>
  </Navbar.Collapse>
</Navbar>
            </div>
        )
    }
}
