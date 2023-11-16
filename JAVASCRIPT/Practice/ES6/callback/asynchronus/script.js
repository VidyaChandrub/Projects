// setTimeout(() => {
//     console.log("Hello")
// },3000)

function greet(){
    console.log("Good Morning")
}
setTimeout(greet,3000);

function showTime(){
    let datetime = new Date();
    let time = datetime.toLocaleTimeString();
    console.log(time);

    setTimeout(showTime, 2000);
}

console.log(showTime);
