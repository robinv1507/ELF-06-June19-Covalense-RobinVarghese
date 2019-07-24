//login validation


function validateForm(){
    var myEmail= document.forms[0].email.value;
var myPassword= document.forms[0].cPassword.value;
var myConformPassword= document.forms[0].password.value;
localStorage.setItem("email", myEmail);
localStorage.setItem("password", myPassword);
localStorage.setItem("cpassword", myConformPassword);
 
 console.log(myEmail);
    console.log(myPassword);
    console.log(myConformPassword);

      //validation  for all input
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myEmail) && 
         myEmail.length>6&&
         myPassword.length>6&&
         myConformPassword.length>6&&
         myConformPassword===myPassword)
    {
        document.getElementById('submitButton').disabled=false;

    }else{
        document.getElementById('submitButton').disabled=true;
    }
    //validation message for email
    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myEmail) && 
         myEmail.length>6)
    {
        document.getElementById('emailMessage').style.visibility='hidden';
        
    }else{
        document.getElementById('emailMessage').style.visibility='visible';
    }
    //validation message for password
    if ( myPassword.length>6)
    {
        document.getElementById('passwordMessage').style.visibility='hidden';
        
    }else{
        document.getElementById('passwordMessage').style.visibility='visible';
    }

     //validation message for conform password
     if (myConformPassword===myPassword)
     {
         document.getElementById('cpasswordMessage').style.visibility='hidden';
         
     }else{
         document.getElementById('cpasswordMessage').style.visibility='visible';
     }
}
//show password 
function showPassword(){
    
       if(  document.getElementById('password1').type=="password"){
  document.getElementById('password1').type="text";
       }else{
        document.getElementById('password1').type="password";

       }
 
}
  //show password
function showcPassword(){
    
    if(  document.getElementById('password2').type=="password"){
document.getElementById('password2').type="text";
    }else{
     document.getElementById('password2').type="password";

    }

}


//sign in form data table 

function showTable(){

var myemail=localStorage.getItem("email");
var mypswd=localStorage.getItem("password");
var mycpswd=localStorage.getItem("cpassword");

let signInData = [
    { Email: myemail,Password: mypswd,Conform_Password: mycpswd },
   
   
  ];

  function generateTableHead(table, data) {
   
    let thead = table.createTHead();
    let row = thead.insertRow();
    for (let key of data) {
      let th = document.createElement("th");
      let text = document.createTextNode(key);
      th.appendChild(text);
      row.appendChild(th);
    }
  }
  function generateTable(table, data) {
    for (let element of data) {
      let row = table.insertRow();
      for (key in element) {
        let cell = row.insertCell();
        let text = document.createTextNode(element[key]);
        cell.appendChild(text);
      }
    }
  }
  let table = document.querySelector("table");
  let data = Object.keys(signInData[0]);

        generateTableHead(table, data);
       

  generateTable(table, signInData);

}