 //function expression or anonynmus or nameless function

let X = function (num){
    return num*num;
}

console.log(X(6));


function mul(x){
    return function(y){
        return function (z){
            return x*y*z;
        }
    }
}

mul(3);