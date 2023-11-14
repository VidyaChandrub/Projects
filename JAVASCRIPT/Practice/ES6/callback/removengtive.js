const arr = [2, -3, 6, 7, 8, 10, -11, -15, 30, -30];

const posNum = removeNegative(arr, (x) => x>= 0);

console.log(posNum);

function removeNegative(numbers, callback){
    let myArray = [];
    for(let x of numbers){
        if(!callback(x)){
            myArray.push(x);
        }
    }
    return myArray;
}