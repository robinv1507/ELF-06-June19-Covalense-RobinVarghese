//login validation
function validateForm(){
    let myEmail= document.forms[0].email.value;
    let myPassword= document.forms[0].password.value;
    let myConformPassword= document.forms[0].password.value;
    console.log(myEmail);
    console.log(myPassword);
    console.log(myConformPassword);


    if (/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/.test(myEmail) && 
         myEmail.length>6&&
         myPassword>6&&
         myConformPassword.length>6&&
         myPassword==myConformPassword)
    {
        document.getElementById('submitButton').disabled=false;
    }else{
        document.getElementById('submitButton').disabled=true;
    }
    
}