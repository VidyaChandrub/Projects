
function Greeting(wish){
    document.getElementById("demo").innerHTML = wish;
}

function msg(msg1, mycallback){
    let x = msg1;
    mycallback(x);
}

msg("Hi", Greeting);