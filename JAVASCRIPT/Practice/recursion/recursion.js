//recursion - function calling itself

function recurse(number){
    console.log(number);

    var newNum = number - 1;
    if(newNum > 0){
        
        recurse(newNum);
    }
    
}
recurse(8);

let person = {
    name: "vidya",
    age : 78, 
    name : "b"
};

console.log(person)

let arr = [1,1,2,"vidya", false];
console.log(arr)

arr.forEach(element => {
    console.log(element);
});