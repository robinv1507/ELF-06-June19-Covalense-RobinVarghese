import React, { Component } from 'react'

export default class Experience extends Component {
    render() {
        return (
            <div>
               <form method="post"  className="col-md-10 offset-1" style={{backgroundColor : 'rgb(177, 234, 97)'}}>

                   <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Experience Details</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Company Name </label>
            <input required type="text" name="expInfoBean[0].empPkBean.companyName" className="form-control" placeholder="please Enter Company Name" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Designation</label>
            <input required type="text" name="expInfoBean[0].designation" className="form-control" placeholder="Please Enter Designation" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Joining Date</label>
            <input type="date" name="expInfoBean[0].joiningDate" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">leaving Date</label>
            <input type="date" name="expInfoBean[0].leavingDate" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
        </div>

        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Experience Details 2</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Company Name </label>
            <input required type="text" name="expInfoBean[1].empPkBean.companyName" className="form-control" placeholder="please Enter Company Name" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Designation</label>
            <input required type="text" name="expInfoBean[1].designation" className="form-control" placeholder="Please Enter Designation" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Joining Date</label>
            <input type="date" name="expInfoBean[1].joiningDate" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">leaving Date</label>
            <input type="date" name="expInfoBean[1].leavingDate" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
        </div>
</form>
            </div>
        )
    }
}
