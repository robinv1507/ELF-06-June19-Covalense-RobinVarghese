
import {Carousel} from 'react-bootstrap';
import React, { Component } from 'react'

export default class BootstrapCarousel extends Component {
   
    sliderImg=(i)=>{
        return (
<Carousel.Item>
     
     <img
      // onChange={this.props.slide}
        className="d-block w-100"
        src={i}
        alt="First slide"
      /> 
        
      <Carousel.Caption>
        <h3>First slide label</h3>
        <p>Nulla vitae elit libero, a pharetra augue mollis interdum.</p>
      </Carousel.Caption>
    </Carousel.Item>
        )
    }
    render() {
        let imgarr=[]
       for(var i=0;i<this.props.images.length;i++){
               imgarr.push(this.sliderImg(this.props.images[i]))
       }
        return (
            <div>
           <Carousel >
             {imgarr}
 
            </Carousel>
            </div>
        )
    }
}
