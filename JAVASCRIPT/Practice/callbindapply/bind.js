const john = {
    name : "john",
    age : 43
}

const jane = {
    name : "jane",
    age : 34
}

function greeting (){
    console.log(`Hi ${this.name} and am ${this.age} years old!`);
}

//greeting();
const greetingJohn = greeting.bind(john);
greetingJohn();