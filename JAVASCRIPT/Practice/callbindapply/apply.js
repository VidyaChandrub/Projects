function greet(a,b){
    console.log(b)
    console.log(`Hi ${a}, am ${this.name} and am ${this.age} years old`);
}

const jane = {
    name:"jane",
    age:29
}

const janu = {
    name:"janu",
    age:49
}

greet.apply(janu,["hi", "en"]);
greet.apply(jane)