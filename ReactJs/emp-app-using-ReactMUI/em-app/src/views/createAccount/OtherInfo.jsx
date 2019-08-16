import React, { Component } from 'react'

export default class OtherInfo extends Component {
    render() {
        return (
            <div>
               <form method="post"  className="col-md-10 offset-1" style={{backgroundColor : 'rgb(177, 234, 97)'}}>

                <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Other Information</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Emergency Contact Name</label>
            <input type="text" className="form-control" name="otherInfo.emergencyContactName" placeholder="Please Enter Emergency Contact Number " />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Mother Name</label>
            <input name="otherInfo.motherName" type="text" className="form-control" id="inputAddress" placeholder="Please Enter Mother Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Pan Number</label>
            <input type="text" className="form-control" name="otherInfo.pan" placeholder="Please Enter Pan Number" />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Emergency Contact Number</label>
            <input type="text" className="form-control" name="otherInfo.emergencyContactNumber" placeholder="Please Enter Emergency Contact Number " />
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Spouse Name</label>
            <input type="text" name="otherInfo.spouseName" className="form-control" id="inputAddress" placeholder="Please Enter Spouse Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Married Status</label><br />
            <select name="otherInfo.ismarried" style={{width: '408.75px', height: '37.99px'}}>
              <option value="true">married</option>
              <option value="false">unmarried</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Nationality</label>
            <select name="otherInfo.nationality" style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="Indian">Indian</option>
              <option value="Other">Other</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Passport Number</label>
            <input type="text" className="form-control" name="otherInfo.passport" id="inputAddress" placeholder="please enter Passport Number" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Blood Group</label>
            <select name="otherInfo.bloodGrp" style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="A+">A+</option>
              <option value="B+">B+</option>
              <option value="O+">O+</option>
              <option value="AB+">AB+</option>
              <option value="A-">A-</option>
              <option value="B-">B-</option>
              <option value="O-">O-</option>
              <option value="AB-">AB-</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Religion</label>
            <select name="otherInfo.religion" style={{width: '408.75px', height: '37.99px'}}>
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="Hinduism">Hinduism</option>
              <option value="Islam">Islam</option>
              <option value="Sikhism">Sikhism </option>
              <option value="Buddhism">Buddhism</option>
              <option value="Jainism">Jainism</option>
              <option value="Other religions ">Other religions </option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputAddress">Aadhar Number</label>
            <input type="text" name="otherInfo.adhar" className="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-4">
            <label htmlFor="inputEmail4">Physically Challenged?</label>
            <select style={{width: '408.75px', height: '37.99px'}} name="otherInfo.isChallenged">
              <option value disabled="disabled" selected="selected">Please select</option>
              <option value="YES">YES</option>
              <option value="NO">NO</option>
            </select>
          </div>
          <div className="form-group col-md-4">
            <label htmlFor="inputPassword4">Father Name</label>
            <input type="text" className="form-control" name="otherInfo.fatherName" placeholder="Please Enter Father Name " />
          </div>
        </div> 
        </form>
            </div>
        )
    }
}
