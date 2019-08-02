<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee register </title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
 <form  method="post" action="./submitRegisterData" class="col-md-10 offset-1" style="background-color : rgb(177, 234, 97);">
                <h3 style="text-align: center;padding: 20px;">Employee Information</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input type="text" name="id" class="form-control"  placeholder="Please Enter ID">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" name="accountNumber" class="form-control"  placeholder="Please EnterAccount Number ">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" name="name" class="form-control"  placeholder="Please Enter Name">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" name="email" class="form-control"  placeholder="Please Enter Email Id ">
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
                                      <input type="text" name="salary" class="form-control"  placeholder="Please EnterDesignation">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="text" name="departmentId" class="form-control"  placeholder="Please Enter Department ID ">

                                     
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
                                              <input type="text" class="form-control" name="password"  placeholder="Please Enter Password ">
        
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
                                    <div style="text-align: center;padding: 27px 42px 20px;"  class="btn-group" role="group" >  
                                            <button  style="width: 130px; height: fit-content;" type="reset"  class="btn btn-outline-secondary">Reset</button>
                                            <button   style="width: 130px; height: fit-content;" type="submit"  class=" btn btn-outline-primary" >Submit</button>
                                    </div>
                                    </div>

             </form>


</body>
</html>