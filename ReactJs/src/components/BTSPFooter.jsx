import {Navbar} from 'react-bootstrap';
import {Nav} from 'react-bootstrap';
import {NavDropdown} from 'react-bootstrap';
import {Form} from 'react-bootstrap';
import {Button} from 'react-bootstrap';
import {FormControl} from 'react-bootstrap';
import React, { Component } from 'react'

export default class BootstrapFooter extends Component {
    render() {
        return (
            <div>
        <Navbar fixed="bottom" bg="dark">
    <Navbar.Brand variant="dark" href="#home">
    ©copy Right 2010-ReactJs 
    </Navbar.Brand>
  </Navbar>
            </div>
        )
    }
}
