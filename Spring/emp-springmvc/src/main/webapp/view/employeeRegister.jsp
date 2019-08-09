<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee register </title>
<<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
 <form  method="post" action="./submitRegisterData" class="col-md-10 offset-1" style="background-color : rgb(177, 234, 97);">
                <h3 style="text-align: center;padding: 20px;">Employee Information</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input type="text" name="id" class="form-control" required  placeholder="Please Enter ID">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" name="accountNumber" class="form-control"  placeholder="Please EnterAccount Number ">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" name="name" required class="form-control"  placeholder="Please Enter Name">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" name="email" required class="form-control"  placeholder="Please Enter Email Id ">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br>
                            <input type="text" name="age" class="form-control"  placeholder="Please Enter Age">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input type="text" name="designation" class="form-control"  placeholder="Please EnterDesignation">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br>
                                  <select name="gender" style="width: 640.75px;height: 39.99px;" >
                                      <option value="" disabled="disabled" selected="selected">Please select</option>
                                    <option value="Male">Male</option>
                                      <option value="Female">Female</option>
                                     
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input type="date" name="dob" class="form-control"  placeholder="dd-mm-yyyy">
                                </div>
                                
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input type="number" name="salary" class="form-control"  placeholder="Please EnterDesignation">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="text" required name="departmentInfoBean.deptId" class="form-control"  placeholder="Please Enter Department ID ">

                                     
                                    </div>
                              </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input type="text" name="phone" class="form-control"  placeholder="Please Enter Phone Number">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input type="text" name="managerId" class="form-control"  placeholder="Please Enter Manager ID ">
    
                                         
                                        </div>
                                      </div>
                                      
                                      <div class="form-row">
                                          <div class="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input type="date" name="joiningDate" class="form-control"  placeholder="dd-mm-yyyy">
                                            </div>
                                             <div class="form-group col-md-6">
                                              <label for="inputPassword4">Password</label>
                                              <input type="text" required class="form-control" name="password"  placeholder="Please Enter Password ">
        
                                            </div>
                                            <div style="text-align: center;padding: 0px 102px 20px;margin: 30px;"  class="btn-group" role="group" >  
                                                
                                              </div>
                                        </div>
                          </div>

              <!--===============================employee Other info===================================  -->
    <h3 style="text-align: center;padding: 20px;">Employee Other Information</h3>
                <hr>   
            <div class="form-row">
           
                  <div class="form-group col-md-4">
                    <label for="inputPassword4">Emergency Contact Name</label>
                    <input type="text" class="form-control"  name="otherInfo.emergencyContactName" placeholder="Please Enter Emergency Contact Number ">
                  </div>
                  <div class="form-group col-md-4">
                        <label for="inputAddress">Mother Name</label>
                        <input name="otherInfo.motherName" type="text" class="form-control" id="inputAddress" placeholder="Please Enter Mother Name">
                      </div>
                </div>

                <div class="form-row">
                        <div class="form-group col-md-4">
                          <label for="inputEmail4">Pan Number</label>
                          <input type="text" class="form-control" name="otherInfo.pan" placeholder="Please Enter Pan Number">
                        </div>
                        <div class="form-group col-md-4">
                          <label for="inputPassword4">Emergency Contact Number</label>
                          <input type="text" class="form-control" name="otherInfo.emergencyContactNumber"  placeholder="Please Enter Emergency Contact Number ">
                        </div>
                        <div class="form-group col-md-4">
                              <label for="inputAddress">Spouse Name</label>
                              <input type="text" name="otherInfo.spouseName" class="form-control" id="inputAddress" placeholder="Please Enter Spouse Name">
                            </div>
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-4">
                            <label for="inputEmail4">Married Status</label><br>
                            <select name="otherInfo.ismarried" style="width: 408.75px;height: 37.99px;">
                                <option value="true">married</option>
                                <option value="false">unmarried</option>
                              </select>
                       
                        </div>
                         
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Nationality</label>
                          
                            <select name="otherInfo.nationality" style="    width: 408.75px;height: 37.99px;" >
                                <option value="" disabled="disabled" selected="selected">Please select</option>
                              <option value="Indian">Indian</option>
                                <option value="Other">Other</option>
                              </select>
                            </div>

                            <div class="form-group col-md-4">
                                  <label for="inputAddress">Passport Number</label>
                                  <input type="text" class="form-control"  name="otherInfo.passport" id="inputAddress" placeholder="please enter Passport Number">
                                </div>
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-4">
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
                                <div class="form-group col-md-4">
                                  <label for="inputPassword4">Religion</label>
                                  <select name="otherInfo.religion" style="width: 408.75px;height: 37.99px;" >
                                    <option value="" disabled="disabled" selected="selected">Please select</option>
                                  <option value="Hinduism">Hinduism</option>
                                    <option value="Islam">Islam</option>
                                    <option value="Sikhism">Sikhism </option>
                                    <option value="Buddhism">Buddhism</option>
                                    <option value="Jainism">Jainism</option>
                                    <option value="Other religions ">Other religions </option>

                                    </option>
                                  
                                  </select>
                                </div>
                                <div class="form-group col-md-4">
                                      <label for="inputAddress">Aadhar Number</label>
                                      <input type="text" name="otherInfo.adhar" class="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number">
                                    </div>
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-4">
                                      <label for="inputEmail4">Physically Challenged?</label>
                                      <select style="width: 408.75px;height: 37.99px;" name="otherInfo.isChallenged" >
                                        <option value="" disabled="disabled" selected="selected">Please select</option>
                                      <option value="YES">YES</option>
                                        <option value="NO">NO</option>
                                      </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <label for="inputPassword4">Father Name</label>
                                      <input type="text" class="form-control" name="otherInfo.fatherName" placeholder="Please Enter Father Name ">

                                     
                                    </div>
                                   
                                    </div>
 <!--===============================employee Educational Details===================================  -->

                                     <h3 style="text-align: center;padding: 20px;">Employee Educational Details</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Education Type</label>
                                         <input required type="text" name="educationalInfoBeans[0].educationalInfoPKBean.educationalType" class="form-control"  placeholder=" Education Type ">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Degree Type</label>
                                        <input required type="text"  name="educationalInfoBeans[0].degreeType" class="form-control"  placeholder="Please Enter Degree Type">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                             <div class="form-group col-md-6">
                                               <label for="inputPassword4">Branch</label>
                                               <input type="text" name="educationalInfoBeans[0].branch" class="form-control"  placeholder="Please Enter Branch ">
                                             </div>
                                             <div  class="form-group col-md-6">
                                                <label for="inputEmail4">Collage Name</label><br>
                                                <input type="text" name="educationalInfoBeans[0].collageName" class="form-control"  placeholder="Please Enter Collage Name">
                                           
                                            </div>
                                           
                                         </div>
                                   
                                           <div class="form-row">
                                            
                                              
                                                 <div class="form-group col-md-6">
                                                   
                                                   <label for="inputPassword4">University</label>
                                               
                                                   <input type="text" name="educationalInfoBeans[0].university" class="form-control"  placeholder="Please Enter University">
                                                 </div>
                     
                                                 <div class="form-group col-md-6">
                                                    <label for="inputPassword4">Year Of Passing</label>
                                                    <input type="date" name="educationalInfoBeans[0].yop" class="form-control"  placeholder="dd-mm-yyyy">
                                                  </div>
                                              
                                               </div>
                                    
                                                   <div class="form-row">
                                                         <div class="form-group col-md-6">
                                                           <label for="inputEmail4">Percentage</label>
                                                           <input type="number" name="educationalInfoBeans[0].percentage" class="form-control"  placeholder="Please Enter Percentage">
                                                         </div>
                                                         <div class="form-group col-md-6">
                                                           <label for="inputPassword4">Location </label>
                                                           <input type="text" name="educationalInfoBeans[0].location" class="form-control"  placeholder="Please Enter Location ">
                     
                                                         </div>
                                                   </div>      
                                               </div>
 <!--===============================employee Educational Details 2===================================  -->
                                     <h3 style="text-align: center;padding: 20px;">Employee Educational Details 2</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Education Type</label>
                                         <input required type="text" name="educationalInfoBeans[1].educationalInfoPKBean.educationalType" class="form-control"  placeholder=" Education Type ">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Degree Type</label>
                                        <input required type="text"  name="educationalInfoBeans[1].degreeType" class="form-control"  placeholder="Please Enter Degree Type">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                             <div class="form-group col-md-6">
                                               <label for="inputPassword4">Branch</label>
                                               <input type="text" name="educationalInfoBeans[1].branch" class="form-control"  placeholder="Please Enter Branch ">
                                             </div>
                                             <div  class="form-group col-md-6">
                                                <label for="inputEmail4">Collage Name</label><br>
                                                <input type="text" name="educationalInfoBeans[1].collageName" class="form-control"  placeholder="Please Enter Collage Name">
                                           
                                            </div>
                                           
                                         </div>
                                   
                                           <div class="form-row">
                                            
                                              
                                                 <div class="form-group col-md-6">
                                                   
                                                   <label for="inputPassword4">University</label>
                                               
                                                   <input type="text" name="educationalInfoBeans[1].university" class="form-control"  placeholder="Please Enter University">
                                                 </div>
                     
                                                 <div class="form-group col-md-6">
                                                    <label for="inputPassword4">Year Of Passing</label>
                                                    <input type="date" name="educationalInfoBeans[1].yop" class="form-control"  placeholder="dd-mm-yyyy">
                                                  </div>
                                              
                                               </div>
                                    
                                                   <div class="form-row">
                                                         <div class="form-group col-md-6">
                                                           <label for="inputEmail4">Percentage</label>
                                                           <input type="text" name="educationalInfoBeans[1].percentage" class="form-control"  placeholder="Please Enter Percentage">
                                                         </div>
                                                         <div class="form-group col-md-6">
                                                           <label for="inputPassword4">Location </label>
                                                           <input type="text" name="educationalInfoBeans[1].location" class="form-control"  placeholder="Please Enter Location ">
                     
                                                         </div>
                                                   </div>      
                                               </div>

      <!--===============================employee Experience Details ===================================  -->

                                     <h3 style="text-align: center;padding: 20px;">Employee Experience Details</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Company Name </label>
                                         <input required type="text" name="expInfoBean[0].empPkBean.companyName" class="form-control"  placeholder="please Enter Company Name">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Designation</label>
                                        <input required type="text" name="expInfoBean[0].designation" class="form-control"  placeholder="Please Enter Designation">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                     
                                                     <div class="form-group col-md-6">
                                                       <label for="inputPassword4">Joining Date</label>
                                                       <input type="date" name="expInfoBean[0].joiningDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                     </div>
                                                     <div class="form-group col-md-6">
                                                        <label for="inputPassword4">leaving Date</label>
                                                        <input type="date" name="expInfoBean[0].leavingDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                      </div>

                                                     
                                     </div>
     <!--===============================employee Experience Details 2 ===================================  -->

                                     <h3 style="text-align: center;padding: 20px;">Employee Experience Details 2</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Company Name </label>
                                         <input required type="text" name="expInfoBean[1].empPkBean.companyName" class="form-control"  placeholder="please Enter Company Name">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Designation</label>
                                        <input required type="text" name="expInfoBean[1].designation" class="form-control"  placeholder="Please Enter Designation">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                     
                                                     <div class="form-group col-md-6">
                                                       <label for="inputPassword4">Joining Date</label>
                                                       <input type="date" name="expInfoBean[1].joiningDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                     </div>
                                                     <div class="form-group col-md-6">
                                                        <label for="inputPassword4">leaving Date</label>
                                                        <input type="date" name="expInfoBean[1].leavingDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                      </div>

                                                     
                                     </div>

<!--===============================employee Address1 Details===================================  -->
<h3 style="text-align: center;padding: 20px;">Employee Address-1 Information</h3>
   <b><hr></b>   
<div class="form-row">
  
  <div class="form-group col-md-6">
    <label for="inputPassword4">City</label>
    <input type="text" required class="form-control" name="addressInfoBean[0].city" placeholder="Please Enter City ">
  </div>
  <div class="form-group col-md-6">
    <label for="inputEmail4">Address type</label>
    <input type="text" required class="form-control" value="permenent" readonly name="addressInfoBean[0].addPK.addressType" placeholder="permenent">
  
   </div>

</div>
<div class="form-row">
        
        <div class="form-group col-md-6">
          <label for="inputPassword4">State</label>
          <input type="text" class="form-control" name="addressInfoBean[0].state"  placeholder=" Enter State ">
        </div>
        <div  class="form-group col-md-6">
            <label for="inputEmail4">Address1</label><br>
            <input type="text" name="addressInfoBean[0].addressOne" class="form-control"  placeholder=" Enter Address1">
       
        </div>
      
      </div>

      <div class="form-row">
       
         
            <div class="form-group col-md-6">
              
              <label for="inputPassword4">Country</label>
          
              <input type="text" name="addressInfoBean[0].country" class="form-control"  placeholder="Enter Country">
            </div>
           
            <div class="form-group col-md-6">
                <label for="Pincode">Pincode</label>
                <input type="number" name="addressInfoBean[0].pincode" class="form-control"  placeholder="enter  Pincode">
               </div>
         
          </div>
          <div class="form-row">
                
               
                 <div class="form-group col-md-6">
                    <label for="inputEmail4">Landmark</label>
                    <input type="text" name="addressInfoBean[0].landmark" class="form-control"  placeholder="Please Enter Landmark">
                  </div>

              </div>

              <!--===============================employee Address2 Details===================================  -->
<h3 style="text-align: center;padding: 20px;">Employee Address2 Information</h3>
<div class="form-row">
  
  <div class="form-group col-md-6">
    <label for="inputPassword4">City</label>
    <input type="text" required class="form-control" name="addressInfoBean[1].city" placeholder="Please Enter City ">
  </div>
  <div class="form-group col-md-6">
    <label for="inputEmail4">Address type</label>
    <input type="text"  class="form-control" value="temporary" readonly name="addressInfoBean[1].addPK.addressType" placeholder="temporary">
  
     </select>
   </div>

</div>
<div class="form-row">
        
        <div class="form-group col-md-6">
          <label for="inputPassword4">State</label>
          <input type="text" class="form-control" name="addressInfoBean[1].state"  placeholder=" Enter State ">
        </div>
        <div  class="form-group col-md-6">
            <label for="inputEmail4">Address2</label><br>
            <input type="text" name="addressInfoBean[1].addressTwo" class="form-control"  placeholder=" Enter Address1">
       
        </div>
      
      </div>

      <div class="form-row">
       
         
            <div class="form-group col-md-6">
              
              <label for="inputPassword4">Country</label>
          
              <input type="text" name="addressInfoBean[1].country" class="form-control"  placeholder="Enter Country">
            </div>
           
            <div class="form-group col-md-6">
                <label for="Pincode">Pincode</label>
                <input type="number" name="addressInfoBean[1].pincode" class="form-control"  placeholder="enter  Pincode">
               </div>
         
          </div>
          <div class="form-row">
                
               
                 <div class="form-group col-md-6">
                    <label for="inputEmail4">Landmark</label>
                    <input type="text" name="addressInfoBean[1].landmark" class="form-control"  placeholder="Please Enter Landmark">
                  </div>
                   <div style="text-align: center;padding: 0px 102px 20px;margin: 30px;"  class="btn-group" role="group" >  
            <button style="width: 180px;height: 40px;" type="reset"  class="btn btn-outline-secondary">Reset</button>
            <button  style="width: 180px;height: 40px;" type="submit"  class=" btn btn-outline-primary" >Submit</button>
        
         </div>

              </div>


    </form>


</body>
</html>