let first = "Arm";
let second = "Mar";

isAnagram(first, second);

function isAnagram(f, s){
    var a = f.toLowerCase();
    var b = s.toLowerCase();

    a = a.split("").sort().join("");
    b = b.split("").sort().join("");

    console.log(a === b);
}