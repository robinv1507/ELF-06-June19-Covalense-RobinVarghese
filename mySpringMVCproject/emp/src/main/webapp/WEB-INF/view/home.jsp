<%@page import="com.covalense.emp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>home page</title>
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>

</head>
<body>

<%@ include file = "/include/header.html" %>
<%@ include file = "/include/sidebar.html" %>


		           <div class="card " style="width: 18rem;width: 29rem; position: absolute;  top: 191px; left: 185px;"> 
			
			    <div class="card-header">Employee Details</div>                                                    
			
			    <div class="card-body"     style="padding:2.25rem;">                                               

			                                                                                                   
			             <h6 class="card-subtitle mb-2 text-muted">Name : ${bean.name }<br>
			                                                                                     <br>                                     
			            <h6 class="card-subtitle mb-2 text-muted">Email  : ${bean.email }<br>
			                                                                                    <br> 
			            <h6 class="card-subtitle mb-2 text-muted">Phone no: ${bean.phone }<br>
			<br>                                     
			           <h6 class="card-subtitle mb-2 text-muted">EmpId: ${bean.id }<br>
			<br>                                         
			            <h6 class="card-subtitle mb-2 text-muted">Age :${bean.age }<br>
			<br>                                          
			            <h6 class="card-subtitle mb-2 text-muted">Designation :${bean.designation }<br>
			                                       
			
			    </div>                                                                                             
			
			  </div>                                                                                               
			
			                                                                                                       
			

</body>
</html>