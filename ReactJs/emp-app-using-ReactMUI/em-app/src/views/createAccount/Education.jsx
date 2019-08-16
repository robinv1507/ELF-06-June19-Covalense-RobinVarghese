import React, { Component } from 'react'

export default class Education extends Component {
    render() {
        return (
            <div>
               <form method="post"  className="col-md-10 offset-1" style={{backgroundColor : 'rgb(177, 234, 97)'}}>

                 <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Educational Details</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Education Type</label>
            <input required type="text" name="educationalInfoBeans[0].educationalInfoPKBean.educationalType" className="form-control" placeholder=" Education Type " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Degree Type</label>
            <input required type="text" name="educationalInfoBeans[0].degreeType" className="form-control" placeholder="Please Enter Degree Type" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Branch</label>
            <input type="text" name="educationalInfoBeans[0].branch" className="form-control" placeholder="Please Enter Branch " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Collage Name</label><br />
            <input type="text" name="educationalInfoBeans[0].collageName" className="form-control" placeholder="Please Enter Collage Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">University</label>
            <input type="text" name="educationalInfoBeans[0].university" className="form-control" placeholder="Please Enter University" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Year Of Passing</label>
            <input type="date" name="educationalInfoBeans[0].yop" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Percentage</label>
            <input type="number" name="educationalInfoBeans[0].percentage" className="form-control" placeholder="Please Enter Percentage" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Location </label>
            <input type="text" name="educationalInfoBeans[0].location" className="form-control" placeholder="Please Enter Location " />
          </div>
        </div>   
        <h3 style={{textAlign: 'center', padding: '20px'}}>Employee Educational Details 2</h3>
        <hr />   
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Education Type</label>
            <input required type="text" name="educationalInfoBeans[1].educationalInfoPKBean.educationalType" className="form-control" placeholder=" Education Type " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Degree Type</label>
            <input required type="text" name="educationalInfoBeans[1].degreeType" className="form-control" placeholder="Please Enter Degree Type" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Branch</label>
            <input type="text" name="educationalInfoBeans[1].branch" className="form-control" placeholder="Please Enter Branch " />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Collage Name</label><br />
            <input type="text" name="educationalInfoBeans[1].collageName" className="form-control" placeholder="Please Enter Collage Name" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">University</label>
            <input type="text" name="educationalInfoBeans[1].university" className="form-control" placeholder="Please Enter University" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Year Of Passing</label>
            <input type="date" name="educationalInfoBeans[1].yop" className="form-control" placeholder="dd-mm-yyyy" />
          </div>
        </div>
        <div className="form-row">
          <div className="form-group col-md-6">
            <label htmlFor="inputEmail4">Percentage</label>
            <input type="text" name="educationalInfoBeans[1].percentage" className="form-control" placeholder="Please Enter Percentage" />
          </div>
          <div className="form-group col-md-6">
            <label htmlFor="inputPassword4">Location </label>
            <input type="text" name="educationalInfoBeans[1].location" className="form-control" placeholder="Please Enter Location " />
          </div>
        </div>    
        </form>     
            </div>
        )
    }
}
