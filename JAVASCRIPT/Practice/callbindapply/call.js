function greet(a,b){
    console.log(`Hi ${a}, ${b} am ${this.name} and am ${this.age} years old`);
}

const jane = {
    name:"jane",
    age:29
}

const janu = {
    name:"janu",
    age:49
}

greet.call(janu,"hi","GN");
greet.call(jane)