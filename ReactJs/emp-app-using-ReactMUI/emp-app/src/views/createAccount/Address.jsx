import React, { Component } from 'react'

export default class Address extends Component {
    render() {
        return (
            <div>
               <form method="post"  className="col-md-10 offset-1" style={{backgroundColor : 'rgb(177, 234, 97)'}}>

                <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Address-1 Information</h3>
        <b><hr /></b>   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">City</label>
            <input type="text" required className="form-control" name="addressInfoBean[0].city" placeholder="Please Enter City " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address type</label>
            <input type="text" required className="form-control" defaultValue="permenent" readOnly name="addressInfoBean[0].addPK.addressType" placeholder="permenent" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">State</label>
            <input type="text" className="form-control" name="addressInfoBean[0].state" placeholder=" Enter State " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address1</label><br />
            <input type="text" name="addressInfoBean[0].addressOne" className="form-control" placeholder=" Enter Address1" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Country</label>
            <input type="text" name="addressInfoBean[0].country" className="form-control" placeholder="Enter Country" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="Pincode">Pincode</label>
            <input type="number" name="addressInfoBean[0].pincode" className="form-control" placeholder="enter  Pincode" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Landmark</label>
            <input type="text" name="addressInfoBean[0].landmark" className="form-control" placeholder="Please Enter Landmark" />
          </div>
        </div> 
        
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Address2 Information</h3>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">City</label>
            <input type="text" required className="form-control" name="addressInfoBean[1].city" placeholder="Please Enter City " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address type</label>
            <input type="text" className="form-control" defaultValue="temporary" readOnly name="addressInfoBean[1].addPK.addressType" placeholder="temporary" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">State</label>
            <input type="text" className="form-control" name="addressInfoBean[1].state" placeholder=" Enter State " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Address2</label><br />
            <input type="text" name="addressInfoBean[1].addressTwo" className="form-control" placeholder=" Enter Address1" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Country</label>
            <input type="text" name="addressInfoBean[1].country" className="form-control" placeholder="Enter Country" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="Pincode">Pincode</label>
            <input type="number" name="addressInfoBean[1].pincode" className="form-control" placeholder="enter  Pincode" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Landmark</label>
            <input type="text" name="addressInfoBean[1].landmark" className="form-control" placeholder="Please Enter Landmark" />
          </div>
          <div style={{textAlign: 'center', padding: '0px 102px 20px', margin: '30px'}} className="btn-group" role="group">  
            <button style={{width: '180px', height: '40px'}} type="reset" className="btn btn-outline-secondary">Reset</button>
            <button style={{width: '180px', height: '40px'}} type="submit" className=" btn btn-outline-primary">Submit</button>
          </div>
        </div>
        </form>
            </div>
        )
    }
}
