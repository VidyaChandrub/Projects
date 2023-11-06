// var sen = "Welcome to Javascript";


// var reverseEntire = reverseBySeparator(sen, "");
// var reverseEachword = reverseBySeparator(reverseEntire, " ");

// function reverseBySeparator(sen, separator){
//     return sen.split(separator).map(word=>word.split(separator).reverse().join(separator)).join(separator);
// }

// Original String
const str = "Welcome to world of Vidya";
// Reverse each word of the string
let reversedStr = str.split(' ')
                 .map(word=>word.split('').reverse().join(''))
                 .join(' ');
// Print the reversed string
console.log(reversedStr);

function duplicate(arr){
    console.log(arr.concat(arr));
}

let arr = [1,2,3,4];
duplicate(arr);
