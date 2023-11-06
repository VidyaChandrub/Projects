const str = "Mom";

// function palindrome(str){
//     var reverseStr = str.toLowerCase();
//     reverseStr = str.split("").reverse().join("");
//     if(reverseStr == str){
//         console.log("palindorme");
//     }else{
//         console.log("Not palindorme");
//     }
// }

let reversedStr = str.split('').reverse().join('');
if(str == reversedStr){
            console.log("palindorme");
             }else{
           console.log("Not palindorme");
     }

console.log(reversedStr)

// program to check if the string is palindrome or not

// function checkPalindrome(string) {

//     var reverseString = string.split('').reverse().join('');

//     if(string == reverseString) {
//         console.log('It is a palindrome');
//     }
//     else {
//         console.log('It is not a palindrome');
//     }
// }

// //take input
// const string = "mom";

// checkPalindrome(string);
