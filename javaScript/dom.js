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

//this keyword demo
var ab=10;
/* 
var ab=10;
console.log(this);
console.log(window);
console.log(this.ab);
console.log(window.ab);
console.log(this===window);
 */


/*  var person={
        name :"robin",
        age:29,
        getname :function(){
            console.log(this);
            function innerFunction(){
                console.log(this);
            }
            innerFunction();
        }
        
    };
    person.getname(); */
/* function checkThis(){

console.log(this);
console.log(window);
console.log(this.ab);
console.log(window.ab);
console.log(this===window);
}

checkThis(); */


//call(), apply() demo
var john={
    name :"john",
    age:29,
    presentation :function(style,message){
         if(style==='formal'){
             console.log("hi "+this.name+ '  good '+message);
         }else{
            console.log("hi "+this.name+' '+message);
         }
    }
    
};
//john.presentation('formal','morning');

var mike={
    name :"mike",
    age:25

};
//john.presentation.call(mike,'friendly','evening');
//john.presentation.apply(mike,['friendly','evening']);

var johnForm=john.presentation.bind(mike);
johnForm('friendly','morning');


