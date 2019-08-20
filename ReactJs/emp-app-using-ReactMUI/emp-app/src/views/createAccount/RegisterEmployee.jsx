import React, { Component } from 'react'
import Info from './Info';
import Address from './Address';
import Education from './Education';
import Experience from './Experience';
import OtherInfo from './OtherInfo';


export default class RegisterEmployee extends Component {
    render() {
        return (
            <div>

                <Info />
                <OtherInfo/>
                <Education/>
                <Experience/>
                <Address/>

            </div>
        )
    }
}
