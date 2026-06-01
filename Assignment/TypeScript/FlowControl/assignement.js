"use strict";
var data = prompt("Enter a number");
console.log(data);
if (data !== null) {
    var number = parseInt(data);
    console.log(number);
    if (number % 2 == 0)
        alert("It is even");
    else
        alert("It is odd");
}
else {
    console.log("No input provided");
}
