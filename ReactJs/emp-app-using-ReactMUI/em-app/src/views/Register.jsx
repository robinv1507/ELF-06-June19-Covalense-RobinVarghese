
import React from "react";

class Register extends React.Component {
  render() {
    
    return (
      <div>
       
       <form  method="post" action="./submitRegisterData" className="col-md-10 offset-1" style="background-color : rgb(177, 234, 97);">
                <h3 style="text-align: center;padding: 20px;">Employee Information</h3>
                <hr/>   
            <div className="form-row">
                  <div classNameName="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input type="text" name="id" className="form-control" required  placeholder="Please Enter ID"/>
                  </div>
                  <div className="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" name="accountNumber" className="form-control"  placeholder="Please EnterAccount Number "/>
                  </div>
              
                </div>
                <div className="form-row">
                        <div className="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" name="name" required className="form-control"  placeholder="Please Enter Name"/>
                        </div>
                        <div className="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" name="email" required className="form-control"  placeholder="Please Enter Email Id "/>
                        </div>
                      
                      </div>
              
                      <div className="form-row">
                        <div  className="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br/>
                            <input type="text" name="age" className="form-control"  placeholder="Please Enter Age"/>
                       
                        </div>
                         
                            <div className="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input type="text" name="designation" className="form-control"  placeholder="Please EnterDesignation"/>
                            </div>

                           
                         
                          </div>
                          <div className="form-row">
                                <div className="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br/>
                                  <select name="gender" style="width: 640.75px;height: 39.99px;" >
                                      <option value="" disabled="disabled" selected="selected">Please select</option>
                                    <option value="Male">Male</option>
                                      <option value="Female">Female</option>
                                     
                                    </select>
                                </div>
                                <div className="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input type="date" name="dob" className="form-control"  placeholder="dd-mm-yyyy"/>
                                </div>
                                
                              </div>

                
                              <div className="form-row">
                                    <div className="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input type="number" name="salary" className="form-control"  placeholder="Please EnterDesignation"/>
                                    </div>
                                    <div className="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="text" required name="departmentInfoBean.deptId" className="form-control"  placeholder="Please Enter Department ID "/>

                                     
                                    </div>
                              </div>
                                    <div className="form-row">
                                        <div className="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input type="text" name="phone" className="form-control"  placeholder="Please Enter Phone Number"/>
                                        </div>
                                        <div className="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input type="text" name="managerId" className="form-control"  placeholder="Please Enter Manager ID "/>
    
                                         
                                        </div>
                                      </div>
                                      
                                      <div className="form-row">
                                          <div className="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input type="date" name="joiningDate" className="form-control"  placeholder="dd-mm-yyyy"/>
                                            </div>
                                             <div className="form-group col-md-6">
                                              <label for="inputPassword4">Password</label>
                                              <input type="text" required className="form-control" name="password"  placeholder="Please Enter Password "/>
        
                                            </div>
                                            <div style="text-align: center;padding: 0px 102px 20px;margin: 30px;"  className="btn-group" role="group" >  
                                                
                                              </div>
                                        </div>
                       

           {/*    <!--===============================employee Other info===================================  -->
 */}    <h3 style="text-align: center;padding: 20px;">Employee Other Information</h3>
                <hr/>   
            <div className="form-row">
           
                  <div className="form-group col-md-4">
                    <label for="inputPassword4">Emergency Contact Name</label>
                    <input type="text" className="form-control"  name="otherInfo.emergencyContactName" placeholder="Please Enter Emergency Contact Number "/>
                  </div>
                  <div className="form-group col-md-4">
                        <label for="inputAddress">Mother Name</label>
                        <input name="otherInfo.motherName" type="text" className="form-control" id="inputAddress" placeholder="Please Enter Mother Name"/>
                      </div>
                </div>

                <div className="form-row">
                        <div className="form-group col-md-4">
                          <label for="inputEmail4">Pan Number</label>
                          <input type="text" className="form-control" name="otherInfo.pan" placeholder="Please Enter Pan Number"/>
                        </div>
                        <div className="form-group col-md-4">
                          <label for="inputPassword4">Emergency Contact Number</label>
                          <input type="text" className="form-control" name="otherInfo.emergencyContactNumber"  placeholder="Please Enter Emergency Contact Number "/>
                        </div>
                        <div className="form-group col-md-4">
                              <label for="inputAddress">Spouse Name</label>
                              <input type="text" name="otherInfo.spouseName" className="form-control" id="inputAddress" placeholder="Please Enter Spouse Name"/>
                            </div>
                      </div>
              
                      <div className="form-row">
                        <div  className="form-group col-md-4">
                            <label for="inputEmail4">Married Status</label><br/>
                            <select name="otherInfo.ismarried" style="width: 408.75px;height: 37.99px;">
                                <option value="true">married</option>
                                <option value="false">unmarried</option>
                              </select>
                       
                        </div>
                         
                            <div className="form-group col-md-4">
                              
                              <label for="inputPassword4">Nationality</label>
                          
                            <select name="otherInfo.nationality" style="    width: 408.75px;height: 37.99px;" >
                                <option value="" disabled="disabled" selected="selected">Please select</option>
                              <option value="Indian">Indian</option>
                                <option value="Other">Other</option>
                              </select>
                            </div>

                            <div className="form-group col-md-4">
                                  <label for="inputAddress">Passport Number</label>
                                  <input type="text" className="form-control"  name="otherInfo.passport" id="inputAddress" placeholder="please enter Passport Number"/>
                                </div>
                         
                          </div>
                          <div className="form-row">
                                <div className="form-group col-md-4">
                                  <label for="inputEmail4">Blood Group</label>
                                  <select name="otherInfo.bloodGrp" style="    width: 408.75px;height: 37.99px;" >
                                      <option value="" disabled="disabled"  selected="selected">Please select</option>
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
                                  <label for="inputPassword4">Religion</label>
                                  <select name="otherInfo.religion" style="width: 408.75px;height: 37.99px;" >
                                    <option value="" disabled="disabled" selected="selected">Please select</option>
                                  <option value="Hinduism">Hinduism</option>
                                    <option value="Islam">Islam</option>
                                    <option value="Sikhism">Sikhism </option>
                                    <option value="Buddhism">Buddhism</option>
                                    <option value="Jainism">Jainism</option>
                                    <option value="Other religions ">Other religions </option>

                                   
                                  
                                  </select>
                                </div>
                                <div className="form-group col-md-4">
                                      <label for="inputAddress">Aadhar Number</label>
                                      <input type="text" name="otherInfo.adhar" className="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number"/>
                                    </div>
                              </div>

                
                              <div className="form-row">
                                    <div className="form-group col-md-4">
                                      <label for="inputEmail4">Physically Challenged?</label>
                                      <select style="width: 408.75px;height: 37.99px;" name="otherInfo.isChallenged" >
                                        <option value="" disabled="disabled" selected="selected">Please select</option>
                                      <option value="YES">YES</option>
                                        <option value="NO">NO</option>
                                      </select>
                                    </div>
                                    <div className="form-group col-md-4">
                                      <label for="inputPassword4">Father Name</label>
                                      <input type="text" className="form-control" name="otherInfo.fatherName" placeholder="Please Enter Father Name "/>

                                     
                                    </div>
                                   
                                    </div>
{/*  <!--===============================employee Educational Details===================================  --> */}

                                     <h3 style="text-align: center;padding: 20px;">Employee Educational Details</h3>
                                     <hr/>   
                                 <div className="form-row">
                
                                       <div className="form-group col-md-6">
                                         <label for="inputPassword4">Education Type</label>
                                         <input required type="text" name="educationalInfoBeans[0].educationalInfoPKBean.educationalType" className="form-control"  placeholder=" Education Type "/>
                                       </div>
                                       <div className="form-group col-md-6">
                                        <label for="inputEmail4">Degree Type</label>
                                        <input required type="text"  name="educationalInfoBeans[0].degreeType" className="form-control"  placeholder="Please Enter Degree Type"/>
                                      </div>
                                   
                                     </div>
                                     <div className="form-row">
                                             
                                             <div className="form-group col-md-6">
                                               <label for="inputPassword4">Branch</label>
                                               <input type="text" name="educationalInfoBeans[0].branch" className="form-control"  placeholder="Please Enter Branch "/>
                                             </div>
                                             <div  className="form-group col-md-6">
                                                <label for="inputEmail4">Collage Name</label><br/>
                                                <input type="text" name="educationalInfoBeans[0].collageName" className="form-control"  placeholder="Please Enter Collage Name"/>
                                           
                                            </div>
                                           
                                         </div>
                                   
                                           <div className="form-row">
                                            
                                              
                                                 <div className="form-group col-md-6">
                                                   
                                                   <label for="inputPassword4">University</label>
                                               
                                                   <input type="text" name="educationalInfoBeans[0].university" className="form-control"  placeholder="Please Enter University"/>
                                                 </div>
                     
                                                 <div className="form-group col-md-6">
                                                    <label for="inputPassword4">Year Of Passing</label>
                                                    <input type="date" name="educationalInfoBeans[0].yop" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                  </div>
                                              
                                               </div>
                                    
                                                   <div className="form-row">
                                                         <div className="form-group col-md-6">
                                                           <label for="inputEmail4">Percentage</label>
                                                           <input type="number" name="educationalInfoBeans[0].percentage" className="form-control"  placeholder="Please Enter Percentage"/>
                                                         </div>
                                                         <div className="form-group col-md-6">
                                                           <label for="inputPassword4">Location </label>
                                                           <input type="text" name="educationalInfoBeans[0].location" className="form-control"  placeholder="Please Enter Location "/>
                     
                                                         </div>
                                                   </div>      
                                              
 {/*  <!--===============================employee Educational Details 2===================================  -->
 */}                                      <h3 style="text-align: center;padding: 20px;">Employee Educational Details 2</h3>
                                     <hr/>   
                                 <div className="form-row">
                
                                       <div className="form-group col-md-6">
                                         <label for="inputPassword4">Education Type</label>
                                         <input required type="text" name="educationalInfoBeans[1].educationalInfoPKBean.educationalType" className="form-control"  placeholder=" Education Type "/>
                                       </div>
                                       <div className="form-group col-md-6">
                                        <label for="inputEmail4">Degree Type</label>
                                        <input required type="text"  name="educationalInfoBeans[1].degreeType" className="form-control"  placeholder="Please Enter Degree Type"/>
                                      </div>
                                   
                                     </div>
                                     <div className="form-row">
                                             
                                             <div className="form-group col-md-6">
                                               <label for="inputPassword4">Branch</label>
                                               <input type="text" name="educationalInfoBeans[1].branch" className="form-control"  placeholder="Please Enter Branch "/>
                                             </div>
                                             <div  className="form-group col-md-6">
                                                <label for="inputEmail4">Collage Name</label><br/>
                                                <input type="text" name="educationalInfoBeans[1].collageName" className="form-control"  placeholder="Please Enter Collage Name"/>
                                           
                                            </div>
                                           
                                         </div>
                                   
                                           <div className="form-row">
                                            
                                              
                                                 <div className="form-group col-md-6">
                                                   
                                                   <label for="inputPassword4">University</label>
                                               
                                                   <input type="text" name="educationalInfoBeans[1].university" className="form-control"  placeholder="Please Enter University"/>
                                                 </div>
                     
                                                 <div className="form-group col-md-6">
                                                    <label for="inputPassword4">Year Of Passing</label>
                                                    <input type="date" name="educationalInfoBeans[1].yop" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                  </div>
                                              
                                               </div>
                                    
                                                   <div className="form-row">
                                                         <div className="form-group col-md-6">
                                                           <label for="inputEmail4">Percentage</label>
                                                           <input type="text" name="educationalInfoBeans[1].percentage" className="form-control"  placeholder="Please Enter Percentage"/>
                                                         </div>
                                                         <div className="form-group col-md-6">
                                                           <label for="inputPassword4">Location </label>
                                                           <input type="text" name="educationalInfoBeans[1].location" className="form-control"  placeholder="Please Enter Location "/>
                     
                                                         </div>
                                                   </div>      
                                               

{/*       <!--===============================employee Experience Details ===================================  -->
  */}
                                     <h3 style="text-align: center;padding: 20px;">Employee Experience Details</h3>
                                     <hr/>   
                                 <div className="form-row">
                
                                       <div className="form-group col-md-6">
                                         <label for="inputPassword4">Company Name </label>
                                         <input required type="text" name="expInfoBean[0].empPkBean.companyName" className="form-control"  placeholder="please Enter Company Name"/>
                                       </div>
                                       <div className="form-group col-md-6">
                                        <label for="inputEmail4">Designation</label>
                                        <input required type="text" name="expInfoBean[0].designation" className="form-control"  placeholder="Please Enter Designation"/>
                                      </div>
                                   
                                     </div>
                                     <div className="form-row">
                                             
                                     
                                                     <div className="form-group col-md-6">
                                                       <label for="inputPassword4">Joining Date</label>
                                                       <input type="date" name="expInfoBean[0].joiningDate" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                     </div>
                                                     <div className="form-group col-md-6">
                                                        <label for="inputPassword4">leaving Date</label>
                                                        <input type="date" name="expInfoBean[0].leavingDate" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                      </div>

                                                     
                                     </div>
 {/*      <!--===============================employee Experience Details 2 ===================================  -->
  */}                                    <h3 style="text-align: center;padding: 20px;">Employee Experience Details 2</h3>
                                     <hr/>   
                                 <div className="form-row">
                
                                       <div className="form-group col-md-6">
                                         <label for="inputPassword4">Company Name </label>
                                         <input required type="text" name="expInfoBean[1].empPkBean.companyName" className="form-control"  placeholder="please Enter Company Name"/>
                                       </div>
                                       <div className="form-group col-md-6">
                                        <label for="inputEmail4">Designation</label>
                                        <input required type="text" name="expInfoBean[1].designation" className="form-control"  placeholder="Please Enter Designation"/>
                                      </div>
                                   
                                     </div>
                                     <div className="form-row">
                                             
                                     
                                                     <div className="form-group col-md-6">
                                                       <label for="inputPassword4">Joining Date</label>
                                                       <input type="date" name="expInfoBean[1].joiningDate" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                     </div>
                                                     <div className="form-group col-md-6">
                                                        <label for="inputPassword4">leaving Date</label>
                                                        <input type="date" name="expInfoBean[1].leavingDate" className="form-control"  placeholder="dd-mm-yyyy"/>
                                                      </div>

                                                     
                                     </div>
 
{/* <!--===============================employee Address1 Details===================================  -->  */}
<h3 style="text-align: center;padding: 20px;">Employee Address-1 Information</h3>
   <b><hr/></b>   
<div className="form-row">
  
  <div className="form-group col-md-6">
    <label for="inputPassword4">City</label>
    <input type="text" required className="form-control" name="addressInfoBean[0].city" placeholder="Please Enter City "/>
  </div>
  <div className="form-group col-md-6">
    <label for="inputEmail4">Address type</label>
    <input type="text" required className="form-control" value="permenent" readonly name="addressInfoBean[0].addPK.addressType" placeholder="permenent"/>
  
   </div>

</div>
<div className="form-row">
        
        <div className="form-group col-md-6">
          <label for="inputPassword4">State</label>
          <input type="text" className="form-control" name="addressInfoBean[0].state"  placeholder=" Enter State "/>
        </div>
        <div  className="form-group col-md-6">
            <label for="inputEmail4">Address1</label><br/>
            <input type="text" name="addressInfoBean[0].addressOne" className="form-control"  placeholder=" Enter Address1"/>
       
        </div>
      
      </div>

      <div className="form-row">
       
         
            <div className="form-group col-md-6">
              
              <label for="inputPassword4">Country</label>
          
              <input type="text" name="addressInfoBean[0].country" className="form-control"  placeholder="Enter Country"/>
            </div>
           
            <div className="form-group col-md-6">
                <label for="Pincode">Pincode</label>
                <input type="number" name="addressInfoBean[0].pincode" className="form-control"  placeholder="enter  Pincode"/>
               </div>
         
          </div>
          <div className="form-row">
                
               
                 <div className="form-group col-md-6">
                    <label for="inputEmail4">Landmark</label>
                    <input type="text" name="addressInfoBean[0].landmark" className="form-control"  placeholder="Please Enter Landmark"/>
                  </div>

              </div>

           {/*     <!--===============================employee Address2 Details===================================  -->  */}
<h3 style="text-align: center;padding: 20px;">Employee Address2 Information</h3>
<div className="form-row">
  
  <div className="form-group col-md-6">
    <label for="inputPassword4">City</label>
    <input type="text" required className="form-control" name="addressInfoBean[1].city" placeholder="Please Enter City "/>
  </div>
  <div className="form-group col-md-6">
    <label for="inputEmail4">Address type</label>
    <input type="text"  className="form-control" value="temporary" readonly name="addressInfoBean[1].addPK.addressType" placeholder="temporary"/>
  
    
   </div>

</div>
<div className="form-row">
        
        <div className="form-group col-md-6">
          <label for="inputPassword4">State</label>
          <input type="text" className="form-control" name="addressInfoBean[1].state"  placeholder=" Enter State "/>
        </div>
        <div  className="form-group col-md-6">
            <label for="inputEmail4">Address2</label><br/>
            <input type="text" name="addressInfoBean[1].addressTwo" className="form-control"  placeholder=" Enter Address1"/>
       
        </div>
      
      </div>

      <div className="form-row">
       
         
            <div className="form-group col-md-6">
              
              <label for="inputPassword4">Country</label>
          
              <input type="text" name="addressInfoBean[1].country" className="form-control"  placeholder="Enter Country"/>
            </div>
           
            <div className="form-group col-md-6">
                <label for="Pincode">Pincode</label>
                <input type="number" name="addressInfoBean[1].pincode" className="form-control"  placeholder="enter  Pincode"/>
               </div>
         
          </div>
          <div className="form-row">
                
               
                 <div className="form-group col-md-6">
                    <label for="inputEmail4">Landmark</label>
                    <input type="text" name="addressInfoBean[1].landmark" className="form-control"  placeholder="Please Enter Landmark"/>
                  </div>
                   <div style="text-align: center;padding: 0px 102px 20px;margin: 30px;"  className="btn-group" role="group" >  
            <button style="width: 180px;height: 40px;" type="reset"  className="btn btn-outline-secondary">Reset</button>
            <button  style="width: 180px;height: 40px;" type="submit"  className=" btn btn-outline-primary" >Submit</button>
        
         </div>

              </div>


    </form>



      </div>
    );
  }
}


export default Register;
