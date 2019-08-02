<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search employee</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous"/>

</head>
<body>

<!--header-->
<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">E M P</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Link</a>
      </li>
      <li class="nav-item dropdown">
        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
          Dropdown
        </a>
        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
          <a class="dropdown-item" href="#">Action</a>
          <a class="dropdown-item" href="#">Another action</a>
          <div class="dropdown-divider"></div>
          <a class="dropdown-item" href="#">Something else here</a>
        </div>
      </li>
      <li class="nav-item">
       <form action="../employee/search">
      <input required class="form-control mr-sm-2" name="id" type="text" placeholder="Search" aria-label="Search">
      </li>
     <li class="nav-item">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </li>
    </form>
    
      </li>
      
    </ul>
    
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit"><a href="./logout">Logout</a></button>
    
  </div>
</nav>
<!--header end-->
<!-- body of home -->
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