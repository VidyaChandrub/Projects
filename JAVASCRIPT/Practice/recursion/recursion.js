//recursion - function calling itself

function recurse(number){
    console.log(number);

    var newNum = number - 1;
    if(newNum > 0){
        recurse(newNum);
    }
    
}
recurse(8);