let arr = [1,2,2,4];
console.log(arr);
//clone an array

let arr2 = [...arr];
arr2.push(5);
console.log(arr2);
console.log(...arr2);

let a = ["v","i","d","y","a"];
console.log(a);
console.log(...a);


let obj1 = {name:"vidya",age:21};
console.log(obj1);
let obj2 = { gender:"female", father:"chandru"};
console.log(obj2);
let obj3 = {...obj1, ...obj2}
console.log(obj3);