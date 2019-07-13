var a=10;
console.log(a);//10
var b=a;
console.log(b);
b=20;
console.log(a);
console.log(b);//20
console.log("=======================");
//person object
var person={

    name :'robin',
    age:20,
   getfullname:function(){
        return this.name+ " "+'varghese';
    },
    address :{
        city :'bangalore',
        state : 'karnataka',
        pincode :560100
    },
    hobbies:['sleeping','watching tv']

};
console.log("Name ="+person.name);
console.log("Full Name ="+person.getfullname());
console.log("city ="+person.address.city);
console.log("hobbies ="+person.hobbies);
var person1=person;
console.log("p1 Name ="+person1.name);

person1.name='chandan';
console.log("p Name ="+person.name);
console.log("p1 Name ="+person1.name);

//complex array

var library=[

           {
               id :1,
               auther :'bill hjan',
               name :'bill'
           },
           {
            id :2,
            auther :'steve jobs',
            name :'steve'
          }

];

console.log(library[0]);

console.log(library[0].name);
//loop statements

var   hobbies=['sleeping','watching tv'];
document.getElementById('demo').innerHTML=hobbies;//to web page
//for loop for object will not work
for(var i=0;i<person.length;i++){
    console.log("value="+person[i]);
} 
//for loop for array
for(var i=0;i< hobbies.length;i++){
    console.log("value="+ hobbies[i]);
} 
//forEach method for array
hobbies.forEach((val,index)=>{
    console.log("value="+val); 
    console.log("index="+index); 

});
console.log("======");
//for of for array
for(var val of hobbies){
    console.log("value="+val);
} 

console.log("======");
//for of for object will not work

console.log("======");


//for in for object
for(var val in person){
    console.log("value="+person[val]);
} 
console.log("======");
hobbies['test']='value hi';
for(var val in hobbies){
    console.log("value="+hobbies[val]);
} 

console.log("======");
console.time("forOf");
for(var val of hobbies){
   var a=[];
} 
console.timeEnd("forOf end");

console.log("======");

//named func
function alertMessage( val,number){
    alert(`named function value= ${val} number= ${number}`);
}
//IIFE func
// (function (){
//     alert("IIFE function");
// }());

//alertMessage("note",2);
// types of variable demo
function varKey(){
    r=20;
    console.log("r="+r);
}
varKey();
console.log("r="+r);
 

function letKey(){
   let ba=90;
    console.log("ba="+ba);
}
letKey();
//console.log("ba="+ba);
//function demo
fname();
function fname(){
    console.log("aa");
}

var fn=function(){
    console.log("dd");
}
fn();


//call back fuction
function fisrt(sec){

    setTimeout(()=>{
        console.log("first");
        sec();
    });
}
function second(){

        console.log("second");
}
fisrt(second);

const items=[
           {
               id :1,
               name :'pen',
               price :90
           },
           {
            id :2,
            name :'bag',
            price :930
        },
        {
            id :3,
            name :'watch',
            price :9000
        },
        {
            id :4,
            name :'laptop',
            price :9000000
        }
];
console.log(items);
//map method
let mappedIds=items.map((val)=>{
                 return val.name;
                     });

console.log(mappedIds);

//filter method
let filterPrice=items.filter((val)=>{
                 return val.price==200;
        });

console.log(filterPrice);