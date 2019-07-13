/* let name=document.getElementById('name');
console.log(name);
console.log(name.textContent);
name.style.color='pink';

var classCollection=document.getElementsByClassName('demo');
classCollection[0].style.fontSize='44px';

//document.getElementById('myButton1').className='button';

document.getElementById('myButton').classList='button button1';

//document.querySelectorAll('.demo').style.fontSize='20px';
 */
let input=document.createElement('input');

document.body.appendChild(input);


var demoClass=document.getElementsByClassName('demo');
console.log(demoClass.lenght);


var demoClass1=document.getElementsByClassName('demo');
console.log(demoClass1.lenght);

var demoQuery=document.querySelectorAll('.demo');

console.log(demoQuery.lenght);

document.getElementById('blue').className='blue';
