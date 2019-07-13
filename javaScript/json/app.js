

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
var jsonLibrary=JSON.stringify(library);
console.log(jsonLibrary);

var objLibrary=JSON.parse(jsonLibrary);
console.log(objLibrary);

// //fact method
// //var num=prompt("enter the number");
// var f=1;
// console.log(fact(num));
// function fact(num){
//   if(num==1 || num==0){
//      return 1;
//   }else{
//     return f*fact(num-1);
//   }
// }

// closures demo
/* function counter(){
  var counter=0;
  function getCout(){
    counter++;
    return counter;
  }
  return getCout;
}

let count=counter();
var counterValue=count();
console.log(counterValue);

var awightSalary=(function() {
              var salary=80000;
              function changeBy(amount){
                salary+=amount;

              }
              return {

                raise:function(){
                  changeBy(2000);
                },
                lower : function(){
                  changeBy(-2000);
                },
                currentAmount : function(){
                  return salary;
                }

              };
})();
alert(awightSalary.currentAmount());
awightSalary.raise();
alert(awightSalary.currentAmount());
awightSalary.lower();
alert(awightSalary.currentAmount());
 */
//promises

let promise=new Promise((res,rej)=>{
     const items=[{id:1,name:"robin"}];
     if(items.length>0){
       res(items);
     }else{

      rej("rejected");
     }


});

promise.then((data)=>{

     console.log(data);
}).catch((reason)=>{
  console.log(reason);
});