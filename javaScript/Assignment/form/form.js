//login validation
function validateForm(){
    let myEmail= document.forms[0].email.value;
    let myPassword= document.forms[0].cPassword.value;
    let myConformPassword= document.forms[0].password.value;
    console.log(myEmail);
    console.log(myPassword);
    console.log(myConformPassword);


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
}
//show password 
function showPassword(){
    
       if(  document.getElementById('password1').type=="password"){
  document.getElementById('password1').type="text";
       }else{
        document.getElementById('password1').type="password";

       }
 
}

function showcPassword(){
    
    if(  document.getElementById('password2').type=="password"){
document.getElementById('password2').type="text";
    }else{
     document.getElementById('password2').type="password";

    }

}