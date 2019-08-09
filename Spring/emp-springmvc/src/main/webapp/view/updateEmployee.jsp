<%@page import="com.covalense.emp.beans.EmployeeAddressInfoBean"%>
<%@page import="com.covalense.emp.beans.EmployeeExperienceInfoBean"%>
<%@page import="java.util.List"%>
<%@page import="com.covalense.emp.beans.EmployeeEducationalInfoBean"%>
<%@page import="com.covalense.emp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%
    EmployeeInfoBean infoBean=(EmployeeInfoBean)session.getAttribute("bean");
    
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee register </title>
<<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
    integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

</head>
<body>
 <form  method="post" action="./updateEmployee" class="col-md-10 offset-1" style="background-color : rgb(177, 234, 97);">
                <h3 style="text-align: center;padding: 20px;">Employee Information</h3>
                <hr>   
            <div class="form-row">
                  <div class="form-group col-md-6">
                    <label for="inputEmail4">ID</label>
                    <input type="text" name="id" value="${infoBean.getId}" class="form-control" required  placeholder="Please Enter ID">
                  </div>
                  <div class="form-group col-md-6">
                    <label for="inputPassword4">Account Number</label>
                    <input type="text" name="accountNumber" value="${infoBean.getAccountNumber}" class="form-control"  placeholder="Please EnterAccount Number ">
                  </div>
              
                </div>
                <div class="form-row">
                        <div class="form-group col-md-6">
                          <label for="inputEmail4">Name</label>
                          <input type="text" name="name" value="${infoBean.getAccountNumber}" required class="form-control"  placeholder="Please Enter Name">
                        </div>
                        <div class="form-group col-md-6">
                          <label for="inputPassword4">Email Id</label>
                          <input type="email" name="email" value="<%=infoBean.getEmail()%>" required class="form-control"  placeholder="Please Enter Email Id ">
                        </div>
                      
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-6">
                            <label for="inputEmail4">Age</label><br>
                            <input type="text" name="age" value="<%=infoBean.getAge()%>" class="form-control"  placeholder="Please Enter Age">
                       
                        </div>
                         
                            <div class="form-group col-md-6">
                              
                              <label for="inputPassword4">Designation</label>
                          
                              <input type="text" name="designation" value="<%=infoBean.getDesignation()%>" class="form-control"  placeholder="Please EnterDesignation">
                            </div>

                           
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-6">
                                  <label for="inputEmail4">Gender</label><br>
                                  <select name="gender"   style="width: 640.75px;height: 39.99px;" >
                                  <%if(infoBean.getGender().equalsIgnoreCase("Male")) {%>
                              
                                    <option value="Male" selected="selected">Male</option>
                                      <option value="Female">Female</option>
                                      <%}else{ %>
                                      <option value="Female" selected="selected">Female</option>
                                      <option value=Male>Male</option>
                                      <%} %>
                                     
                                    </select>
                                </div>
                                <div class="form-group col-md-6">
                                  <label for="inputPassword4">Date Of Birth</label>
                                  <input type="date" name="dob"  value="<%= infoBean.getDob() %>" class="form-control"  placeholder="dd-mm-yyyy">
                                </div>
                                
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-6">
                                      <label for="inputEmail4">Salary</label>
                                      <input type="number" name="salary"  value="<%=infoBean.getSalary()%>" class="form-control"  placeholder="Please EnterDesignation">
                                    </div>
                                    <div class="form-group col-md-6">
                                      <label for="inputPassword4">Department ID</label>
                                      <input type="text" required name="departmentInfoBean.deptId"  value="<%=infoBean.getDepartmentInfoBean()%>" class="form-control"  placeholder="Please Enter Department ID ">

                                     
                                    </div>
                              </div>
                                    <div class="form-row">
                                        <div class="form-group col-md-6">
                                          <label for="inputEmail4">Phone Number</label>
                                          <input type="text" name="phone"  value="<%=infoBean.getPhone()%>" class="form-control"  placeholder="Please Enter Phone Number">
                                        </div>
                                        <div class="form-group col-md-6">
                                          <label for="inputPassword4">Manager ID</label>
                                          <input type="text" name="managerId"  value="<%=infoBean.getManagerId()%>" class="form-control"  placeholder="Please Enter Manager ID ">
    
                                         
                                        </div>
                                      </div>
                                      
                                      <div class="form-row">
                                          <div class="form-group col-md-6">
                                              <label for="inputPassword4">Date Of Joining</label>
                                              <input type="date" name="joiningDate"  value="<%=infoBean.getJoiningDate()%>" class="form-control"  placeholder="dd-mm-yyyy">
                                            </div>
                                             <div class="form-group col-md-6">
                                              <label for="inputPassword4">Password</label>
                                              <input type="text" required class="form-control"  value="<%=infoBean.getPassword()%>" name="password"  placeholder="Please Enter Password ">
        
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
                    <input type="text" class="form-control" value="<%=infoBean.getOtherInfo().getEmergencyContactName() %>"  name="otherInfo.emergencyContactName" placeholder="Please Enter Emergency Contact Number ">
                  </div>
                  <div class="form-group col-md-4">
                        <label for="inputAddress">Mother Name</label>
                        <input name="otherInfo.motherName" value="<%=infoBean.getOtherInfo().getMotherName() %>"  type="text" class="form-control" id="inputAddress" placeholder="Please Enter Mother Name">
                      </div>
                </div>

                <div class="form-row">
                        <div class="form-group col-md-4">
                          <label for="inputEmail4">Pan Number</label>
                          <input type="text" class="form-control" value="<%=infoBean.getOtherInfo().getPan() %>"  name="otherInfo.pan" placeholder="Please Enter Pan Number">
                        </div>
                        <div class="form-group col-md-4">
                          <label for="inputPassword4">Emergency Contact Number</label>
                          <input type="text" class="form-control" value="<%=infoBean.getOtherInfo().getEmergencyContactNumber() %>"  name="otherInfo.emergencyContactNumber"  placeholder="Please Enter Emergency Contact Number ">
                        </div>
                        <div class="form-group col-md-4">
                              <label for="inputAddress">Spouse Name</label>
                              <input type="text" name="otherInfo.spouseName" value="<%=infoBean.getOtherInfo().getSpouseName() %>"  class="form-control" id="inputAddress" placeholder="Please Enter Spouse Name">
                            </div>
                      </div>
              
                      <div class="form-row">
                        <div  class="form-group col-md-4">
                            <label for="inputEmail4">Married Status</label><br>
                            <select name="otherInfo.ismarried" style="width: 408.75px;height: 37.99px;">
                            
                            <%if(infoBean.getOtherInfo().isIsmarried()==true) {%>
                              
                          
                                <option value="true" selected="selected">married</option>
                                <option value="false">unmarried</option>
                                <%}else{ %>
                                <option value="false" selected="selected">unmarried</option>
                                <option value="true">married</option>
                              </select>
                              <%} %>
                       
                        </div>
                         
                            <div class="form-group col-md-4">
                              
                              <label for="inputPassword4">Nationality</label>
                          
                            <select name="otherInfo.nationality" style="    width: 408.75px;height: 37.99px;" >
                               <%if(infoBean.getOtherInfo().getNationality().equalsIgnoreCase("Indian")) {%>
                              
                              <option value="Indian" selected="selected">Indian</option>
                                <option value="Other">Other</option>
                                <%}else{ %>
                                 <option value="Other" selected="selected">Other</option>
                                <option value="Indian">Indian</option>
                                  <%} %>
                                
                              </select>
                            </div>

                            <div class="form-group col-md-4">
                                  <label for="inputAddress">Passport Number</label>
                                  <input type="text" class="form-control" value="<%=infoBean.getOtherInfo().getPassport()%>"  name="otherInfo.passport" id="inputAddress">
                                </div>
                         
                          </div>
                          <div class="form-row">
                                <div class="form-group col-md-4">
                                  <label for="inputEmail4">Blood Group</label>
                                  <select name="otherInfo.bloodGrp" style="    width: 408.75px;height: 37.99px;" >
                                    <% switch(infoBean.getOtherInfo().getBloodGrp()) {
                                     case "A+" :%>
                                    <option value="A+"  selected="selected">A+</option>
                                      <option value="B+">B+</option>
                                      <option value="O+">O+</option>
                                      <option value="AB+">AB+</option>
                                      <option value="A-">A-</option>
                                      <option value="B-">B-</option>
                                      <option value="O-">O-</option>
                                      <option value="AB-">AB-</option>
                                      
                                      <%break; case "B+" :%>
                                
                                          <option value="B+"  selected="selected">B+</option>
                                      <option value="A+">A+</option>
                                      <option value="O+">O+</option>
                                      <option value="AB+">AB+</option>
                                      <option value="A-">A-</option>
                                      <option value="B-">B-</option>
                                      <option value="O-">O-</option>
                                      <option value="AB-">AB-</option>
                                        <%  break; case "O+" :%>
                                         <option value="O+"  selected="selected">O+</option>
                                      <option value="A+">A+</option>
                                       <option value="B+">B+</option>
                                      <option value="O+">O+</option>
                                      <option value="AB+">AB+</option>
                                      <option value="A-">A-</option>
                                      <option value="B-">B-</option>
                                      <option value="O-">O-</option>
                                      <option value="AB-">AB-</option>
                                        
                                        <%} %>
                                    </select>
                                </div>
                                <div class="form-group col-md-4">
                                  <label for="inputPassword4">Religion</label>
                                  <select name="otherInfo.religion" style="width: 408.75px;height: 37.99px;" >
                                   <% switch(infoBean.getOtherInfo().getReligion()) {
                                     case "Hinduism" :%>
                              
                                  <option value="Hinduism" selected="selected">Hinduism</option>
                                    <option value="Islam">Islam</option>
                                    <option value="Sikhism">Sikhism </option>
                                    <option value="Buddhism">Buddhism</option>
                                    <option value="Jainism">Jainism</option>
                                    <option value="Other religions ">Other religions </option>
                                       <%break; case "Islam" :%>
                                    <option value="Islam" selected="selected">Islam</option>
                                        <option value="Hinduism" >Hinduism</option>
                                    <option value="Sikhism">Sikhism </option>
                                    <option value="Buddhism">Buddhism</option>
                                    <option value="Jainism">Jainism</option>
                                    <option value="Other religions ">Other religions </option>
                                        </option>
                                  <%} %>
                                  </select>
                                </div>
                                <div class="form-group col-md-4">
                                      <label for="inputAddress">Aadhar Number</label>
                                      <input type="text" value="<%=infoBean.getOtherInfo().getAdhar() %>"  name="otherInfo.adhar" class="form-control" id="inputAddress" placeholder="Please Enter  Aadhar Number">
                                    </div>
                              </div>

                
                              <div class="form-row">
                                    <div class="form-group col-md-4">
                                      <label for="inputEmail4">Physically Challenged?</label>
                                      <select style="width: 408.75px;height: 37.99px;" name="otherInfo.isChallenged" >
                                        <%if(infoBean.getOtherInfo().isChallenged()==true) {%>
                                        
                                      <option value="true"  selected="selected">YES</option>
                                        <option value="false">NO</option>
                                        <%}else{ %>
                                         <option value="false"  selected="selected">NO</option>
                                        <option value="true">YES</option>
                                        <%} %>
                                        
                                      </select>
                                    </div>
                                    <div class="form-group col-md-4">
                                      <label for="inputPassword4">Father Name</label>
                                      <input type="text" value="<%=infoBean.getOtherInfo().getFatherName() %>"  class="form-control" name="otherInfo.fatherName" placeholder="Please Enter Father Name ">

                                     
                                    </div>
                                   
                                    </div>
 <!--===============================employee Educational Details===================================  -->
<%  List<EmployeeEducationalInfoBean> empEduBeans=infoBean.getEducationalInfoBeans();
                                    		  int i=0;
                           for(EmployeeEducationalInfoBean empEduBean : empEduBeans ) {   %>
                                     <h3 style="text-align: center;padding: 20px;">Employee Educational Details</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Education Type</label>
                                         <input required type="text" value="<%=empEduBean.getEducationalInfoPKBean().getEducationalType()%>" name="educationalInfoBeans[${i}].educationalInfoPKBean.educationalType" class="form-control"  placeholder=" Education Type ">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Degree Type</label>
                                        <input required type="text" value="<%=empEduBean.getDegreeType()%>"  name="educationalInfoBeans[${i}].degreeType" class="form-control"  placeholder="Please Enter Degree Type">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                             <div class="form-group col-md-6">
                                               <label for="inputPassword4">Branch</label>
                                               <input type="text" value="<%=empEduBean.getBranch()%>" name="educationalInfoBeans[${i}].branch" class="form-control"  placeholder="Please Enter Branch ">
                                             </div>
                                             <div  class="form-group col-md-6">
                                                <label for="inputEmail4">Collage Name</label><br>
                                                <input type="text" value="<%=empEduBean.getCollegeName()%>" name="educationalInfoBeans[${i}].collageName" class="form-control"  placeholder="Please Enter Collage Name">
                                           
                                            </div>
                                           
                                         </div>
                                   
                                           <div class="form-row">
                                            
                                              
                                                 <div class="form-group col-md-6">
                                                   
                                                   <label for="inputPassword4">University</label>
                                               
                                                   <input type="text" value="<%=empEduBean.getUniversity()%>" name="educationalInfoBeans[${i}].university" class="form-control"  placeholder="Please Enter University">
                                                 </div>
                     
                                                 <div class="form-group col-md-6">
                                                    <label for="inputPassword4">Year Of Passing</label>
                                                    <input type="date" value="<%=empEduBean.getYop()%>" name="educationalInfoBeans[${i}].yop" class="form-control"  placeholder="dd-mm-yyyy">
                                                  </div>
                                              
                                               </div>
                                    
                                                   <div class="form-row">
                                                         <div class="form-group col-md-6">
                                                           <label for="inputEmail4">Percentage</label>
                                                           <input type="number" value="<%=empEduBean.getPercentage()%>" name="educationalInfoBeans[${i}].percentage" class="form-control"  placeholder="Please Enter Percentage">
                                                         </div>
                                                         <div class="form-group col-md-6">
                                                           <label for="inputPassword4">Location </label>
                                                           <input type="text" value="<%=empEduBean.getLocation()%>" name="educationalInfoBeans[${i}].location" class="form-control"  placeholder="Please Enter Location ">
                     
                                                         </div>
                                                   </div>      
                                               </div>
                                               
                                               <%  i++;}%>

      <!--===============================employee Experience Details ===================================  -->
<%List<EmployeeExperienceInfoBean> empExpBeans=infoBean.getExpInfoBean();
                                    		  int c=0;
                           for(EmployeeExperienceInfoBean empExpBean : empExpBeans ){%>
                          
                                     <h3 style="text-align: center;padding: 20px;">Employee Experience Details</h3>
                                     <hr>   
                                 <div class="form-row">
                
                                       <div class="form-group col-md-6">
                                         <label for="inputPassword4">Company Name </label>
                                         <input required type="text" value="<%=empExpBean.getEmpPkBean().getCompanyName()%>" name="expInfoBean[${c}].empPkBean.companyName" class="form-control"  placeholder="please Enter Company Name">
                                       </div>
                                       <div class="form-group col-md-6">
                                        <label for="inputEmail4">Designation</label>
                                        <input required type="text" value="<%=empExpBean.getDesignation()%>" name="expInfoBean[${c}].designation" class="form-control"  placeholder="Please Enter Designation">
                                      </div>
                                   
                                     </div>
                                     <div class="form-row">
                                             
                                     
                                                     <div class="form-group col-md-6">
                                                       <label for="inputPassword4">Joining Date</label>
                                                       <input type="date" value="<%=empExpBean.getJoiningDate()%>" name="expInfoBean[${c}].joiningDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                     </div>
                                                     <div class="form-group col-md-6">
                                                        <label for="inputPassword4">leaving Date</label>
                                                        <input type="date" value="<%=empExpBean.getLeavingDate()%>" name="expInfoBean[${c}].leavingDate" class="form-control"  placeholder="dd-mm-yyyy">
                                                      </div>

                                                     
                                     </div>
                                      <%  c++;}%>

<!--===============================employee Address1 Details===================================  -->
<%List<EmployeeAddressInfoBean> empAddrBeans=infoBean.getAddressInfoBean();
                                    		  int b=0;
                           for(EmployeeAddressInfoBean empAddrBean : empAddrBeans ){%>
                          
<h3 style="text-align: center;padding: 20px;">Employee Address-1 Information</h3>
   <b><hr></b>   
<div class="form-row">
  
  <div class="form-group col-md-6">
    <label for="inputPassword4">City</label>
    <input type="text" required class="form-control" value="<%=empAddrBean.getCity()%>" name="addressInfoBean[${b}].city" placeholder="Please Enter City ">
  </div>
  <div class="form-group col-md-6">
    <label for="inputEmail4">Address type</label>
    <input type="text" required class="form-control" value="<%=empAddrBean.getAddPK().getAddressType()%>" readonly name="addressInfoBean[${b}].addPK.addressType" placeholder="permenent">
  
   </div>

</div>
<div class="form-row">
        
        
         <div  class="form-group col-md-6">
            <label for="inputEmail4">Address1</label><br>
            <input type="text" name="addressInfoBean[${b}].addressOne" value="<%=empAddrBean.getAddressOne()%>" class="form-control"  placeholder=" Enter Address1">
       
        </div>
        <div  class="form-group col-md-6">
            <label for="inputEmail4">Address2</label><br>
            <input type="text" name="addressInfoBean[${b}].addressTwo" value="<%=empAddrBean.getAddressTwo()%>" class="form-control"  placeholder=" Enter Address2">
       
        </div>
      
      </div>

      <div class="form-row">
       
         
            <div class="form-group col-md-6">
              
              <label for="inputPassword4">Country</label>
          
              <input type="text" name="addressInfoBean[${b}].country" value="<%=empAddrBean.getCountry()%>" class="form-control"  placeholder="Enter Country">
            </div>
           
            <div class="form-group col-md-6">
                <label for="Pincode">Pincode</label>
                <input type="number" name="addressInfoBean[${b}].pincode"  value="<%=empAddrBean.getPincode()%>" class="form-control"  placeholder="enter  Pincode">
               </div>
         
          </div>
          <div class="form-row">
                
               
                 <div class="form-group col-md-6">
                    <label for="inputEmail4">Landmark</label>
                    <input type="text" name="addressInfoBean[${b}].landmark" value="<%=empAddrBean.getLandmark()%>" class="form-control"  placeholder="Please Enter Landmark">
                  </div>
                  <div class="form-group col-md-6">
          <label for="inputPassword4">State</label>
          <input type="text" class="form-control" value="<%=empAddrBean.getCity()%>" name="addressInfoBean[${b}].state"  placeholder=" Enter State ">
        </div>

              </div>
 <%  b++;}%>
         
    </form>


</body>
</html>