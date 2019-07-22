
/* Function to display a Countdown timer with starting time from a form */
// sets variables for minutes and seconds
var ctmnts = 0;
var ctsecs = 0;
var startchr = 0;       // used to control when to read data from form

function countdownTimer() {
// if $startchr is 0, and form fields exists, gets data for minutes and seconds, and sets $startchr to 1
if(startchr == 0 && document.getElementById('mns') ) {
// makes sure the script uses integer numbers
ctmnts = parseInt(document.getElementById('mns').value) + 0;
ctsecs = 0;
startchr = 1;
document.getElementById('btnct').setAttribute('disabled', 'disabled');     // disable the button
}
// increase seconds, and increase minutes if seconds reach to user entered minutes
ctsecs++;
var mn=ctmnts;
if(ctmnts < mn) {
  if(ctsecs < mn*60) {
    
    ctmnts++;
  }
  else {
    ctsecs = 0;
    ctmnts = 0;
  }
}


// display the time in page, and auto-calls this function after 1 seccond
document.getElementById('showmns').innerHTML = ctmnts;
 document.getElementById('showscs').innerHTML = ctsecs;
setTimeout('countdownTimer()', 1000);
}
