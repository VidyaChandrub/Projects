// Only variable declarations are hoisted 
// hoisting is using a variabel or function before declaraing or moving all declarations to the top of current scope or document

a = 5;
console.log(a);
var a;

greet();

function greet(){
    name = "vidya";
    console.log("Good night "+ name);
    var name;
}

b = 45;
console.log(b);
let b;  // let  and const doesnot support hoisting